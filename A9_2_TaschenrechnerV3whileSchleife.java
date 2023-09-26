package Woche1;

import java.util.Scanner;

public class A9_2_TaschenrechnerV3whileSchleife {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        char operator = '#';                // char vor der schleife beliebig zuweisen


        while (operator != 'x' ) {

            System.out.println("Gib den Operator (+, -, *, /, %) ein:");
            operator = sc.nextLine().charAt(0);

            if (operator == '+' || operator == '-' || operator == '*' || operator == '/' || operator == '%') {


                System.out.println("Gib die erste Zahl ein:");
                int a = sc.nextInt();
                System.out.println("Gib die zweite Zahl ein:");
                int b = sc.nextInt();


                sc.nextLine();

                switch (operator) {

                    case '+':
                        System.out.println(a + " + " + b + " = " + (a + b));
                        break;

                    case '-':
                        System.out.println(a + " - " + b + " = " + (a - b));
                        break;

                    case '*':
                        System.out.println(a + " * " + b + " = " + (a * b));
                        break;

                    case '/':
                        System.out.println(a + " / " + b + " = " + ((double) a / b));
                        break;

                    case '%':
                        System.out.println(a + " % " + b + " = " + (a % b));
                        break;

                    default:
                      System.out.println("Sie haben x als Operator gewählt, das Programm wird nun beendet");
                       break;

                }
            } else if (operator == 'x') {  //operator
                System.out.println("Sie haben x als Operator gewählt, das Programm wird nun beendet!");
            }
        }

    }
}
