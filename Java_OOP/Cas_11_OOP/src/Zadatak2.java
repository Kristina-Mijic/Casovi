import java.util.ArrayList;

public class Zadatak2 {
    public static void main(String[] args) {
        //Zadatak 2:
        //1.1 Napraviti listu sa 20 parnih brojeva, izracunati sumu elemenata liste.
        //1.2 Iz date liste izbaciti sve elemente deljive sa 4

        ArrayList<Integer> listaParnihBrojeva = new ArrayList<>();

        int suma = 0;
        for(int i = 0; i < 42; i+=2) {
            listaParnihBrojeva.add(i);
            suma += i;
        }
        System.out.println(listaParnihBrojeva);


        /*int suma = 0;
        for(int i = 0; i < listaParnihBrojeva.size(); i++) {
            suma += listaParnihBrojeva.get(i);
        }*/
        System.out.println(suma);

        for(int i = 0; i < listaParnihBrojeva.size(); i++) {
            if(listaParnihBrojeva.get(i) % 4 == 0) {
                listaParnihBrojeva.remove(i);
            }
        }
        System.out.println(listaParnihBrojeva);
    }
}
