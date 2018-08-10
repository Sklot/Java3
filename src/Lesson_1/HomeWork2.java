package Lesson_1;

import java.util.ArrayList;
import java.util.Arrays;


/**
 * Написать метод, который преобразует массив в ArrayList;
 */

public class HomeWork2<E> {
    ArrayList<E> data_list = new ArrayList<>();

    public ArrayList gotoList(E[] array) {
        for (int i = 0; i < array.length; i++) {
            data_list.add(i, array[i]);

        }
        return data_list;

    }


    public static void main(String[] args) {
        HomeWork2 hw2 = new HomeWork2();

        Integer[] data_int = {52, 123, 345, 250, 608};

        hw2.gotoList(data_int);




        System.out.println(hw2.data_list.get(4));
        System.out.println(hw2.data_list);


    }


}
