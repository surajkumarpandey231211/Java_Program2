public class Q1Print1To10{
    public static void main(String[] args) {
        getNum(1);
    }
    public static void getNum(int num){
        if(num<10){
            System.out.println(num);
            getNum(num+1);
        }
        else{
        System.out.println(num);;
        }
    }
}