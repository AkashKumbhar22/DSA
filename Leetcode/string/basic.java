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
package string;

public class basic{
    public static void main(String[]args){
String s = "hello";
char[] v = s.toCharArray();

System.out.println("The string before modification :"+ new String(v));

v[2] = 'a';

    }
}