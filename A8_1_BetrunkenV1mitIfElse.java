package Woche1;

import java.util.Scanner;

public class A8_1_BetrunkenV1mitIfElse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wie viele Bier hast du getrunken?");

        int Bier = sc.nextInt();

        System.out.println("Wie viele Shots hast du getrunken?");

        int Shots = sc.nextInt();

        if ((Bier <= 0) && (Shots <= 0)) {
            System.out.println("Gar nicht betrunken!");
        }
        else if (Bier + Shots <=2) {
            System.out.println("Leicht betrunken!");
        }
        else if ((Bier<=6) && (Shots == 0)) {
            System.out.println("Betrunken!");
        }
        else {
            System.out.println("Oida du bist voi ogsoffn herst!");
        }
    }
}
