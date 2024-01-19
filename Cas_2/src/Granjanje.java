import java.util.Scanner;

public class Granjanje {
    public static void main(String[] args) {

        //If() / else() / if else /

        /*
        if(5 > 2) {
            System.out.println("Ova poruka je unutar If-a");
        } else {
            System.out.println("Ova poruka je unutar else-a");
        }

         */


        /*
        if(5 < 4) {
            System.out.println("Ovaj text je unutar if-a");
        } else if (5 < 3){
            System.out.println("Ovaj text je unutar prvog else/if-a");
        } else if (7 < 5){
            System.out.println("Ovaj text je unutar drugog else/if-a");
        }

         */


        /*
        //Zadatak za vezbu:
        //Deklarisati i inicijalizovati dva broja, izracunati njihov zbir i njihov proizvod i istampati sta je vece.

        int br1 = 5;
        int br2 = 6;

        int rezProzivod = br1 * br2;
        int rezZbir = br1 + br2;

        if(rezProzivod > rezZbir) {
            System.out.println("Rezultat prozivoda je veci od zbira");
        } else if (rezZbir > rezProzivod) {
            System.out.println("Zbir je veci od prozivoda");
        } else {
            System.out.println("Oni su jednaki");
        }

         */

        //Zadatak za vezbu:
        //Deklarisati i inicijalizovati neki ceo broj, ukoliko je deljiv sa 2, istampati poruku zajedno sa brojem, ukoliko nije,  istampati poruku o tome.

        /*
        //Primer1:
        Scanner scan1 = new Scanner(System.in);
        System.out.println("Uneti neki broj: ");

        int broj1 = scan1.nextInt();

        if(broj1 % 2 == 0) {
            System.out.println("Broj koji ste uneli je paran: " + "broj koji ste uneli je: " +  broj1);
        } else {
            System.out.println("Broj koji ste uneti nije paran: " + "broj koji ste uneli je: " + broj1);
        }

         */

        //Primer2

        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Uneti jedan  ceo broj: ");
        System.out.println("Uneti drugi ceo broj: ");

        int br1 = scan.nextInt();
        int br2 = scan.nextInt();

        if(br1 % 2 == 0) {
            System.out.println("Prvi broj je deljiv sa 2: " + br1);
        } else if (br2 % 2 == 0) {
            System.out.println("Drugi broj je deljiv sa 2: " + br2);
        } else {
            System.out.println("Ni jedan broj nije deljiv sa dva");
        }

         */

        //Operator && - i (true && true = true / false && true = false / false && false = false)
        //Operator ||  - ili (true || true = true / false || true = true / false || false = false)


        //Zadatak za vezbu:
        //Uneti broj godina preko Scannera, ukoliko imate 18 i vise, ispisati poruku da mozete da konzumirate alkohol, u suprtonom ispisi da ne mozes.

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite broj godina: ");

        int brojGodina = scan.nextInt();

        if(brojGodina >= 18) {
            System.out.println("Osoba moze da konzumira alkohol jer ima: " + brojGodina + " godina.");
        } else {
            System.out.println("Osoba je mladja od 18 godina, ne moze da konzumira alkohol" + brojGodina + " godina.");
        }


        //Zadatak za vezbu:
        //Uneti preko Scannera naziv meseca u godini, ukoliko je unet Jul ili Avgust, ispisati poruku da je vrucina prevelika,
        // u slucaju da je neki drugi mesec, ispisati poruku da nije tako strasno.

        Scanner skener = new Scanner(System.in);
        System.out.println("Uneti jedan mesec u godini: ");

        String mesec = skener.nextLine();

        if(mesec.trim().equalsIgnoreCase("Jul") || mesec.trim().equalsIgnoreCase("Avgust")) {
            System.out.println("Mesec Jul i Avgust je prevelika vrucina: ");
        } else {
            System.out.println("Izabrali ste drugi mesec u kome nije prevelika vrucina: ");
        }

    }
}
