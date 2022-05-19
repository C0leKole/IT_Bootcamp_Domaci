package domaci_18_05_2022;

public class SmartAirConditioningMain {
    public static void main(String[] args) {

        SmartAirConditioning klimaPrva = new SmartAirConditioning();
        klimaPrva.marka = "Vox";
        klimaPrva.izabranaTemperatura = 22;
        klimaPrva.daLiHladi = true;

        SmartAirConditioning.stampa(klimaPrva.marka, klimaPrva.izabranaTemperatura, klimaPrva.daLiHladi);

        SmartAirConditioning klimaDruga = new SmartAirConditioning();
        klimaDruga.marka = "LG";
        klimaDruga.izabranaTemperatura = 30;
        klimaDruga.daLiHladi = false;

        SmartAirConditioning.stampa(klimaDruga.marka, klimaDruga.izabranaTemperatura, klimaDruga.daLiHladi);
    }
}
