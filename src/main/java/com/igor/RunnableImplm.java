package com.igor;

public class RunnableImplm implements Runnable {
    @Override
    public void run() {
        System.out.println("Thread " +
                Thread.currentThread().getId() +
                " is running in RunnableImplm");
    }
}
