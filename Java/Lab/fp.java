public class fp {
    
    public static double pow(double base, int n) {
        if (n == 0) return 1;

        double y = pow(base, n/2);
        y = y * y;
        return n % 2 == 1 ? base * y : y;
    }

    public static void main(String[] args) {
        System.out.println(pow(2, 10));
    }

}
