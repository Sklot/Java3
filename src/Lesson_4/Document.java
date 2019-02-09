package Lesson_4;

public class Document {
    private int letters;
    private String name;

    public Document(int letters, String name) {
        this.letters = letters;
        this.name = name;
    }

    public int getLetters() {
        return letters;
    }

    public String getName() {
        return name;
    }
}
