
/**
 * Prints the 'Solitaire' title, prints welcome message, runs gameLoop, and prints closing message.
 */

public class Main {
    public static void main(String[] args) {

        // Game Title

        System.out.println(
                " ____         __  __         " + "\n" +
                "/ ___/ ____  / (_) /_____,_(_)_______" + "\n" +
                "\\___ \\/ __ \\/ / / __/ __  / / __/ __ \\" + "\n" +
                " __/ / /_/ / / / /_/ /_/ / / / /  ___/" + "\n" +
                "/___/\\____/_/_/\\__/\\__,_/_/_/  \\____/" +"\n"
        );

        // Initial Game Board (in rough code sketch, this will not be here! Covered in future method)
        // gameStructure.printBoard();

        for(int i = 1; i <= 7; i++) {
            System.out.print("   [" + i + "]   ");
        }
        System.out.println();

        for(int i = 1; i <= 7; i++) {
            System.out.print("  _____  ");
        }
        System.out.println();

        for(int i = 1; i <= 7; i++) {
            if (i == 1) {
                System.out.print(" |" + "A" + "    | "); // If the final card in the stack
            }
            else {
                System.out.print(" |_____| "); // If not the final card in the stack
            }
        }
        System.out.println();

        for(int i = 1; i <= 7; i++) {
            if (i == 1) {
                System.out.print(" |     | "); // If the final card in the stack &&  card
            }
            else if (i == 2) {
                System.out.print(" |" + "3" + "    | "); // If the final card in the stack
            }
            else {
                System.out.print(" |_____| "); // If not the final card in the stack
            }
        }
        System.out.println();

        // Welcome Message

        //GameLoop.gameLoop();

        // Closing Message (depends on how the game ended)
    }
}
