import java.util.ArrayList;

public class YouTubeKanal {

    private int brojLjudiPretplaceniNaKanal;
    private ArrayList<Video> listaVidea;


    public YouTubeKanal(int brojLjudiPretplaceniNaKanal, ArrayList<Video> listaVidea) {
        this.brojLjudiPretplaceniNaKanal = brojLjudiPretplaceniNaKanal;
        this.listaVidea = listaVidea;
    }

    public int getBrojLjudiPretplaceniNaKanal() {
        return brojLjudiPretplaceniNaKanal;
    }

    public void setBrojLjudiPretplaceniNaKanal(int brojLjudiPretplaceniNaKanal) {
        this.brojLjudiPretplaceniNaKanal = brojLjudiPretplaceniNaKanal;
    }

    public ArrayList<Video> getListaVidea() {
        return listaVidea;
    }

    public void setListaVidea(ArrayList<Video> listaVidea) {
        this.listaVidea = listaVidea;
    }

    @Override
    public String toString() {
        return "YouTubeKanal{" +
                "brojLjudiPretplaceniNaKanal=" + brojLjudiPretplaceniNaKanal +
                ", listaVidea=" + listaVidea +
                '}';
    }


    //METODE:

    public Video najpopuarnijiVideo() {

        if(listaVidea.isEmpty()) {
            return null;
        }

        Video najvisePregleda = listaVidea.get(0);

        for(Video videi:listaVidea) {
            if(videi.getBrojPregleda() > najvisePregleda.getBrojPregleda()) {
                najvisePregleda = videi;
            }
        }
        return najvisePregleda;
    }


    public int ukupnoSvidjanja() {
        int ukupanBrojlajkova = 0;

        for(Video videi:listaVidea) {
            ukupanBrojlajkova += videi.getBrojLajkova();

        }
        return ukupanBrojlajkova;
    }


    public double zarada() {
        double ukupnaZaradaPoKanalu = 0;

        for(Video videi:listaVidea) {
            ukupnaZaradaPoKanalu += videi.getBrojLajkova() * 10;
        }
        return ukupnaZaradaPoKanalu;
    }



}
