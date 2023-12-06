public class Common {
    public static void commonAlpha(String str1,String str2){
        for(int i =0;i<str1.length();i++){
            for(int j=0;j<str2.length();j++){
                if(str1.charAt(i)==str2.charAt(j)){
                    System.out.print(str1.charAt(i)+",");
                }
            }
        }
    }
    public static void main(String[] args) {
            commonAlpha("ABC","ABCD");
        }
    }


