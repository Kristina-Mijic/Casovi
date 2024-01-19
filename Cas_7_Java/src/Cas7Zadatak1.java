import java.util.Scanner;

public class Cas7Zadatak1 {
    public static void main(String[] args) {

        //Napravi metodu koja prima i kreira niz te velicine.

        int a = 5;
        int[] niz = unesiNiz(a);
        stampaj(niz);

    }
    public static void stampaj(int[] niz) {
        for(int n: niz) {
            System.out.println(n);
        }
    }

    public static int[] unesiNiz(int n) {
        int[] rezultat = new int[n];
        boolean[] niz = new boolean[4];

        Scanner skener = new Scanner(System.in);
        for(int i=0; i < n; i++) {
            System.out.println("Unesi broj: ");
            rezultat[i] = skener.nextInt();
        }
        return rezultat;
    }

}
