import java.util.ArrayList;

public class Location {
    String question;
    String[] answers;
    Integer CorrectAnswer;
    Integer TileNumber;

    public Location(String quest, Integer CorrectAns, String... questAns){
        this.question = quest;
        this.answers = questAns;
        this.CorrectAnswer = CorrectAns;
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
}
