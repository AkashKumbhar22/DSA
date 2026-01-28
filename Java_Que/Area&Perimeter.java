// //Area and Perimeter: Write a Java program that defines two integer variables, length 
// and width, initializes them to 5 and 8, respectively, and then calculates and prints both 
// the area and perimeter of the rectangle using these dimensions.  

import java.util.Scanner;
class Area{
    public static void main(String []args){
        int length = 5;
        int width = 8;
        int area = length * width;
        int perimeter = 2*(length + width);

        System.out.println(area);
        System.out.println(perimeter);

    }
}