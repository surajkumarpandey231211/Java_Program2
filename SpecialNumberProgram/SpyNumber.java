// The numbers digit sum and product is same is called SPY number...
import java.util.*;
public class SpyNumber{
    public static boolean getSum(int num){
        int sum=0;
        int product=1;
        while(num>0){
            int rem=num%10;
            sum=sum+rem;
            product=product*rem;
        num=num/10;    
        }
        return sum==product;

    }
    // public static int getSum(int num){
        
    // }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=1; i<=num; i++){
            if(getSum(i)){
                System.out.print(i+" ");
            }
        }
        
    }
}