package Zadanie6.Part2;


import javax.swing.*;

public class MyTest {
    public static void main(String[] args) {
        // Creating instance of JFrame
        JFrame frame = new JFrame();

        frame.setTitle("just a test :3");

        // Creating instance of JButton
        JButton button = new JButton("proste len button");

        // x axis, y axis, width, height
        button.setBounds(150, 200, 220, 50);

        // adding button in JFrame
        frame.add(button);

        // 400 width and 500 height
        frame.setSize(500, 600);

        // using no layout managers
        frame.setLayout(null);

        // making the frame visible
        frame.setVisible(true);
    }
}
