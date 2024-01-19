public class Zadatak7i8 {
    public static void main(String[] args) {
        //Zadatak 7:
        //Napraviti metodu koja prima niz celih brojeva i vraca minimum.
        //Zadatak 8:
        //Napraviti metodu koja prima 3 niza, racuna minimum za svaki niz i kao rezultat vraca zbir svih minimuma.

        int[] nizBrojeva1 = {2, 30, 54, 15, 3, 4, 8};
        int[] nizBrojeva2 = {3, 50, 64, 6, 4, 7, 5};
        int[] nizBrojeva3 = {2, 60, 44, 65, 43, 4, 8};

       // System.out.println(zbirSvihMinimuma(nizBrojeva1, nizBrojeva2, nizBrojeva3));

        System.out.println("Zbir svih min: " + sumaSvihMin(nizBrojeva1, nizBrojeva2, nizBrojeva3));

        System.out.println("Zbir svih max: " + zbirSvihMax(nizBrojeva1, nizBrojeva2, nizBrojeva3));
    }

    public static int vracaMinimum(int[] nizCelihBrojeva) {
        int minimum = nizCelihBrojeva[0];

        for(int nizBrojeva: nizCelihBrojeva) {
            if(nizBrojeva < minimum) {
                minimum = nizBrojeva;
            }
        }
        return minimum;
    }

    public static int zbirSvihMinimuma(int[] niz1, int[] niz2, int[] niz3) {
        int min1 = vracaMinimum(niz1);
        int min2 = vracaMinimum(niz2);
        int min3 = vracaMinimum(niz3);
        int rezultatMinimuma = min1 + min2 + min3;

        return rezultatMinimuma;

    }


    //
    public static int vratiMin(int[] nizBrojeva) {
        int min = nizBrojeva[0];

        for(int i = 0; i < nizBrojeva.length; i++) {
            if(nizBrojeva[i] < min) {
                min = nizBrojeva[i];
            }
        }
        return min;
    }

    public static int sumaSvihMin(int[] niz1, int[] niz2, int[] niz3) {
        int min1 = vratiMin(niz1);
        int min2 = vratiMin(niz2);
        int min3 = vratiMin(niz3);

        int rezultatMin = min1 + min2 + min3;
        return rezultatMin;
    }


    //
    public static int vratiMax(int[] nizBrojeva) {
        int max = nizBrojeva[0];

        for(int i = 0; i < nizBrojeva.length; i++) {
            if(nizBrojeva[i] > max) {
                max = nizBrojeva[i];
            }
        }
        return max;
    }

    public static int zbirSvihMax(int[] niz1, int[] niz2, int[] niz3) {
        int max1 = vratiMax(niz1);
        int max2 = vratiMax(niz2);
        int max3 = vratiMax(niz3);

        int rezultatMax = max1 + max2 + max3;
        return rezultatMax;
    }
}
