package java_Week_2;

import java.util.Scanner;

/**
 * Write a program to convert the upper case to lower case.
 */
public class Programme_9_ConvertUpperToLower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase string : ");
        String uppercase = scanner.nextLine();
        Programme_9_ConvertUpperToLower t = new Programme_9_ConvertUpperToLower();
        t.convertUppercaseToLower(uppercase);

        scanner.close();
    }


    public void convertUppercaseToLower(String text) {
        System.out.println("The Lowercase value is = " + text.toLowerCase());
    }
}
