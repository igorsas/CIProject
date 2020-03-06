package com.igor;

public class Main {
    public boolean isPositive(int a) {
        return a > 0;
    }

    public void badMethod() {
        int a = 5;
    }

    public static void main(String[] args) {
        int n = 10;
        for (int i = 0; i < n; i++) {
            new Thread(new RunnableImplm()).start();
            new SmartThread().start();
        }
    }
}
