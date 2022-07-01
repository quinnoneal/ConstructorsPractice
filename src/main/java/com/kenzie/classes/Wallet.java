package com.kenzie.classes;

public class Wallet {
    private int numCreditCards;
    private double totalCash;
    private String owner;

    public Wallet() {
        this.numCreditCards = 0;
        this.totalCash = 0;
        this.owner = "";
    }

    public Wallet(String owner) {
        this.owner = owner;
        this.totalCash = 0;
        this.numCreditCards = 0;
    }

    public Wallet(int numCreditCards, String owner, double totalCash) {
        this.numCreditCards = numCreditCards;
        this.owner = owner;
        this.totalCash = totalCash;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setNumCreditCards(int numCreditCards) {
        this.numCreditCards = numCreditCards;
    }

    public void setTotalCash(double totalCash) {
        this.totalCash = totalCash;
    }

    public String getOwner() {
        return owner;
    }

    public int getNumCreditCards() {
        return numCreditCards;
    }

    public double getTotalCash() {
        return totalCash;
    }

}
