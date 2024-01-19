import java.util.Scanner;

public class CetvrtiZadatakCas3 {
    public static void main(String[] args) {

        //Zadatak :
        //Napiši program koji traži od korisnika da unese dva broja
        // i operaciju (sabiranje, oduzimanje, množenje, deljenje).
        // Korišćenjem switch iskoristi unetu operaciju i izračunaj rezultat.

        Scanner scan = new Scanner(System.in);

        System.out.println("Unesite prvi broj: ");
        double broj1 = scan.nextDouble();

        System.out.println("Unesite drugi broj: ");
        double broj2 = scan.nextDouble();

        System.out.println("Unesite operaciju: ");

        scan.nextLine(); //ovim praznimo scan

        double rezultat = 0;
        String operacija = scan.nextLine();

        
        switch (operacija) {
            case "+":
                rezultat = broj1 + broj2;
                System.out.println("Rezultat za sabiranje je: " + rezultat);
                break;
                
            case "-":
                rezultat = broj1 - broj2;
                System.out.println("Rezultat za oduzimanje je: " + rezultat);
                break;

            case "*":
                rezultat = broj1 * broj2;
                System.out.println("Rezultat za mnozenje je: " + rezultat);
                break;

            case "/":
                rezultat = broj1 / broj2;
                System.out.println("Rezultat za deljenje je: " + rezultat);
                break;

            default:
                System.out.println("Niste uneli odgovarajucu operaciju");
                break;
        }



    }
}
