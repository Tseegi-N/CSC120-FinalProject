import java.util.ArrayList;

public class Location {
    String question;
    String[] answers;
    Integer CorrectAnswer;
    Integer WrongAnswer;
    Integer TileNumber;

    public Location(String quest, Integer CorrectAns, Integer WrongAns, String... questAns){
        this.question = quest;
        this.answers = questAns;
        this.CorrectAnswer = CorrectAns;
        this.WrongAnswer = WrongAns;
    }

    public String getQuest(){
        return question;
    }

    public String[] getAns(){
        return answers;
    }

    public Integer getCorrectAns(){
        return CorrectAnswer;
    }    

    public Integer getWrongAns(){
        return WrongAnswer;
    }
}
