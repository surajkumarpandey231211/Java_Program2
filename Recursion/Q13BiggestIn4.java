public class Q13BiggestIn4 {
    public static void main(String[] args) {
        int a=12, b=9,c=11,d=16;
        int big=biggest(biggest(a, b), biggest(c, d));
        System.out.println("Biggest is:"+big);
        
    }
    public static int biggest(int a,int b){
        return a>b?a:b;
    }
}
