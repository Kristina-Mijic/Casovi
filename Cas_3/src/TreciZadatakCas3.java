import java.util.Scanner;

public class TreciZadatakCas3 {
    public static void main(String[] args) {
        //Zadatak:
        //Clanstvo za knjizaru je 2000 dinara.
        // Uneti vas status (Penzioner, student), ukoliko ste penzioner vasa clanarina je 40% na popustu, ukoliko ste student onda 20% u suprotnom nema popusta.


        Scanner skener = new Scanner(System.in);

        System.out.println("Unesite status, da li ste penzioner ili student");
        String statusOsobe = skener.nextLine();
        statusOsobe = statusOsobe.toLowerCase();

        double clanarina = 2000;

        switch (statusOsobe) {
            case "penzioner":
                clanarina *= 0.6;
                System.out.println("Penzioner " + clanarina);
                break;

            case "student":
                clanarina *= 0.8;
                break;

            default:
                System.out.println("Osoba nije ni penzioner ni student");
                break;
        }
        System.out.println("Clanarina je: " + clanarina);
    }
}
