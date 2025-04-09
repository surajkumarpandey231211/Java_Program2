public class Q5SumOfSquare {
    public static void main(String[] args) {
        int num=10;
        int result=sumOfNum(num);
        System.out.println(result);
            
        }
        public static int sumOfNum(int num){
           if(num>1)
            return num*num+sumOfNum(num-1);
           
           else{
            return num;
        }   
       }
    
}
