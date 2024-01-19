public class Cas6 {
    public static void main(String[] args) {

                            //FUNJKCIJE - metode


        //Zadatak 1:
        //Napraviti metodu koja ce kao argument primati 3 int-a i vratiti srednju vrednost.

        int a = 5;
        int b = 3;
        int c = 6;

        //Primer 1
        //System.out.println(srednjaVrednost(a, b, c));

        //Primer 2
        int srednje = srednjaVrednost(a, b, c);
        System.out.println(srednje);
    }

    public static int srednjaVrednost(int x, int y, int z) {

        int suma = x + y + z;
        suma = suma/3;
        return suma;
    }


}
