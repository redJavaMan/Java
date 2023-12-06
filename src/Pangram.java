public class Pangram {
    public static boolean pangram(String pangram){
        boolean[] mark = new boolean[26];
        int index = 0;
        for (int i = 0; i < pangram.length(); i++) {
            if ('A' <= pangram.charAt(i) && pangram.charAt(i) <= 'Z') {
                index = pangram.charAt(i) - 'A';
            } else if ('a' <= pangram.charAt(i) && pangram.charAt(i) <= 'z') {
                index = pangram.charAt(i) - 'a';
                mark[index] = true;
            }
        }
        for (int i = 0; i <= 25; i++) {
            if (!mark[i]) {
                return false;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        pangram("The quick brown fox jumps over the lazy dog");
    }
}