public class SquareCalc {
    int square(int n){
        return n*n;
    }

    public static void main(String[] args) {
        SquareCalc akash = new SquareCalc();
      int result =  akash.square(5);
        System.out.println(result);
    }
}