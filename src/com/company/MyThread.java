package com.company;

public class MyThread extends Thread{

    public MyThread(ThreadGroup group, String name) {
        super(group, name);
    }

    @Override
    public void run() {
        try {
            while (!isInterrupted()) {
                Thread.sleep(2500);
                System.out.printf("Поток %s. Всем привет!\n", getName());
            }
        } catch (InterruptedException err) {
            System.out.printf("Поток %s прерван.\n", getName());
        } finally {
            System.out.printf("%s завершен\n", getName());
        }
    }
}
