import java.util.Scanner;
public interface Actions{
    void buy(String questions, String a, String b, String c);
}

class Game implements Actions{
    protected int point = 0;
    /*public String a;
    public String b;
    public String c;
    public String questions;*/

    Location firstTile = new Location(1, "Do you brush your teeth in the morning?", 1, "yes", "no", "rinse with moutwash");
    /* Constructor */
    public Game(){
        System.out.println("Welcome to the Good Place: the game!");
        System.out.println("");
        System.out.println("Your every action in this lifetime decides whether you go into \n the good place or the bad place. Play the dice, go to the tiles, and answer questions to gain point. \n There is a total of 40 tiles until you reach Judge's chamber.");
        System.out.println("Good forking luck!");
        System.out.println("");

        boolean stillPlaying = true;
    
        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            System.out.println("You are still playing. Follow the instructions if you want to win/lose...");
            
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



    public static void main(String[] args) {
        //Game loop
        Game GoodPlace = new Game();;
        GoodPlace.buy("buy food?", "bread", "ramen", "rice");
    }
}