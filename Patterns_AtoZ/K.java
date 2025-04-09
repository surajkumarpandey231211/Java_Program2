import java.util.Scanner;

public class K {
     public static void printK(int n){
        int mid=n/2+1;
        int p=mid;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(j==1 || j==p){
                    System.out.print("* ");
               }
                else{
                    System.out.print("  ");
                }
            }
            if(i<mid){
                p--;
            }
            else{
                p++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printK(n);
    }
    
}
