package domaciZadaci_16_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak5 {
    public static void main(String[] args) {
        //(Za vezbanje )Napisati funkciju koja za pronalazi koliko ima celih brojeve izmedju brojeva M i N.
        //
        //Primer izvrsenja:
        //izbroji(5, 10) ima za rezultat 4. Kako? 5 6 7 8 9 10
        //izbroji(-5, 1) ima za rezultlat 5. Kako? -5 -4 -3 -2 -1 0 1
        int rezultat = celiBrojevi(5,10);
        System.out.println(rezultat);
    }
    static int celiBrojevi (int m, int n) {
        int suma = n - m - 1;
        return suma;


    }
}
