import java.util.Scanner;

public class DrugiZadatakCas3 {
    public static void main(String[] args) {

        //Zadatak:
        //Uneti preko Scanner-a naziv meseca u godini i ispisati koliko taj mesec ima dana.

        Scanner scan = new Scanner(System.in);
        System.out.println("Uneti mesec u godini");

        String mesec = scan.nextLine();
        mesec = mesec.toLowerCase();

        switch (mesec) {
            case "januar","mart", "maj", "jul", "avgust", "oktobar", "decembar":
                System.out.println("Mesec ima 31 dan");
                break;
            case "februar":
                System.out.println("Mesec ima 28 dana");
                break;
            case "april", "jun", "septembar", "novembar":
                System.out.println("Mesec ima 30 dana");
                break;
            default:
                System.out.println("Uneli ste nepostojeci mesec");
                break;
        }


    }
}
