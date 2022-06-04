package domaciZadaci.domaci_02_06_2022;

public class TimeControl extends Control {
    public TimeControl(boolean napred) {
        this.napred = napred;

    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {


        if (napred) {
            videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea()+15);
            if (videoPlayer.getTrenutnoVremeVidea() > videoPlayer.getDuzinaVidea()) {
                videoPlayer.setTrenutnoVremeVidea(videoPlayer.getDuzinaVidea());
            }

        } else {
            videoPlayer.setTrenutnoVremeVidea(videoPlayer.getTrenutnoVremeVidea()-15);
            if (videoPlayer.getTrenutnoVremeVidea() < 0) {
                videoPlayer.setTrenutnoVremeVidea(0);
            }
        }



    }
    //Kreirati klasu TimeControl koja nasledjuje klasu Control i
    //konstruktore
    //ima atribut koji kaze na koju stranu pomera trenutno vreme videa (tipa boolean)
    //implementira metodu izvrsi akciju tako sto pomeri trenutno vreme videa za 15s unapred ili
    // unazad u zavisnosti od atributa. Veoma je bitno da se ne izadje van granica videa.


    public boolean isNapred() {
        return napred;
    }

    public void setNapred(boolean napred) {
        this.napred = napred;
    }

    public boolean isNazad() {
        return nazad;
    }

    public void setNazad(boolean nazad) {
        this.nazad = nazad;
    }


    private boolean napred;
    private boolean nazad;




}
