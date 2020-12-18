package com.company;

public class Runner extends Thread{
    private int number;

    public Runner(String name, int number) {
        super(name);
        this.number = number;
    }

    @Override
    public void run() {
        super.run();
        System.out.println(this.getName() + this.number + " берет палку");
        System.out.println(this.getName() + this.number + " бежит к " + this.getName() + (this.number + 1));
        if (this.number == 4) {
            for (int i = this.number + 1; i > 0; i--) {
                try {
                    Runner.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                if (i == 1) {
                    System.out.println(this.getName() + 1 + " берет палку и финиширует!");
                    break;
                }
                System.out.println(this.getName() + i + " берет палку");
                System.out.println(this.getName() + i + " бежит к " + this.getName() + (i - 1));
            }
        }
    }


}

