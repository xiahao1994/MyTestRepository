/**
 * 研究反射机制
 * Created by xh on 2019/2/27.
 */

    import java.lang.reflect.Array;
    import java.lang.reflect.InvocationTargetException;
    import java.lang.reflect.Method;

    public class Reflect {
        public static void main (String[] args)throws Exception {
           // test();
           // testArray();
            isInstanceofoneclass();
        }
        public static void test1() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
            Class <?>c = InterfaceImplementExample.class;
            Object o = c.newInstance();
            Method method = c.getMethod("func1");
            Object result = method.invoke(o);
            System.out.println("xx");
        }

        /**
         * 判断是否为某个类的实例
         * @throws IllegalAccessException
         * @throws InstantiationException
         */
        public static void isInstanceofoneclass() throws IllegalAccessException, InstantiationException {
            Class<?>c = methodClass.class;
            Object o = c.newInstance();
            boolean is =c.isInstance(o);
            System.out.println(is);
        }
        /**
         * 反射调用方法
         * @throws IllegalAccessException
         * @throws InstantiationException
         * @throws NoSuchMethodException
         * @throws InvocationTargetException
         */
        public static void test() throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
            Class<?> c = methodClass.class;
            Object object = c.newInstance();
            Method[] methods = c.getMethods();
            Method[] declaredMethods = c.getDeclaredMethods();
            //获取methodClass类的add方法
            Method method = c.getMethod("add", int.class, int.class);
            Object result = method.invoke(object,1,2);
            //getMethods()方法获取的所有方法
            System.out.println("getMethods获取的方法：");
            for(Method m:methods)
                System.out.println(m);
            //getDeclaredMethods()方法获取的所有方法
            System.out.println("getDeclaredMethods获取的方法：");
            for(Method m:declaredMethods)
                System.out.println(m);
        }

        /**
         * 反射创建数据组
         * @throws ClassNotFoundException
         */
        public static void testArray() throws ClassNotFoundException {
            Class<?> cls = Class.forName("java.lang.String");
            Object array = Array.newInstance(cls,25);
            //往数组里添加内容
            Array.set(array,0,"hello");
            Array.set(array,1,"Java");
            Array.set(array,2,"fuck");
            Array.set(array,3,"Scala");
            Array.set(array,4,"Clojure");
            //获取某一项的内容
            System.out.println(Array.get(array,3));
        }
    }

    class methodClass {

        public final int fuck = 3;
        public int add(int a,int b) {
            return a+b;
        }
        public int sub(int a,int b) {
            return a+b;
        }
    }