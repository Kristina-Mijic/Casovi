package Zadatak1;

import java.util.ArrayList;

public abstract class Muzicar {

    private ArrayList<Album> albumi;

    //Konstrukor
    public Muzicar(ArrayList<Album> albumi) {
        this.albumi = albumi;
    }


    //METODE:

    public int ukupnoPregleda() {
        int ukupnoPregleda = 0;

        for(Album a:albumi) {
            for(Pesma pes: a.getPesme()) {
                ukupnoPregleda += pes.getBrojPregleda();
            }
        }
        return ukupnoPregleda;
    }

    public abstract double zarada();



    //GET I SET:
    public ArrayList<Album> getAlbumi() {
        return albumi;
    }

    public void setAlbumi(ArrayList<Album> albumi) {
        this.albumi = albumi;
    }
}
