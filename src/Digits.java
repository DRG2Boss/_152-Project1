// Ryan McGonagle, Isaiah Marshall
// Comp 152 Summer Session II
// Project 1: Digits
// Due 8/2/23 11:59pm

import javax.swing.*;

public class Digits {
    public static void main(String[] args) {
        // construct JFrame variable
        JFrame myWindow = new JFrame();
        // Graphics initialization after constructing and before setVisible (so we don't see it resized in realtime).
        myWindow.setSize(500, 500);
        myWindow.setTitle("Digits: A NYT's Ripoff");
        // Make the close button on the window work
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel0 = new JPanel();
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();
        JPanel panel3 = new JPanel();
        JPanel bigPanel = new JPanel();

        JLabel direction = new JLabel();
        direction.setText("Use the 6 provided numbers and 4 operators to create the following number:");

        JLabel randomTotal = new JLabel();
        randomTotal.setText("Target: 136");

        JButton numberButton1 = new JButton();
        numberButton1.setText("1");
        JButton numberButton2 = new JButton();
        numberButton2.setText("13");
        JButton numberButton3 = new JButton();
        numberButton3.setText("23");
        JButton numberButton4 = new JButton();
        numberButton4.setText("7");
        JButton numberButton5 = new JButton();
        numberButton5.setText("4");
        JButton numberButton6 = new JButton();
        numberButton6.setText("17");

        JButton operatorButton1 = new JButton();
        operatorButton1.setText("+");
        JButton operatorButton2 = new JButton();
        operatorButton2.setText("-");
        JButton operatorButton3 = new JButton();
        operatorButton3.setText("*");
        JButton operatorButton4 = new JButton();
        operatorButton4.setText("/");

        panel0.add(direction);
        panel1.add(randomTotal);
        panel2.add(numberButton1);
        panel2.add(numberButton2);
        panel2.add(numberButton3);
        panel2.add(numberButton4);
        panel2.add(numberButton5);
        panel2.add(numberButton6);
        panel3.add(operatorButton1);
        panel3.add(operatorButton2);
        panel3.add(operatorButton3);
        panel3.add(operatorButton4);

        // Add each panel to big panel
        bigPanel.add(panel0);
        bigPanel.add(panel1);
        bigPanel.add(panel2);
        bigPanel.add(panel3);

        myWindow.add(bigPanel);
        myWindow.setVisible(true);
    }
}
