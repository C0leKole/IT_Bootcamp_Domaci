package domaciZadaci.domaci_02_06_2022;

import java.sql.Time;

public class VideoPlayerMain {
    public static void main(String[] args) {
        //U glavnom programu kreirati video plejer i izvrsiti neke akcije nad njim.
        VideoPlayer videoPlejer = new VideoPlayer(200, 20, 5, 144);

        TimeControl vremeNazad = new TimeControl(false);
        TimeControl vremeNapred = new TimeControl(true);
        vremeNazad.izvrsiAkciju(videoPlejer);
        vremeNazad.izvrsiAkciju(videoPlejer);
        vremeNazad.izvrsiAkciju(videoPlejer);
        vremeNazad.izvrsiAkciju(videoPlejer);
        vremeNazad.izvrsiAkciju(videoPlejer);
        vremeNapred.izvrsiAkciju(videoPlejer);
        vremeNapred.izvrsiAkciju(videoPlejer);
        vremeNapred.izvrsiAkciju(videoPlejer);
        vremeNapred.izvrsiAkciju(videoPlejer);
        vremeNapred.izvrsiAkciju(videoPlejer);
        vremeNapred.izvrsiAkciju(videoPlejer);



        AudioControl pojacaj = new AudioControl(true);
        AudioControl smanji = new AudioControl(false);
        pojacaj.izvrsiAkciju(videoPlejer);
        pojacaj.izvrsiAkciju(videoPlejer);
        pojacaj.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);
        smanji.izvrsiAkciju(videoPlejer);

        QualityOptimizerControl qo = new QualityOptimizerControl(10);
        qo.izvrsiAkciju(videoPlejer);

        videoPlejer.stampaj();
    }
}
