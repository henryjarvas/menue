package com.example.menue.Models;

public class NotificationsModel {
    String id,fullname,status,amount,saving_date,balance;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }


    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }


    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }


    public String getSaving_date() {
        return saving_date;
    }

    public void setSaving_date(String saving_date) {
        this.saving_date = saving_date;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }


    public NotificationsModel(String id, String fullname, String status,  String amount, String saving_date,  String balance) {
        this.id = id;
        this.fullname = fullname;
        this.status = status;
        this.amount = amount;
        this.saving_date = saving_date;
        this.balance = balance;

    }
}
