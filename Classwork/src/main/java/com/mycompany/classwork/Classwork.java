/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.classwork;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Briana
 */
public class Classwork extends JFrame implements ActionListener{
    
    JTextField text1;
    JLabel label1;
    JTextField text2;
    JLabel label2;
    
    Classwork(){
        label1 = new JLabel("First Number: ");
        add(label1);
        label2 = new JLabel("Second Number: ");
        add(label2);
        
        text1 = new JTextField(15);
        add(text1);
        text2 = new JTextField(15);
        add(text2);
        
        JButton bChange = new JButton("Add");
        bChange.addActionListener(this);
        add(bChange);
        setLayout(new FlowLayout());
    }
    
    @Override
    public void actionPerformed(ActionEvent evt) {
        String s1 = text1.getText();
        String s2 = text2.getText();
        
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int sum = n1 + n2;
        
        JLabel label3 = new JLabel();
        add(label3);
        label3.setText("The sum is: " + String.valueOf(sum));
        
    }

    public static void main(String[] args) {
        Classwork x = new Classwork();
        x.setSize(200, 300);
        x.setVisible(true);
    }


}
