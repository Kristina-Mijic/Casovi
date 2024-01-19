package Zadatak1;

import java.util.ArrayList;

public class RokZvezda extends Muzicar{
    public RokZvezda(ArrayList<Album> albumi) {
        super(albumi);
    }

    @Override
    public double zarada() {
       double zarada = ukupnoPregleda() * 100;
       return zarada;
    }
}
