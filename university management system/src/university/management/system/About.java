package university.management.system;

import javax.swing.*;
import java.awt.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame  {

    About(){
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/gndulogo.png"));
        Image i2 = i1.getImage().getScaledInstance(200, 200, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel img = new JLabel(i3);
        img.setBounds(350,0,300,200);
        add(img);

        JLabel heading = new JLabel("<html> GURU NANAK DEV <br>UNIVERSITY</html>");
        heading.setBounds(30,20,300,130);
        heading.setFont(new Font("Tahoma", Font.BOLD,30));
        add(heading);

        JLabel name = new JLabel("GNDU, AMRITSAR");
        name.setBounds(60,260,550,40);
        name.setFont(new Font("Tahoma", Font.BOLD,30));
        add(name);

        JLabel contact = new JLabel("helpdesk@gndu.ac.in." );
        contact.setBounds(70,340,550,40);
        contact.setFont(new Font("Tahoma", Font.BOLD,30));
        add(contact);


    setSize(700,500);
    setLocation(400,150);
    getContentPane().setBackground(new Color(252,228,210));
    setLayout(null);
    setVisible(true);

    }

    public static void main(String[] args) {
  new About();
    }
}
