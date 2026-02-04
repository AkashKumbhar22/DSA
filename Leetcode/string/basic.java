// //Converting string to array

// package string;

// public class basic {
//     public static void main(String[] args) {
//         String v = "akash";

//         char[] vaish = v.toCharArray();

//     for(int i=0;i<vaish.length;i++){
//         System.out.println("The elemnt at position "+ i+ " is: " +vaish[i]);
        
//     }
//     }
// }


//Convert Back to String
// package string;

// public class basic{
//     public static void main(String[]args){
// String s = "hello";
// char[] v = s.toCharArray();

// System.out.println("The string before modification :"+ new String(v));

// v[2] = 'x';

// System.out.println(new String(v));

//     }
// }


// Type this exact code and run it
// package string;

// public class basic {
//     public static void main(String[] args) {
//         String word = "apple";
//         char[] letters = word.toCharArray();
        
//         // Change 'a' to 'A'
//         letters[0] = 'A';
        
//         // Change last letter to 'E'
//         letters[letters.length - 1] = 'E';
        
//         System.out.println("Result: " + new String(letters));
//     }
// }
// What will this print?




//char c = s.charAt(i); === Grt one sngle character at position i
public class basic{
    public static void main(String[]args){
String s = "hello";

char first = s.charAt(0);
System.out.println(first);


    }
}