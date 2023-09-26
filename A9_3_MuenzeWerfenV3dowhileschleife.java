package Woche1;

import java.util.Random;
import java.util.Scanner;

public class A9_3_MuenzeWerfenV3dowhileschleife {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);


        Random r = new Random();

        int k = 0;
        int z = 0;

        int y;
        do {
            System.out.println("Wie oft soll die Münze geworfen werden (ungerade Zahl 1-10)?");
            y = sc.nextInt();
        } while (y < 1 || y > 9 || y % 2 == 0);  // Modulo


        for (int x = 1; x <= y; x++) {
            boolean kopf = r.nextBoolean();

            if (kopf == true) {
                System.out.println("Werfe Münze... Kopf!");
                k++;
            } else {
                System.out.println("Werfe Münze... Zahl!");
                z++;
            }
        }

        System.out.println("Summe Kopf:" + k);
        System.out.println("Summe Zahl:" + z);

        if (k > z) {
            System.out.println("Ich bekomme das Ticket");
        } else if (k == z) {
            System.out.println("Unentschieden");
        } else {
            System.out.println("Stefan bekommt das Ticket");
        }


    }
}