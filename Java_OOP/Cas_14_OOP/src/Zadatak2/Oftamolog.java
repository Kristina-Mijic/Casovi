package Zadatak2;

import java.util.ArrayList;

public class Oftamolog extends Doktor{
    public Oftamolog(int id, ArrayList<Pacijent> listaPacijenata) {
        super(id, listaPacijenata);
    }

    @Override
    public double zarada() {
        return getListaPacijenata().size() * 120;
    }
}
