package Lesson_4;
/*
Написать класс МФУ, на котором возможны одновременная печать и сканирование документов,
при этом нельзя одновременно печатать два документа или сканировать (при печати в консоль выводится сообщения
"отпечатано 1, 2, 3,... страницы", при сканировании тоже самое только "отсканировано...",
вывод в консоль все также с периодом в 50 мс.)
 */
public class third_task {

    public static void main(String[] args) {

        Document doc1 = new Document(8, "Passport");
        Document doc2 = new Document(13, "Diplom");

        Mfu mfu = new Mfu();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.print(doc1);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan(doc2);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                mfu.scan(doc1);
            }
        }).start();

    }

}
