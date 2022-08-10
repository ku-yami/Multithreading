package com.company;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        ThreadGroup group = new ThreadGroup("group");
        MyThread thread1 = new MyThread(group, "thread 1");
        MyThread thread2 = new MyThread(group, "thread 2");
        MyThread thread3 = new MyThread(group, "thread 3");
        MyThread thread4 = new MyThread(group, "thread 4");

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        Thread.sleep(15000);
        System.out.println("Завершение всех потоков.");
        group.interrupt();
    }
}
