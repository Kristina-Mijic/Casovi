public class ForPetnjaZadatak2 {
    public static void main(String[] args) {

        //Zadatak2:
        //Izracunati sumu prvih 20 parnih brojeva.

        int suma = 0;
        for(int i = 0; i <= 20; i++) {
            if(i % 2 == 0) {
                suma += i;
            }
        }
        System.out.println("Suma prvih 20 parnih brojeva je: " + suma);
    }
}
