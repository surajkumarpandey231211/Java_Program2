public class Q21TowerOfHanoi {
    public static void towerOfHanoi(int num,char from,char aux,char to){
        if(num==1){
            System.out.println("Move Disk from "+from+" To "+to);
            return;
        }
        towerOfHanoi(num-1,from,to,aux);
        System.out.println("Move Disk from "+from+" To "+to);
        towerOfHanoi(num-1,aux,to,from); 
    }
    public static void main(String[] args) {
        int num=2;
        char from='A',aux='B',to='C';
        towerOfHanoi(num,from,aux,to);
        
    }
}
