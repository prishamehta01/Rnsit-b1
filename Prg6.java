//import java.util.HashSet;
public class Prg6 {
    public static void main(String[] args) {
        int[] a = {2,2,2,2,3,3,3,4,5,5,6,7,7,7};
        int[] res = new int[a.length];
        int i,j;
        res[0]=a[0];
        for(i=0,j=0;i<a.length;i++){
            if(a[i]!=res[j]){
                res[j+1] = a[i];
                j++;
            }
        }

        for(int k=0;k<j;k++){
            System.out.println(res[k]);
        }
        /*
        HashSet<Integer> hs = new HashSet<>();
        for(int x:a){
            hs.add(x);
        }
        System.out.println(hs);
        */
    }
}
