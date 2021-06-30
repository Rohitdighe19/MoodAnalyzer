package analyzer.moodAnalyzer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoodAnalyzerTests 
{
	MoodAnalyzer moodanalyzer=new MoodAnalyzer();
    @Test
    public void testMoodAnalyzer() throws Exception
    {
    	String mood=moodanalyzer.analyseMood("I am in Sad Mood");
        assertEquals("SAD",mood);
    }
	
	}
