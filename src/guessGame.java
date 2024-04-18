import javax.swing.JOptionPane;

public class guessGame {
    public static void guessGame() throws Exception {
        // Initializing variable for user guesses
        int guessed = 0;
        //Generates random number from 1-100
        int randN = (int)(Math.random()*100) + 1;

        //Loops until input = random number
        while (guessed != randN) {
            //gets input
            guessed = Integer.parseInt(JOptionPane.showInputDialog("Guess a number"));
            //checks if input is bigger than random number
            if(guessed>randN){
                JOptionPane.showMessageDialog(null, "The number is smaller");
            }
            //checks if input is small than random number
            if(guessed<randN){
                JOptionPane.showMessageDialog(null, "The number is bigger");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Correct");
    }
}
