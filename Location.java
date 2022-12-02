import java.util.ArrayList;

public class Location {
    String question;
    String[] answers;
    Integer CorrectAnswer;
    Integer TileNumber;

    public Location(Integer TileNum, String quest, Integer CorrectAns, String... questAns){
        this.question = quest;
        this.answers = questAns;
        this.CorrectAnswer = CorrectAns;
        this.TileNumber = TileNum;
    }

    public Location(Integer TileNum){
        this.TileNumber = TileNum;
    }

    public String getQuest(Integer TileNum){
        if(TileNum == TileNumber){
            return question;
        }
        else{
            return "wtf??";
        }
    }

    public String[] getAns(Integer TileNum){
        if(TileNum == TileNumber){
            return answers;
        }
        else{
            String[] example = {"m", "fe"};
            return example;
        }
    }

    public Integer getCorrectAns(Integer TileNum){
        if(TileNum == TileNumber){
            return CorrectAnswer;
        }
        else{
            return -1;
        }
    }    
}
