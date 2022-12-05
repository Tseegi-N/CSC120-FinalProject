public class BadPlace {
    //Assigning color code
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_RESET = "\u001B[0m";

    /**
     * Prints out ASCII art for Bad Place
     */
    public static void display(){
        System.out.println("             ______" );
        System.out.println("            / O  O \\ ");
        System.out.println("        \\ \\ \\___O__/ / /");
        System.out.println("         \\ \\__/  /__/ /");
        System.out.println(ANSI_RED +"  ^ / \\   ^       /\\  ^  /\\"+ ANSI_RESET);
        System.out.println(ANSI_RED +"   /    \\ / \\/\\ /    \\  /  \\"+ ANSI_RESET);
        System.out.println(ANSI_RED +"  /     /    \\  \\     \\/   /"+ ANSI_RESET);
    }

    /* Test-run */
    public static void main(String[] args) {
        BadPlace.display(); 
    }
}