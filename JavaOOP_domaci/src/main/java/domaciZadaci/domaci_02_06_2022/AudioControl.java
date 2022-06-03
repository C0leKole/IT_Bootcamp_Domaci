package VideoPlayer;

public class AudioControl extends Control {
    public AudioControl(boolean akcijaZvuka) {
        this.akcijaZvuka = akcijaZvuka;
    }

    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
        if (akcijaZvuka) {
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() + 1);
            if (videoPlayer.getJacinaZvuka() > 100) {
                videoPlayer.setJacinaZvuka(100);
            }
        } else {
            videoPlayer.setJacinaZvuka(videoPlayer.getJacinaZvuka() - 1);
            if (videoPlayer.getJacinaZvuka() < 0) {
                videoPlayer.setJacinaZvuka(0);
            }
        }



    }
    //Kreirati klasu AudioControl koja nasledjuje klasu Control i
    //gettere, settere i konstruktore
    //ima atribut koji kaze da li se smanjuje ili pojacava zvuk (tipa boolean)
    //implementira metodu izvrsi akciju tako sto pojaca ili smanjuje zvuk za 1. U opsegu od 0 do 100

    private boolean akcijaZvuka;


}
