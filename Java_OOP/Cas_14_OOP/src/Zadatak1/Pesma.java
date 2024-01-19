package Zadatak1;

public class Pesma {
    private int brojPregleda;
    private String naziv;

    //Konstruktor
    public Pesma(int brojPregleda, String naziv) {
        this.brojPregleda = brojPregleda;
        this.naziv = naziv;
    }


    //GET I SET
    public int getBrojPregleda() {
        return brojPregleda;
    }

    public void setBrojPregleda(int brojPregleda) {
        this.brojPregleda = brojPregleda;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    @Override
    public String toString() {
        return "Pesma{" +
                "brojPregleda=" + brojPregleda +
                ", naziv='" + naziv + '\'' +
                '}';
    }


    //METODE:
}
