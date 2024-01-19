
public class Main {
    public static void main(String[] args) {

        //Tip podatka je nama klasa.
        // osoba1 - je objekat
        //promenljiva koja ima tim neke klase je OBJEKAT!


        //Covek osoba1 = new Covek("Kristina", "Mijic"); // Ovako se deklarise i inicijalizuje OBJEKAT!
        //Covek osoba2 = new Covek("Marko", "Mikic"); // Ovako se deklarise i inicijalizuje OBJEKAT!

        //System.out.println(osoba1.ime);
        //System.out.println(osoba2.ime);

        //osoba1.stampajPoruku();

        //

        Prodavac prodavacPrvi = new Prodavac("Kristina", "Mijic", 2020);
        Prodavac prodavacDrugi = new Prodavac("Pera", "Peric", 2012);
        Prodavac prodavacTreci = new Prodavac("Marko", "Mitic", 2018);

        //Prodavac osoba = new Prodavac("Kristina", "Mijic", 2024); moze i ovako

        System.out.println(prodavacPrvi);
    }
}