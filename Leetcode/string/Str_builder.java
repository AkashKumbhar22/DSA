// public class Str_builder {
//     public static void main(String[] args) {
        
//     StringBuilder akash = new StringBuilder();
//     akash.append("Vaish");
//    // akash.append("123");

//     akash.reverse();
//     String result = akash.toString();
//     System.out.println(result);
//     }

// }



//Write a function that reverse a string using char[]
public class Str_builder {
    public static void main(String[] args) {
        
   String v = "Hello";
   char[] akash = v.toCharArray();

   String a = v.reverse();
   for(int i=0;i<akash.length;i++)
   System.out.print("["+akash[i]+"]");
    }
}



