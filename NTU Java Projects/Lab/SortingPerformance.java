import java.util.Arrays;

public class SortingPerformance {

    public static int numsOfRepetition = 10;
    public static String[] algorithmTitles = {"Bubble Sort", "Selection Sort", "Insertion Sort", "Arrays.sort"};
    public static int[] sizes = {1000, 2000, 4000, 8000, 16000, 32000, 64000};
    public static double[][] records = new double[algorithmTitles.length][sizes.length];

    public static void main(String[] args) {

        for (int i = algorithmTitles.length - 1 ; i >= 0 ; i--) {
            simulate(i);
        }
        showStat();

    }
    
    public static void debug() {

        int[] A = arrayGen(10);
        display(A);

        double t0 = System.nanoTime() / 1e6;
        //
        double t1 = System.nanoTime() / 1e6;

        display(A);
        System.out.println(t1-t0);

    }


    public static void simulate(int algoNo) {
        System.out.printf("Simulating %s: ", algorithmTitles[algoNo]);

        for (int i = 0 ; i < sizes.length ; i++) {
            for (int j = 1 ; j <= numsOfRepetition ; j++) {

                int[] A = arrayGen(sizes[i]);
                double t0 = System.nanoTime() / 1e6;

                switch (algoNo) {
                    
                    case 0:
                        bubbleSort(A);
                    case 1:
                        selectionSort(A);
                    case 2:
                        insertionSort(A);
                    case 3:
                        Arrays.sort(A);

                }

                double t1 = System.nanoTime() / 1e6;
                records[algoNo][i] += t1 - t0;

            }
            System.out.printf(".");
            records[algoNo][i] /= numsOfRepetition;
        
        }
        System.out.println("Done.");
    }


    public static void bubbleSort(int[] A) {
        for (int i = 0 ; i < A.length ; i++) {
            for (int j = 0 ; j < A.length - i - 1 ; j++) {
                if (A[j] > A[j+1]) {
                    int temp = A[j];
                    A[j] = A[j+1];
                    A[j+1] = temp;
                }
            }
        }
    }


    public static void selectionSort(int[] A) {
        

        for (int i = 0 ; i < A.length ; i++) {
            int idx = i;
            for (int j = i ; j < A.length - i ; j++) {
                if (A[j] < A[idx]) {
                    idx = j;
                }
            }
            int tmp = A[i];
            A[i] = A[idx];
            A[idx] = tmp;
        }
    }

    public static void insertionSort(int[] A) {
        
        for (int i = 1 ; i < A.length ; i++) {
            
            int k = i;
            for (int j = k - 1 ; j >= 0 ; j--) {
                if (A[j] > A[k]) {
                    int tmp = A[k];
                    A[k] = A[j];
                    A[j] = tmp;
                    k--;
                } else {
                    break;
                }
            }
        }

    }

    public static void showStat() {
        System.out.println("Benchmark (time unit: ms)");
        System.out.printf("%7s", "Size");
        for (String title: algorithmTitles)
            System.out.printf("%17s", title);
        System.out.println();

        for (int i = 0 ; i < sizes.length ; i++) {
            System.out.printf("%7d", sizes[i]);
            for (double[] record : records) {
                System.out.printf("%17.3f", record[i]);
            }
            System.out.println();
        }
    }

    public static int[] arrayGen(int N) {

        int[] A = new int[N];
        for (int i = 0 ; i < A.length ; i++) {
            A[i] = (int) (Math.random() * N * 10);
        }
        return A;

    }

    public static void display(int[] A) {

        for (int item: A) 
            System.out.printf("%d", item);
        System.out.println();
        
    }

}
