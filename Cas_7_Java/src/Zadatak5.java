public class Zadatak5 {
    public static void main(String[] args) {

        //Zadatak 4:
        //Napraviti metodu koja prima dva cela broja
        // i izracunava razliku tako sto veci oduzima od manjeg.

        int br1= 250;
        int br2 = 150;

        int rezultat = razlikaBrojeva(br1, br2);
        System.out.println(rezultat);
    }

    public static int razlikaBrojeva(int a, int b) {
        //int suma = a - b;
       // return suma;

        int razlika = 0;
        if(a > b) {
            razlika = a - b;
        } else {
            razlika = b - a;
        }
        return razlika;
    }
}
