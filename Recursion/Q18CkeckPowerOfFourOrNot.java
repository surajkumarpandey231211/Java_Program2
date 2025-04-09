import java.util.*;
public class Q18CkeckPowerOfFourOrNot {
    public static boolean isPowerOfFour(int num){
        if(num<=0){
            return false;
        }
        if(num==1){
            return true;
        }
        if(num%4 != 0){
            return false;
        }
        return isPowerOfFour(num/4);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(isPowerOfFour(num));
    }
}
