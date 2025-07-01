import javax.swing.*;
import java.awt.*;

public class ToDoPanel extends JPanel {
private DefaultListModel<String> listModel;
private JList<String> taskList;
private JTextField taskInput;
private JButton addButton;
private JButton deleteButton;

public ToDoPanel(){
    setLayout(new BorderLayout()); // sets layout manager for the panel

    listModel=new DefaultListModel<>(); // to store tasks
    taskList = new JList<>(listModel);



    taskInput = new JTextField();
    addButton=new JButton("Add Task");
    deleteButton=new JButton("Delete Task");

    JPanel inputPanel=new JPanel(new BorderLayout()); // panel for i/p and o/p buttons
    inputPanel.add(taskInput, BorderLayout.CENTER); // places i/p field in the center

    JPanel buttonPanel1=new JPanel(new FlowLayout()); // panel for buttons
    buttonPanel1.add(addButton);
    buttonPanel1.add(deleteButton);

    inputPanel.add(buttonPanel1, BorderLayout.EAST); // buttons to the right of the i/p
    add(inputPanel, BorderLayout.NORTH); // i/p panel at the top
    add(new JScrollPane(taskList), BorderLayout.CENTER); // scrollable list in the center

    // action for adding a task
    addButton.addActionListener(e ->{
        String task= taskInput.getText().trim(); // gets and trims i/p text\

        if(!task.isEmpty()) {  // checks if i/p is not empty

            listModel.addElement(task); // add tasks to the list model

            taskInput.setText(""); // clears the i/p field
        }
    });

    deleteButton.addActionListener(e ->{
        int selectedIndex = taskList.getSelectedIndex(); // gets selected task index

        if(selectedIndex!= -1){ // checks if a task is selected

            listModel.remove(selectedIndex); // removes the selected task
        }
    });
}
}
