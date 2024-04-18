import javax.swing.JOptionPane;

public class trueFalse {
    public static void truefalse() throws Exception {
        //loops until you select the correct choice
        while (true) {
            int answer = JOptionPane.showConfirmDialog(null, "Is rock climbing fun?", null, JOptionPane.YES_NO_OPTION);

            if (answer == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "CORRECT!");
                break;
                //Exits the loop
            }
            if (answer == JOptionPane.NO_OPTION) {
                JOptionPane.showMessageDialog(null, "TRY AGAIN!!!!!");
            }
        }
    }
}
