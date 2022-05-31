package domaciZadaci.domaci_26_05_2022;

import java.util.ArrayList;

public class FacePost {
    //Kreirati klasu FacebookPost koja ima:
    //ime i prezime korisnika koji je stavio oglas
    //tekst objave
    //niz reakcija
    //metodu reaguj, koja dodaje reakciju u niz
    //(modifikacija za vezbu) Ukoliko se desi situacija da jedan isti korisnik reaguje na post
    // (tj. postoji rekacija korisnika sa istim imenom i prezimenom) izbaciti prethodnu reakciju i uracunati novu.
    //Primer: Milan - lajkuje
    //	 Nemanja - lajkuje
    //	 Milan - daje srce
    //Post ima lajk od Nemanje i srce od Milana.
    //privatnu metodu koja vraca broj reakcija odredjenog tipa (prosledjuje se tip reakcije koji moze da bude smajli,
    // like ili srce)
    //metodu stampaj koja stampa podatke u formatu:
    //ime i prezime
    //tekst objave
    //Smajli 10 | Like 15 | Srce 2
    public ArrayList<Reakcija> nizReakcija = new ArrayList<Reakcija>();
    private String imeAutora;
    private String tekstObjave;

    public ArrayList<Reakcija> getNizReakcija() {
        return nizReakcija;
    }

    public void setNizReakcija(ArrayList<Reakcija> nizReakcija) {
        this.nizReakcija = nizReakcija;
    }

    public String getImeAutora() {
        return imeAutora;
    }

    public void setImeAutora(String imeAutora) {
        this.imeAutora = imeAutora;
    }

    public String getTekstObjave() {
        return tekstObjave;
    }

    public void setTekstObjave(String tekstObjave) {
        this.tekstObjave = tekstObjave;
    }

    public void reaguj(Reakcija reakcija) {
        for (int i = 0; i < nizReakcija.size() ; i++) {

            if (nizReakcija.get(i).getImeIprezime().equals(reakcija.getImeIprezime())){
                nizReakcija.remove(i);
            }
        }
        nizReakcija.add(reakcija);
    }

    private int brojReakcija(String tipReakcije) {
        int brojac = 0;
        for (int i = 0; i < nizReakcija.size(); i++) {

            if (tipReakcije.equals(nizReakcija.get(i).getReakcija())) {
                brojac ++;
            }

        }
        return brojac;
    }
    //metodu stampaj koja stampa podatke u formatu:
    //ime i prezime
    //tekst objave
    //Smajli 10 | Like 15 | Srce 2

    public void stampaj() {
        System.out.println(this.imeAutora);
        System.out.println(this.tekstObjave);
        System.out.println("Smajli " + brojReakcija("smajli") + " | " + "Like " +
                brojReakcija("like") + " | Srce " + brojReakcija("srce"));
    }


}
