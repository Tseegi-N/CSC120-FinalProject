public class Location {
    String question;
    String[] answers;
    Integer CorrectAns;

    public Location(String quest, String[] questAns, Integer CorrectAns){
        this.question = quest;
        this.answers[] = questAns[];
        this.CorrectAns = CorrectAns;
    }

    public void askQuestions(){
        System.out.println(question);
    }
}
