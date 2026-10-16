public class Adder {
    int add(int a,int b){
    int result = a + b;
    return result;
    }
    public static void main(String[] args) {
        Adder ovj = new Adder();
        int sum =ovj.add(1,0);
    System.out.println(sum);
    }
}
