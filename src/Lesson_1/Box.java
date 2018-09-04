package Lesson_1;

import java.util.ArrayList;
import java.util.Objects;

public class Box {
    String boxtype;
    ArrayList<Fruit> volume = new ArrayList<Fruit>();

    public Box(String boxtype) {
        this.boxtype = boxtype;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box box = (Box) o;
        return Objects.equals(boxtype, box.boxtype);
    }

    @Override
    public int hashCode() {

        return Objects.hash(boxtype);
    }

    public float getTotal() {
        float result = 0;
        for (int i = 0; i < this.volume.size(); i++) {
            result += this.volume.get(i).weight;
        }
        return result;
    }

    public void addIt(Fruit fruit) {
        if (fruit.type.equals(this.boxtype)) {
            this.volume.add(fruit);
            System.out.println("Добавил в корзину " + fruit.type + " весом " + fruit.weight);
        } else if (fruit.type.equals(this.boxtype)) {
            this.volume.add(fruit);
            System.out.println("Добавил в корзину " + fruit.type + " весом " + fruit.weight);
        } else System.out.println("У меня нет для этого коробки!");
    }

    public boolean compare(Box box) {
        if (this.getTotal() == box.getTotal()) return true;
        else return false;
    }

    public void boxinfo() {
        System.out.println("В этой коробке хранятся " + this.boxtype);
        System.out.println("В коробке  " + this.volume.size() + " " + this.boxtype);
        System.out.println("Общий вес фруктов в коробке  " + this.getTotal());
    }

    public void temp_name(Box box) {
        if (this.boxtype.equals(box.boxtype)) {
            box.volume.addAll(this.volume);
            this.volume.clear();
        }else System.out.println("Эти фрукты мы не смешиваем!");
    }
}
