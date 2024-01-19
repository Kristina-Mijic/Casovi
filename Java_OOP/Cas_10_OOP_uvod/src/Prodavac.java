public class Prodavac {
    //Zadatak 1:
    //Napraviti klasu Prodavac koja ima ime, prezime i godinu zaposlenja, takodje ima metod koji vraca radni staz prodavca. Istampati podatke u prodavcu.
    String ime;
    String prezime;
    int godinaZaposlenja;

    public Prodavac(String ime, String prezime, int godinaZ) {
        this.ime = ime;
        this.prezime = prezime;
        this.godinaZaposlenja = godinaZ;
    }

    public int radniStazProdavca( ){

        int godinaRezultat = 2023 - godinaZaposlenja;
        return godinaRezultat;
    }

    public String toString() {
        return ime + " " + prezime + ", radni staz osobe: " +  radniStazProdavca() + " godine";
    }

}
