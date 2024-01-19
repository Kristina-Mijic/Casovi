package Zadatak_2;

public class Knjiga {

    private String naslovKnjige;
    private int brojStrana;

    private String zanr;

    private double cenaKnjige;

    public Knjiga(String naslovKnjige, int brojStrana, String zanr, double cenaKnjige) {
        this.naslovKnjige = naslovKnjige;
        this.brojStrana = brojStrana;
        this.zanr = zanr;
        this.cenaKnjige = cenaKnjige;
    }

    public String getNaslovKnjige() {
        return naslovKnjige;
    }

    public void setNaslovKnjige(String naslovKnjige) {
        this.naslovKnjige = naslovKnjige;
    }

    public int getBrojStrana() {
        return brojStrana;
    }

    public void setBrojStrana(int brojStrana) {
        this.brojStrana = brojStrana;
    }

    public String getZanr() {
        return zanr;
    }

    public void setZanr(String zanr) {
        this.zanr = zanr;
    }

    public double getCenaKnjige() {
        return cenaKnjige;
    }

    public void setCenaKnjige(double cenaKnjige) {
        this.cenaKnjige = cenaKnjige;
    }

    @Override
    public String toString() {
        return "Knjiga{" +
                "naslovKnjige='" + naslovKnjige + '\'' +
                ", brojStrana=" + brojStrana +
                ", zanr='" + zanr + '\'' +
                ", cenaKnjige=" + cenaKnjige +
                '}';
    }

    //METODE:

}
