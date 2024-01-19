package Zadatak3;

//Zadatak 3:
//Napraviti klasu Tocak koja ima:
//- broj dana koliko je koriscen
//- naziv (model)
//Napraviti klasu Automobil koji ima:
//-jedan rezervni tocak
//-cenu
//-godinu proizvodnje
//-boja
//Takodje ima metode:
//popust() - daje 30% popust na automobil
//novTocak() - kreira i ubacuje nam nov Tocak ukoliko je nas Tocak koriscen vise od 100 dana
//Klasa BMW nasledjuje klasu Auto i:
//- BMW daje popust od 50% na sve modele koji su beli
//Klasa Mercedes nasledjuje klasu Auto i:
//- menja Tocak tek kada je koriscen vise od 150 dana

public class main {
    public static void main(String[] args) {

        Tocak t1 = new Tocak(175, "yamaha");
        Automobil prvi = new Mercedes(t1, 1000, 2020, "bela");
        System.out.println(prvi);
        prvi.novTocak();
        System.out.println(prvi);


    }
}
