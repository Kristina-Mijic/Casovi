package Zadatak2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Pacijent p1 = new Pacijent(123, 13, "boginje");
        Pacijent p2 = new Pacijent(321, 19, "prehlada");
        Pacijent p3 = new Pacijent(222, 22, "prehlada");

        ArrayList<Pacijent> pacijenti = new ArrayList<>();
        pacijenti.add(p1);
        pacijenti.add(p2);
        pacijenti.add(p3);
        Pacijent p4 = new Pacijent(421, 19, "korona");

        Doktor pedijatar = new Pedijatar(333, pacijenti);
        //System.out.println(pedijatar.brojDijagnoza("boginje"));
        // pedijatar.dodajPacijenta(p4);

        System.out.println(pedijatar.getListaPacijenata());
        System.out.println(pedijatar.zarada());


        //System.out.println(pedijatar.brojDijagnoza("korona"));



        Pacijent p5 = new Pacijent(777, 30, "korona");
        Pacijent p6 = new Pacijent(111, 19, "prehlada");
        Pacijent p7 = new Pacijent(888, 22, "korona");
        ArrayList<Pacijent> pacijenti2 = new ArrayList<>();
        pacijenti2.add(p5);
        pacijenti2.add(p6);
        pacijenti2.add(p7);
        Doktor pedijatar2 = new Pedijatar(900, pacijenti2);
        //System.out.println(pedijatar2.zarada());
    }

}
