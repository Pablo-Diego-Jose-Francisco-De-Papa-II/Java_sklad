package Zadanie6.Part2;


import javax.swing.*;

public class GUI {
    public static void main(String[] args) {
        /*todo

         */
        JFrame frame = new JFrame();
        JFileChooser chooser = new JFileChooser();
        JTextField textField = new JTextField();


        frame.setTitle("FileManager :3");
        frame.setSize(500, 500);
        frame.setVisible(true);

        JButton openButton = new JButton("Open");
        frame.add(openButton);
        openButton.setBounds(20,20,100,50);
    }
}
