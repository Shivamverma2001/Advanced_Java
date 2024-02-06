@FunctionalInterface
/**
 * only 1 abstract method 
 * contain maybe any number of non-abstract methods
 */

 interface Msg {
    void say(String msg);
}

public class FunctionalInterfaceDemo implements Msg{

    public void say(String msg){
        System.out.println(msg);
    }

    public static void main(String[] args) {
        FunctionalInterfaceDemo f=new FunctionalInterfaceDemo();
        f.say("Good Morning Everyone");
    }
}
