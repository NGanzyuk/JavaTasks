package edu.projects.creditapplication.event;

public class CreditDecisionEvent {
    private Long applicationId;
    private String decision;

    public CreditDecisionEvent(Long applicationId, String decision) {
        this.applicationId = applicationId;
        this.decision = decision;
    }

    public Long getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Long applicationId) {
        this.applicationId = applicationId;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }
}