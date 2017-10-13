package MainPackage;

import javax.swing.JOptionPane;

/**
 *
 * @author nieznosnybahor
 */
public class BicycleNoteR {

    /**
     * @param args the command line arguments
     */
    static Database database;
    
    public static void main(String[] args) {
        showIntro();
        if (JOptionPane.showConfirmDialog(null, "Would you like to load base from file?") == 0) //1-false, 0-true
        {
            database = new Database();
            // upload file
        } else {
            database = new Database();
        }
        Frame frame = new Frame();
        frame.setVisible(true);
    }

    private static void showIntro() {
        System.out.println("Welcome to my BicycleNoteR program!!!");
        System.out.println("If You have any questions You can contact me on email given in Credits section.");
        System.out.println("I hope you will have fun using this app as I did when I was creating it <happy>");
    }
}
