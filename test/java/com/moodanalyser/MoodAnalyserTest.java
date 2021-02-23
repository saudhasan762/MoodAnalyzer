package com.moodanalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("This is a Sad Message");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("SAD", mood);
    }

    @Test
    public void givenMessage_WhenNotSad_ShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("This is a Happy Message");
        }  catch( MoodAnalysisException e){
            e.printStackTrace();
        }
      Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void givenNullMoodShouldReturnHappy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = null;
        try {
            mood = moodAnalyser.analyseMood("This is a Happy Message");
        } catch (MoodAnalysisException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("HAPPY", mood);
    }

    @Test
    public void GivenNullMood_ShouldThrowException() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try {
            moodAnalyser.analyseMood(null);
        }  catch( MoodAnalysisException e){
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.type);
        }
    }
}
