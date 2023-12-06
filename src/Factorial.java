public class Factorial {
    public static void factor(int f){
        int factorial=1;
        for (int i=1;i<=f;i++){
            factorial=factorial*i;
            System.out.print(factorial+" , ");
        }
    }
    public static void main(String[] args) {
        factor(5);
    }
}
