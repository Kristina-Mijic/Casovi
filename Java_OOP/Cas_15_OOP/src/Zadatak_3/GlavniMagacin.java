package Zadatak_3;

import java.util.ArrayList;

public class GlavniMagacin extends Prodavnica implements Kurir{
    public GlavniMagacin(ArrayList<Artikl> listaArtikala) {
        super(listaArtikala);
    }

    @Override
    public boolean daLiSeNalazi(Artikl a) {
        for(Artikl art: getListaArtikala()) {
            if(a.equals(art)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void preuzmi(Artikl a) {
        getListaArtikala().remove(indexOdA(a));
    }

    //Pomocna metoda:
    private int indexOdA(Artikl a) {
        for(int i = 0; i < getListaArtikala().size(); i++) {
            if(getListaArtikala().get(i).equals(a)) {
                return i;
            }
        }
        return -1;
    }

    //Drugi nacin:

    public void preuzmi2(Artikl a) {
        ArrayList<Artikl> novaLista = new ArrayList<>();

        for(Artikl art: getListaArtikala()) {
            if(art.equals(a)) {
                novaLista.add(art);
            }
        }
        setListaArtikala(novaLista);
    }
}
