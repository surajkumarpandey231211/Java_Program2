public class Q6sumOfCube {
    public static void main(String[] args) {
        int num=10;
        int sum=sumOfCube(num);
        System.out.println("Sum of cube: "+sum);
        
    }
    public static int sumOfCube(int num){
        if(num>1){
            return num*num*num+sumOfCube(num-1);
        }
        else{
            return num;
        }
    }
    
}
