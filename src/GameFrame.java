//This class will set up the main Window(J Frame) for my game.

/*GameFrame extends JFrame, Part of Swing library used for creating window-based application
in java.*/ 
import javax.swing.JFrame;

//GameFrame is a specified form of JFrame, top level window with a title and border.
public class GameFrame extends JFrame{
    //constructor: Sets up the frame's Properties.
    public GameFrame() {
        //Adding instance of GamePanel to the frame. 
        this.add(new GamePanel());
        this.setTitle("Snake");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.pack();
        //makes the window visible
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }
    //Main Method: Entry point of the program.
    public static void main(String[] args){
        new GameFrame();
    }
}

