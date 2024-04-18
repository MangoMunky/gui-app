import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {
        String name = JOptionPane.showInputDialog
        ("Enter your name");

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        JOptionPane.showMessageDialog(null, "Youre name is " + name);
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        trueFalse.truefalse();
        guessGame.guessGame();
    }
}
