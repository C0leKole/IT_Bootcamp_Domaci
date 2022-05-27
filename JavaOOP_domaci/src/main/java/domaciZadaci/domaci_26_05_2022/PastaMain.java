package p26_05_2022;

public class PastaMain {
    public static void main(String[] args) {
        Sastojak p1 = new Sastojak("Pavlaka", 100);
        Sastojak p2 = new Sastojak("Tuna", 200);
        Sastojak p3 = new Sastojak("Makarone", 150);



        Pasta sastojak = new Pasta();
        sastojak.dodajStastojak(p1);
        sastojak.dodajStastojak(p2);
        sastojak.dodajStastojak(p3);

        sastojak.stampaj();

    }
}
