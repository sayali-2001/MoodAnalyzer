package com.bl.moodAnalyser;

public class MoodAnalyzer {
    private String message;

    public MoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyseMood(String message) throws MoodAnalyzerException {
        this.message = message;
        return analyseMood();
    }

    /**
     * Method for analyse respond Happy or Sad Mood
     * @return : HAPPY or SAD
     */
    public String analyseMood() throws MoodAnalyzerException {

        try {
            if (message.contains("SAD"))
                return "SAD";
            else if (message.contains(""))
                throw new MoodAnalyzerException("Empty Input");
            else
                return "HAPPY";
        }catch (NullPointerException e){
            throw new MoodAnalyzerException("Null Input");
        }
    }

    public static void main(String[] args) throws MoodAnalyzerException {
        MoodAnalyzer moodAnalyzer = new MoodAnalyzer("HAPPY");
        String result = moodAnalyzer.analyseMood();
        System.out.println(result + " MOOD");
    }
}
