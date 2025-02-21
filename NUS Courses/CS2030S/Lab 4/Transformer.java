/**
 * The Transformer interface that can transform a type T
 * to type U.
 * CS2030S Exercise 4
 * AY23/24 Semester 2
 *
 * @author Chiang Peng-Yi (16K)
 */
interface Transformer<T, U> {

  U transform(T item);
}
