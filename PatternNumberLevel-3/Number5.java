import java.util.Scanner;

public class Number5 {
    public static void printNumberPattern(int n){ 
        int space=0;
        int num=n*(n+1)/2;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=num; j++){
                System.out.print(num-- +"\t");sdfghjkl;''
            }
            space++;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        printNumberPattern(n);

    }
}
