package Zadatak3;
//Napraviti klasu Automobil koji ima:
//-jedan rezervni tocak
//-cenu
//-godinu proizvodnje
//-boja
//Takodje ima metode:
//popust() - daje 30% popust na automobil
//novTocak() - kreira i ubacuje nam nov Tocak ukoliko je nas Tocak koriscen vise od 100 dana
public class Automobil {

    private Tocak rezervniTocak;
    private double cena;
    private int godinaProzivodnje;
    private String boja;

    //Konstruktor:
    public Automobil(Tocak rezervniTocak, double cena, int godinaProzivodnje, String boja) {
        this.rezervniTocak = rezervniTocak;
        this.cena = cena;
        this.godinaProzivodnje = godinaProzivodnje;
        this.boja = boja;
    }

    public Tocak getRezervniTocak() {
        return rezervniTocak;
    }

    public void setRezervniTocak(Tocak rezervniTocak) {
        this.rezervniTocak = rezervniTocak;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    public int getGodinaProzivodnje() {
        return godinaProzivodnje;
    }

    public void setGodinaProzivodnje(int godinaProzivodnje) {
        this.godinaProzivodnje = godinaProzivodnje;
    }

    public String getBoja() {
        return boja;
    }

    public void setBoja(String boja) {
        this.boja = boja;
    }


    public void popust() {
        cena *= 0.7;
    }

    public void  novTocak() {
        if(rezervniTocak.getBrojDanaKoriscenja() > 100) {
            Tocak nov = new Tocak(0, "nov model");
            rezervniTocak = nov;
        }
    }


    public String toString() {
        return "Automobil{" +
                "rezervniTocak=" + rezervniTocak +
                ", cena=" + cena +
                ", godinaProzivodnje=" + godinaProzivodnje +
                ", boja='" + boja + '\'' +
                '}';
    }
}
