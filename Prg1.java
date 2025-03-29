import java.util.*;
public class Prg1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum =0;
        /* 
        O(n)
        for(int i=1;i<=num;i++){
            sum+=i;
        }*/
        
        //Optimised -- O(1)
        sum = ((num)*(num+1))/2;
        System.out.println(sum);
        sc.close();
}
}