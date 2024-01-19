public class Zadatak3 {
    public static void main(String[] args) {

        //3. Napraviti metodu koja prima 3 niza celih brojeva,
        // trazi minimum za svaki niz pa zatim vraca najmanji od ta tri.

        int[] niz1 = {3, 4, 6, 7, 5};
        int[] niz2 = {7, 4, 6, 7, 5};
        int[] niz3 = {10, 4, 6, 7, 5};

        System.out.println(vratiNajmanjiBroj(niz1, niz2, niz3));
    }
    public static int minimum(int[] niz) {
        int minimum = niz[0];

//        for(int nizz:niz) {
//            if(nizz < minimum) {
//                minimum = nizz;
//            }
//        }

        for(int i = 1; i < niz.length; i++) {
            if(niz[i] < minimum) {
                minimum = niz[i];
            }
        }
        return minimum;
    }
    public static int vratiNajmanjiBroj(int[] niz1, int[] niz2, int[] niz3) {
        int min1 = minimum(niz1);
        int min2 = minimum(niz2);
        int min3 = minimum(niz3);

        int[] minimNiz = {min1, min2, min3};
        return minimum(minimNiz);
    }

}
