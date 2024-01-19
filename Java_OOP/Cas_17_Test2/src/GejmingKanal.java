import java.util.ArrayList;

public class GejmingKanal extends YouTubeKanal {
    public GejmingKanal(int brojLjudiPretplaceniNaKanal, ArrayList<Video> listaVidea) {
        super(brojLjudiPretplaceniNaKanal, listaVidea);
    }




    //METODE:

    //Klasa GejmingKanal nasledjuje YouTubeKanal i zaradjuje 100e od videa koji imaju vise od 1000 pregleda.
    @Override
    public double zarada() {
        double ukupnaCena = 0;
        double cenaPoVideu = 100;

        for(Video videi:getListaVidea()) {
            if(videi.getBrojPregleda() > 1000) {
                ukupnaCena += cenaPoVideu;
            }
        }
        return ukupnaCena;
    }
}
