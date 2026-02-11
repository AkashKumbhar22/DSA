import java.util.Scanner;
public class star_pattern{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

      int n = 5;
      for(int rows=1 ; rows<=n ; rows++){
        for(int spaces=1;spaces<=n-rows;spaces++)
                System.out.print(" ");
            for(int star=1;star<=rows;star++)
                System.out.print("* ");
                    System.out.println();
        }
              for(int rows=1 ; rows<=n ; rows++){
        for(int spaces=1;spaces<rows;spaces++)
                System.out.print(" ");
            for(int star=rows;star<=n;star++)
                System.out.print("* ");
                    System.out.println();
        }
      }
    }

