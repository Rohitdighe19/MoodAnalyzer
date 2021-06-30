package analyzer.moodAnalyzer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoodAnalyzerTests 
{
	MoodAnalyzer moodanalyzer=new MoodAnalyzer();
    @Test
    public void testMoodAnalyzer_anyMOod_shouldReturn_Happy()
    {
    	String mood=moodanalyzer.analyseMood("I am in Any Mood");
        assertEquals("HAPPY",mood);
    }
}