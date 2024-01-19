import java.util.ArrayList;

public class Amater extends Maratonac {
    public Amater(int brojGodinaMaratonca, ArrayList<Staza> listaStazaKojeJeIstrcao) {
        super(brojGodinaMaratonca, listaStazaKojeJeIstrcao);
    }

    @Override
    public double humanitarnaAkcija() {
        return getListaStazaKojeJeIstrcao().size() * 1000;
    }
}
