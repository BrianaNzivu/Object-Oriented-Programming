/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lessongui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Briana
 */

public class LessonGUI extends JFrame implements ActionListener{
    
    public LessonGUI(){
        JLabel label = new JLabel("Hello Swing!");
        super.add(label);
        super.setLayout(new FlowLayout());
        
        JButton bChange = new JButton("Blue");
        bChange.addActionListener((ActionListener) this);
        super.add(bChange);
        
        JButton bChange1 = new JButton("Red");
        bChange1.addActionListener((ActionListener) this);
        super.add(bChange1);
    }
    
    @Override
    public void actionPerformed(ActionEvent evt){
        if(evt.getActionCommand().equals("Blue")){
           getContentPane().setBackground(Color.blue); 
        } else {
            getContentPane().setBackground(Color.red); 
        }
        repaint();
    }
    
    public static void main(String[] args) {
        LessonGUI x = new LessonGUI();
        x.setTitle ("Test Frame 1");
        x.setSize(200,100);
        x.setVisible(true);
        

       
    }
}
