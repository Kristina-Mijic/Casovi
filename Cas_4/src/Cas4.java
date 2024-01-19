import java.util.Scanner;

public class Cas4 {
    public static void main(String[] args) {

        //WHILE / DO-WHILE

        //Zadatak:
        //Uneti jedan broj od 1 do 100 i istampati njegov redosled unazad.

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesi neki broj 1-100: ");

        int broj = scan.nextInt();

        while (broj > 0) {
            System.out.println(broj);
            broj--;
        }

    }

}
