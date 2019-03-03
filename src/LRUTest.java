import java.util.Iterator;

/**
 * Created by xh on 2019/3/1.
 */
public class LRUTest {
   //
   public static void main(String[] args) {
       LRU lru = new LRU(3);
       lru.put(1,1);
       printLRU(lru.iterator());
       lru.put(2,3);
       printLRU(lru.iterator());
       lru.put(3,1);
       printLRU(lru.iterator());
       lru.put(2,3);
       printLRU(lru.iterator());

   }
    public static void printLRU(Iterator it){
        while(it.hasNext()){
            System.out.print(it.next());
        }
        System.out.println("");
    }

}
