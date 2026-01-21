import java.util.Scanner;
public class arr_que {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.println("Don't miss the task twice: ");
        int n = 5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
            if(i==1||i==n||j==1||j==n){
                System.out.print(" * ");}
            else{
                System.out.print("   ");   
            }
            }
             System.out.println();
        }
    //    System.out.println();
    }
    
}
