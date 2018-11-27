package com.qa.accountGenerator.accountapi.persistence.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PrizeAccount {

    @Id
    private String accountId;

    private int prizeWinnings;

    private String date;

    public PrizeAccount(){

    }

    public PrizeAccount(String accountId, int prizeWinnings, String date) {
        this.accountId = accountId;
        this.prizeWinnings = prizeWinnings;
        this.date = date;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public int getPrizeWinnings() {
        return prizeWinnings;
    }

    public void setPrizeWinnings(int prizeWinnings) {
        this.prizeWinnings = prizeWinnings;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }



}
