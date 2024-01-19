public class PetiCasZadatak2 {
    public static void main(String[] args) {
        //Zadatak:
        //Napraviti niz imena.Iterirati kroz niz dok ne naidjete na ime "Jelena",
        // cim naidjete na to ime, ispisati poruku i prekinuti program da ne trazi dalje.

        String[] imena = {"Kristina", "Milica","jelena", "Marko", "Aleksandra", "Jelena", "Katarina"};
        int i = 0;

        while (!imena[i].equalsIgnoreCase("jelena")) {
            System.out.println(imena[i]);
            i++;
        }
        System.out.println("Dosli ste do ime Jelena, program se prekida");


        //II NACIN:

        for(int j = 0; j < imena.length; j++) {
            if(imena[j].equalsIgnoreCase("Jelena")) {
                System.out.println("Dosli ste do imena 'Jelena' , program se prekida");
                break;
            }
        }
    }
}
