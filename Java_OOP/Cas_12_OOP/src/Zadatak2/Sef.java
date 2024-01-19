package Zadatak2;

//Klasa Sef nasledjuje klasu Radnik i ukoliko je sef tu duze od 10 godina, dobija povisicu od 60%.

public class Sef extends Radnik {

    public Sef(int id, double plata, int godinaZaposlenja) {
        super(id, plata, godinaZaposlenja);
    }

    @Override
    public void izracunajBonus() {
        double pomocna = 0;
        if(izracunajRadniStaz() > 10) {
            pomocna = getPlata() * 1.6;
            setPlata(pomocna);
        }
    }

    public double izracunajUkupnuZaradu() {
        if(getGodinaZaposlenja() > 10) {
            return getPlata() * 0.6;
        } else {
            return 0;
        }
    }
}
