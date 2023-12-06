public class Recursion {
    public static int factorial(int n) {
        if(n==1){
            return 1;
        }
        else {
            return n*factorial(n-1);
        }
    }
    public static int fibonacci(int f){
        if (f<=1){
            return f;
        }
        return fibonacci(f-1)+(f-2);
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fibonacci(8));
    }
}
