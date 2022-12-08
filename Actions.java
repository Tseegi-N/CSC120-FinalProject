import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Game {
    /* Declaring parameters */
    protected static int point = 0;
    static Integer CurrentTile;
    static Integer DiceNumber;
    
    /* Assign information to each tile */
    Location[] map = new Location[41];{
    map[1] = new Location("Do you brush your teeth in the morning?", 0, 2, "yes", "no", "rinse with moutwash");
    map[2] = new Location("How do you get to work?", 0, 1, "bike", "bus", "drive");
    map[3] = new Location("How do you interact with your coworkers?", 0, 2, "Say hi", "ignore", "nod knowingly");
    map[4] = new Location("Buy food from grocery store. Which brand do you choose?", 0, 0, "Organic Farmhouse", "Fresh Greens", "Happy Animals");
    map[5] = new Location("Buy drink from grocery store. Which brand do you choose?", 2, 0, "Bulb", "Flash", "Nurture");
    map[6] = new Location("Buy snack from grocery store. Which brand do you choose?", 1, 2,  "Kringles", "Zheetos", "Jays");
    map[7] = new Location("Buy appliances. Which brand do you choose?", 0, 2, "Bouncy", "Cleanext", "Sweep");
    map[8] = new Location("Buy a cookie from...", 0, 2, "Local bakery", "Costco", "CVS");
    map[9] = new Location("Buy a cookie. Which flavor do you choose?", 2, 1, "Chocolate", "Almond", "Oatmeal");
    map[10] = new Location("Buy a cup of coffee. What flavor do you choose?", 0, 1, "Decaf", "Americano", "Latte");
    map[11] = new Location("Buy a cup of coffee. Where do you buy it from?", 0, 1, "Local coffee shop", "Starbucks", "Dunkin");
    map[12] = new Location("Surprise your partner with flowers! Choose where you get your flowers from.", 0, 1, "Handpick", "grocery store", "local flower shop");
    map[13] = new Location("Check up on your introverted friend! What form of communication do you use?", 1, 2, "Call", "Text", "Surprise visit!");
    map[14] = new Location("Check up on your extroverted friend! What form of communication do you use?", 2, 1, "Call", "Text", "Surprise visit!");
    map[15] = new Location("You need to buy some toilet paper. Where do you want to buy it from?", 2, 0, "Amazon", "Target", "Costco"); 
    map[16] = new Location("Buy non dairy milk. Which type do you choose?", 2, 0, "almond milk", "soy milk", "coconut milk");
    map[17] = new Location("How do you ask someone out?", 1, 2, "through phone", "surprise event", "not directly ask them out");
    map[18] = new Location("If your friend ask you to be their bestmate/bridesmaid for their wedding: ", 1, 2, "no", "yes", "says yes but regrets immediately afterwards");
    map[19] = new Location("A volunteer handing out environmental awareness flyers", 0, 2, "sign up to help", "ignore", "call them a \"whale hump\"");
    map[20] = new Location("Buy a drink!", 2, 1, "Margarita", "Molotov cocktail", "wine");
    map[21] = new Location("How do you impress people?", 1, 0, "Drop celebrity names", "tell jokes", "show them your moves");
    map[22] = new Location("Which NFL team do you support?", 0, 2, "New York Jets", "Miami Dolphins", "Jacksonville Jaguars");
    map[23] = new Location("How do you respond to 'I love you'?", 0, 2, "YEET", "I consider you one of my favorite friends...", "who doesn't?!");
    map[24]= new Location("You want to do something. How do you proceed?", 2, 0, "Immediately do it without thinking", "think it over for a year and give up", "ask your friend for help");
    map[25] = new Location("What is your favorite mythical animal?", 2, 0, "Bearded dragon", "Penguin", "Unicorn");
    map[26] = new Location("How do you get over a break-up?", 2, 0, "Make a rebound guy(Derek)", "Pretend all is okay", "Drink margaritas");
    map[27]  = new Location("How do you get out of the escape room?", 0, 2, "Analyze all rules and play by the rule", "Get distracted by a butterfly and forget about the game", "Break enough stuff until they kick you out");
    map[28] = new Location("What is one thing that brings you joy?", 0, 1, "Wedding day", "People puking on roller coasters", "Vacation");
    map[29] = new Location("What is your favorite insult?", 2, 0, "Shi(r)t for brains", "Ya basic", "You're a medium person");
    map[30]  = new Location("What do philosophers mean by 'knowing yourself'?", 1, 0, "Masturbation", "Full understanding of who you are", "Inner peace");
    map[31] = new Location("What do you do if your uber driver starts talking to you?", 0, 2,  "Talk with them", "Pay them to be quiet", "Argue that the ride should be free");
    map[32] = new Location("What do you do in your ethics class?", 1, 2, "Sleep", "Take notes", "Question teacher on everything");
    map[33] = new Location("What do you call your 'space'?", 1, 0, "Bud-hole", "Buddy room", "Game room");
    map[34] = new Location("What do you do when you have a problem?", 2, 1, "Avoid at all cost", "Drink your problems away", "Approach gently");
    map[35] = new Location("Would you feed the ducks?", 2, 0, "No why would I??", "I could", "I'd skip work to do that!");
    map[36] = new Location("Would you kick a baby?", 0, 2, "No why would I??", "I could", "I'd skip work to do that!");
    map[37] = new Location("Would you buy 28 light bublbs from Home Depot?", 1, 2, "No why would I??", "I could", "I'd skip work to do that!");
    map[38] = new Location("What do you do if kids start yelling for McDonalds?", 0, 2, "We have food at home", "Yell together", "Drives to McDonald drive away once your get a black coffee");
    map[39] = new Location("What is the best human creation?", 0, 1, "Froyo", "Chowder", "Garden gnomes");
    map[40] = new Location("What is the best tv show?", 1, 0, "Game of Thrones", "The Good Place", "Friends");
    }
   
    /* Constructor */
    public Game(){
        System.out.println("Welcome to the Good Place: the game!");
        System.out.println("");
        System.out.println("Your every action in this lifetime decides whether you go into \n the good place or the bad place. Play the dice, go to the tiles, and answer questions to gain point. \n There is a total of 40 tiles until you reach Judge's chamber.");
        System.out.println("Good forking luck!");
        System.out.println("");
    }

    /**
     * Prints out questons and multiple choices
     * @param tile - number of tile 
     */
    public void ask(Integer tile){ 
        //Print question of the tile
        System.out.println(map[tile].getQuest());

        //Assign multiple choices to string list and print
        String[] answerOne = map[tile].getAns();
        List <String> answerOneList = new ArrayList<String>();
        answerOneList = Arrays.asList(answerOne);
        String[] ansStr = answerOneList.toString().replace("[", "").replace("]", "").split(",");
        System.out.println("Choices are: \n" + " a: " + ansStr[0] + "\n b:" + ansStr[1] + "\n c:" + ansStr[2]);
    }

    /**
     * Check for user input and return indexes
     * @param CorAns - string of user input
     * @return Integer of indexes for the multiple choice
     */
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

    /**
     * Assign points if question is answered correct/incorrect
     * @param reply - string of user input
     * @param Tile - index of the tile number
     */
    public boolean play(String reply, Integer Tile){
        //If user input matches possible multiple choices
        if (reply.equalsIgnoreCase("a") || reply.equalsIgnoreCase("b") || reply.equalsIgnoreCase("c")){
            System.out.println("Your answer: " + reply);
            //if correct +6, incorrect -6, medium answer no change   
            if(map[Tile].getCorrectAns() == multipleChoice(reply)){
                point += 6;            
            }
            if (map[Tile].getWrongAns() == multipleChoice(reply)){
                point -= 6;
            } 
            return true;
        }
        else {
            return false;
        }
    }  


    /**
     * Roll the dice and get random number from 1 to 6
     * @return random integer (1-6)
     */
    private static Integer dice(){
        int random_int = (int)Math.floor(Math.random()*(6-1+1)+1);
        return random_int;
    }



    /**
     * To start game
     */
    public static void main(String[] args) {
        //Game loop
        Game GoodPlace = new Game();
        boolean stillPlaying = true;
        
        do {
            //On tile 0 at the start of the game
            CurrentTile = 0;
            System.out.println("Rolling the dice...");

            //Input scanner
            Scanner myObj = new Scanner(System.in); 

            //Roll the dice and change tile
            DiceNumber = dice();
            CurrentTile += DiceNumber;

            //Only 40 tiles to reach the Judge's chamber
            while(CurrentTile < 41){
                System.out.println("You're currently on tile " + CurrentTile);
                GoodPlace.ask(CurrentTile);
                System.out.print("Please type your answer (a, b, c): ");

                //Waiting for input
                String reply = myObj.nextLine(); 

                //Ask question, play game
                while(GoodPlace.play(reply, CurrentTile) == false){
                    System.out.print("Invalid answer, please try again: ");
                    String replyAgain = myObj.nextLine(); 

                    if(GoodPlace.play(replyAgain, CurrentTile) == false){
                    GoodPlace.play(replyAgain, CurrentTile);
                }

                    if(GoodPlace.play(replyAgain, CurrentTile) == true){
                        break;
                    }
                    //break;
                } 

                //Roll the dice again to move on and reach the Judge's chamber
                System.out.println("Roll the dice again");
                DiceNumber = dice();
                CurrentTile += DiceNumber;

                //Seperator
                System.out.println();
                System.out.println("--------------------------------------------------");
                System.out.println();
            }

            //Game is over; count the total score to see the result
            System.out.println("You reached the Judge's chamber. It's judgement time!!!");
            System.out.println("Your point total is: " + point);
            
            if(point > 10){
                GoodPlace Final = new GoodPlace();
                Final.display();
            }
            if(point < -10){
                BadPlace Final = new BadPlace();
                Final.display();
                System.out.println("YOU'RE IN THE BAD PLACE NOW. BURNNNN IN HELLLLLL");
            }
            if(point < 10 & point > -10){
                System.out.println("You're in Medium Place. Welcome to eternal boring life \n YA BASIC");
            }
            //Close scanner
            myObj.close();

            //End the game loop (unnecessary?)
            if (0 == 0) {
                stillPlaying = false;
            }
        } while (stillPlaying);

    }
}