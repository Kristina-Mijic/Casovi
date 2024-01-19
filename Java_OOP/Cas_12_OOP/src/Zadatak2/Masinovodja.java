package Zadatak2;

// Klasa Masinovodja nasledjuje klasu Radnik, poseduje dodatni atribut za osiguranje(boolean)
public class Masinovodja extends Radnik {

    private boolean osiguranje;
    public Masinovodja(int id, double plata, int godinaZaposlenja, boolean osiguranje) {
        super(id, plata, godinaZaposlenja);
        this.osiguranje = osiguranje;
    }


@Override
    public double izracunajUkupnuZaradu() {
       double ukupno = 0;
       ukupno = (izracunajRadniStaz() * getPlata());
       ukupno *= 0.9;
       return ukupno;
    }
}
