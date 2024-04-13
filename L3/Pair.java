public class Pair<T extends Comparable<T>, U extends Comparable<U>> implements Comparable<Pair<T, U>> {
  private T first;
  private U second;

  public Pair(T first, U second) {
    this.first = first;
    this.second = second;
  }

  public T getFirst() {
    return first;
  }

  public U getSecond() {
    return second;
  }

  // Implementing Comparable interface
  @Override
  public int compareTo(Pair<T, U> other) {
    int firstComparison = this.first.compareTo(other.first);
    if (firstComparison != 0) {
      return firstComparison;
    }
    return this.second.compareTo(other.second);
  }

  public static void main(String[] args) {
    // Create a Pair of Integer and String
    Pair<Integer, String> mixedPair1 = new Pair<>(1, "one");
    Pair<Integer, String> mixedPair2 = new Pair<>(1, "one");

    // Create a Pair of String and Double
    Pair<String, Double> doublePair1 = new Pair<>("pi", 3.14);
    Pair<String, Double> doublePair2 = new Pair<>("pi", 3.14);

    // Compare pairs using compareTo
    int result1 = mixedPair1.compareTo(mixedPair2);
    System.out.println("Comparison result for mixed pairs: " + result1);

    int result2 = doublePair1.compareTo(doublePair2);
    System.out.println("Comparison result for double pairs: " + result2);
  }
}
