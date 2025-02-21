/**
 * Takes an item and return the item in a box.
 * CS2030S Exercise 4
 * AY23/24 Semester 2
 *
 * @author Chiang Peng-Yi (16K)
 */
class BoxIt<T> implements Transformer<T, Box<T>> {

  @Override
  public Box<T> transform(T item) {
    Box<T> myBox = Box.<T>of(item);
    return myBox;
  }
}
