package VideoPlayer;

public class QualityOptimizerControl extends Control {
    @Override
    public void izvrsiAkciju(VideoPlayer videoPlayer) {
    double kvalitet = brzinaInterneta * 10.1;

    if (kvalitet < 144) {
        videoPlayer.setKvalitetVidea(144);
    } else if (kvalitet < 240) {
        videoPlayer.setKvalitetVidea(240);
    }
    else if (kvalitet < 720) {
        videoPlayer.setKvalitetVidea(720);
    }
    else {
        videoPlayer.setKvalitetVidea(1080);
    }
    }
    //Kreirati klasu QualityOptimizerControl koja nasledjuje klasu Control i
    //ima brzinu interneta u megabajtima, npr 10mb/s, 20mb/s, 7.9mb/s
    //gettere, settere i konstruktore
    //implementira metodu izvrsi akciju tako sto postavlja kvalitet videa u zavisnosti od brzine interneta.
    // Kvalitet se racuna na osnovu formule:
    //brzina interneta * 10.1, gde se uzima prvi veci kvalitet
    //npr: ako je brizna interneta 20 * 10.1 = 204 => postavlja 240
    //npr: ako je brzina interneta 5 * 10.1 = 50.5 => postavlja 144
    //npr: ako je brzina interneta 50 * 10.1 = 505 => postavlja 720

    private double brzinaInterneta;

    public double getBrzinaInterneta() {
        return brzinaInterneta;
    }

    public void setBrzinaInterneta(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }

    public QualityOptimizerControl(double brzinaInterneta) {
        this.brzinaInterneta = brzinaInterneta;
    }
}
