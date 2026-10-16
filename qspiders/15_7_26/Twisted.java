class T_Prime {

    public static boolean prime(int n) {

        if (n < 2)
            return false;

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }

        return true;
    }

    public static int reverse(int n) {

        int rev = 0;

        while (n > 0) {
            int digit = n % 10;
            rev = rev * 10 + digit;
            n /= 10;
        }

        return rev;
    }

    public static void main(String[] args) {

        int n = 23;

        if (prime(n) && prime(reverse(n))) {
            System.out.println("It is a Twisted Prime Number");
        } else {
            System.out.println("It is not a Twisted Prime Number");
        }
    }
}