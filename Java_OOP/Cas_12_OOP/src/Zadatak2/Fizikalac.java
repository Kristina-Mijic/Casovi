package Zadatak2;

// Klasa Fizikalac nasledjuje klasu Radnik.

public class Fizikalac extends Radnik {

    public Fizikalac(int id, double plata, int godinaZaposlenja) {
        super(id, plata, godinaZaposlenja);
    }

    @Override
    public double izracunajUkupnuZaradu() {
        return 0;
    }
}
