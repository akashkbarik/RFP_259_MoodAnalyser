package com.moodanalysertest;

import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    @Test
    public void givenMessage_WhenSad_Should_returnSadMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood= moodAnalyser.analyseMood("this is a sad message");
        Assert.assertEquals("SAD", mood);

    }
    @Test
    public void givenMessage_WhenHappy_Should_returnHappyMood() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood= moodAnalyser.analyseMood("this is a happy message");
        Assert.assertEquals("HAPPY", mood);

    }
}
