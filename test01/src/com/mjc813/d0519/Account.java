package com.mjc813.d0519;

public class Account {
    private int balance = 0;
    private final int MIN_BALANCE = 0;
    private final int MAX_BALANCE = 10000000;

    public void setBalance(int balance) {
        if(balance < MIN_BALANCE || balance > MAX_BALANCE){
            return;
        } else {
            this.balance = balance;
        }
    }

}
