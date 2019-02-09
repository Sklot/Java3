package Lesson_4;

public class Mfu {
   static Object print_lock = new Object();
   static Object scan_lock = new Object();

    public void print(Document doc) {
        synchronized (print_lock) {
            try {

            for (int i = 1; i < doc.getLetters(); i++) {
                Thread.sleep(1000);
                System.out.println(doc.getName() + " Print letter # " + i + " ...");
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void scan(Document doc) {
        synchronized (scan_lock) {
            try {

            for (int i = 1; i < doc.getLetters(); i++) {
                Thread.sleep(1000);
                System.out.println(doc.getName() + " Scan letter # " + i + " ...");
            }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
