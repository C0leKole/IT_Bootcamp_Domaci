package domaciZadaci.domaci_16_05_2022;

public class Zadatak6 {
    public static void main(String[] args) {
        //(Za vezbanje)Napisati funkciju koja za tri prosledjena broja vraca najmanji od ta 3.
        // U glavnom programu iskoristi funkciju i ispisti odgovarajucu poruku.
        int res = najmanjiBroj(1, 10, 2);
        System.out.println("Najmanji broj je: " + res);
    }

    static int najmanjiBroj(int x, int y, int z) {
        if (x < y && x < z) {
            return x;
        } else if (y < x && y < z) {
            return y;
        } else {
            return z;
        }

    }
}
