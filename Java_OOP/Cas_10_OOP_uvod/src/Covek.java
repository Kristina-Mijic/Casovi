public class Covek {
    String ime; //Ovo je atribut neke klase
    String prezime;  //Ovo je atribut neke klase

    //Konstruktor - nema povratni tip, dodeljuje vrednost atributima nase klase
    //Klasa moze i da ima svoju neku metodu

    public Covek(String ime1, String prezime) {
        this.ime = ime1;
        this.prezime = prezime;
    }

    public void stampajPoruku() {
        System.out.println("Moje ime je: " + ime +  " moj hobi je odbojka!");
    }
}

