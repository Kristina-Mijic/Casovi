import java.util.Scanner;

public class Cas4Zadatak4 {
    public static void main(String[] args) {

        //Zadatak:
        //Inicijalizovati neku int promenljivu 1-10.
        // Zatim u konzoli pokusajte da pogodite koji ste broj uneli, takodje ispisati i broj pokusaja koji je trebao.


        Scanner scan = new Scanner(System.in);

        int broj = 9;
        int brojac = 0;
        int unesiBr = 0;

        while (broj != unesiBr) {
            System.out.println("Unesite broj 1-10: ");
            unesiBr = scan.nextInt();
            brojac++;
        }
        System.out.println("Broj pokusaja je: " + brojac);

    }
}
