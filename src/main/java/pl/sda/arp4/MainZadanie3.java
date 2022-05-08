package pl.sda.arp4;

import java.util.Scanner;

public class MainZadanie3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tablica = new int[10];
        for (int i = 0; i < 5; i++) {
            System.out.println("Podaj " + (i + 1) + " ujemną liczbę: ");
            int liczba = scanner.nextInt();
            tablica[i] = liczba;
        }
        for (int i = 0; i < 5; i++) {
        }
        int sumaUjemne = 0;
        for (int i = 0; i < tablica.length; i++) {
            sumaUjemne = sumaUjemne + tablica[i];
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("podaj " + (i + 1) + " dodanią liczbę:");
            int liczba = scanner.nextInt();
            tablica[i] = liczba;
        }
        for (int i = 0; i < 5; i++) {
        }
        int sumaDodatnie = 0;
        for (int i = 0; i < tablica.length; i++) {
            sumaDodatnie = sumaDodatnie + tablica[i];
        }
        System.out.println("Suma: " + (sumaUjemne + sumaDodatnie));
    }
}







