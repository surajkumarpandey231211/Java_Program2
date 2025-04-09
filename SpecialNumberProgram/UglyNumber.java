import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int i;
        for( i=2; i<=num/2; i++){
            if(num%i==0){
                System.out.print(i+" ");  
            }
        }
        if(i==2 && i==3 || i==2 && i==5 || i==3 && i==5 || i==2 && i==3 && i==5){
            System.out.println("\nUgly number...");
        }
        else{
            System.out.println("\nNot a ugly number..");
        }
      
        
    }
    
}
