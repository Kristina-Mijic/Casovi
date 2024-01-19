package Zadatak_2;

import java.util.ArrayList;

public class Pedijatar extends Doktor {
    public Pedijatar(int id, ArrayList<Pacijent> listaPacijenata) {
        super(id, listaPacijenata);
    }

    @Override
    public void dodajPacijenta(Pacijent noviPacijent) {
        if(getListaPacijenata().size() < 40 && noviPacijent.getBrojGodina() <= 18) {
            getListaPacijenata().add(noviPacijent);
            System.out.println("Novi pacijent je dodat kod Pedijatra!");
        } else {
            System.out.println("Nije moguce dodati novog pacijenta Pedijatru! ");
        }
    }
}
