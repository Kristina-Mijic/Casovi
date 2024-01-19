package Zadatak2;

//Zadatak 2:
//Napraviti klasu Radnik koja ima:
//- id
//- platu
//- godinu zaposlenja
// takodje ima metodu za racunanje radnog staza, metodu za racunanje ukupne zarade od kad se radnik zaposlio
// i metodu za bonus koji daje radniku povisicu od 40% ukoliko je tu duze od 10 godina.
// Klasa Fizikalac nasledjuje klasu Radnik.
// Klasa Masinovodja nasledjuje klasu Radnik,
// poseduje dodatni atribut za osiguranje(boolean)
// i od ukupne zarade koju je radnik do tada zaradio oduzima 10% zbog osiguranja.
// Klasa Sef nasledjuje klasu Radnik i ukoliko je sef tu duze od 10 godina, dobija povisicu od 60%.

public abstract class Radnik {

    private int id;
    private double plata;
    private int godinaZaposlenja;


    public Radnik(int id, double plata, int godinaZaposlenja) {
        this.id = id;
        this.plata = plata;
        this.godinaZaposlenja = godinaZaposlenja;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    public int getGodinaZaposlenja() {
        return godinaZaposlenja;
    }

    public void setGodinaZaposlenja(int novaGodinaZaposlenja) {
        this.godinaZaposlenja = novaGodinaZaposlenja;
    }

    public int izracunajRadniStaz() {
        int trenutnaGodina = 2023;
        return trenutnaGodina - godinaZaposlenja;
    }

    public double ukupnaZarada() {
        double pomocna = 0;
        pomocna = (izracunajRadniStaz() * 12) * plata;
        return pomocna;
    }

    public void izracunajBonus() {
        if(izracunajRadniStaz() > 10) {
            plata *= 1.4;
        }
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "id=" + id +
                ", plata=" + plata +
                ", godinaZaposlenja=" + godinaZaposlenja +
                '}';
    }


    public abstract double izracunajUkupnuZaradu();
};

