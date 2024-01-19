package Zadatak1;

import java.util.ArrayList;

public class KafanskiPevac extends Muzicar{
    public KafanskiPevac(ArrayList<Album> albumi) {
        super(albumi);
    }

    @Override
    public double zarada() {
        double zarada = 0;

        for(Album a:getAlbumi()) {
            zarada += a.getPesme().size();
        }
        return zarada * 500;
    }
}
