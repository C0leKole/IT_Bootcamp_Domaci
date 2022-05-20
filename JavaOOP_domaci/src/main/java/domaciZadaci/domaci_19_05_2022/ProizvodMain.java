package domaciZadaci.domaci_19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {
        Proizvod sony = new Proizvod();

        sony.naziv = "Sony a6400";
        sony.tezina = 55;
        sony.cena = 120000;

        Proizvod canon = new Proizvod();

        canon.naziv = "Canon 250d";
        canon.tezina = 330;
        canon.cena = 90000;

        sony.stampaj();
        System.out.println();
        canon.stampaj();
        System.out.println();

        sony.povecajCenu(25000);
        sony.povecajCenu(33000);
        canon.povecajCenu(23000);

        System.out.println("Nova cena Sony aparata je: " + sony.cena);
        System.out.println("Nova cena Canon aparata je: " + canon.cena);

        System.out.println();

        System.out.println("Cena sa unetim popustom je: " + sony.vratiCenuSaPopustom(30));
        System.out.println("Cena sa unetim popustom je: " + canon.vratiCenuSaPopustom(80));

        System.out.println();

        System.out.println("Postarina za uneti proizvod iznosi: " + sony.racunajPostarinu());
        System.out.println("Postarina za uneti proizvod iznosi: " + canon.racunajPostarinu());


    }
}
