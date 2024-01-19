import java.util.ArrayList;

public class Maratonac {
    private int brojGodinaMaratonca;
    private ArrayList<Staza> listaStazaKojeJeIstrcao;

    public Maratonac(int brojGodinaMaratonca, ArrayList<Staza> listaStazaKojeJeIstrcao) {
        this.brojGodinaMaratonca = brojGodinaMaratonca;
        this.listaStazaKojeJeIstrcao = listaStazaKojeJeIstrcao;
    }

    public int getBrojGodinaMaratonca() {
        return brojGodinaMaratonca;
    }

    public void setBrojGodinaMaratonca(int brojGodinaMaratonca) {
        this.brojGodinaMaratonca = brojGodinaMaratonca;
    }

    public ArrayList<Staza> getListaStazaKojeJeIstrcao() {
        return listaStazaKojeJeIstrcao;
    }

    public void setListaStazaKojeJeIstrcao(ArrayList<Staza> listaStazaKojeJeIstrcao) {
        this.listaStazaKojeJeIstrcao = listaStazaKojeJeIstrcao;
    }

    @Override
    public String toString() {
        return "Maratonac{" +
                "brojGodinaMaratonca=" + brojGodinaMaratonca +
                ", listaStazaKojeJeIstrcao=" + listaStazaKojeJeIstrcao +
                '}';
    }

    //METODE:


    public Staza najduzaStaza() {
        double najduzaStaza = Double.MIN_VALUE;
        Staza rezultat = null;

        for(Staza staze:listaStazaKojeJeIstrcao) {
            if(staze.getDuzinaUKm() > najduzaStaza) {
                najduzaStaza = staze.getDuzinaUKm();
                rezultat = staze;
            }
        }
        return rezultat;
    }


    public double ukupnaKilometraza() {
        double rezultat = 0;

        for(Staza staze:listaStazaKojeJeIstrcao) {
            rezultat += staze.getDuzinaUKm();
        }
        return rezultat;
    }

    public double humanitarnaAkcija() {
        double rezultat = 0;

        for(Staza s:listaStazaKojeJeIstrcao) {
            rezultat += s.getDuzinaUKm();
        }
        return rezultat * 20;
    }

}
