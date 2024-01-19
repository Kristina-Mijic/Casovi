package VezbanjeListe;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //Zadatak 1:
        //Kreirati listu brojeva i ubaciti u nju 20 neparnih brojeva, zatim izbaciti sve koji su deljivi sa 5.

        ArrayList<Integer> lista = new ArrayList<>();

        for(int i = 1; i < 41; i+=2) {
           lista.add(i);
        }
        //System.out.println(lista);

        for(int i = 1; i < lista.size(); i++) {
            if(lista.get(i) % 5 == 0) {
                lista.remove(i);
            }
        }
        //System.out.println(lista);



        //Zadatak 2:
        //1.1 Napraviti listu sa 20 parnih brojeva, izracunati sumu elemenata liste.
        //1.2 Iz date liste izbaciti sve elemente deljive sa 4

        ArrayList<Integer> lista2 = new ArrayList<>();

        int suma = 0;
        for(int i = 0; i < 42; i += 2) {
            lista2.add(i);
            suma += i;
        }
        System.out.println(lista2);
        System.out.println(suma);

        for(int i = 0; i < lista2.size(); i++) {
            if(lista2.get(i) % 4 == 0) {
                lista2.remove(i);
            }
        }
        System.out.println(lista2);

    }
}