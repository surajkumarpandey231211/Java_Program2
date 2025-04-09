public class Q9CountDigit {
    public static void main(String[] args) {
        int num=123;
        int cnt=countDigit(num);
       System.out.println("Count of Digit is:"+cnt); 
    }
    public static int countDigit(int num){
        if(num>1){
            return 1+countDigit(num/10);
        }
        else{
            return 1;
        }
    }
    
}
