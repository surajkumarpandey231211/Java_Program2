import java.util.Scanner;
public class Mixed {
    public static void plus3(int n){
        if(n%2 == 0){
            System.out.println("Not possible plus operation..");
            return;
        }
        int mid=n/2+1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n || i==j || i+j==n+1|| i==mid || j==mid || i==1 && j>mid || j==n && i>mid || i==n && j<mid || j==1 && i<mid ){
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
        plus3(n);
    }
}
