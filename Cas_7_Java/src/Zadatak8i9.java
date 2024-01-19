public class Zadatak8i9 {
    public static void main(String[] args) {
        //Zadatak 7:
        //Napraviti metodu koja prima niz celih brojeva i vraca minimum.

        //Zadatak 8:
        //Napraviti metodu koja prima 3 niza, racuna minimum za svaki niz i kao rezultat vraca zbir svih minimuma.

        int[] nizBrojeva1 = {2, 3, 4, 5, 6, 7, 8, 9};
        int[] nizBrojeva2 = {3, 6, 8, 9, 20};
        int[] nizBrojeva3 = {5, 6, 7, 8, 9, 10};

        int niz1 = minimum(nizBrojeva1);
        System.out.println(niz1);

        System.out.println(minSvihBrojeva(nizBrojeva1,nizBrojeva2, nizBrojeva3));
    }
    //7:
    public static int minimum(int[] niz) {
        //int minimum = Integer.MIN_VALUE;
        int minimum = niz[0];

        for(int pivot:niz) {
            if(pivot < minimum) {
                minimum = pivot;
            }
        }
        return minimum;
    }
    //8
    public static int minSvihBrojeva(int[] a, int[] b, int[] c) {
        int minA = minimum(a);
        int minB = minimum(b);
        int minC = minimum(c);

        int rezultat = minA + minB + minC;
        return rezultat;
    }
}
