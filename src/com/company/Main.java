package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 5; i++) {
            Runner runner=new Runner("Runner ",i);
            try {
                runner.start();
                runner.join();
                runner.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
