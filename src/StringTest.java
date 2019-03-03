/**
 * Created by xh on 2019/2/27.
 */
public class StringTest {
    public final int a =1;
    public static void main(String[] args) {
       // a=2;会报错
        StringBuffer a = new StringBuffer();
        a.append("qwer");
        //a.append(true);
        StringBuffer b = new StringBuffer();
        b.append("qwer");
        System.out.println(a==b);
        System.out.println(a.toString()==b.toString());
        System.out.println(a.toString().equals(b.toString()));
    }
}
