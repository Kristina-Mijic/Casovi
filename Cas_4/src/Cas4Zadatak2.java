import java.util.Scanner;

public class Cas4Zadatak2 {
    public static void main(String[] args) {

        //Zadatak:
        //Uneti neki broj preko konzole. Kao rezultat vratiti sumu parnih brojeva do tog broja.

        Scanner skener = new Scanner(System.in);
        System.out.println("Unesite neki broj, ciju sumu cemo racunati: ");

        int broj = skener.nextInt();
        int suma = 0;

        while (broj > 0) {
            if(broj % 2 == 0) {
                suma += broj;
                broj--;
            } else {
                broj--;
            }
        }
        System.out.println("Rezultat je: " + suma);
    }
}
