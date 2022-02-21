package by.bsuir.source.model;

public class RusEng {
    int id_eng;
    int id_rus;
    public RusEng(int id_eng, int id_rus) {
        this.id_eng = id_eng;
        this.id_rus = id_rus;
    }
    public int getId_eng() {
        return id_eng;
    }
    public void setId_eng(int id_eng) {
        this.id_eng = id_eng;
    }
    public int getId_rus() {
        return id_rus;
    }
    public void setId_rus(int id_rus) {
        this.id_rus = id_rus;
    }
}
