package Zadatak3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Planina prva = new Planina("Moune Everest", 4000);
        Planina druga = new Planina("Kopaonik", 4000);
        Planina treca = new Planina("Zlatibor", 1500);

        ArrayList<Planina> planine = new ArrayList<>();
        planine.add(prva);
        planine.add(druga);
        planine.add(treca);

        Planinar penjac1 = new Profesionalac("Kristina", planine);
        //System.out.println(penjac1.izracunajUkupnuVisinuPlanina());
        System.out.println(penjac1.getListaPlanina());
        penjac1.izbacitiOpasnePlanine();
        System.out.println(penjac1.getListaPlanina());
    }
}
