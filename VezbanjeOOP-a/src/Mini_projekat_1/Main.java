package Mini_projekat_1;

public class Main {
    public static void main(String[] args) {

        Agencija agencija1 = new Agencija();
        agencija1.dodajStambeniObjekat(new Kuca("Beograd", 15000, 100));
        agencija1.dodajStambeniObjekat(new Stan("Novi Sad", 8000, 50, true));
        agencija1.dodajStambeniObjekat(new Stan("Nis", 1000, 80, false));

        Agencija agencija2 = new Agencija();
        agencija2.dodajStambeniObjekat(new Stan("Novi Sad", 90000, 75, true));
        agencija2.dodajStambeniObjekat(new Kuca("Nis", 120000, 100));

        AgencijskiPortal portal = new AgencijskiPortal();
        portal.ubaci(agencija1);
        portal.ubaci(agencija2);

        System.out.println("Najvrednija agencija: " + portal.najvrednije());

        agencija1.izbaciBezTerase();
        System.out.println("Agencija 1 nakon izbacivanja stanova bez terase: " + agencija1.getListaStambenihObj());

    }
}
