package code_clan.wordcounter;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by R.Murzakov on 08/08/2017.
 */

public class TestWordCount {
    WordCount newSentence;

    @Before
    public void before(){
        newSentence = new WordCount("Hello my name is Romuald");
    }

    @Test
    public void testWordCount(){
        assertEquals(5, newSentence.wordCount());
    }
}
