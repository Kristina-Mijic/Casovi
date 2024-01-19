package Zadatak2;

import java.util.ArrayList;

public class Pedijatar extends Doktor{

    public Pedijatar(int id, ArrayList<Pacijent> listaPacijenata) {
        super(id, listaPacijenata);
    }

    @Override
    public void dodajPacijenta(Pacijent noviPacijent) {

        if(getListaPacijenata().size() < 40 && noviPacijent.getBrojGodina() <= 18) {
            getListaPacijenata().add(noviPacijent);
            System.out.println("Novi pacijent je dodat.");
        } else if(getListaPacijenata().size() < 40 && noviPacijent.getBrojGodina() > 18)  {
            System.out.println("Pacijent ima vise od 18 godina i ne moze da bude dodat u listu kod Pedijatra");
        } else {
            System.out.println("Lista vec ima 40 pacijenata i ne moze da prihvati novog pacijenta.");
        }
    }
}
