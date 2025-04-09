public class Q8Power {
    public static void main(String[] args) {
        int a=2;
        int b=3;
        int pow=power(a, b);
        System.out.println(pow);
    }
    public static int power(int a, int b){
        if(b>1){
            return a*power(a, b-1);
        }
        else{
            return a;
        }
    }
    
}
