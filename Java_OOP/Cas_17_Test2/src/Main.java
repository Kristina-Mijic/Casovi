import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Pravljenje primera videa
        Video video1 = new Video("Video 1", 1500, 200);
        Video video2 = new Video("Video 2", 1200, 150);
        Video video3 = new Video("Video 3", 2000, 300);

        // Pravljenje primera kanala
        ArrayList<Video> listaVidea1 = new ArrayList<>();
        listaVidea1.add(video1);
        listaVidea1.add(video2);

        YouTubeKanal kanal1 = new YouTubeKanal(5000, listaVidea1);

        ArrayList<Video> listaVidea2 = new ArrayList<>();
        listaVidea2.add(video3);

        GejmingKanal gejmingKanal = new GejmingKanal(80, listaVidea2);

        // Pravljenje instance YouTube
        ArrayList<YouTubeKanal> listaKanala = new ArrayList<>();
        listaKanala.add(kanal1);
        listaKanala.add(gejmingKanal);

        YouTube youtube = new YouTube(listaKanala);


        // Testiranje metoda
        System.out.println("Najpopuarniji video: " + kanal1.najpopuarnijiVideo().getNaziv());
        System.out.println("Ukupan broj lajkova: " + kanal1.ukupnoSvidjanja());
        System.out.println("Zarada kanala: $" + kanal1.zarada());

        System.out.println("Najprofitabilniji kanal: " + youtube.najprofitabilniji().getClass().getSimpleName());

        youtube.izbaciKanal();
        System.out.println("Nakon izbacivanja gejming kanala sa manje od 100 pretplatnika: " + youtube.getListaKanala().size() + " kanala");

        System.out.println("Pretraga kanala po imenu: " + youtube.search("GejmingKanal"));


        // Sortiranje kanala po broju pretplatnika
        youtube.sortiranjeKanalaPorojuPretplatnika();
        System.out.println("Sortirani kanali po broju pretplatnika:");
        for (YouTubeKanal kanal : youtube.getListaKanala()) {
            System.out.println(kanal.getClass().getSimpleName() + " - " + kanal.getBrojLjudiPretplaceniNaKanal() + " pretplatnika");
        }
    }

}
