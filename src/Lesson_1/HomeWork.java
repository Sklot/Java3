package Lesson_1;



import java.util.ArrayList;
import java.util.Arrays;

public class HomeWork<E> {

    public void exch(int x, int y, E[] ints) {
        ArrayList<E> data = new ArrayList<>();
        int pos = 0;
        data.add(pos, ints[x - 1]);
        pos++;
        data.add(pos, ints[y - 1]);


        ints[x - 1] = data.get(pos);
        ints[y - 1] = data.get(pos - 1);


    }


    public static void main(String[] args) {
        HomeWork hw = new HomeWork();
        Integer[] data_int = {5, 18, 34, 25, 68};
        String[] data_str = {"Мама", "Папа", "Бабушка", "Дедушка"};
        Cat[] cats = {new Cat("Barsik", 3, "Red"), new Cat("Murzik", 4,"White"),
                new Cat("Vaska", 1, "Black"), new Cat("Leopold", 8, "Yellow")};


        hw.exch(3, 1, data_str);
        hw.exch(2, 4, data_int);

        System.out.println(Arrays.toString(data_int));
        System.out.println(Arrays.toString(data_str));
        for (int i = 0; i <cats.length ; i++) {
            cats[i].info();

        }
        hw.exch(1, 4, cats);


        System.out.println("Отработал метод");

        for (int i = 0; i <cats.length ; i++) {
            cats[i].info();

        }

    }

    public static class Cat{
        String name;
        int age;
        String color;

        public Cat(String name, int age, String color) {
            this.name = name;
            this.age = age;
            this.color = color;
        }

        public void info() {
            System.out.println("Имя "+name+". Возраст "+age+". Окрас ");
        }
    }


}



