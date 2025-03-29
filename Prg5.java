
//import java.util.LinkedHashSet;

public class Prg5 {
    public static void main(String[] args) {
        int[] a = {3,3,4,3,2,8,3,4,5,5,3,3,2,1,7,8};
        //Brute Force
        int[] b = new int[a.length];
        int i,j,k=0,flag;
        for(i=0;i<a.length;i++){
            flag = 0;
            for(j=0;j<k;j++){
                if(a[i]==b[j]){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                b[k++] = a[i] ;
            }
        }

        for(int l=0;l<k;l++){
            System.out.print(b[l]+" ");
        }
        //Optimal
        /*
        LinkedHashSet<Integer> hs = new LinkedHashSet<>();
        for(int z:a){
            hs.add(z);
        }
        System.out.print(hs);
        */
    }
}
