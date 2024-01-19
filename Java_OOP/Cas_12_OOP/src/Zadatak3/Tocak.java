package Zadatak3;
//Napraviti klasu Tocak koja ima:
//- broj dana koliko je koriscen
//- naziv (model)
public class Tocak {

    private int brojDanaKoriscenja;
    private String model;

    public Tocak(int brojDanaKoriscenja, String model) {
        this.brojDanaKoriscenja = brojDanaKoriscenja;
        this.model = model;
    }

    public Tocak() {
        this.model = "novi model";
        this.brojDanaKoriscenja = 0;
    }


    public int getBrojDanaKoriscenja() {
        return brojDanaKoriscenja;
    }

    public void setBrojDanaKoriscenja(int brojDanaKoriscenja) {
        this.brojDanaKoriscenja = brojDanaKoriscenja;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Tocak{" +
                "Rezervni tocak: "  +
                "cena: " +
                "brojDanaKoriscenja = " + getBrojDanaKoriscenja() +
                ", model='" + getModel() + '\'' +
                '}';
    }
}
