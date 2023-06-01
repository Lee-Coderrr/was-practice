package org.example.counter;

public class Counter implements Runnable {

    private int count = 0;


    public void increments() {
        count++;
    }

    public void decrements() {
        count--;
    }

    public int getValue() {
        return count;
    }

    @Override
    public void run() {

        synchronized (this) {
            this.increments();
            System.out.println("Value for Thread after increments " + Thread.currentThread().getName() + " " + this.getValue());
            this.decrements();
            System.out.println("Value for Thread after decrements " + Thread.currentThread().getName() + " " + this.getValue());
        }


    }
}
