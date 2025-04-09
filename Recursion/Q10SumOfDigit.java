public class Q10SumOfDigit {
    public static void main(String[] args) {
        int num=123;
        int sum=sumOfDigit(num);
        System.out.println(sum);
    }
    public static int sumOfDigit(int num){
    if(num>0){
        return num%10+sumOfDigit(num/10);
    }
    else{
        return num;
    }
}
}
