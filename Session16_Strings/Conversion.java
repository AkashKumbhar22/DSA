public class Conversion {
    public static void main(String[] args) {

        //String to Integer "Integer.parseInt()"
        // String num = "324";
        // System.out.println("Before Conversion " + num+1);

        // int conv = Integer.parseInt(num);
        // System.out.println("After Conversion " + (conv+1));

        int number = 1;
        String change = Integer.toString(number);
        System.out.println("Before Conversion: " + (number+1));
        System.out.println("After converting into String: " + (change+1));


    }
}
