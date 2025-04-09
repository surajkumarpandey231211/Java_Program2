public class Q14FibbonaciSeries {
    public static int getFibonacci(int num){
        if(num==0){
            return 0;
        }
        if(num==1 || num==2){
            return 1;
        }
        return getFibonacci(num-1)+getFibonacci(num-2);
    }
    public static void main(String[] args) {
        int num=7;
        System.out.println(getFibonacci(num));
    }
}
