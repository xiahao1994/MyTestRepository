/**
 * Created by xh on 2019/2/27.
 */
public class InterfaceImplementExample implements InterfaceExample {
    @Override
    public void func1() {
        System.out.println(x);
    }

    public static void main(String[] args) {
        InterfaceExample interfaceImplementExample = new InterfaceImplementExample();
        interfaceImplementExample.func1();
    }
}
