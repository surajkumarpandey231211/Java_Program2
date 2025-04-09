import java.util.Scanner;
public class Q16CkeckPowerOfTwoOrNot {
    public static boolean isPower(int num){
        if(num<=0){
            return false;
        }
        if(num==1){
            return true;
        }
        if(num%2 !=0){
            return false;
        }
        return isPower(num/2);
    }
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the number:");
    int num=sc.nextInt();
    System.out.println(isPower(num));


}
    
}
