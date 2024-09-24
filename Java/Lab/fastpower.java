public class fastpower {
    
    public static int power(int base, int expo) {

        if (expo == 0) {
            return 1;
        } else if (expo % 2 == 0) {
            return power(base, expo/2) * power(base, expo/2);
        } else {
            return power(base, (expo-1)/2) * power(base, (expo-1)/2) * base;
        }

    }

    public static void main(String[] args) {
        System.out.println(power(3, 4));
    }

}
