import javax.swing.*;

public class ToDoFrame extends JFrame {
    public ToDoFrame(){  // constructor for the main window

        setTitle("To Do List App"); // window title

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // close the app when window is closed

        setSize(400,300);
        setLocationRelativeTo(null); // centers the window on the screen

        add(new ToDoPanel());  // add main content panel to the frame

        setVisible(true); // make the window visible
    }

}
