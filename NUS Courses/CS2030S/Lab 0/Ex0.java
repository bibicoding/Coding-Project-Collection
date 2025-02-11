import java.util.Scanner;

/**
 * CS2030S Exercise 0: Estimating Pi with Monte Carlo
 * Semester 2, 2023/24
 *
 * <p>This program takes in two command line arguments: the
 * number of points and a random seed.  It runs the
 * Monte Carlo simulation with the given argument and print
 * out the estimated pi value.
 *
 * @author Chiang Peng-Yi (00X)
 */
class Ex0 {

  public static double estimatePi(int numOfPoints, int seed) {
    RandomPoint.setSeed(seed);

    Circle c = new Circle(new Point(0.5, 0.5), 0.5);

    int n = 0;
    for (int i = 0; i < numOfPoints; i++) {
      Point p = new RandomPoint(0, 1, 0, 1);
      if (c.contains(p)) {
        n++;
      }
    }

    return 4.0 * n / numOfPoints;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numOfPoints = sc.nextInt();
    int seed = sc.nextInt();

    double pi = estimatePi(numOfPoints, seed);

    System.out.println(pi);
    sc.close();
  }
}
