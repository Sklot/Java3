package Lesson_4;

public class Second_task {

    public static void main(String[] args) {
        get_ready(2000);
    }
    static Object mon = new Object();

    static void get_ready(int wfi) {


        new Thread(() -> {
            for (int i = 0; i < 3; i++) {

                try {
                    synchronized (mon) {

                        Thread.sleep(wfi);
                        System.out.println("Thread 1");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();
        new Thread(() -> {
            for (int i = 0; i < 3; i++) {

                try {
                    synchronized (mon) {

                        Thread.sleep(wfi);
                        System.out.println("Thread 2");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(() -> {
            for (int i = 0; i < 3; i++) {

                try {
                    synchronized (mon) {

                        Thread.sleep(wfi);
                        System.out.println("Thread 3");
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

    }

}
