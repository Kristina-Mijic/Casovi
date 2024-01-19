package Zadatak3;

import java.util.ArrayList;

public class Amater extends Planinar {
    public Amater(String imePlaninara, ArrayList<Planina> listaPlanina) {
        super(imePlaninara, listaPlanina);
    }

    @Override
    public void izbacitiOpasnePlanine() {
        //remove() radi samo za obican for preko indexa, ne moze forEach

        for(int i = 0; i < getListaPlanina().size(); i++) {
            if(getListaPlanina().get(i).getVisina() > 1500) {
                getListaPlanina().remove(i);
            }
        }
    }





}
