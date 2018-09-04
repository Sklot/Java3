package Lesson_1;

import java.util.Objects;

public class Fruit {
    String type;
    float weight;

    public Fruit(String type, float weight) {
        this.type = type;
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fruit fruit = (Fruit) o;
        return Objects.equals(type, fruit.type);
    }

    @Override
    public int hashCode() {

        return Objects.hash(type);
    }
}
