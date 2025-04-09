import java.util.Scanner;

public class A{
    public static void printA(int n){
        int mid=n/2+1;
        int p=mid,q=mid;
        for(int i=1; i<=n; i +=2){
            for(int j=1; j<=q; j++){
                if(i==p|j==q|| i==mid+1 && j>p){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
                
            }
            p--;
            q++;

            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printA(n); 
    }
}