/**
 * CS2030S Exercise 0: Point.java
 * Semester 2, 2023/24
 *
 * <p>The Point class encapsulates a point on a 2D plane.
 *
 * @author Chiang Peng-Yi
 */
class Point {
  private double x;
  private double y;

  public Point(double x, double y) {
    this.x = x;
    this.y = y;
  }

  public String toString() {
    return "(" + this.x + ", " + this.y + ")";
  }

  public double distanceTo(Point p) {
    return Math.sqrt((this.x - p.x) * (this.x - p.x) + (this.y - p.y) * (this.y - p.y));
  }
}
