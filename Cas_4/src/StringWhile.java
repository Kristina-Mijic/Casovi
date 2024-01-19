import java.util.Scanner;

public class StringWhile {
    public static void main(String[] args) {

        //Zadatak:
        //Uneti neki String preko konzole sve dok ne unesemo "."
        // Kao rezultat istampati sta smo pre te tacke uneli.

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite neki string: ");

        String uneto = "";
        String input = "";

        do {
            uneto += input;
            input = scan.nextLine();
        } while (!(input.equalsIgnoreCase(".")));

        System.out.println(uneto);


    }
}

//while((!(input.contains(".")) -> ovo vazi ukoliko neki string ima tacku u sebi