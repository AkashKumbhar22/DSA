// public class r_sum{
//     static int n = 3;
//     static int sum = 0;
//     public static void test(int i){
//         sum = sum + i;
//         System.out.println(sum);
//         if(i==n){
//             return;
//         }
//         test(i+1);
//     }

//     public static void main(String[] args){
//         test(1);
//     }
// }


//============================================================================================= alternative
public class r_sum{
   public static int SON(int n){
    if(n == 1){
        return 1;
    }
    return n * SON(n-1);
   }

    public static void main(String[] args){
        int sum = SON(5);
        System.out.println(sum);
    }
}

