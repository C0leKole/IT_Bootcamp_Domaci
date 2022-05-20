package domaciZadaci.domaci_19_05_2022;

public class SmartAirConditioning {
    //(ZA VEZBANJE)Kreirati klasu SmartAirConditioning koja ima:
    //atribut za marku klime (npr: Samsung, Galanz, Gree, …)
    //atribut za potrosnju elektricne energije dok hladi (npr 1kW/h)
    //atribut za potrosnju elektricne energije dok greje (npr 2kW/h)
    //atribut za izabranu temperaturu (minimum je 16, maksimum 35)
    //atribut za mod (hladi/greje)
    //metodu za stampu - stampa u formatu
    //marka - mod - termperatura
    //metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
    //30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
    //metodu koja racuna koliko klima novca potrosi za mesec dana
    //Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
    //Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
    //Metoda vraca ukupnu cenu za taj mesec
    //
    //U glavnom programu krairati objekat klase SmartAirConditioning i testirati sve metode.

    public String marka;
    public int potrosnjaDokHladi;
    public int potrosnjaDokGreje;
    public int izabranaTemp;
    public boolean daLiHladi;

    public void stampaj() {

        if (daLiHladi == true) {
            System.out.println("Klima marke " + this.marka + " hladi a izarana temperatura je "
                    + this.izabranaTemp);
        } else {
            System.out.println("Klima marke " + this.marka + " greje a izarana temperatura je "
                    + this.izabranaTemp);
        }

    }
    public int racunajkWpoSatu (){
        //metodu koja racuna mesecnu potrosnju u kW/h, po formuli:
        //    //30 * 15 * potrosnja po satu ( zavisi da li greje ili hladi)
        int mesecnaPotrosnjaUkW = 0;
        if (daLiHladi == true) {
            return mesecnaPotrosnjaUkW = 30 * 15 * 1;
        }
        return mesecnaPotrosnjaUkW = 30 * 15 * 2;
    }
    public int mesecnaPotrosnja () {
        //Prvih 350 kW/h su u zelenoj zoni i 1 kW/h kosta 6din
        //    //Sve ostalo se racuna kao u plavoj zoni, gde 1kW/h kosta 9 dinara
        //    //Metoda vraca ukupnu cenu za taj mesec
        int mesecnaPotrosnja = 0;
        if (racunajkWpoSatu() <=350) {
            mesecnaPotrosnja = racunajkWpoSatu() * 6;
        }
        return mesecnaPotrosnja = racunajkWpoSatu() * 9;
    }
}
