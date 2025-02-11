public class primedemo {
    public static void main(String[] args) {
        
        int count = 99999;
        
        for (int i = 2 ; i <= 100000 ; i++) {
            
            Boolean isPrime = true;

            for (int j = 2 ; j <= Math.sqrt(i) ; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    count -= 1;
                    break;
                }
            }

            if (isPrime == true) {
                System.out.println(i + " is prime.");
            }

        }
        System.out.println(count);
    }
}
