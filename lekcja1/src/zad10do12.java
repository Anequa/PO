public class zad10do12 {
    public static void zad10(){
        System.out.println("1 miejsce:shrek");
        System.out.println("2 miejsce:osiol");
        System.out.println("3 miejsce:kot w butach");
        }
    public static void zad11(){
        System.out.println("wlazł kotek na plotek i mruga ładna to piosenka nie długa");
    }
    public static void zad12(){

        for (int i=0;i<6;i++)
        {
            if (i%2!=0)
            {
                System.out.println("* ".repeat(6)+"- ".repeat(10));
            }
        else{
                System.out.println(" *".repeat(6)+"- ".repeat(10));
        }
        }
        for (int j=0;j<6;j++)
        {
            System.out.println("- ".repeat(16));
        }

    }
    public static void main(String[] args){
    zad10();
    zad11();
    zad12();

    }
}
