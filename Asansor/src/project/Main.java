package project;

import java.util.Scanner;

public class Main {
	
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

        Asansor asansor = new Asansor(15, 10);

    //	asansor.yolcu(3, 5, 9);
    //  asansor.yolcu(5,11, 8);

        System.out.print("Kaçıncı kattasınız: ");
        int bulunulanKat = scanner.nextInt();
        asansor.asansorNereye(bulunulanKat);

        System.out.print("Kaç kişi bineceksiniz: ");
        int kisi = scanner.nextInt();

        System.out.print("Kaçıncı kata gitmek istiyorsunuz: ");
        int gidilecekKat = scanner.nextInt();

        asansor.bin(kisi, gidilecekKat);
	}
}