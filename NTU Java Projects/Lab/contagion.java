import java.util.Scanner;

public class contagion {
    public static void main(String[] args) {
        
        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Enter number of citizens: ");
            int num = input.nextInt();

            int A[] = new int[num];

            System.out.printf("       Id: ");
            for (int i = 0; i < num; i++) {
                A[i] = i;
                System.out.printf("%3d", i);
            }
            
            System.out.println();
            System.out.printf("Contactee: ");

            for (int i = 0; i < A.length; i++) {
                
                //swap number from the first element in array A, the swapping only involves elements not yet evaluated :)

                int j = (int) (Math.random() * (A.length - i) + i); 
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;

                System.out.printf("%3d", A[i]);
            }

            System.out.println("\n---------------------");

            System.out.println("Enter Id of Infected citizen. ");
            int origin = input.nextInt();
            input.close();

            Boolean circular = false;

            System.out.println("These citizens are to be self-isolated in the following 14 days: ");
            System.out.printf("%d", origin);

            int zombie = A[origin];

            while (circular == false) {

                if (zombie != origin) {

                    System.out.printf("%3d", zombie);
                    zombie = A[zombie];
                
                } else {
                    circular = true;
                }
            
            }
        }
        

    }

}