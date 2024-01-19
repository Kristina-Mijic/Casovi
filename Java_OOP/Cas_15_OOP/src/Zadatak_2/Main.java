package Zadatak_2;

public class Main {
    public static void main(String[] args) {

        Knjiga knjiga1 = new Knjiga("dobar dan", 120, "horor", 100);
        Knjiga knjiga2 = new Knjiga("na drini cuprije", 220, "roman", 500);
        Knjiga knjiga3 = new Knjiga("ivo andric", 190, "horor", 300);

        Knjiga[] niz = {knjiga1, knjiga2, knjiga3};

        Biblioteka biblioteka = new Biblioteka(niz);
        //biblioteka.stampanje();
        System.out.println("Sortiranje:");
        biblioteka.sortiranjeNizaKnjiga();

        biblioteka.stampanje();

    }
}
