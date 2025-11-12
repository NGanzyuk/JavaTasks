package edu.projects.bffapplication.controller;

import edu.projects.bffapplication.model.Profile;
import edu.projects.bffapplication.service.BffService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/site-bff")
public class BffController {
    private final BffService bffService;

    public BffController(BffService bffService) {
        this.bffService = bffService;
    }

    @GetMapping("/user/{userId}")
    public Profile getUserProfile(@PathVariable Long userId) {
        return bffService.getUserProfile(userId);
    }
}
