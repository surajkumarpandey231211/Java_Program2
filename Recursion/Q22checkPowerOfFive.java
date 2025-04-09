import java.util.Scanner;

public class Q22checkPowerOfFive {
    public static boolean isPowerOfFive(int num){
        if(num<=0){
            return false;
        }
        if(num==1){
            return true;
        }
        if(num%5 !=0){
            return false;
        }
        return isPowerOfFive(num/5);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int count=0;
        for(int i=1; i<=num; i++){
            if (isPowerOfFive(i)){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Count of fives's power:"+ count);
    }
}
