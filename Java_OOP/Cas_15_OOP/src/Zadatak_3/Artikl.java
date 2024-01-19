package Zadatak_3;

public class Artikl {
    private String nazivArtikla;
    private double cena;

    public Artikl(String nazivArtikla, double cena) {
        this.nazivArtikla = nazivArtikla;
        this.cena = cena;
    }

    public String getNazivArtikla() {
        return nazivArtikla;
    }

    public void setNazivArtikla(String nazivArtikla) {
        this.nazivArtikla = nazivArtikla;
    }

    public double getCena() {
        return cena;
    }

    public void setCena(double cena) {
        this.cena = cena;
    }

    @Override
    public String toString() {
        return "Artikl{" +
                "nazivArtikla='" + nazivArtikla + '\'' +
                ", cena=" + cena +
                '}';
    }
}
