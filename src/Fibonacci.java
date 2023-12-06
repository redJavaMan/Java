public class Fibonacci {
    public static void fibonaci(int f){
        int n1=0;
        int n2=1;
        int sum;
        for (int i=1;i<=f;i++){
            sum=n1+n2;
            System.out.println(sum);
            n1=n2;
            n2=sum;
        }
    }
    public static void main(String[] args) {
        fibonaci(7);
    }
}
