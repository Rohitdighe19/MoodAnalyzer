package analyzer.moodAnalyzer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class MoodAnalyzerTests 
{	
	@Test
    public void testMoodAnalyzer_Constructor_SadMessage_shouldReturn_SAD()
    {	
		String Mood=MoodAnalyzer.MoodAnalyzer();
		System.out.println(Mood);
        assertEquals("SAD",Mood);
    }
    
}