package Zadatak2;

public class Main {
    public static void main(String[] args) {

        Radnik radnik1 = new Fizikalac(1, 1000, 2000);

        //System.out.println(radnik1);
        //System.out.println(radnik1.ukupnaZarada());
        radnik1.izracunajBonus();
        //System.out.println(radnik1.getPlata());

        Radnik radnik2 = new Masinovodja(2, 1200, 2022, true);
        System.out.println(radnik2.ukupnaZarada());

    }
}
