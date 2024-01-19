import java.util.Scanner;

public class Cas6Zadatak4 {
    public static void main(String[] args) {

        //Zadatak:
        //Napraviti metodu koja prima dva cela broja,
        // racuna njihov zbir i ispisuje nam poruku ukoliko je zbir paran ili neparan.

                    //PRIMER 1
        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite prvi broj: ");
        int prviBroj = skener.nextInt();

        System.out.println("Unesite drugi broj: ");
        int drugiBroj = skener.nextInt();

        daLiJeZbirParan(prviBroj, drugiBroj);


                    //PRIMER 2:

        //int x = 9;
        //int y = 3;
        //System.out.println("Zbir brojeva " + x + " + " + y);
        //daLiJeZbirParan(x, y);
    }
    public static void daLiJeZbirParan(int a, int b) {

        int zbir = a + b;

        if(zbir % 2 == 0) {
            System.out.println("Zbir je paran! Rezultat je " + zbir);
        } else {
            System.out.println("Zbir NIJE paran! Rezultat je " + zbir);
        }
    }
}
