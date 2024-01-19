import java.util.Arrays;

public class Zadatak3 {
    public static void main(String[] args) {

        //Zadatak 3:
        //Napraviti metodu koja prima pet nizova celih brojeva i racuna
        //maksimum za svaki niz, zatim racuna i vraca zbir tih maksimuma.

        int[] niz1 = {2, 3, 4, 10, 6};
        int[] niz2 = {6, 7, 8, 10, 6};
        int[] niz3 = {4, 3, 10, 5, 6};
        int[] niz4 = {1, 10, 7, 5, 6};
        int[] niz5 = {9, 3, 4, 10, 8};

        System.out.println("Zbir svih maksimuka iz sva pet niza je:");
        System.out.println(zbirMax(niz1, niz2, niz3, niz4, niz5));


        System.out.println("Zbir minumima iz 4 niza:");
        System.out.println(zbirMinimuma(niz1, niz2, niz3,niz4));
    }
    public static int zbirMax(int[] niz1, int[] niz2, int[] niz3, int[] niz4, int[] niz5) {
        int max1 = vratiMaxBroj(niz1);
        int max2 = vratiMaxBroj(niz2);
        int max3 = vratiMaxBroj(niz3);
        int max4 = vratiMaxBroj(niz4);
        int max5 = vratiMaxBroj(niz5);

        int rezultatMax = max1 + max2 + max3 +max4 + max5;
        return rezultatMax;
    }
    public static int vratiMaxBroj(int[] broj) {

        int maxBroj = 0;
        for(int i = 0; i < broj.length; i++) {
            if(broj[i] > maxBroj) {
                maxBroj = broj[i];
            }
        }
        return maxBroj;
    }

    //Zbir svih minimuma!
    public static int zbirMinimuma(int[] niz1, int[] niz2, int[] niz3, int[] niz4) {
        int min1 = vratiMinBroj(niz1);
        int min2 = vratiMinBroj(niz2);
        int min3 = vratiMinBroj(niz3);
        int min4 = vratiMinBroj(niz4);

        int rezultatMin = min1 + min2 + min3 + min4;
        return rezultatMin;
    }

    public static int vratiMinBroj(int[] broj) {

        int minBroj = broj[0];

        for(int i = 0; i < broj.length; i++) {
            if(broj[i] < minBroj) {
                minBroj = broj[i];
            }
        }
        return minBroj;
    }
}
