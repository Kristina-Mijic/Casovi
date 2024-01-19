import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //ArrayList i LinkedList - razlika je samo u brzini
        // Liste koistimo tako sto navodimo tip podatka -> ArrayList<ime tipa koji ce biti nasa lista>
        //Liste imaju dosta ugradjenih metoda, i samim tim olaksavaju posao
        // size - isto kao length kod nizova

        //Reper klasa -> <Integer>

        ArrayList<Integer> list = new ArrayList<>(); //Nije nam velicina fisirana, ne moramo da unosimo velicinu kao kod nizova.
        list.add(1); // Nasa lista izgleda: {5}
        list.add(2);
        list.add(3);
        System.out.println(list); // [1, 2, 3]

        list.add(1, 6); //Ubacujemo broj 3 na index 1
        System.out.println(list); // [1, 6, 2, 3]

        list.remove(1); // remove po INDEXU i po OBJEKTU!
        System.out.println(list); // [1, 2, 3]

        int a = list.get(2); //Get z j poziciji
        System.out.println(a); // stampa broj 3, jer na je broj 3 na poziciji tj indexu 2

        list.size(); //vraca velicinu liste
        System.out.println(list.size()); // velicina je 3

        list.isEmpty(); // vraca boolean rezultat, da li je nasa lista prazna ili nije
        System.out.println(list.isEmpty()); //false -> jer nije prazna lista; true-> kada je prazna lista



        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(14);
        lista2.add(15);
        lista2.add(16);

        for(int i = 0; i < lista2.size(); i++) {
            if(lista2.get(i) == 16) { //get(i) je isto sto i [i]
                System.out.println("Pronadjen je broj!");
            }
        }



    }
}