@FunctionalInterface
/**
 * MyFuncInterface
 */
interface MyFuncInterface {
    public String sayHello();
}

public class LambdaDemo{
    public static void main(String[] args) {
        MyFuncInterface msg= ()->{return "Hello Student";};
        System.out.println(msg.sayHello());
    }   
}
