package cs2030s.fp;

public class Lazy<T> {
  private Producer<? extends T> producer;
  private Maybe<T> value;

  private Lazy(T item) {
    this.value = Maybe.some(item);
    this.producer = () -> item;
  }

  private Lazy(Producer<? extends T> p) {
    this.producer = p;
    this.value = Maybe.none();
  }

  public static <T> Lazy<T> of(T t) {
    return new Lazy<T>(t);
  }

  public static <T> Lazy<T> of(Producer<? extends T> p) {
    return new Lazy<T>(p);
  }

  public T get() {
    if (Maybe.none().equals(this.value)) {
      T temp = this.value.orElseGet(producer);
      this.value = Maybe.some(temp);
      return temp;
    }
    return this.value.orElseGet(producer);
  }

  @Override
  public String toString() {
    if (Maybe.none().equals(this.value)) {
      return "?";
    } else {
      return String.valueOf(this.get());
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o instanceof Lazy) {
      Lazy<?> lazy = (Lazy<?>) o;
      return this.get().equals(lazy.get());
    } else {
      return false;
    }
  }

  public Lazy<Boolean> filter(BooleanCondition<? super T> b) {
    return Lazy.of(() -> b.test(this.get()));
  }

  public <U> Lazy<U> map(Transformer<? super T, ? extends U> t) {
    return Lazy.of(() -> t.transform(this.get()));
  }

  public <U> Lazy<U> flatMap(Transformer<? super T, ? extends Lazy<? extends U>> t) {
    return Lazy.of(() -> t.transform(this.get()).get());
  }

  public <R, S> Lazy<R> combine(Lazy<S> s, Combiner<? super T, ? super S, ? extends R> f) {
    return Lazy.of(() -> f.combine(this.get(), s.get()));
  }
}
