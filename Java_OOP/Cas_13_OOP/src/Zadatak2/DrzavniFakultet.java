package Zadatak2;

import java.util.ArrayList;

public class DrzavniFakultet extends Fakultet {
    public DrzavniFakultet(ArrayList<Ucenik> ucenici) {
        super(ucenici);
    }

    @Override
    public double zarada() {
        return getUcenici().size() * 1000;
    }




}
