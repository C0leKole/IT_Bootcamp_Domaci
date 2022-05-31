package domaciZadaci.domaci_30_05_2022;

public class IspitiMain {
    public static void main(String[] args) {
        Ispiti i = new Ispiti("Matematika", 6, "Profa Profic");
        Ispiti i2 = new Ispiti("Hemija", 8, "Profa Profic");
        Ispiti i3 = new Ispiti("Istorija", 9, "Profa Profic");
        Ispiti i4 = new Ispiti("Muzicko", 5, "Profa Profic");

        Student s = new Student(1031, "Nikola Ilic", "osnovne");
        s.dodajIspit(i);
        s.dodajIspit(i2);
        s.dodajIspit(i3);
        s.dodajIspit(i4);


        s.stampaj();
    }
}
