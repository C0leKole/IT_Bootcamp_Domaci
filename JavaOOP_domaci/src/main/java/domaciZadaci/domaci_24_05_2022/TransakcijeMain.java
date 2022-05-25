package domaciZadaci.domaci_24_05_2022;

public class TransakcijeMain {
    public static void main(String[] args) {

        Racun primalac = new Racun("293891923", "Nikola Ilic", 50000);
        Racun posiljalac = new Racun("298558866", "Pera Peric", 60000);


        Transakcije prenos = new Transakcije(203, primalac, posiljalac);

        prenos.izvrsiTranskaciju(5000);

    }
}
