import java.util.*;
public class Prg4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if((num & (num-1))==0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
