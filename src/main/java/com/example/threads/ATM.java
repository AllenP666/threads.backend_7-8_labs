package com.example.threads;

import static com.example.threads.ThreadsApplication.money;

public class ATM {
    public static synchronized void getMoney(int amount, String username){
        if (amount <= money){
            try {
                Thread.sleep(1000);
                money -= amount;
                System.out.println(username + " снял со счета: " + amount + " рублей.");
            }
            catch (InterruptedException exception){
                exception.printStackTrace();
            }
        }
        else {
            System.out.println(username + " не может снять со счета " + amount + " рублей.");
        }
    }
}
