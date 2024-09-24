import java.util.Scanner;

public class NumberGuessing {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int num = (int) (Math.random() * 100);

        Boolean correct = false;

        int a = 0;
        int b = 99;

        while (correct == false) {
            
            if (a != b) {
                System.out.println("(" + a + ", " + b + ")?");
                int response = input.nextInt();
                
                if (a <= response && response <= b) {

                    if (response < num) {
                        a = response + 1;
                    }
                    else if (response > num) {
                        b = response - 1;
                    }
                    
                    else if (response == num) {
                        System.out.println("Bingo!");
                        input.close();
                        correct = true;
                    }
                } else {
                    System.out.println("Out of range. Try again? ");
                }
                
            }

            else if (a == b) {
                System.out.println("GG.");
                System.out.println("The answer is " + num + ".");
                input.close();
                break;
            }

        }


    }
    
}
