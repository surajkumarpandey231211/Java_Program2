import java.util.Scanner;

public class Q {
    public static void printQ(int n){
        int mid=n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 && i<n || i==1 && j<n || j==n-1 && i<n ||i==j && i>=mid || i==n-1 && j<n ){
                    System.out.print("* ");
               }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printQ(n);
    }
    
}
