package Zadatak_3;

import Zadatak_2.Knjiga;

import java.util.*;

public class Prodavnica {

    private ArrayList<Artikl> listaArtikala;

    public Prodavnica(ArrayList<Artikl> listaArtikala) {
        this.listaArtikala = listaArtikala;
    }

    public ArrayList<Artikl> getListaArtikala() {
        return listaArtikala;
    }

    public void setListaArtikala(ArrayList<Artikl> listaArtikala) {
        this.listaArtikala = listaArtikala;
    }

    @Override
    public String toString() {
        return "Prodavnica{ " +
                "listaArtikala = " + listaArtikala +
                '}';
    }


    //METODE:

    public void sortiraj() {
        Comparator<Artikl> c = Comparator.comparing(Artikl::getCena);
        Collections.sort(listaArtikala, c);
    }


    public void popust() {
        double max = Double.MIN_VALUE;
        Artikl artikl = null;

        for(Artikl najskuplji: listaArtikala) {
            if(najskuplji.getCena() > max) {
                max = najskuplji.getCena();
                artikl = najskuplji;
            }
        }
        artikl.setCena(artikl.getCena() * 0.8);
    }
}
