package TestYoutube;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vvedi 5");
        int value = scanner.nextInt();
        while(value!=5) {
            System.out.println("Vvedi 5");
            value = scanner.nextInt();
        }
        System.out.println("Vy vveli 5.");
    }
}
