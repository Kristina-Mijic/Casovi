package Zadatak2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> ocene = new ArrayList<>();
        ocene.add(7);
        ocene.add(7);
        ocene.add(6);

        ArrayList<Integer> ocene2 = new ArrayList<>();
        ocene2.add(10);
        ocene2.add(10);
        ocene2.add(8);

        Ucenik prvi = new Ucenik(123, 23, ocene);
        Ucenik drugi = new Ucenik(133, 22, ocene2);

        ArrayList<Ucenik> ucenici = new ArrayList<>();
        ucenici.add(prvi);
        ucenici.add(drugi);

        Fakultet drzavni = new DrzavniFakultet(ucenici);
            System.out.println(drzavni.uspesni());
            System.out.println(drzavni.zarada());

        Fakultet privatni = new PrivatniFakultet(ucenici);
            System.out.println(privatni.uspesni());
            System.out.println(privatni.zarada());

    }

}
