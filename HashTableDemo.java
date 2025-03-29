import java.util.Hashtable;
import java.util.Map;
public class HashTableDemo {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht = new Hashtable<>();
        ht.put(122, "Prisha");
        ht.put(1, "Abhi");
        ht.put(2,"Abc");
        for(Map.Entry hm : ht.entrySet()){
            System.out.println(hm.getKey()+" "+ hm.getValue());
        }
    }
}
