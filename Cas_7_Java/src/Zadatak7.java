public class Zadatak7 {
    public static void main(String[] args) {
        //Zadatak 6:
        //Napraviti metodu koja prima niz brojeva, i broji parne brojeve u tom nizu.

        int[] nizBrojeva = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15, 16};

        int rez = parniBrojevi(nizBrojeva);
        System.out.println(rez);

    }
    public static int parniBrojevi(int[] x) {
       int sumaParnihBrojeva = 0;

       for(int p: x) {
           if(p % 2 == 0) {
               sumaParnihBrojeva ++;
           }
       }
        return sumaParnihBrojeva;
    }
}
