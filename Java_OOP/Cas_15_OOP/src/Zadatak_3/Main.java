package Zadatak_3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Artikl artikal = new Artikl("Igracka", 1000);
        Artikl artikal1 = new Artikl("Sveska", 100);
        Artikl artikal2 = new Artikl("Lopta", 500);
        Artikl artikal3 = new Artikl("Ranac", 1500);

        ArrayList<Artikl> artikli = new ArrayList<>();
        artikli.add(artikal);
        artikli.add(artikal1);
        artikli.add(artikal2);
        artikli.add(artikal3);

        GlavniMagacin glMagacin = new GlavniMagacin(artikli);
        System.out.println("Da li se nalazi: " + glMagacin.daLiSeNalazi(artikal1));

        glMagacin.preuzmi(artikal3);
        System.out.println("Da li se nalazi 2: " + glMagacin.getListaArtikala());

        glMagacin.popust();
        System.out.println("Popust: " + glMagacin.getListaArtikala());
    }
}
