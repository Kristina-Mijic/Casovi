import java.util.Arrays;

public class Zadatak6 {
    public static void main(String[] args) {

        //Zadatak 6:
        //Napraviti metodu koja prima dva niza brojeva i kao rezultat vraca
        //konkatenaciju ta dva niza (spojiti dva niza u jedan veci niz).

        int[] nizBrojeva1 = {1, 2, 3, 4};
        int[] nizBrojeva2 = {5, 6, 7, 8};
        int[] nizBrojeva3 = {9, 10, 11, 12};

        int[] nizBr4 = {1, 2, 3, 4, 5};

        System.out.println("Prvi niz:");
        System.out.println(Arrays.toString(nizBrojeva1));

        System.out.println("Drugi niz:");
        System.out.println(Arrays.toString(nizBrojeva2));

        System.out.println("Novi niz:");
        System.out.println(Arrays.toString(spajanjeBrojevaUNoviNiz(nizBrojeva1, nizBrojeva2)));


        System.out.println("vezba:");
        System.out.println(Arrays.toString(spajanjeNizovaUNovi(nizBrojeva1, nizBrojeva2, nizBrojeva3)));

        System.out.println("Vezbanje: obrnuti niz");
        System.out.println(Arrays.toString(obrnutRedposled(nizBr4)));
    }
    public static int[] spajanjeBrojevaUNoviNiz(int[] niz1, int[] niz2) {

        int[] noviNizBrojeva = new int[niz1.length + niz2.length];
        int noviIndex = 0;

        for(int i = 0; i < niz1.length; i++) {
           noviNizBrojeva[noviIndex++] = niz1[i];
        }

        for(int i = 0; i < niz2.length; i++) {
            noviNizBrojeva[noviIndex++] = niz2[i];
        }

        return noviNizBrojeva;
    }


    public static int[] spajanjeNizovaUNovi(int[] niz1, int[] niz2, int[] niz3) {
        int[] noviNiz = new int[niz1.length + niz2.length + niz3.length];
        int noviIndex = 0;

        for(int i = 0; i < niz1.length; i++) {
            noviNiz[noviIndex++] = niz1[i];
        }

        for(int i = 0; i < niz2.length; i++) {
            noviNiz[noviIndex++] = niz2[i];
        }

        for(int i = 0; i < niz3.length; i++) {
            noviNiz[noviIndex++] = niz3[i];
        }

        return noviNiz;
    }

    public static int[] obrnutRedposled(int[] niz1) {
        int[] noviNiz = new int[niz1.length];

        for(int i = 0; i < niz1.length; i++) {
            noviNiz[i] = niz1[(niz1.length-i)-1];
        }
        return noviNiz;
    }
}
