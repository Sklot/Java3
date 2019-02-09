package Lesson_4;
/*
Написать класс МФУ, на котором возможны одновременная печать и сканирование документов,
при этом нельзя одновременно печатать два документа или сканировать (при печати в консоль выводится сообщения
"отпечатано 1, 2, 3,... страницы", при сканировании тоже самое только "отсканировано...",
вывод в консоль все также с периодом в 50 мс.)
 */
public class third_task {

    public static void main(String[] args) {

        Document doc1 = new Document(7, "Passport");
        Document doc2 = new Document(15, "Diplom");

        Mfu mfu = new Mfu();
        mfu.print(doc1);
        mfu.scan(doc2);

    }

}
