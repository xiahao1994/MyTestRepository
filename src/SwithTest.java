/**
 * Created by xh on 2019/2/27.
 */
public class SwithTest {
    public static void main(String[] args) {
        String s = "aa";

        //支持int string
        switch (s) {
            case "a":
                System.out.println("aaa");
                break;
            case "aa":
                System.out.println("bbb");
                break;
        }
    }
}
