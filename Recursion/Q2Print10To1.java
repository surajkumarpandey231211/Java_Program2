public class Q2Print10To1 {
    public static void main(String[] args) {
        tenToOne(10);
        
    }
    public static void tenToOne(int num){
        if(num>1){
            System.out.println(num);
            tenToOne(num-1);
        }else{
            System.out.println(1);
        }
    }
    
}
