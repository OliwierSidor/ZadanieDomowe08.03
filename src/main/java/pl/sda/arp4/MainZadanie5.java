package pl.sda.arp4;

import java.util.Random;
import java.util.Scanner;

public class MainZadanie5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wylosowanaLiczba1 = new Random().nextInt(48) + 1;
        int wylosowanaLiczba2 = new Random().nextInt(48) + 1;
        int wylosowanaLiczba3 = new Random().nextInt(48) + 1;
        int wylosowanaLiczba4 = new Random().nextInt(48) + 1;
        int wylosowanaLiczba5 = new Random().nextInt(48) + 1;
        System.out.println("Podaj liczbę z przedziału 1-49");
        int liczba = scanner.nextInt();
        if (liczba == wylosowanaLiczba1) {
            System.out.println("Brawo trafiłeś liczbę");
        } else {
            System.out.println("Pierwsza liczba jest inna :(");
        }
        if (liczba == wylosowanaLiczba2) {
            System.out.println("Brawo trafiłeś liczbę");
        } else {
            System.out.println("Druga liczba jest inna :(");
        }
        if (liczba == wylosowanaLiczba3) {
            System.out.println("Brawo trafiłeś liczbę");
        } else {
            System.out.println("Trzecia liczba jest inna :(");
        }
        if (liczba == wylosowanaLiczba4) {
            System.out.println("Brawo trafiłeś liczbę");
        } else {
            System.out.println("Czwarta liczba jest inna :(");
        }
        if (liczba == wylosowanaLiczba5) {
            System.out.println("Brawo trafiłeś liczbę");
        } else {
            System.out.println("Piąta liczba jest inna :(");
        }
    }
}
