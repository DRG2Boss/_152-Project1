// Isaiah Marshall
// Comp 152 Summer Session II
// Project 1: Digits
// Due 8/2/23 11:59pm

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Digits {

    // Create needed global variables.
    public static int step = 0;
    public static JButton firstNumberButton = new JButton();
    public static int firstNumber = 0;
    public static char operation;
    public static int secondNumber = 0;
    public static int computation = 0;
    public static int target = 77;

    public static void main(String[] args) {
        // Construct our window using JFrame variable.
        JFrame myWindow = new JFrame();
        // Give it an appropriate size, title, and ensure the operation ends upon closing the window.
        myWindow.setSize(500, 500);
        myWindow.setTitle("Digits: A NYT Ripoff!");
        myWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Declare all other starting local variables.
        JPanel innerPanelNum = new JPanel();
        JPanel innerPanelOp = new JPanel();
        JPanel outerPanel = new JPanel();
        int[] values = new int[] {1, 2, 3, 4, 5, 25};
        JTextArea operationLog = new JTextArea(6, 30);

        // Create the main text displayed to the user.
        // Add this text to the outer panel.
        JLabel instructText = new JLabel();
        instructText.setText("Target: "+ target);
        outerPanel.add(instructText);

        // Use a for loop to create the 6 number buttons.
        // And add all of them to a panel.
        for(int i = 0; i < 6; i++) {
            JButton numberButton = new JButton();
            numberButton.setText(""+values[i]);
            innerPanelNum.add(numberButton);

            // Use addActionListener function to track and do things upon clicking any of the numberButtons.
            numberButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println(numberButton.getText());

                    if(step == 0) {
                        firstNumber = Integer.parseInt(numberButton.getText());
                        firstNumberButton = numberButton;
                        step = 1;
                    }
                    if(step == 2) {
                        secondNumber = Integer.parseInt(numberButton.getText());
                        firstNumberButton.setVisible(false);
                        step = 0;

                        if(operation == '+') {
                            computation = firstNumber + secondNumber;
                            System.out.println(computation);
                            numberButton.setText(""+computation);
                        }
                        if(operation == '-') {
                            computation = firstNumber - secondNumber;
                            System.out.println(computation);
                            numberButton.setText(""+computation);
                        }
                        if(operation == 'x') {
                            computation = firstNumber * secondNumber;
                            System.out.println(computation);
                            numberButton.setText(""+computation);
                        }
                        if(operation == '/') {
                            computation = firstNumber / secondNumber;
                            System.out.println(computation);
                            numberButton.setText(""+computation);
                        }
                        
                        operationLog.append(""+firstNumber+operation+secondNumber+" = "+computation+"\n");
                        
                        if(computation == target) {
                            instructText.setText("Congratulations! You Win!");
                            step = 99;
                        }
                    }
                }
            });
        }

        // Create the addition operator button.
        JButton addButton = new JButton();
        addButton.setText("+");
        // Use addActionListener function to track and do things upon clicking this operator button.
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(addButton.getText());
                if(step == 1) {
                    operation = '+';
                    step = 2;
                }
            }
        });

        // Create the subtraction operator button.
        JButton subtractButton = new JButton();
        subtractButton.setText("-");
        // Use addActionListener function to track and do things upon clicking this operator button.
        subtractButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(subtractButton.getText());
                if(step == 1) {
                    operation = '-';
                    step = 2;
                }
            }
        });

        // Create the multiplication operator button.
        JButton multiplyButton = new JButton();
        multiplyButton.setText("*");
        // Use addActionListener function to track and do things upon clicking this operator button.
        multiplyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(multiplyButton.getText());
                if(step == 1) {
                    operation = 'x';
                    step = 2;
                }
            }
        });

        // Create the division operator button.
        JButton divideButton = new JButton();
        divideButton.setText("/");
        // Use addActionListener function to track and do things upon clicking this operator button.
        divideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println(divideButton.getText());
                if(step == 1) {
                    operation = '/';
                    step = 2;
                }
            }
        });

        // Add each operator button to a panel.
        innerPanelOp.add(addButton);
        innerPanelOp.add(subtractButton);
        innerPanelOp.add(multiplyButton);
        innerPanelOp.add(divideButton);

        // Incorporate the button panels and the operationLog into the outer panel.
        outerPanel.add(innerPanelNum);
        outerPanel.add(innerPanelOp);
        outerPanel.add(operationLog);

        // Add the outer panel containing everything to the window.
        // Now that all other code has been run, make the window visible.
        myWindow.add(outerPanel);
        myWindow.setVisible(true);
    }
}
