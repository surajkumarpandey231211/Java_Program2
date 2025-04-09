import java.util.Scanner;

public class R {
    public static void printR(int n){
        int mid=n/2+1;
        int p=mid;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || i==1|| j==n && i<mid || i==mid){
                    System.out.print("* ");
               }
                else{
                    System.out.print("  ");
                }
            }
            if(i>mid){
                p++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printR(n);
    }
    
    
}
