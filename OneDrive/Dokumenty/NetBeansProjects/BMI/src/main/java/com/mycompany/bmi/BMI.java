package com.mycompany.bmi;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.event.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public final class BMI extends JFrame implements ActionListener{

    public BMI (){
        this.setTitle("BMI");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setBounds(300, 250, 350, 270);
        
        weightLabel.setBounds(110, 30, 120, 20);
        weightLabel.setFont(new Font("Monospaced", Font.PLAIN, 16));
        add(weightLabel);
        add(weight);
        weight.setBounds(100, 50, 120, 20);
        weight.setBackground(new Color(202, 229, 255));
        weight.addActionListener(this);
        
        heightLabel.setBounds(110, 80, 120, 20);
        heightLabel.setFont(new Font("Monospaced", Font.PLAIN, 16));
        add(heightLabel);
        add(height);
        height.setBounds(100, 100, 120, 20);
        height.setBackground(new Color(202, 229, 255));
        height.addActionListener(this);
        add(button);
        button.setBounds(100, 180, 120, 40);
        button.addActionListener(this);
        button.setFont(new Font("Monospaced", Font.BOLD, 16));
        button.setBackground(new Color(111, 138, 183));
        button.setForeground(Color.white);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        System.out.println("Hello World!");
        new BMI();
    }
    
    public void calculate(double weight, double height){
        double bmi;
        bmi = weight / (height * height);
        JOptionPane.showMessageDialog(this,
    "Your BMI is: " + bmi);
    }
    
    public void actionPerformed(ActionEvent e){
      Double weightDouble = Double.valueOf(weight.getText());
      Double heightDouble = Double.valueOf(height.getText());
      calculate(weightDouble,heightDouble);
    }
    
    JButton button = new JButton("Calculate");
    JLabel weightLabel = new JLabel("Weight (kg)");

    JLabel heightLabel = new JLabel("Height (m)");
    JTextField weight = new JTextField();
    JTextField height = new JTextField();
}
