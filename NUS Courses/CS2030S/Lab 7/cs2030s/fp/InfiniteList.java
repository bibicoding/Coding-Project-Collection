package cs2030s.fp;

import java.util.ArrayList;
import java.util.List;

public class InfiniteList<T> {

  private final Lazy<Maybe<T>> head;
  private final Lazy<InfiniteList<T>> tail;
  private static final EmptyList emptyList = new EmptyList();

  private InfiniteList() {
    this.head = null;
    this.tail = null;
  }

  public static <T> InfiniteList<T> generate(Producer<T> producer) {
    return new InfiniteList<>(
        Lazy.of(() -> Maybe.some(producer.produce())),
        Lazy.of(() -> InfiniteList.generate(producer)));
  }

  public static <T> InfiniteList<T> iterate(T seed, Transformer<T, T> next) {
    return new InfiniteList<>(seed, () -> InfiniteList.iterate(next.transform(seed), next));
  }

  private InfiniteList(T head, Producer<InfiniteList<T>> tail) {
    this.head = Lazy.of(Maybe.some(head));
    this.tail = Lazy.of(tail);
  }

  private InfiniteList(Lazy<Maybe<T>> head, Lazy<InfiniteList<T>> tail) {
    this.head = head;
    this.tail = tail;
  }

  public T head() {
    return this.head.get().orElseGet(() -> this.tail.get().head());
  }

  public InfiniteList<T> tail() {
    return this.head.get().map(x -> this.tail.get()).orElseGet(() -> this.tail.get().tail());
  }

  public <R> InfiniteList<R> map(Transformer<? super T, ? extends R> mapper) {
    return new InfiniteList<R>(head.map(h -> h.map(mapper)), tail.map(t -> t.map(mapper)));
  }

  public InfiniteList<T> filter(BooleanCondition<? super T> predicate) {
    return new InfiniteList<T>(
        head.map(h -> h.filter(predicate)), tail.map(t -> t.filter(predicate)));
  }

  public static <T> InfiniteList<T> sentinel() {
    @SuppressWarnings("unchecked")
    InfiniteList<T> empty = (InfiniteList<T>) emptyList;
    return empty;
  }

  public InfiniteList<T> limit(long n) {
    return n <= 0
        ? sentinel()
        : new InfiniteList<T>(
            Lazy.of(() -> Maybe.some(this.head())), Lazy.of(() -> this.tail().limit(n - 1)));
  }

  public InfiniteList<T> takeWhile(BooleanCondition<? super T> predicate) {
    Lazy<Boolean> test = Lazy.of(() -> predicate.test(this.head()));
    return new InfiniteList<>(
        Lazy.of(() -> test.get() ? Maybe.some(this.head()) : Maybe.none()),
        Lazy.of(() -> test.get() ? this.tail().takeWhile(predicate) : sentinel()));
  }

  public boolean isSentinel() {
    return false;
  }

  public <U> U reduce(U identity, Combiner<U, ? super T, U> accumulator) {
    U result = identity;
    InfiniteList<T> infiniteList = this;
    while (!infiniteList.isSentinel()) {
      if (infiniteList.head.get().map(x -> true).orElse(false)) {
        result = accumulator.combine(result, infiniteList.head());
      }
      infiniteList = infiniteList.tail.get();
    }
    return result;
  }

  public long count() {
    return reduce(0L, (x, y) -> x + 1L);
  }

  public List<T> toList() {
    List<T> thisList = new ArrayList<>();
    InfiniteList<T> infiniteList = this;
    while (!infiniteList.isSentinel()) {
      if (infiniteList.head.get().map(x -> true).orElse(false)) {
        thisList.add(infiniteList.head());
      }
      infiniteList = infiniteList.tail.get();
    }
    return thisList;
  }

  public String toString() {
    return "[" + this.head + " " + this.tail + "]";
  }

  private static class EmptyList extends InfiniteList<Object> {
    EmptyList() {
      super();
    }

    @Override
    public boolean isSentinel() {
      return true;
    }

    @Override
    public Object head() {
      throw new java.util.NoSuchElementException();
    }

    @Override
    public InfiniteList<Object> tail() {
      return this;
    }

    @Override
    public boolean equals(Object obj) {
      return (obj instanceof EmptyList);
    }

    @Override
    public <R> InfiniteList<R> map(Transformer<? super Object, ? extends R> mapper) {
      return this.sentinel();
    }

    @Override
    public InfiniteList<Object> filter(BooleanCondition<? super Object> predicate) {
      return this;
    }

    @Override
    public InfiniteList<Object> limit(long n) {
      return this;
    }

    @Override
    public List<Object> toList() {
      return List.of();
    }

    @Override
    public String toString() {
      return "[" + "]";
    }

    @Override
    public InfiniteList<Object> takeWhile(BooleanCondition<? super Object> predicate) {
      return this;
    }

    @Override
    public long count() {
      return 0;
    }
  }
}
