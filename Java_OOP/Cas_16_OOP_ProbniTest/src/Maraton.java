import java.util.ArrayList;

public class Maraton {
    private ArrayList<Maratonac> listaMaratonaca;
    private double temperatura;

    public Maraton(ArrayList<Maratonac> listaMaratonaca, double temperatura) {
        this.listaMaratonaca = listaMaratonaca;
        this.temperatura = temperatura;
    }

    public ArrayList<Maratonac> getListaMaratonaca() {
        return listaMaratonaca;
    }

    public void setListaMaratonaca(ArrayList<Maratonac> listaMaratonaca) {
        this.listaMaratonaca = listaMaratonaca;
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    @Override
    public String toString() {
        return "Maraton{" +
                "listaMaratonaca=" + listaMaratonaca +
                ", temperatura=" + temperatura +
                '}';
    }


    //METODE:

    public void izbaci() {

        if(temperatura > 35) {
            for(int i = listaMaratonaca.size()-1; i >= 0; i--) {
                if(listaMaratonaca.get(i) instanceof Amater) {
                    listaMaratonaca.remove(i);
                }
            }
        }
    }

    public void izbaci2() {
        ArrayList<Maratonac> rezultat = new ArrayList<>();

        if(temperatura > 35) {
            for(Maratonac m:listaMaratonaca) {
                if(!(m instanceof Amater)) {
                    rezultat.add(m);
                }
            }
        }
        setListaMaratonaca(rezultat);
    }


    public void ubaci(Maratonac noviMaratonac) {
      if(noviMaratonac.getBrojGodinaMaratonca() >= 18 && noviMaratonac.getListaStazaKojeJeIstrcao().size() >= 3) {
          listaMaratonaca.add(noviMaratonac);
        }

    }


    public boolean nadjiStazu(Staza stazaZaPretragu) {
        for(Maratonac maratonac:listaMaratonaca) {
         for(Staza s1: maratonac.getListaStazaKojeJeIstrcao()) {
             if(s1.equals(stazaZaPretragu)) {
                 return true;
             }
         }
        }
        return false;
    }


}
