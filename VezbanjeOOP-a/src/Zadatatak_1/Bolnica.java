package Zadatatak_1;

import java.util.ArrayList;

public class Bolnica {

    private ArrayList<Doktor> listaLekara;

    public Bolnica() {
        this.listaLekara = new ArrayList<>();
    }

    public ArrayList<Doktor> getListaLekara() {
        return listaLekara;
    }

    public Pedijatar najuspesnijiPedijatar() {
        if (listaLekara.isEmpty()) {
            return null;
        }

        Pedijatar najuspesniji = null;
        int maxPacijenti = 0;

        for (Doktor doktor : listaLekara) {
            if (doktor instanceof Pedijatar) {
                Pedijatar pedijatar = (Pedijatar) doktor;
                if (pedijatar.getListaPacijenata().size() > maxPacijenti) {
                    maxPacijenti = pedijatar.getListaPacijenata().size();
                    najuspesniji = pedijatar;
                }
            }
        }

        return najuspesniji;
    }

    public double zarada() {
        double ukupnaZarada = 0;
        for (Doktor doktor : listaLekara) {
            ukupnaZarada += doktor.zarada();
        }
        return ukupnaZarada;
    }

    public void dodajDoktora(Doktor doktor) {
        listaLekara.add(doktor);
    }






}
