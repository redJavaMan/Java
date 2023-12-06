public class Alternative {
    public static void alter(String word1,String word2){
        for (int i=0;i<word1.length();i++) {
            System.out.print(word1.charAt(i)+",");
            for (int j = i; j <= i; j++) {
                System.out.print(word2.charAt(j)+",");
            }
        }
    }
    public static void main(String[] args) {
        alter("abc","pqr");
    }
}
