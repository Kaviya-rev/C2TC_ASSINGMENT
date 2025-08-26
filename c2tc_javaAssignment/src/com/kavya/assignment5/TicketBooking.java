package com.kavya.assignment5;

public class TicketBooking {
    // Private attributes
    private String stageEvent;
    private String customer;
    private Integer noOfSeats;

    // Default constructor
    public TicketBooking() {
        this.stageEvent = "";
        this.customer = "";
        this.noOfSeats = 0;
    }

    // Parameterized constructor
    public TicketBooking(String stageEvent, String customer, Integer noOfSeats) {
        this.stageEvent = stageEvent;
        this.customer = customer;
        this.noOfSeats = noOfSeats;
    }

    // Getters
    public String getStageEvent() {
        return stageEvent;
    }

    public String getCustomer() {
        return customer;
    }

    public Integer getNoOfSeats() {
        return noOfSeats;
    }

    // Setters
    public void setStageEvent(String stageEvent) {
        this.stageEvent = stageEvent;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public void setNoOfSeats(Integer noOfSeats) {
        this.noOfSeats = noOfSeats;
    }

    // Display ticket details
    public void displayTicketDetails() {
        System.out.println("Stage event:" + stageEvent);
        System.out.println("Customer:" + customer);
        System.out.println("Number of seats:" + noOfSeats);
    }

    // Overloaded methods for payments

    // 1. Cash payment
    public void makePayment(double amount) {
        System.out.printf("Amount %.1f paid in cash\n", amount);
    }

    // 2. Wallet payment
    public void makePayment(double amount, String walletNumber) {
        System.out.printf("Amount %.1f paid using wallet number %s\n", amount, walletNumber);
    }

    // 3. Credit card payment
    public void makePayment(String holderName, double amount, String cardType, String ccv) {
        System.out.println("Holder name:" + holderName);
        System.out.printf("Amount %.1f paid using %s card\n", amount, cardType);
        System.out.println("CCV:" + ccv);
    }
}
