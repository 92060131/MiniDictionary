package by.bsuir.source.model;

public class LibRus {
    private int id_russian;
    private String word_russian;
    public LibRus(int id_russian, String word_russian) {
        this.id_russian = id_russian;
        this.word_russian = word_russian;
    }
    public int getId_russian() {
        return id_russian;
    }
    public void setId_russian(int id_russian) {
        this.id_russian = id_russian;
    }
    public String getWord_russian() {
        return word_russian;
    }
    public void setWord_russian(String word_russian) {
        this.word_russian = word_russian;
    }
}
