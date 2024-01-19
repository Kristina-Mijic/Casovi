package ApstraktneKlase;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Abstraktne klase se ne mogu inicijalizovati!

        //Zivotinje pas = new Zivotinje(5, true); //Ovo NE moze!


        Zivotinje macka = new Macka(4, true);
        Zivotinje pas = new Pas(5, true);
        Zivotinje macka1 = new Macka(2, true);
        ArrayList<Zivotinje> zivotinje = new ArrayList<>();
        zivotinje.add(macka);
        zivotinje.add(pas);
        zivotinje.add(macka1);

        Zoo zoloskiVrt = new Zoo(zivotinje);
        System.out.println(zoloskiVrt.brojMacaka());

        Zivotinje pas1 = new Pas(3, true);
        Zivotinje pas2 = new Pas(2, true);
        Zivotinje pas3 = new Pas(6, true);
        ArrayList<Zivotinje> novaLista = new ArrayList<>();
        novaLista.add(pas1);
        novaLista.add(pas2);
        novaLista.add(pas3);

        Zoo zooVrt = new Zoo(novaLista);
        System.out.println("Broj macaka je: " + zooVrt.brojMacaka());


    }
}