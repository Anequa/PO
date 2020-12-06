public class PairUtilDemo {
    public static void main(String[] args)
    {
        Pair<String> imiona = new Pair<>("pierwsze", "Drugie");
        Pair zamianka=PairUtil.swap(imiona);
        System.out.println(imiona);
        System.out.println(zamianka);
    }
}
