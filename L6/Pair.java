// Generic class - обобщен клас
public class Pair<Type1, Type2> {
    private Type1 first;
    private Type2 second;
    
    public Pair(Type1 first, Type2 second) {
        this.first = first;
        this.second = second;
    }

    public Type1 getFirst() {
        return first;
    }

    public Type2 getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "First: " + first + " second: " + second;
    }

    public static void main(String[] args) {
        Pair<Double, String> pair = new Pair<>(15.5, "text");
        Pair<Character, Integer> pair2=new Pair<>('j',3);
        System.out.println(pair.toString());
        System.out.println(pair2.toString());
    }
}   
