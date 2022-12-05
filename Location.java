public class Location {
    //Declaring parameters
    String question;
    String[] answers;
    Integer CorrectAnswer;
    Integer WrongAnswer;
    Integer TileNumber;

    /* Constructor */
    public Location(String quest, Integer CorrectAns, Integer WrongAns, String... questAns){
        this.question = quest;
        this.answers = questAns;
        this.CorrectAnswer = CorrectAns;
        this.WrongAnswer = WrongAns;
    }

    /** 
     * Get questions from tile
     * @return question - question of the tile
     */
    public String getQuest(){
        return question;
    }

    /** 
     * Get multiple choice answers
     * @return answers - possible answer choices of the tile
     */
    public String[] getAns(){
        return answers;
    }

    /** 
     * Get the correct answer to the question 
     * @return CorrectAnswer - index of the correct answer of the tile
     */
    public Integer getCorrectAns(){
        return CorrectAnswer;
    }    

    /** 
     * Get the incorrect answer to the question 
     * @return WrongAnswer - index of the incorrect answer of the tile
     */
    public Integer getWrongAns(){
        return WrongAnswer;
    }
}
