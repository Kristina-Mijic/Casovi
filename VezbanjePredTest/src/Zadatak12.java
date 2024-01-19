public class Zadatak12 {
    public static void main(String[] args) {
        //2.Napraviti metodu koja prima neki pozitivan ceo broj i ispisuje sve neparne brojeve od 0 do tog broja.


        //ispisujeNeparneBrojeve(8);
        System.out.println("Neparni brojevi:");
        neparniBrojevi(10);
        System.out.println("Parni brojevi:");
        parniBrojevi(10);

        System.out.println("Broj parnih brojeva do 7:");
        System.out.println(ukupanBrojParnihBr(7));

        System.out.println("Broj neparnih brojeva do 7:");
        System.out.println(ukupanBrojNeparnihBr(7));
    }

    public static void ispisujeNeparneBrojeve(int broj) {

        for(int i = 0; i < broj; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void neparniBrojevi(int broj) {

        for(int i = 0; i < broj; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public static void parniBrojevi(int broj) {

        for(int i = 0; i < broj; i++) {
            if(i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    public static int ukupanBrojParnihBr(int br) {
        int brojac = 0;

        for(int i = 0; i < br; i++) {
            if(i % 2 == 0) {
                brojac++;
            }
        }
        return brojac;
    }

    public static int ukupanBrojNeparnihBr(int broj) {
        int brojac = 0;

        for(int i = 0; i <= broj; i++) {
            if(i % 2 == 1) {
                brojac++;
            }
        }
        return brojac;
    }
}
