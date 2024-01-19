import java.util.ArrayList;

public class Rekreativac extends Maratonac {
    public Rekreativac(int brojGodinaMaratonca, ArrayList<Staza> listaStazaKojeJeIstrcao) {
        super(brojGodinaMaratonca, listaStazaKojeJeIstrcao);
    }

    @Override
    public double humanitarnaAkcija() {
        return ukupnaKilometraza() * 30;
    }
}
