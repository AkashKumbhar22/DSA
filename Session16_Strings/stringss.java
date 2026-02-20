import java.util.Scanner;
import java.util.Arrays;
public class stringss{
    public static void main(String[] args) {
        String str = "Akash";
        String full = "AkashKumbhar";

        //Built-In-Functions
        //.length = Gives the length of the variable
        System.out.println(str.length());
                                                                                              
        //.charAt() = Gives the character at specific index
        System.out.println(str.charAt(3));


        //.trim = It trims the extra space
        String st = "    Vaish";
        System.out.println(st.trim());


        //.equals = If the value of the both variable is same it returns true
        System.out.println(str.equals(full));

        //conatins = It checks if the value of one varibale is present in the other
        System.out.println(full.contains(str));


        //compareTo = It checks the both strings and if theere is difference in the letters it gives the difference of there ASCII value of the first character
        String name = "Adarsh";
        String name2 = "Sid";
        
        System.out.println(name.compareTo(name2));

    }
} 