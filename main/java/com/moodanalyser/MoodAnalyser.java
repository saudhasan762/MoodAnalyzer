package com.moodanalyser;

public class MoodAnalyser {
    String message;
    public MoodAnalyser(String message){
        this.message = message;
    }
    public MoodAnalyser(){}

    public String analyseMood(String message) throws MoodAnalysisException{
        this.message = message;
        return analyseMood();
    }
   /* public String analyseMood()  {
        try{
            return analyseMoodAgain();
        }
        catch (MoodAnalysisException e){
            return "HAPPY";
        }

    }*/
    public String analyseMood() throws MoodAnalysisException {
        try {
            if(message.length() == 0)
                throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_EMPTY, "Please Enter Proper Message");
            if (message.contains("Sad"))
                return "SAD";
            else
                return "HAPPY";
        } catch(NullPointerException e){
            throw new MoodAnalysisException(MoodAnalysisException.ExceptionType.ENTERED_NULL, "Please Enter Proper Message");
        }
    }
}
