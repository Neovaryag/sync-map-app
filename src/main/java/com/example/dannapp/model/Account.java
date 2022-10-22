package com.example.dannapp.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Account {

    @JsonProperty("account_number")
    private String accountNumber;
    @JsonProperty("total_balance")
    private long totalBalance;

    public Account() {
    }

    public Account(String accountNumber, long totalBalance) {
        this.accountNumber = accountNumber;
        this.totalBalance = totalBalance;
    }

    public String accountNumber() {
        return accountNumber;
    }

    public Account setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
        return this;
    }

    public long totalBalance() {
        return totalBalance;
    }

    public Account setTotalBalance(long totalBalance) {
        this.totalBalance = totalBalance;
        return this;
    }
}