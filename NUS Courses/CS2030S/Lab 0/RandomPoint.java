import java.util.Random;

/**
 * CS2030S Exercise 0: RandomPoint.java
 * Semester 2, 2023/24
 *
 * <p>The Point class encapsulates a point on a 2D plane.
 *
 * @author Chiang Peng-Yi
 */
class RandomPoint extends Point {

  private static Random rng = new Random(1);

  public static void setSeed(int seed) {
    rng = new Random(seed);
  }

  public RandomPoint(double minX, double maxX, double minY, double maxY) {

    super(minX + (maxX - minX) * rng.nextDouble(), minY + (maxY - minY) * rng.nextDouble());
  }
}
