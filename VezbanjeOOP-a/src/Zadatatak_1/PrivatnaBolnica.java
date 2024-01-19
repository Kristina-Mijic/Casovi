package Zadatatak_1;

public class PrivatnaBolnica extends Bolnica {

    @Override
    public double zarada() {
        double ukupnaZarada = 0;
        for (Doktor doktor : getListaLekara()) {
            ukupnaZarada += doktor.getListaPacijenata().size() * 100.0;
        }
        return ukupnaZarada;
    }
}
