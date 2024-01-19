package Zadatak3;

import java.util.ArrayList;

public class Profesionalac extends Planinar {
    public Profesionalac(String imePlaninara, ArrayList<Planina> listaPlanina) {
        super(imePlaninara, listaPlanina);
    }

    @Override
    public void izbacitiOpasnePlanine() {

       ArrayList<Planina> novaLista = new ArrayList<>();

       for(Planina pivot: getListaPlanina()) {
           if(pivot.getVisina() < 3500) {
               novaLista.add(pivot);
           }
       }
       setListaPlanina(novaLista);
    }
}
