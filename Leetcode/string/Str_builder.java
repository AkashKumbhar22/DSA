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



// //Write a function that reverse a string using char[]
// public class Str_builder {
//     public static void main(String[] args) {
//          int arr[] = {1,2,3,4,5};
//          int target = 5;

//          for(int i=0;i<arr.length;i++){
//                for(int j=i+1;j<arr.length;j++){
//                     if((arr[i]+arr[j])==target){
//                         System.out.println(i+","+j);
                        
//                     }
                    
//              //   }
//          }           
//          }    
// }}

public class Str_builder{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,5};
        int target = 4 ;

        for(int i=0;i<arr.length;i++){
            for(int j=i+1 ; j<arr.length ; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i + ","+j);
                    System.out.println("the value of indices are" +arr[i]+","+arr[j]);
                    //System.out.println(arr[j]);
                }
            }
           break;
        }
    }

}


