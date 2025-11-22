package edu.projects.creditprocessingapplication.service;

import edu.projects.creditprocessingapplication.event.CreditDecisionEvent;
import edu.projects.creditprocessingapplication.event.CreditEvent;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class CreditProcessingService {

    private final RabbitTemplate rabbitTemplate;

    public CreditProcessingService(RabbitTemplate rabbitTemplate) {
        this.rabbitTemplate = rabbitTemplate;
    }

    @KafkaListener(topics = "credit-applications", groupId = "processing-group")
    public void processApplication(CreditEvent event) {
        System.out.println("Processing application ID: " + event.getId());

        double newPayment = event.getAmount() / event.getTerm();

        double totalLoad = event.getCurrentLoad() + newPayment;

        String decision = (totalLoad <= 0.5 * event.getIncome()) ? "одобрено" : "отказано";

        System.out.println("Decision for ID " + event.getId() + ": " + decision);

        CreditDecisionEvent decisionEvent = new CreditDecisionEvent(event.getId(), decision);
        rabbitTemplate.convertAndSend("credit-decisions", decisionEvent);
    }
}