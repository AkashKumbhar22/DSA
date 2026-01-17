//Session 2

class Basics{
    public static void main(String[]args)
    {
        //Implict type
        int a = 1;
        int b = 3;

        a = b;
        System.out.println(a);


        //explict function
        int d = 5;
        float e = 7.5f;

        d = (int)e;
        System.out.println(d);


        //Homework :- Print the sum of N natural nummbers hint: (N*(N+1))/2
        int N = 5;
        int sum = (N*(N+1))/2;
        System.out.println("The sum of N natural number is : " + sum);
    }
}