import java.util.Random;

public class PetiCasZadatak4 {
    public static void main(String[] args) {


        //Zadatak
        //a) Kreirati niz sa 5 nasumicnih brojeva:
        //b) Izracunati sumu parnih brojeva u nizu
        //c) Istampati sve brojeve koji u ostatku pri deljenju sa 5 vracaju 3


        int[] niz = {2, 13, 8, 130, 45};

        int[] niz1 = new int[5];
        Random r = new Random();
        int suma = 0;

        for (int i = 0; i < niz1.length; i ++) {
            niz1[i] = r.nextInt(20);
        }

        for(int i = 0; i < niz1.length; i++) {
            if(niz1[i] % 2 == 0) {
                suma += niz1[i];
            }
        }
        System.out.println("Suma parnih brojeva niza je: " + suma);

        int rez = 0;
        for(int i = 0; i < niz1.length; i++) {
            if(niz1[i] % 5 == 3) {
                rez += niz1[i];
            }
        }
        System.out.println("Ostatak pri deljenju su : " + rez);
    }
}
