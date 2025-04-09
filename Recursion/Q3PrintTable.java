public class Q3PrintTable {
    public static void main(String[] args) {
        table(10, 1);
        
    }
    public static void table(int n,int i){
        if(i<=10){
            System.out.println(n+"*"+i+"="+n*i);
            table(n, i+1);
        }
    }
    
}
