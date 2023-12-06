public class Palindrome {
    private static void palindrom(String nam){
        String name =nam.toLowerCase();
        String rev="";
        for (int i=name.length()-1;i>=0;i--){
            rev=rev+name.charAt(i);
        }
        if (name.equals(rev)){
            System.out.println("It is a Palindrome : "+rev);
        }
        else {
            System.out.println("It is not a Palindrome : "+rev);
        }
    }
    public static void main(String[] args) {
        palindrom("Maaadam");
    }
}
