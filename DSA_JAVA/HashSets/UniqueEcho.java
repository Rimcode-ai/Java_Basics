package DSA_JAVA.HashSets;
import java.util.HashSet;
/***Question-Picture this: you're given a vast list of words, and you must
identify the final word that stands proudly solitary — the last word that is not repeated. 
Imagine sorting through a database of unique identifiers and finding one identifier 
towards the end of the list that is unlike any others.***/
//State the 1 or more unique words in the list, and do not count the duplicate words

public class UniqueEcho {
    public static void main (String [ ] args){
        String [] input = {"apple", "banana", "orange", "grape", "mango", "pineapple", "watermelon", "cherry", "strawberry", "blueberry", "raspberry", 
                            "blackberry", "kiwi", "peach","grape", "mango", "pineapple", "watermelon", "cherry", "strawberry", "blueberry", "raspberry", "blackberry"};
        //create 2 HashSets- UniqueWord & DuplicateWord; then remove DuplicateWord HashSet from UniqueWord

        HashSet <String> UniqueWord = new HashSet<>();
        HashSet <String> DuplicateWord = new HashSet<>();

        for (String item : input ){
            if (UniqueWord.contains(item)){
                DuplicateWord.add(item);

            }else{
                UniqueWord.add(item);
            }
        }
        UniqueWord.remove(DuplicateWord);
        System.out.println("The Unique Echos are: " + UniqueWord);
    }
    
}
