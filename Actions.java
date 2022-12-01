import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
/*public interface Actions{
    void buy(String questions, String a, String b, String c);
}
*/
import java.util.List;

class Game {
    protected static int point = 0;
    /*public String a;
    public String b;
    public String c;
    public String questions;*/

    Location firstTile = new Location(1, "Do you brush your teeth in the morning?", 0, "yes", "no", "rinse with moutwash");
    Location secondTile = new Location(2, "How do you get to work?", 0, "bike", "bus", "drive");
    Location thirdTile = new Location(3, "How do you interact with your coworkers?", 0, "Say hi", "ignore", "nod knowingly");
    Location forthTile = new Location(4, "Buy food from grocery store. Which brand do you choose?", 0, "Organic Farmhouse", "Fresh Greens", "Happy Animals");
    Location fifthTile = new Location(5, "Buy drink from grocery store. Which brand do you choose?", 2, "Bulb", "Flash", "Nurture");
    Location sixthTile = new Location(6, "Buy snack from grocery store. Which brand do you choose?", 1, "Kringles", "Zheetos", "Jays");
    Location seventhTile = new Location(7, "Buy appliances. Which brand do you choose?", 0, "Bouncy", "Cleanext", "Sweep");
    Location eighthTile = new Location(8, "Buy a cookie from...", 0, "Local bakery", "Costco", "CVS");
    Location ninthTile = new Location(9, "Buy a cookie. Which flavor do you choose?", 2, "Chocolate", "Almond", "Oatmeal");
    Location tenthTile = new Location(10, "Buy a cup of coffee. What flavor do you choose?", 0, "Decaf", "Americano", "Latte");
    Location eleventhTile = new Location(11, "Buy a cup of coffee. Where do you buy it from?", 0, "Local coffee shop", "Starbucks", "Dunkin");
    Location twelfthTile = new Location(12, "Surprise your partner with flowers! Choose where you get your flowers from.", 0, "Handpick", "grocery store", "local flower shop");
    Location thirteenthTile = new Location(13, "Check up on your introverted friend! What form of communication do you use?", 1, "Call", "Text", "Surprise visit!");
    Location fourteenthTile = new Location(14, "Check up on your extroverted friend! What form of communication do you use?", 2, "Call", "Text", "Surprise visit!");
    Location fifteenthTile = new Location(15, "You need to buy some toilet paper. Where do you want to buy it from?", 2, "Amazon", "Target", "Costco"); 

    /* Constructor */
    public Game(){
        System.out.println("Welcome to the Good Place: the game!");
        System.out.println("");
        System.out.println("Your every action in this lifetime decides whether you go into \n the good place or the bad place. Play the dice, go to the tiles, and answer questions to gain point. \n There is a total of 40 tiles until you reach Judge's chamber.");
        System.out.println("Good forking luck!");
        System.out.println("");
    }

    public void ask(){ //should we use void here??
        System.out.println(firstTile.getQuest(1));
        String[] answerOne = firstTile.getAns(1);
        List <String> answerOneList = new ArrayList<String>();
        answerOneList = Arrays.asList(answerOne);
        String[] ansStr = answerOneList.toString().split(",");
        System.out.println("Choices are: \n" + " a: " + ansStr[0] + "\n b:" + ansStr[1] + "\n c: " + ansStr[2]);
    }

    private Integer multipleChoice(String CorAns){
        if(CorAns == "a"){
            return 0;
        }
        if(CorAns == "b"){
            return 1;
        }
        if(CorAns == "c"){
            return 2;
        }
        else{
            return -1;
        }
        
    }
    public void play(String reply){
        String[] answerOne = firstTile.getAns(1);
        System.out.println("Your answer: " + reply);
        if (reply.equalsIgnoreCase("a") || reply.equalsIgnoreCase("b") || reply.equalsIgnoreCase("c")){
            if(firstTile.getCorrectAns(1) == multipleChoice(reply)){
                System.out.println(multipleChoice(reply));
                point += 6;
            }
            if (firstTile.getCorrectAns(1) != multipleChoice(reply)){
                point -= 6;
            }
        } else {
            System.out.println("invalid ans");
        }
    }

    public static void main(String[] args) {
        //Game loop
        Game GoodPlace = new Game();
        boolean stillPlaying = true;
        
        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            GoodPlace.ask();
            Scanner myObj = new Scanner(System.in);  
            String reply = myObj.nextLine(); 
            GoodPlace.play(reply); 
            System.out.println(point);
            myObj.close();

            if (0 == 0) {
                stillPlaying = false;
            }
        } while (stillPlaying);

    }

    

    /*public void buy(String questions, String a, String b, String c){
        System.out.println(questions);
        System.out.println("Choices are: " + a + b + c);
        Scanner myObj = new Scanner(System.in);  
        String reply = myObj.nextLine();  
        System.out.println("You chose to buy " + reply);
        if (reply.equalsIgnoreCase("a")){
            point += 6;
        }
        if (reply.equalsIgnoreCase("b")){
            point -= 6;
        }
        myObj.close();
    }
    */



    
}