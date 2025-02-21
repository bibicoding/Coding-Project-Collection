/**
 * A generic box storing an item.
 * CS2030S Exercise 4
 * AY23/24 Semester 2
 *
 * @author Chiang Peng-Yi (16K)
 */
class Box<T> {

  private final T content;
  private static final Box<?> EMPTY_BOX = new Box<>(null);

  private Box(T content) {
    this.content = content;
  }

  public static <T> Box<T> of(T content) {
    if (content != null) {
      return new Box<T>(content);
    } else {
      return null;
    }
  }

  public static <T> Box<T> ofNullable(T content) {
    if (content != null) {
      return new Box<T>(content);
    } else {
      return Box.empty();
    }
  }

  public static <T> Box<T> empty() {
    // EMPTY_BOX is final, so it is immutable after initialed
    @SuppressWarnings("unchecked")
    Box<T> myBox = (Box<T>) EMPTY_BOX;
    return myBox;
  }

  public boolean isPresent() {
    if (this.content != null) {
      return true;
    } else {
      return false;
    }
  }

  public Box<T> filter(BooleanCondition<? super T> bc) {
    if (this.isPresent() && bc.test(this.content)) {
      return this;
    } else {
      return Box.empty();
    }
  }

  public <U> Box<U> map(Transformer<? super T, U> tsfm) {
    if (!this.isPresent()) {
      return Box.empty();
    } else {
      Box<U> myBox = new Box<U>(tsfm.transform(this.content));
      return myBox;
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Box) {
      // o is an instance of Box for sure
      @SuppressWarnings("unchecked")
      Box<T> b = (Box<T>) o;

      if (this.isPresent() && b.isPresent()) {
        return this.content.equals(b.content);
      } else if (!this.isPresent()) {
        return !b.isPresent();
      } else {
        return false;
      }
    } else {
      return this == null && o == null;
    }
  }

  @Override
  public String toString() {
    if (content != null) {
      return "[" + content + "]";
    } else {
      return "[]";
    }
  }
}
