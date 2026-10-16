import java.util.Scanner;
public class character {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int n = 5;
      for(int rows=0 ; rows<n ; rows++){
        for(int columns=0;columns<n;columns++){
            if(rows==0 || columns==0 || rows==n-1 || columns==n-1){
                System.out.print("* ");
            }
            else{
                System.out.print("  ");
            }
        }
        System.out.println();
      }
    }
}
