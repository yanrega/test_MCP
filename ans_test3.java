import java.util.*;

public class MyFunction {
    public static String[] wordLength(String word, int x) {
        ArrayList<String> list_result = new ArrayList<String>();
        String[] arrWord = word.split(" ");
        for(String words: arrWord){
            if(words.length() == x){
                list_result.add(words);
            }
        }

        String[] result = new String[list_result.size()];
        for (int i = 0; i < list_result.size(); i++)
            result[i] = list_result.get(i);
        return result;
    }

    public static void main(String[] args) {
        String word = "souvenir loud four lost";
        int x = 4;
        System.out.println(Arrays.toString(wordLength(word, x)));
    }

}