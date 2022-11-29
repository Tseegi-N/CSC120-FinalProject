import java.lang.reflect.Method;
import java.util.Hashtable;

public class Random extends Game{
    private Hashtable<String, String> tile;
    private String answers;
    public String[] all_answer;
    public String a;
    public String b;
    public String c;

    /* Constructor */
    public Random(){
        this.tile = new Hashtable<>();
        tile.put("Do you brush teeth in the morning?", "yes, no, only with mouthwash");
        answers = tile.get("Do you brush teeth in the morning?");
        String[] all_answer = answers.split(",");
        this.a = all_answer[0];
        this.b = all_answer[1];
        this.c = all_answer[2];
    }

    public <T> void questions(T[] arr){
        Class classobj = Game.class;
        Method[] methods = classobj.getMethods();
  
        // get the name of every method present in the list
        for (Method method : methods) {
            String MethodName = method.getName();
            tile.put(MethodName, answers);
            System.out.println("Name of the method: " + MethodName);
        }
    }


    /*@Override
    public void buy(String questions, String a, String b, String c){
        super.buy("Do you brush teeth in the morning?", a, b, c);
    }

    public void buy(){
        super.buy("Do you brush teeth in the morning?", a, b, c);
    }*/

    /*public static void main(String[] args) {
        boolean stillPlaying = true;
    
        // The do...while structure means we execute the body of the loop once before checking the stopping condition
        do {
            System.out.println("You are still playing. Follow the instructions if you want to win/lose...");

            if (userResponse.equals("WIN") || userResponse.equals("LOSE")) {
                stillPlaying = false;
            }
        } while (stillPlaying);
    }*/
    public static void main(String[] args) {
        Random try_one = new Random();
        //try_one.buy();
    }
}
