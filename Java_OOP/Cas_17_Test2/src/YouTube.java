import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class YouTube {

    private ArrayList<YouTubeKanal> listaKanala;

    public YouTube(ArrayList<YouTubeKanal> listaKanala) {
        this.listaKanala = listaKanala;
    }

    public ArrayList<YouTubeKanal> getListaKanala() {
        return listaKanala;
    }

    public void setListaKanala(ArrayList<YouTubeKanal> listaKanala) {
        this.listaKanala = listaKanala;
    }

    @Override
    public String toString() {
        return "YouTube{" +
                "listaKanala=" + listaKanala +
                '}';
    }



    //METODE:

    // vraca YouTubeKanal koji zaradjuje najvise para
    public YouTubeKanal najprofitabilniji() {

        if(listaKanala.isEmpty()) {
            return null;
        }

        YouTubeKanal najviseZaradjuje = listaKanala.get(0);

        for(YouTubeKanal kanal: getListaKanala()) {
            if(kanal.zarada() > najviseZaradjuje.zarada()) {
                najviseZaradjuje = kanal;
            }
        }
        return najviseZaradjuje;
    }


    // ukoliko neki gejming kanal ima manje od 100 pretplacenih korisnika na tom kanalu, izbaciti ga:
    public ArrayList<YouTubeKanal> izbaciKanal() {

        ArrayList<YouTubeKanal> novaLista = new ArrayList<>();

        for(YouTubeKanal kanalG: listaKanala) {
            if(kanalG.getBrojLjudiPretplaceniNaKanal() < 100 && kanalG instanceof GejmingKanal) {
                novaLista.add(kanalG);
            }
        }
        listaKanala.removeAll(novaLista);

        return novaLista;
    }


    //za prosledjeni naziv vraca odredjeni videa:
    public ArrayList<Video> search(String naziv) {

        ArrayList<Video> novaLista = new ArrayList<>();

        for(YouTubeKanal kanal: listaKanala ) {
            for(Video video: kanal.getListaVidea()) {
                if(video.getNaziv().equalsIgnoreCase(naziv)) {
                    novaLista.add(video);
                }
            }
        }
        return novaLista;
    }



    // (dodatni) - napraviti metodu koja sortira kanale po broju pretplatnika
    public void  sortiranjeKanalaPorojuPretplatnika() {
        listaKanala.sort(Comparator.comparing(YouTubeKanal::getBrojLjudiPretplaceniNaKanal));
    }

}
