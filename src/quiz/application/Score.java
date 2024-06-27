package quiz.application;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.DARK_GRAY);
        setLayout(null);
        
        JLabel heading = new JLabel("Thank you " + name + " , Have A Good Day....!");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        heading.setForeground(Color.MAGENTA);
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score);
        lblscore.setBounds(300, 200, 200, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        
        lblscore.setForeground(Color.MAGENTA);
        add(lblscore);
        
        JButton submit = new JButton("RESTART");
        submit.setBounds(330, 250, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
