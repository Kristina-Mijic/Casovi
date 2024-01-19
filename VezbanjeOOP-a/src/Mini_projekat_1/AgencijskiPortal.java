package Mini_projekat_1;

import java.util.ArrayList;

public class AgencijskiPortal {

    private ArrayList<Agencija> listaAgencija;

    public AgencijskiPortal() {
        this.listaAgencija = new ArrayList<>();
    }

    public ArrayList<Agencija> getListaAgencija() {
        return listaAgencija;
    }

    public void setListaAgencija(ArrayList<Agencija> listaAgencija) {
        this.listaAgencija = listaAgencija;
    }

    @Override
    public String toString() {
        return "AgencijskiPortal{" +
                "listaAgencija=" + listaAgencija +
                '}';
    }


    //METODE:
    public Agencija najvrednije() {
        if (listaAgencija.isEmpty()) {
            return null;
        }

        Agencija najvrednijaAgencija = listaAgencija.get(0);

        for (Agencija agencija : listaAgencija) {
            double sumaVrednosti = 0.0;

            for (StambeniObjekat objekat : agencija.getListaStambenihObj()) {
                sumaVrednosti += objekat.getCena();
            }

            double sumaVrednostiNajvrednija = 0.0;

            for (StambeniObjekat objekat : najvrednijaAgencija.getListaStambenihObj()) {
                sumaVrednostiNajvrednija += objekat.getCena();
            }

            if (sumaVrednosti > sumaVrednostiNajvrednija) {
                najvrednijaAgencija = agencija;
            }
        }
        return najvrednijaAgencija;
    }

    //ubacuje agenciju u listu ukoliko ima vise od 3 stambena objekta u ponudi
    public void ubaci(Agencija agencija) {
        if (agencija.getListaStambenihObj().size() > 3) {
            listaAgencija.add(agencija);
        } else {
            System.out.println("Agencija ne ispunjava uslov za ubacivanje u portal.");
        }
    }
}
