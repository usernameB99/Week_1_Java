package Woche1;

import java.util.Scanner;
import java.util.Random;

public class A9_5_MuenzeWerfenV4verschachtelteSchleifen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        Random r = new Random();

        int k = 0;                      //anzahl Kopf
        int z = 0;                      //anzahl Zahl
        int y;                          //anzahl würfe
        int a = 0;                      //anzahl Würfe neu
        boolean zufrieden = true;       //wurf wiederholen ja/nein


        do {

            do {
                System.out.println("Wie oft soll die Münze geworfen werden?");
                y = sc.nextInt();
            } while (y < 1 || y > 9 || (a + y) % 2 == 0);                            // Modulo


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

            System.out.println("Bist du mit dem Ergebnis zufrieden");
            zufrieden = sc.nextBoolean();                                       // <- Boolean zuweisen
            a += y;

        } while (!zufrieden);


        if (k > z) {
            System.out.println("Ich bekomme das Ticket");
        } else {
            System.out.println("Stefan bekommt das Ticket");
        }

    }
}






