package Zadatak_2;

import java.util.Arrays;

public class Biblioteka implements Usluge{

    private Knjiga[] nizKnjiga;

    public Biblioteka(Knjiga[] nizKnjiga) {
        this.nizKnjiga = nizKnjiga;
    }

    public Knjiga[] getNizKnjiga() {
        return nizKnjiga;
    }

    public void setNizKnjiga(Knjiga[] nizKnjiga) {
        this.nizKnjiga = nizKnjiga;
    }


    @Override
    public void stampanje() {
        for(Knjiga k: nizKnjiga) {
            System.out.println(k);
        }
    }

    @Override
    public void sortiranjeNizaKnjiga() {
        for(int i = 0; i < nizKnjiga.length; i++) {
            int minIndex = i;

            for(int j = 0; j < nizKnjiga.length; j++) {
                if(nizKnjiga[minIndex].getCenaKnjige() > nizKnjiga[i].getCenaKnjige()) {
                    minIndex = j;
                }
            }

            Knjiga temp = nizKnjiga[minIndex];
            nizKnjiga[minIndex] = nizKnjiga[i];
            nizKnjiga[i] = temp;
        }
    }

    //Arrays.sort = zahteva komparator
    public void sortiranjeKnjiga2() {
        Arrays.sort(nizKnjiga);
    }


    //METODE:

    public Knjiga knjigaSaNajviseStrana() {
        int max = Integer.MIN_VALUE;
        Knjiga rezultat = null;

        for(Knjiga najviseStrana : nizKnjiga) {
            if(najviseStrana.getBrojStrana() > max) {
                max = najviseStrana.getBrojStrana();
                rezultat = najviseStrana;
            }
        }
        return rezultat;
    }


    public void popustNaZanr(String zanrPopust) {
        for(Knjiga k:nizKnjiga) {
            if(k.getZanr().equalsIgnoreCase(zanrPopust)) {
                k.setCenaKnjige(k.getCenaKnjige() * 0.65);
            }
        }
    }

}
