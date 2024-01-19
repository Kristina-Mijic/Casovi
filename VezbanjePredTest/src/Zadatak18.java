import java.util.Arrays;

public class Zadatak18 {
    public static void main(String[] args) {
        //Saberi dva niza:

        int[] nizBrojeva = {1, 2, 5};
        int[] nizBrojeva2 = {1, 2};

        System.out.println(Arrays.toString(sabiranjeDvaNiza(nizBrojeva, nizBrojeva2)));
    }

    public static int[] sabiranjeDvaNiza(int[] niz1, int[] niz2) {
        int[] noviNiz = new int[min(niz1.length, niz2.length)];

        for(int i = 0; i < noviNiz.length; i++ ) {
            noviNiz[i] = niz1[i] + niz2[i];
        }
        return noviNiz;
    }

    public static int min(int broj1, int broj2) {
        int min = 0;
        if(broj1 > broj2) {
            min = broj2;
        } else {
            min = broj1;
        }
        return min;
    }
}
