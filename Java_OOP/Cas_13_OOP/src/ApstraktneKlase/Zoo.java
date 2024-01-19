package ApstraktneKlase;

import java.util.ArrayList;

public class Zoo {

    private ArrayList<Zivotinje> zivotinje;


    public int brojMacaka() {
        int brojac = 0;

        for(int i = 0; i < zivotinje.size(); i++) {
            if(zivotinje.get(i) instanceof Macka ) {
                brojac++;
            }
        }
        return brojac;
    }


    public Zoo(ArrayList<Zivotinje> zivotinjes) {
        this.zivotinje = zivotinjes;
    }


    public ArrayList<Zivotinje> getZivotinjes() {
        return zivotinje;
    }

    public void setZivotinjes(ArrayList<Zivotinje> zivotinjes) {
        this.zivotinje = zivotinjes;
    }


    @Override
    public String toString() {
        return zivotinje.toString();
    }
}
