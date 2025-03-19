/**
 * CS2030S Exercise 5
 * AY24/24 Semester 2
 *
 * @author Chaing Peng-Yi (16K)
 */
package cs2030s.fp;

public interface Transformer<T, U> {

  public U transform(T t);
}
