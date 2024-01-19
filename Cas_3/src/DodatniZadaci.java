import java.util.Scanner;

public class DodatniZadaci {
    public static void main(String[] args) {

        //Dodatni zadaci:
        //1. Napisi program koji trazi od korisnika da unese redni broj dana u nedelji
        // (1 za ponedeljak, 2 za utorak, itd.).
        // Program treba koristiti switch da prikaže ime dana.
        // Pokriti uslov kada korisnik unese broj manji od 1 i broj veci od 7.

        Scanner scan = new Scanner(System.in);
        System.out.println("Unesite redni broj dana u nedelji: ");

        int brDanaUNedelji = scan.nextInt();

        switch (brDanaUNedelji) {
            case 1:
                System.out.println("Izabrali ste Ponedelja:");
                break;
            case 2:
                System.out.println("Izabrali ste Utorak:");
                break;
            case 3:
                System.out.println("Izabrali ste Sredu:");
                break;
            case 4:
                System.out.println("Izabrali ste Cetvrtak:");
                break;
            case 5:
                System.out.println("Izabrali ste Petak:");
                break;
            case 6:
                System.out.println("Izabrali ste Subotu:");
                break;
            case 7:
                System.out.println("Izabrali ste Nedelju:");
                break;
            default:
                System.out.println("Izabrali ste nepostojeci dan");
                break;
        }




        //2. Napisi program koji koristi for petlju da prikaže tabelu mnozenja za odredjeni broj
        // (npr. za broj 5). Program treba da ispise rezultate mnozenja od 1 do 10 za taj broj.

        int broj = 5;

        for(int i = 1; i <= 10; i++) {
           int suma = broj * i;
            System.out.println(broj + " * " + i + " = " + suma);
        }
    }
}
