import java.util.Scanner;

public class PrviZadatakCas3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite poziciu koju radite: ");
        String radnaPozicija = scan.nextLine();

        radnaPozicija = radnaPozicija.toLowerCase();

        switch (radnaPozicija) {
            case "masinovodja":
                System.out.println("Plata masinovodje je: " + 30000);
                break;
            case "fizikalac":
                System.out.println("Plata fizikalca je: " + 25000);
                break;
            case "sef":
                System.out.println("Plata sefa je: " + 50000);
                break;
            default:
                System.out.println("Uneli ste pogresnu radnu poziciju");
                break;
        }
    }
}
