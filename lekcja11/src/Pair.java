public class Pair<T> {

    public Pair() {
        first = null;
        second = null;
    }

    public Pair (T first, T second) {
        this.first = first;
        this.second = second;
    }
    public void swap(){
        T temp=this.first;
        this.first=this.second;
        this.second=temp;

    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }

    public T getFirst() {
        return first;
    }
    public T getSecond() {
        return second;
    }

    public void setFirst (T newValue) {
        first = newValue;
    }
    public void setSecond (T newValue) {
        second = newValue;
    }

    private T first;
    private T second;
}
