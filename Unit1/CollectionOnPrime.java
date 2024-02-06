import java.util.ArrayList;
import java.util.Iterator;
/**
 * Num
 */
class Num {
    int n;
    public Num(int n){
        this.n=n;
    }
    public String toString(){
        return ""+n;
    }    
}
public class CollectionOnPrime {
    public static void main(String[] args) {
        ArrayList<Num> ls=new ArrayList<>();

        for(int i=2;i<50;i++){
            if(isPrime(i)){
                ls.add(new Num(i));
            }
        }

        Iterator<Num> it=ls.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }

    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }

        return true;
    }
}
