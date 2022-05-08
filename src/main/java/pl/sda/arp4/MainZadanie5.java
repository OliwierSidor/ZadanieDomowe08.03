package pl.sda.arp4;

import java.util.Random;
import java.util.Scanner;

public class MainZadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int wylosowanaLiczba = new Random().nextInt(48) + 1;
        int liczba;
        do {
            System.out.println("Podaj wybraną przez siebie liczbę z zakresu 1-49: ");
            liczba = scanner.nextInt();
            if (liczba > wylosowanaLiczba) {
                System.out.println("Podałeś za dużą liczbę");;
                }else if (liczba < wylosowanaLiczba) {
                System.out.println("Podałeś za mała liczbę");
            } else {
                System.out.println("Brawo podałeś prawidłową liczbę!!");
            }
        } while (wylosowanaLiczba != liczba);

    }
}
