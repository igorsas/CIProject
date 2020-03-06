package com.igor;

public class SmartThread extends Thread {
    public void run() {
        System.out.println("Thread " +
                Thread.currentThread().getId() +
                " is running in SmartThread");
    }
}
