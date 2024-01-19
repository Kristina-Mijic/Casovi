package Zadatak1;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Pesma p1 = new Pesma(2000, "Pesma1");
        Pesma p2 = new Pesma(1100, "Pesma2");
        Pesma p3 = new Pesma(21000, "Pesma3");
        Pesma p4 = new Pesma(20100, "Pesma4");
        ArrayList<Pesma> pesme = new ArrayList<>();
        pesme.add(p1);
        pesme.add(p2);
        pesme.add(p3);
        pesme.add(p4);


        Album a1 = new Album("Naziv1", pesme);
        Album a2 = new Album("Naziv2", pesme);
        ArrayList<Album> albumi = new ArrayList<>();
        albumi.add(a1);
        albumi.add(a2);

        Muzicar rok = new RokZvezda(albumi);
        System.out.println(rok.ukupnoPregleda());




    }
}