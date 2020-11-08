package exercise6;

import java.util.Scanner;

public class PasswordCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Geben Sie einen Passwort ein: ");
        int number = input.nextInt();
        int numberlength = String.valueOf(number).length();

        boolean check1;
        boolean check2;
        char nextSymbol = '#';
        if(numberlength > 8) {
          check1 = Character.isLetterOrDigit(nextSymbol);
          check2 = Character.isDigit(nextSymbol);

          System.out.println(check1);
          System.out.println(check2);

        } else {
          System.out.print("Der Passwort soll aus mindestens 8 Zeichen bestehen!");
        }
        

    }
}
