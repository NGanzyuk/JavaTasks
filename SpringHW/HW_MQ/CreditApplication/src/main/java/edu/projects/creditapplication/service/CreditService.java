package edu.projects.creditapplication.service;

import edu.projects.creditapplication.entity.CreditEntity;
import edu.projects.creditapplication.event.CreditDecisionEvent;
import edu.projects.creditapplication.event.CreditEvent;
import edu.projects.creditapplication.repository.CreditRepository;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class CreditService {

    @Autowired
    private CreditRepository repository;

    @Autowired
    private KafkaTemplate<String, CreditEvent> kafkaTemplate;

    public Long submitApplication(CreditEntity app) {
        app.setStatus("в обработке");
        CreditEntity saved = repository.save(app);
        CreditEvent event = new CreditEvent(saved.getId(), saved.getAmount(), saved.getTerm(),
                saved.getIncome(), saved.getCurrentLoad(), saved.getRating());
        kafkaTemplate.send("credit-applications", event);
        return saved.getId();
    }

    public String getStatus(Long id) {
        return repository.findById(id).map(CreditEntity::getStatus).orElse("Не найдено");
    }

    public void updateStatus(CreditDecisionEvent event) {
        CreditEntity app = repository.findById(event.getApplicationId()).orElse(null);
        if (app != null) {
            app.setStatus(event.getDecision());
            repository.save(app);
        }
    }
    @RabbitListener(queues = "credit-decisions")
    public void receiveDecision(CreditDecisionEvent event) {
        updateStatus(event);
    }
}