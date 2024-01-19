import java.util.Scanner;

public class Cas4Zadatak6 {
    public static void main(String[] args) {

        //Zadatak:
        //Uzeti brojeve od 1 do 100 i izracunati:
        //-sumu parnih
        //-sumu neparnih
        //-sumu prostih // deljivi sa 1 i samim sobom

        int sumaParnihBrojeva = 0;
        int sumaNeparnihBrojeva = 0;

        for(int i = 1; i < 100; i++) {
            if(i % 2 == 0) {
                sumaParnihBrojeva += i;
            } else {
                sumaNeparnihBrojeva += i;
            }
        }
        System.out.println("Suma parnih brojeva je: " + sumaParnihBrojeva);
        System.out.println("Suma neparnih brojeva je: " + sumaNeparnihBrojeva);
    }
}
