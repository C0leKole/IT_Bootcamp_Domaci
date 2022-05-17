package domaciZadaci_16_05_2022;

public class Zadatak3 {
    public static void main(String[] args) {
        //Zadatak
        //Napisati metodu koja stampa podatke o korisniku u formatu:
        //JMBG: [jmbg]
        //Ime: [ime]
        //Prezime: [prezime]
        //God. rodjenja: [god]
        //Aktivan: [true/false]
        //Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
        stampanjePodataka(170398293, "Nikola", "Ilic", 29, true);
    }
    static void stampanjePodataka (int jmbg, String ime, String prezime, int god, boolean aktivan) {
        System.out.println("JMBG: "+ jmbg);
        System.out.println("Ime: " + ime);
        System.out.println("Prezime: " + prezime);
        System.out.println("Godina rodjenja: " + god);
        System.out.println("Aktivan: " + aktivan);
    }
}
