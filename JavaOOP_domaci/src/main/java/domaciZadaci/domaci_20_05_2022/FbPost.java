package domaciZadaci.domaci_20_05_2022;

public class FbPost {
    //Kreirati klasu FacebookPost koja ima:
    //   Od atributa:
    //ime i prezime korisnika koji je objavio post
    //ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da
    // postavite objavu na tudjem profilu)
    //tekst objave
    //broj lajkova
    //broj deljenja

    public String imeIPrezimeKorisnika;
    public String imeIPrezimeDrugiKorisnik;
    public String tekstObjave;
    public int brojLajkova;
    public int brojDeljenja;

    public FbPost() {

    }


    public FbPost(String imeIPrezimeKorisnika, String imeIPrezimeDrugiKorisnik, String tekstObjave) {

        this.imeIPrezimeKorisnika = imeIPrezimeKorisnika;
        this.imeIPrezimeDrugiKorisnik = imeIPrezimeDrugiKorisnik;
        this.tekstObjave = tekstObjave;

    }

    public void like() {
        this.brojLajkova++;
    }

    public void dislike() {
        this.brojLajkova--;
        if (this.brojLajkova < 0) {
            this.brojLajkova = 0;
        }
    }

    public void podeli() {
        this.brojDeljenja++;
    }

    public void stampaj() {
        //(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
        //(tekst objave)
        //Likes (broj lajkova) | Shares (broj deljenja)
        //Primer stampanja:
        //Milan Jovanovic >>> Pera Peric
        //Ovo je tekst objave
        //Likes 3 | Shares 1

        System.out.println(this.imeIPrezimeKorisnika + " >>> " + this.imeIPrezimeDrugiKorisnik);
        System.out.println(this.tekstObjave);
        System.out.print("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
    }
}
