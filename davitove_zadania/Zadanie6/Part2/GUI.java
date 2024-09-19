package Zadanie6.Part2;


import javax.swing.*;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        JFrame filePickerFrame = new JFrame();
        filePickerFrame.setTitle("FilePicker :3");
        filePickerFrame.setSize(400, 250);
        filePickerFrame.getContentPane().setBackground(Color.LIGHT_GRAY);

        Label text = new Label("Write file name:");
        text.setBounds(25, 25, 275, 50);
        text.setFont(new Font("Arial", Font.PLAIN, 20));
        filePickerFrame.add(text);


        JTextField textField = new JTextField();
        textField.setBounds(25, 75, 350, 25);
        filePickerFrame.add(textField);


        JButton openButton = new JButton("OPEN");
        openButton.setBounds(25, 125, 100, 75);
        filePickerFrame.add(openButton);

        JButton createButton = new JButton("CREATE");
        createButton.setBounds(150, 125, 100, 75);
        filePickerFrame.add(createButton);

        JButton deleteButton = new JButton("DELETE");
        deleteButton.setBounds(275, 125, 100, 75);
        filePickerFrame.add(deleteButton);


        filePickerFrame.setLayout(null);
        //filePickerFrame.setVisible(true);





        JFrame managerFrame = new JFrame();
        managerFrame.setTitle("asi sa zajebem :3");
        managerFrame.setSize(675, 700);
        managerFrame.getContentPane().setBackground(Color.LIGHT_GRAY);


        JButton backButton = new JButton("BACK");
        backButton.setBounds(25, 25, 100, 75);
        managerFrame.add(backButton);

        JButton writeButton = new JButton("WRITE");
        writeButton.setBounds(150, 25, 100, 75);
        managerFrame.add(writeButton);

        JButton writeAllButton = new JButton("WRITE ALL");
        writeAllButton.setBounds(275, 25, 100, 75);
        managerFrame.add(writeAllButton);

        JButton readButton = new JButton("READ");
        readButton.setBounds(400, 25, 100, 75);
        managerFrame.add(readButton);

        JButton readAllButton = new JButton("READ ALL");
        readAllButton.setBounds(525, 25, 100, 75);
        managerFrame.add(readAllButton);


        Label console = new Label("proste random hovna tu budu co neskor spravim");
        console.setBounds(25, 575, 475, 50);
        console.setFont(new Font("Arial", Font.PLAIN, 20));
        managerFrame.add(console);


        JButton okButton = new JButton("OK");
        okButton.setBounds(525, 565, 100, 75);
        managerFrame.add(okButton);


        managerFrame.setLayout(null);
        managerFrame.setVisible(true);
    }
}
