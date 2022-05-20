package domaciZadaci.domaci_19_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {
        SmartAirConditioning klima1 = new SmartAirConditioning();
        klima1.marka = "LG";
        klima1.potrosnjaDokGreje = 2;
        klima1.potrosnjaDokHladi = 1;
        klima1.izabranaTemp = 15;
        klima1.daLiHladi = true;

        SmartAirConditioning klima2 = new SmartAirConditioning();
        klima2.marka = "Samsung";
        klima2.potrosnjaDokGreje = 2;
        klima2.potrosnjaDokHladi = 1;
        klima2.izabranaTemp = 28;
        klima2.daLiHladi = false;

        klima1.stampaj();
        klima2.stampaj();

        System.out.println();
        System.out.println("Mesecna potrosnja u kW/h klime LG je: " + klima1.racunajkWpoSatu() + "kW/h");
        System.out.println("Mesecna potrosnja u kW/h klime Samsung je: " + klima2.racunajkWpoSatu() + "kW/h");

        System.out.println();
        System.out.println("Mesecna potrosnja klime LG je: " + klima1.mesecnaPotrosnja() + " din.");
        System.out.println("Mesecna potrosnja klime Samsung je: " + klima2.mesecnaPotrosnja()+ " din.");

    }
}
