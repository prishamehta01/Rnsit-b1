import java.util.Scanner;

public class Prg2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum =0;
        /* O(n/2)
        for(int i=2;i<=num;i+=2){
            sum+=i;
        }*/

        //Optimised---O(1)
        sum = (n/2)*((n/2)+1);
        System.out.println(sum);
        sc.close();
    }
}
