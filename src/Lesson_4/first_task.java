package Lesson_4;

public class first_task {

    static Object mon = new Object();
    static volatile char ch = 'A';

    public static void main(String[] args) throws InterruptedException {

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (mon) {
                            while (ch != 'A') {
                                mon.wait();
                            }
                            System.out.print("A");
                            ch = 'B';
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (mon) {
                            while (ch != 'B') {
                                mon.wait();
                            }
                            System.out.print("B");
                            ch = 'C';
                            mon.notifyAll();
                        }
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = 0; i < 5; i++) {
                        synchronized (mon) {
                            while (ch != 'C') {
                                mon.wait();
                            }
                            System.out.print("C");
                            ch = 'A';
                            mon.notifyAll();
                        }
                    }

                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }).start();


    }

}
