import javax.swing.JOptionPane;

public class guessGame {
    public static void guessGame() throws Exception {
        int guessed = 0;
        int randN = (int)(Math.random()*100) + 1;
        while (guessed != randN) {
            guessed = Integer.parseInt(JOptionPane.showInputDialog("Guess a number"));
            if(guessed>randN){
                JOptionPane.showMessageDialog(null, "The number is smaller");
            }

            if(guessed<randN){
                JOptionPane.showMessageDialog(null, "The number is bigger");
            }
        }
        JOptionPane.showMessageDialog(null, "Correct");
    }
}
