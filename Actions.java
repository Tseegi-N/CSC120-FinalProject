import java.util.Scanner;
import java.util.stream.IntStream;
import java.util.ArrayList;
import java.util.Arrays;
/*public interface Actions{
    void buy(String questions, String a, String b, String c);
}
*/
import java.util.List;
import java.util.PrimitiveIterator;
import java.util.Random;

class Game {
    protected static int point = 0;
    static Integer CurrentTile;
    static Integer DiceNumber;
    

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
    Location sixteenthTile = new Location(16, "Buy non dairy milk. Which type do you choose?", 2, "almond milk", "soy milk", "coconut milk");
    Location seventeenthTile = new Location(17, "How do you ask someone out?", 1, "through phone", "surprise event", "not directly ask them out");
    Location eighteenthTile = new Location(18, "If your friend ask you to be their bestmate/bridesmaid for their wedding: ", 1, "no", "yes", "says yes but regrets immediately afterwards");
    Location ninteenthTile = new Location(19, "A volunteer handing out environmental awareness flyers", 0, "sign up to help", "ignore", "call them a \"whale hump\"");
    Location twentiethTile = new Location(20, "Buy a drink!", 2, "Margarita", "Molotov cocktail", "wine");
    Location twentyFirstTile = new Location(21, "How do you impress people?", 1, "Drop celebrity names", "tell jokes", "show them your moves");
    Location twentySecondTile = new Location(22, "Which NFL team do you support?", 0, "New York Jets", "Miami Dolphins", "Jacksonville Jaguars");
    Location twentyThirdTile = new Location(23, "How do you respond to 'I love you'?", 0, "YEET", "I consider you one of my favorite friends...", "who doesn't?!");
    Location twentyFourthTile = new Location(24, "You want to do something. How do you proceed?", 2, "Immediately do it without thinking", "think it over for a year and give up", "ask your friend for help");
    Location twentyFifthTile = new Location(25, "What is your favorite mythical animal?", 2, "Bearded dragon", "Penguin", "Unicorn");
    Location twentySixthTile = new Location(26, "How do you get over a break-up?", 2, "Make a rebound guy(Derek)", "Pretend all is okay", "Drink margaritas");
    Location twentySeventhTile = new Location(27, "How do you get out of the escape room?", 0, "Analyze all rules and play by the rule", "Get distracted by a butterfly and forget about the game", "Break enough stuff until they kick you out");
    Location twentyEightTile = new Location(28, "What is one thing that brings you joy?", 0, "Wedding day", "People puking on roller coasters", "Vacation");
    Location twentyNinthTile = new Location(29, "What is your favorite insult?", 2, "Shi(r)t for brains", "Ya basic", "You're a medium person");
    Location thirtiethTile = new Location(30, "What do philosophers mean by 'knowing yourself'?", 1, "Masturbation", "Full understanding of who you are", "Inner peace");
    Location thirtyFirstTile = new Location(31, "What do you do if your uber driver starts talking to you?", 0, "Talk with them", "Pay them to be quiet", "Argue that the ride should be free");
    Location thirtySecondTile = new Location(32, "What do you do in your ethics class?", 1, "Sleep", "Take notes", "Question teacher on everything");
    Location thirtyThirdTile = new Location(33, "What do you call your 'space'?", 1, "Bud-hole", "Buddy room", "Game room");
    Location thirtyFourthTile = new Location(34, "What do you do when you have a problem?", 2, "Avoid at all cost", "Drink your problems away", "Approach gently");
    Location thirtyFifthTile = new Location(35, "Would you feed the ducks?", 2, "No why would I??", "I could", "I can't attend work today because I have to do that");
    Location thirtySixthTile = new Location(36, "Would you kick a baby?", 0, "No why would I??", "I could", "I can't attend work today because I have to do that");
    Location thirtySeventhTile = new Location(37, "Would you buy 28 light bublbs from Home Depot?", 1, "No why would I??", "I could", "I can't attend work today because I have to do that");
    Location thirtyEightTile = new Location(38, "What do you do if kids start yelling for McDonalds?", 0, "We have food at home", "Yell together", "Drives to McDonald drive away once your get a black coffee");
    Location thirtyNinthTile = new Location(39, "What is the best human creation?", 0, "Froyo", "Chowder", "Garden gnomes");
    Location fortiethTile = new Location(40, "What is the best tv show?", 1, "Game of Thrones", "The Good Place", "Friends");

    /* Constructor */
    public Game(){
        System.out.println("Welcome to the Good Place: the game!");
        System.out.println("");
        System.out.println("Your every action in this lifetime decides whether you go into \n the good place or the bad place. Play the dice, go to the tiles, and answer questions to gain point. \n There is a total of 40 tiles until you reach Judge's chamber.");
        System.out.println("Good forking luck!");
        System.out.println("");
    }

    public void ask(){ 
        System.out.println(firstTile.getQuest(1));
        String[] answerOne = firstTile.getAns(1);
        List <String> answerOneList = new ArrayList<String>();
        answerOneList = Arrays.asList(answerOne);
        String[] ansStr = answerOneList.toString().replace("[", "").replace("]", "").split(",");
        System.out.println("Choices are: \n" + " a: " + ansStr[0] + "\n b:" + ansStr[1] + "\n c:" + ansStr[2]);
    }

    private Integer multipleChoice(String CorAns){
        if(CorAns.contains("a")){
            return 0;
        }
        else if(CorAns.contains("b")){
            return 1;
        }
        else if(CorAns.contains("c")){
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
                point += 6;
            }
            if (firstTile.getCorrectAns(1) != multipleChoice(reply)){
                point -= 6;
            } 
        }else {
            System.out.println("invalid ans");
        }
    }  

    private static Integer dice(){
        //Random random = new Random();
        int random_int = (int)Math.floor(Math.random()*(6-1+1)+1);
        return random_int;
    }

    public static void main(String[] args) {
        //Game loop
        Game GoodPlace = new Game();
        boolean stillPlaying = true;
        
        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            CurrentTile = 0;
            System.out.println("Roll the dice");
            Scanner myObj = new Scanner(System.in); 
            while(CurrentTile < 41){
                
                DiceNumber = dice();
                CurrentTile += DiceNumber;
                //Location(CurrentTile);
                GoodPlace.ask(); 
                System.out.print("Please type your answer (a, b, c): ");
                String reply = myObj.nextLine(); 
                GoodPlace.play(reply); 
                System.out.println("Roll the dice again");
                
            }
            System.out.println("You reached the Judge's chamber. It's judgement time!!!");
            if(point > 10){
                GoodPlace Final = new GoodPlace();
                Final.display();
            }
            if(point < -10){
                BadPlace Final = new BadPlace();
                Final.display();
            }
            else{
                System.out.println("You're in Medium Place. Welcome to eternal boring life \n YA BASIC");
            }
            //System.out.println(point);
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