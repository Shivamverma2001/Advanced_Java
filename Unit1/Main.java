public class Main{
    public static void main(String[] args) {
        int n=9373;
        int n2=n*n;
        int count =(""+n).length();

        int p=(int)Math.pow(10, count);

        if((n2-n)%p==0){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

    }
}
