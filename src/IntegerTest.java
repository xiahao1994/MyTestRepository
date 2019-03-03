/**
 * Created by xh on 2019/2/27.
 */
public class IntegerTest {
    public static void main(String[] args) {
        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x == y);    // false
        Integer z = Integer.valueOf(123);
        Integer k = Integer.valueOf(123);//直接从缓冲池取
        System.out.println(z == k);
    }
}
