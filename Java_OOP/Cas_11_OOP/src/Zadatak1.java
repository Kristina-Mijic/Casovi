import java.util.ArrayList;

public class Zadatak1 {
    public static void main(String[] args) {
        //Zadatak:
        //Kreirati listu brojeva i ubaciti u nju 20 neparnih brojeva, zatim izbaciti sve koji su deljivi sa 5.

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 1; i< 41; i+=2) {
            lista.add(i);
        }
        System.out.println(lista);

        for(int i = 0; i< lista.size(); i++) {
            if (lista.get(i) % 5 == 0) {
                lista.remove(i);
            }
        }
        System.out.println(lista);


    }


}
