public class Q4SumOf1To100 {
    public static void main(String[] args) {
    int num=100;
    int result=sumOfNum(num);
    System.out.println(result);
        
    }
    public static int sumOfNum(int num){
       if(num>1)
        return num+sumOfNum(num-1);
       
       else{
        return num;
    }   
   }
}
