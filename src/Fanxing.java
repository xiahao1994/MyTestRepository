/**
 * 泛型
 * http://www.importnew.com/24029.html
 * Created by xh on 2019/2/28.
 */
public class Fanxing {
    public static void main(String[] args) {
        Box b = new Box();
        b.set(1.2f);
        System.out.println(b.get());
    }
}
 class Box<T> {
    // T stands for "Type"
    private T t;
    public void set(T t) { this.t = t; }
    public T get() { return t; }
}
