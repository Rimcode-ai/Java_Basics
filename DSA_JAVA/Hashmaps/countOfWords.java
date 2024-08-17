package DSA_JAVA.Hashmaps;

import java.util.Arrays;
import java.util.HashMap;

public class  countOfWords {
    public static void main (String [] args){
        HashMap <String , Integer> countWords = new HashMap <String , Integer>();
        String input = "Hello World Hello Rima How are you Rima";

        String [] words = input.split(" ");// [Hello, World, Hello, Rima, How, are, you, Rima]

        for (String word : words){
            if (countWords.containsKey(word)){
                int existingCount = countWords.get(word);
                countWords.put(word, existingCount+1);


            }else{
                countWords.put(word, 1);
            }
            
        }
        System.out.println(countWords);
    }
}
