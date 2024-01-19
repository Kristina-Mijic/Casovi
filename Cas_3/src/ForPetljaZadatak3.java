import java.util.Scanner;

public class ForPetljaZadatak3 {
    public static void main(String[] args) {

        //ZADATAK3:
        //Uneti broj preko Scannera pa zatim izracunati njegov faktorijel.

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite neki broj ciji faktorijel zelite da izracunate: ");
        int broj = scan.nextInt();

        int faktorijel = 1;

        for(int i = 1; i <= broj; i++) {
            faktorijel *= i;
        }
        System.out.println("Faktorijel broja: " + broj + " je: " + faktorijel);

    }
}
