package edu.projects.creditprocessingapplication.event;

public class CreditEvent {
    private Long id;
    private Double amount;
    private Integer term;
    private Double income;
    private Double currentLoad;
    private Integer rating;

    public CreditEvent(Long id, Double amount, Integer term, Double income, Double currentLoad, Integer rating) {
        this.id = id;
        this.amount = amount;
        this.term = term;
        this.income = income;
        this.currentLoad = currentLoad;
        this.rating = rating;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Integer getTerm() {
        return term;
    }

    public void setTerm(Integer term) {
        this.term = term;
    }

    public Double getIncome() {
        return income;
    }

    public void setIncome(Double income) {
        this.income = income;
    }

    public Double getCurrentLoad() {
        return currentLoad;
    }

    public void setCurrentLoad(Double currentLoad) {
        this.currentLoad = currentLoad;
    }

    public Integer getRating() {
        return rating;
    }

    public void setRating(Integer rating) {
        this.rating = rating;
    }
}
