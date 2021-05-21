package com.example.myapplication;

public class Customer {
    private int id; //id - идентификационный номер
    private int cash; //cash - денежный счет
    private int bcash; //bonus cash - бонусный счет

    private Customer(int id, int cash, int bcash){
        this.bcash = bcash;
        this.cash = cash;
        this.id = id;
    }

    private void setcash(int cash){
        this.id = cash;
    }

    private void setId(int id){
        this.id = id;
    }

    private void setbcash(int bcash){
        this.id = bcash;
    }

    private int getId(){
        return id;
    }

    private int getCash(){
        return cash;
    }

    private int getBcash(){
        return bcash;
    }

}
