public class Zadatak1 {
    public static void main(String[] args) {

        //Zadatak 1:
        //Napraviti metodu koja kao argument prima niz celih brojeva i stampa
        //sve brojeve koji su deljivi sa 3 i sa 4.

        int[] nizBrojeva = {12, 24, 22, 12};

        System.out.println("Brojevi deljivi sa 3 i 4:");
        deljiviBrojeviSa3i4(nizBrojeva);
    }
    public static void deljiviBrojeviSa3i4(int[] nizBrojeva) {

        for(int i = 0; i < nizBrojeva.length; i++) {
            if(nizBrojeva[i] % 3 == 0 && nizBrojeva[i] % 4 == 0) {
                System.out.println(nizBrojeva[i]);;
            }
        }

    }

}
