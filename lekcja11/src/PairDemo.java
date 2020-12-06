public class PairDemo {
    public static void main(String[] args){
        Pair<Integer> liczby = new Pair<>(5, 8);

        System.out.println(liczby);
        liczby.swap();
        System.out.println(liczby);
    }
}
