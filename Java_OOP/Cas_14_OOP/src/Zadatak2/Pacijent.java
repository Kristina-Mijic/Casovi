package Zadatak2;

public class Pacijent {
    private int id;
    private int brojGodina;
    private String dijagnoza;


    //Konstruktor:
    public Pacijent(int id, int brojGodina, String dijagnoza) {
        this.id = id;
        this.brojGodina = brojGodina;
        this.dijagnoza = dijagnoza;
    }


    //GET I SET
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBrojGodina() {
        return brojGodina;
    }

    public void setBrojGodina(int brojGodina) {
        this.brojGodina = brojGodina;
    }

    public String getDijagnoza() {
        return dijagnoza;
    }

    public void setDijagnoza(String dijagnoza) {
        this.dijagnoza = dijagnoza;
    }
}
