public class zad1do5 {
    public static void main(String[] args){
        System.out.println(31+29+31);
        System.out.println(1+2+3+4+5+6+7+8+9+10);
        int z=1;
        for(int i=1;i<=10;i++) {
            z=z*i;
        }
        double k=1000;
        for(int i=1;i<=3;i++)
        {
            double p=k+(k*0.06);
            System.out.println("kasa po roku"+i+": "+p);
            k=p;
        }
        String slowo="JAVA";
        int d=slowo.length();
        for(int i=0;i<3;i++) {
            if(i==0||i==2) {
                System.out.println("+"+"-".repeat(d)+"+");
            }else{
                System.out.println("|"+slowo+"|");
            }
        }




    }
}
