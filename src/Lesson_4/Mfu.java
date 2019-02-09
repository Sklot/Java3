package Lesson_4;

public class Mfu {
    Object power_on = new Object();
    public void print(Document doc) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < doc.getLetters(); i++) {
                    try {
                        synchronized (power_on) {
                            Thread.sleep(1000);
                            System.out.println(doc.getName() +" Print letter # " + i + " ...");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();

    }

    public void scan(Document doc) {

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < doc.getLetters(); i++) {
                    try {
                        synchronized (power_on) {
                            Thread.sleep(1000);
                            System.out.println(doc.getName()+" Scan letter # " + i + " ...");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();


    }

}
