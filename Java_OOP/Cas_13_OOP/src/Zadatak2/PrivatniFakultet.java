package Zadatak2;

import java.util.ArrayList;

public class PrivatniFakultet extends Fakultet{
    public PrivatniFakultet(ArrayList<Ucenik> ucenici) {
        super(ucenici);
    }

    @Override
    public double zarada() {
        return getUcenici().size() * 1400;
    }




}
