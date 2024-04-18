import javax.swing.JOptionPane;


public class App {
    public static void main(String[] args) throws Exception {

        //Makes a pop up to get age and name of user
        String name = JOptionPane.showInputDialog
        ("Enter your name");
        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));

        //Makes a pop up that says name and age of user
        JOptionPane.showMessageDialog(null, "Youre name is " + name);
        JOptionPane.showMessageDialog(null, "You are " + age + " years old");

        //Calls the the games I made from a different file
        trueFalse.truefalse();
        guessGame.guessGame();
    }
}
