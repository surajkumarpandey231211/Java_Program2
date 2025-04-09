public class Q20LCMOfNum {
    public static int getLcm(int a,int b){
        int big=a>b?a:b;
        for(int i=big;;i+=big){
            if(i%a==0 && i%b==0){
                return i;
            }
        }
    }
    public static void main(String[] args) {
       int a=10;
       int b=20;
       System.out.println(getLcm(a, b)); 
    }
}
