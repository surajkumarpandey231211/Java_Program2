import java.util.*;
public class Q17CkeckPowerOfThreeOrNot {
    public static boolean isPowerOfThree(int num){
        if(num<=0){
            return false;
        }
        if(num==1){
            return true;
        }
        if(num%3 != 0){
            return false;
        }
        return isPowerOfThree(num/3);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        System.out.println(isPowerOfThree(num));
    }
}
