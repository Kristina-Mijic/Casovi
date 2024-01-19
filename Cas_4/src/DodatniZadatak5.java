import java.util.Scanner;

public class DodatniZadatak5 {
    public static void main(String[] args) {

        //Zadatak (napredniji):
        //Ucititavati brojeve sve dok se ne unese broj 0. Ispisati minimalan broj koji je unet.

        Scanner skener = new Scanner(System.in);

        int minim = -Integer.MAX_VALUE;
        System.out.println("Unesi neki broj: ");
        int broj = skener.nextInt();


     do {
         System.out.println("Unesite broj: ");
         broj = skener.nextInt();

         if(minim < broj) {
             minim = broj;
         }
     } while (broj != 0);

        System.out.println("Minimum broj koji je unet je: " + minim);




//        while(broj != 0) {
//            if(broj < minim) {
//                minim = broj;
//            } else {
//                System.out.println("Unesi broj opet: ");
//            }
//            broj = skener.nextInt();
//        }
//        System.out.println("Minimum broj koji je unet je: " + minim);
    }
}
