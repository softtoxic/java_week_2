package java_Week_2;

import java.util.Scanner;

/**
 *  Write a Java program to print the area and perimeter of a rectangle.
 *  Test Data:
 *  Width = 5.5 Height = 8.5
 *  Expected Output:
 *  Area is 5.6 * 8.5 = 47.60
 *  Perimeter is 2 * (5.6 + 8.5) = 28.20
 */
public class Programme_14_AreaAndPerimeter {
    public static void areaAndPerimeterOfRectangle(float height, float width) {
        float perimeter = 2 * (height + width);
        float area = (height * width);
        System.out.println("The area of the rectangle is : " + area);
        System.out.println("The perimeter of the rectangle is : " + perimeter);
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width of the rectangle: ");
        float height = scanner.nextInt();
        System.out.print("Enter the height of the rectangle: ");
        float width = scanner.nextInt();
        areaAndPerimeterOfRectangle(height, width);
        // closing the scanner object
        scanner.close();
    }

}
