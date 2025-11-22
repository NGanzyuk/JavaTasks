package edu.projects.creditapplication.controller;

import edu.projects.creditapplication.entity.CreditEntity;
import edu.projects.creditapplication.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/credit")
public class CreditController {

    @Autowired
    private CreditService service;

    @PostMapping("/apply")
    public Long applyForCredit(@RequestBody CreditEntity app) {
        return service.submitApplication(app);
    }

    @GetMapping("/status/{id}")
    public String getStatus(@PathVariable Long id) {
        return service.getStatus(id);
    }
}
