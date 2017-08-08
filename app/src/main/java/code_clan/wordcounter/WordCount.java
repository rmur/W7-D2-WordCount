package code_clan.wordcounter;

import java.util.HashMap;

/**
 * Created by R.Murzakov on 08/08/2017.
 */

public class WordCount {

String newSentence;

    public WordCount(String newSentence){
        this.newSentence = newSentence;
    }

    public int wordCount(){
        String toCountWords = this.newSentence;
        String[] arr = toCountWords.split(" ");
        int count = 0;
        for (String word : arr){
            count+=1;
        }
        return count;
    }
}
