import java.util.ArrayList;

public class BBPodcast extends YouTubeKanal {
    public BBPodcast(int brojLjudiPretplaceniNaKanal, ArrayList<Video> listaVidea) {
        super(brojLjudiPretplaceniNaKanal, listaVidea);
    }

    @Override
    public double zarada() {
        return super.zarada() * 1.15;
    }
}
