package DSA_JAVA.HashSets;

import java.util.HashSet;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.ArrayList;
/* 2 arrays are given
 * Array1 = [ "Cheater", "god", "root", "peach" ] 
 * Array2 = [ "torso", "teaher", "apple", "dog" ] 
 * find the words of Array1 that are anagram(has all the letters same)in Array2
 */
public class anagramMatcher {

    public static boolean isAnagramCheck(String word1, String word2){
        word1 = word1.toLowerCase();
        word2 = word2.toLowerCase();
        if (word1.length() != word2.length()){
            return false;
        }
        HashMap<Character, Integer> hm1 = getMapForAWord(word1);
        HashMap<Character, Integer> hm2 = getMapForAWord(word2);

        for (Entry<Character, Integer> entry : hm1.entrySet()){
            char keyWord = entry.getKey();
            int countChar = entry.getValue();

            if (!hm2.containsKey(keyWord)){
                return false;
            }
            else if (hm2.get(keyWord)!= countChar){
                return false;
            }
        }
        return true;
    }

    public static HashMap<Character, Integer> getMapForAWord(String word){
        HashMap<Character, Integer> hm = new HashMap<>();
        for (int i =0; i< word.length(); i++){
            char tempWord = word.charAt(i);
            if (hm.containsKey(tempWord)){
                int existingTempWordCount = hm.get(tempWord);
                hm.put(tempWord, existingTempWordCount+1);

            }else{
                hm.put(tempWord, 1);
            }
        }
        return hm;
    }
    public static HashSet <String> toHashSets (String [] arr){
        HashSet<String> hs = new HashSet<>();
        for (int i =0; i < arr.length; i++){
            hs.add(arr[i]);
        }
        return hs;
    }
    public static void main (String [] args){
        String [] arr1 = {"Cheater", "god", "root", "peach"};
        String [] arr2 = {"torso", "teacher", "apple", "dog"};
        HashSet<String> hs1 = (toHashSets(arr1));
        HashSet<String> hs2 = (toHashSets(arr2));
        ArrayList<String> arrOut = new ArrayList<String>();
        for (String s1 : hs1){
            for (String s2 : hs2){
                if (isAnagramCheck(s1, s2)){
                    arrOut.add(s1);
                }
            }
        }
        System.out.println(arrOut);
       
    }
}
