//Given a string,find the most recurring character in it
import java.util.Scanner;

public class most_recurring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.next();

        int sum = 0;
        for(int ch= 0 ; ch < name.length() ; ch++){
            char curr = name.charAt(ch);
             for(int a = ch+1; a < name.length() ; a++){
                char b = name.charAt(a);
                 if(curr == b){
                 //   System.out.print(name.charAt(ch));

                     sum++;
                 }
                            // System.out.print(name.charAt(a));

             }
        //    System.out.println(name.charAt(a));
        }
        System.out.println();
        System.out.println(sum);
    }
}
