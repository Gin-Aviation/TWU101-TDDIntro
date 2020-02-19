package com.thoughtworks.tddintro.exercises.accountbalance;

public class Account {
    private int money;

    public Account(){
        money = 0;
    }
    public Account(int newMoney){
        money = newMoney;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void deposit(int depositMoney){
        money = depositMoney + money;
    }

    public void withdraw(int withdrawMoney){
        if(money >= withdrawMoney) {
            money = money - withdrawMoney;
        }
    }
}
