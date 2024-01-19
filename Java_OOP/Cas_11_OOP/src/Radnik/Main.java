package Radnik;

public class Main {
    public static void main(String[] args) {
        //Zadatak 3:
        //Napraviti klasu Radnik koja ima id, godinu zaposlenja i platu radnika.
        // Napraviti metodu koja racuna staz radniku i metodu koja daje povisicu za 20%
        // ukoliko se radnik tu nalazi vise od 5 godina,
        // i povisicu od 40% ukoliko ima staz duzi od 10 godina.
        // Napraviti adekvatan konstruktor, get i set metod, kao i toString.


        Radnik radnik1 = new Radnik(1, 2003, 10000 );
        Radnik radnik2 = new Radnik(2, 2017, 5000);

        System.out.println(radnik1.godinaStaza());
        System.out.println(radnik2.povisica());
    }
}
