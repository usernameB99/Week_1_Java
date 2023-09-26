package Woche1;

import java.util.Scanner;

public class A8_2_BetrunkenV2ifelse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Wie alt bist du?");

        int age = sc.nextInt();

        System.out.println("Hast du einen Führerschein dabei?");

        boolean license = sc.nextBoolean();

        System.out.println("Wie viele Bier hast du getrunken?");

        int Bier = sc.nextInt();

        System.out.println("Wie viele Shots hast du getrunken?");

        int Shots = sc.nextInt();

        if ((Bier <= 0) && (Shots <= 0) && ((age >=17) &&  (license == true))) {
            System.out.println("Du darft weiter fahren!");
        }
        else if ((Bier + Shots <=2) && (age >=19)&& (license)) {
            System.out.println("Du darfst noch weiterfahren!");
        }
        else {
            System.out.println("Du darfst nicht Auto Fahren!");
        }
    }
}

