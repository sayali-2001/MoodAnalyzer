package com.bl.moodAnalyzer;

import com.bl.moodAnalyser.ExceptionMessage;
import com.bl.moodAnalyser.MoodAnalyzer;
import com.bl.moodAnalyser.MoodAnalyzerException;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class MoodAnalyzerTest {

    MoodAnalyzer moodAnalyzer;

    @Test
    public void givenSad_shouldReturnSad() throws MoodAnalyzerException {
        moodAnalyzer = new MoodAnalyzer("SAD");
        String result = moodAnalyzer.analyseMood();
        assertEquals("SAD", result);

    }

    @Test
    public void givenAny_shouldReturnHappy() throws MoodAnalyzerException {
        moodAnalyzer = new MoodAnalyzer("any");
        String result = moodAnalyzer.analyseMood();
        assertEquals("HAPPY", result);

    }

    @Test
    public void givenNull_shouldReturnHappy() throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String result = null;
        try {
            result =  moodAnalyser.analyseMood();
            Assert.assertEquals("HAPPY", result);
        }catch (NullPointerException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenNull_shouldThrowExceptionAsNullInput(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer(null);
        String result = null;
        try {
            result =  moodAnalyser.analyseMood();
            Assert.assertEquals(null, result);
        }catch (NullPointerException | MoodAnalyzerException e){
            e.printStackTrace();
        }
    }

    @Test
    public void givenEmpty_shouldThrowExceptionAsEmptyInput(){
        MoodAnalyzer moodAnalyser = new MoodAnalyzer("");
        String result = null;
        try {
            result =  moodAnalyser.analyseMood();
            Assert.assertEquals(ExceptionMessage.Empty, result);

        }catch (NullPointerException | MoodAnalyzerException e){
            e.printStackTrace();
        }
    }
}
