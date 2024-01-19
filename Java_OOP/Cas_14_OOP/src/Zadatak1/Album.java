package Zadatak1;

import java.util.ArrayList;

public class Album {
    private String naziv;
    private ArrayList<Pesma> pesme;



    //Konstruktor:
    public Album(String naziv, ArrayList<Pesma> pesme) {
        this.naziv = naziv;
        this.pesme = pesme;
    }

    //METODE:

    public String najveciHit() {

        int najvisePregleda = Integer.MIN_VALUE;
        String najveciHitNaziv = "";

        for(Pesma pivot: pesme) {
            if(pivot.getBrojPregleda() > najvisePregleda) {
                najvisePregleda = pivot.getBrojPregleda();
                najveciHitNaziv = pivot.getNaziv();
            }
        }
        return najveciHitNaziv;
    }


    //SET I GET:
    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public ArrayList<Pesma> getPesme() {
        return pesme;
    }

    public void setPesme(ArrayList<Pesma> pesme) {
        this.pesme = pesme;
    }


    @Override
    public String toString() {
        return "Album{" +
                "naziv='" + naziv + '\'' +
                ", pesme=" + pesme +
                '}';
    }
}
