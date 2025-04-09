public class Q7Factorial {
    public static void main(String[] args) {
        int num=5;
        int fact=factorial(num);
        System.out.println("Factorial of number is: "+fact);
        
    }
    public static int factorial(int num){
        if(num>1){
            return num*factorial(num-1);
        }
        else{
            return num;
        }
    }
    
}
