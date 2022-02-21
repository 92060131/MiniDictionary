package by.bsuir.source.model;

public class LibEnglish {
     private int id_english;
     private String word_english;
    public LibEnglish(int id_english, String word_english) {
        this.id_english = id_english;
        this.word_english = word_english;
    }
    public int getId_english() {
        return id_english;
    }
    public void setId_english(int id_english) {
        this.id_english = id_english;
    }
    public String getWord_english() {
        return word_english;
    }
    public void setWord_english(String word_english) {
        this.word_english = word_english;
    }
}
