public class Prg3 {
    public static void main(String[] args) {
        int[] a = {2,2,3,3,8,8,9,9,10};
        int num = 0;
        int l=0,r=a.length-1;
        while(l<=r)
        {
            int m = (l+r)/2;
            if(m==0){
                num = a[0];
                break;
            }
            else if(m==a.length-1){
                num = a[a.length-1];
                break;
            }
            if(a[m]!=a[m+1] && a[m]!=a[m-1]){
                num = a[m];
                break;
            }
            else if(a[m]==a[m+1] || a[m]==a[m-1]){
                if(((r-m)+1)%2==0){
                    r=m-1;
                }
                else{
                    l=m+1;
                }
            }
           
        }
        System.out.println(num);
    }
}
