package java_Week_2;

import java.util.Scanner;

public class Programme_19_ConvertStringToLower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the uppercase sentence: ");
        String uppercase = scanner.nextLine();
        Programme_19_ConvertStringToLower t = new Programme_19_ConvertStringToLower();
        t.convertStringToLower(uppercase);
        scanner.close();

    }
    public void convertStringToLower(String str) {
        System.out.println("The Lowercase of the string is = " + str.toLowerCase());
    }
}
