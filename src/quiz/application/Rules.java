package quiz.application;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener{

    String name;
    JButton start, back;
    
    Rules(String name) {
        this.name = name;
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        
        JLabel heading = new JLabel("Welcome " + name + " to Java Quiz Application.");
        heading.setBounds(50, 20, 700, 30);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 28));
        heading.setForeground(Color.RED);
        add(heading);
        
        JLabel rules = new JLabel();
        rules.setBounds(20, 90, 700, 350);
        rules.setFont(new Font("Tahoma", Font.PLAIN, 16));
        rules.setForeground(Color.MAGENTA);
        rules.setText(
            "<html>"+ 
              "1) All the Questions in the quiz are multiple Choice."  + "<br><br>" +
              "2) All the Questions are based on java."  + "<br><br>" +
              "3) each Question take 15 sec to solve."  + "<br><br>" +
              "4) Do not go on another page during quiz, otherwise Quize is auto submit."  + "<br><br>" +
              "5)The test is on “Core Java” which is in Semester I."  + "<br><br>" +
              "6) The total time for the test is 30 minutes." + "<br><br>" +
              "7) Use of calculators is permitted."  + "<br><br>" +
              "8)Please read all the questions carefully before answering."  + "<br><br>" +
              "9) Select submit after completing the test."  + "<br><br>" +
            "<html>"
        );
        add(rules);
        
        back = new JButton("Back");
        back.setBounds(250, 500, 100, 30);
        back.setBackground(new Color(30, 144, 254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start = new JButton("Start");
        start.setBounds(400, 500, 100, 30);
        start.setBackground(new Color(30, 144, 254));
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800, 650);
        setLocation(350, 100);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == start) {
            setVisible(false);
            new Quiz(name);
        } else {
            setVisible(false);
            new Login();
        }
    }
    
    public static void main(String[] args) {
        new Rules("User");
    }
}
