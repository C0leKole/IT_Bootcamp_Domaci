package domaciZadaci.domaci_20_05_2022;

import domaciZadaci.domaci_19_05_2022.FacebookPost;

public class FbPostMain {
    public static void main(String[] args) {

        FbPost korisnik1 = new FbPost();

        korisnik1.imeIPrezimeKorisnika = "Milan Jovanovic";
        korisnik1.brojLajkova = 0;
        korisnik1.brojDeljenja = 0;
        korisnik1.tekstObjave = "Ne kasni u kafanu veceras!";
        korisnik1.imeIPrezimeDrugiKorisnik = "Vladimir Minic";

        FbPost korisnik2 = new FbPost("Milan Jovanovic", "Vladimir Minic",
                "Ne brini, tu sam na vreme!");
        korisnik2.brojDeljenja = 0;
        korisnik1.brojLajkova = 0;


        korisnik1.like();
        korisnik1.like();
        korisnik1.like();
        korisnik1.like();
        korisnik1.like();
        korisnik1.like();
        korisnik1.dislike();
        korisnik1.dislike();
        korisnik1.podeli();
        korisnik1.podeli();
        korisnik1.stampaj();

    }
}
