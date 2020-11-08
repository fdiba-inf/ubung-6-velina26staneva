package exercise6;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt(); 
        int realInteger = number; 
        int reversedInteger = 0;
        boolean Palindrome;
      
        assert number > 0;
        
        int count = 0;

        while (number > 0) {
          count = number%10;
          reversedInteger = reversedInteger*10 + count;
          number = number / 10;
        }
        if (realInteger == reversedInteger ) {
          Palindrome = true;
          System.out.println("Palindrome: " + Palindrome);
        }else {
          Palindrome = false;
          System.out.println("Palindrome: " + Palindrome );
        }


    }
}
