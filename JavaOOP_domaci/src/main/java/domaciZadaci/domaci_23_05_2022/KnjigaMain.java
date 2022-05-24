package domaciZadaci.domaci_23_05_2022;

public class KnjigaMain {

    public static void main(String[] args) {

        Autor manly = new Autor("Manly Hall");

        Knjiga k = new Knjiga("2035-23b-238181", "Gnosticism", 1952, manly);

        k.stampaj();

    }
}
