public class ZigZag {
    public static void main(String[] args) {
        int rows = 3,column = 13;
        /*for(int i = 1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                if(i==1 && j%4==3 || i==2 && j%2==0 || i==3 && j%4==1){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
            */
        for(int i = 1;i<=rows;i++){
            for(int j=1;j<=column;j++){
                if((i==2 && j%4==0) ||  (i+j)%4==0){
                    System.out.print(" * ");
                }
                else{
                    System.out.print("   ");
                }
            }
            System.out.println();
        }
    }
}
