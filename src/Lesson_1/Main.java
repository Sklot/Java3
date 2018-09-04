package Lesson_1;
/*
3. Задача:
a. Даны классы Fruit -> Apple, Orange;
b. Класс Box, в который можно складывать фрукты. Коробки условно сортируются по
типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
c. Для хранения фруктов внутри коробки можно использовать ArrayList;
d. Сделать метод getWeight(), который высчитывает вес коробки. Задать вес одного
фрукта и их количество: вес яблока – 1.0f, апельсина – 1.5f (единицы измерения не
важны);
e. Внутри класса Box сделать метод Compare, который позволяет сравнить текущую
коробку с той, которую подадут в Compare в качестве параметра. True – если их массы
равны, False в противоположном случае. Можно сравнивать коробки с яблоками и
апельсинами;
f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую.
Помним про сортировку фруктов: нельзя яблоки высыпать в коробку с апельсинами.
Соответственно, в текущей коробке фруктов не остается, а в другую перекидываются
объекты, которые были в первой;
g. Не забываем про метод добавления фрукта в коробку
 */

public class Main {

    public static void main(String[] args) {
        Box aplle_box = new Box("Apple");
        Box aplle_box2 = new Box("Apple");
        Box orange_box = new Box("Orange");

        Apple apl1 = new Apple("Apple", 0.75f);
        Apple apl2 = new Apple("Apple", 0.24f);
        Apple apl3 = new Apple("Apple", 0.36f);
        Apple apl4 = new Apple("Apple", 0.25f);
        Apple apl5 = new Apple("Apple", 0.40f);

        Orange orng1 = new Orange("Orange", 0.71f);
        Orange orng2 = new Orange("Orange", 0.29f);
        Orange orng3 = new Orange("Orange", 0.91f);
        Orange orng4 = new Orange("Orange", 0.09f);
        Orange orng5 = new Orange("Orange", 0.50f);


        aplle_box.addIt(apl1); //Создание фруктов
        aplle_box.addIt(apl2);
        aplle_box.addIt(apl3);
        aplle_box.addIt(apl4);
        aplle_box.addIt(apl5);

        aplle_box2.addIt(apl2);
        aplle_box2.addIt(apl3);

        orange_box.addIt(orng1);
        orange_box.addIt(orng2);
        orange_box.addIt(orng3);
        orange_box.addIt(orng5);

        aplle_box.boxinfo();
        aplle_box2.boxinfo();
        orange_box.boxinfo();
        System.out.println(aplle_box.compare(orange_box));
        aplle_box.temp_name(aplle_box2); //Пересыпаем фрукты
        aplle_box.boxinfo();
        aplle_box2.boxinfo();


    }
}
