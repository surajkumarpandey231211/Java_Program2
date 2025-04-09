
public class Q19HCFOfThreeNum {
    public static int getHcf(int a, int b){
        if(a==0){
            return b;
        }
        return getHcf(b%a, a);
    }
    public static void main(String[] args) {
        int a=2;
        int b=8;
        int c=4;
        int d=6;

        int hcf=getHcf(getHcf(a, b), getHcf(c, d));
        System.out.println(hcf);
    }
}
