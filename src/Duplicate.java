public class Duplicate {
    public static void main(String[] args) {
        String language[]={"java","python","c++","c","java"};
        for (int i =0;i< language.length;i++){
            for (int j=i+1;j<language.length;j++){
                if (language[i].equals(language[j])){
                    System.out.println(language[i]);
                }
            }
        }

    }
}
