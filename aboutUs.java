
/*
            TCR  Innovation
   CORE JAVA+SQL INTERNSHIP PROGRAM
        INTERNSHIP (( FINAL PROJECT ON LIBRARY MANAGEMENT SYSTEM )) .

INTERNSHIP (( FINAL PROJECT ON LIBRARY MANAGEMENT SYSTEM ))

 */

package library.management.system;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.*;

public class aboutUs extends JFrame implements ActionListener{

	private JPanel contentPane;

        public static void main(String[] args) {
            new aboutUs().setVisible(true);			
	}
    
        public aboutUs() {
            
            super("Library Management System (About Us) ");
            
            setBackground(new Color(173, 216, 230));
            setBounds(500, 250, 700, 700);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            JLabel l1 = new JLabel("New label");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/libLogo.gif"));
            Image i2 = i1.getImage().getScaledInstance(200, 200,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l1 = new JLabel(i3);
            l1.setBounds(500, 40, 100, 100);
            contentPane.add(l1);


            JLabel l3 = new JLabel("Library");
            l3.setForeground(new Color(0, 250, 154));
            l3.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l3.setBounds(160, 40, 150, 55);
            contentPane.add(l3);

            JLabel l4 = new JLabel("Mangement System");
            l4.setForeground(new Color(127, 255, 0));
            l4.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 34));
            l4.setBounds(70, 90, 405, 40);
            contentPane.add(l4);

            JLabel l5 = new JLabel("v1.0");
            l5.setForeground(new Color(30, 144, 255));
            l5.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l5.setBounds(185, 140, 100, 21);
            contentPane.add(l5);


            JLabel l6 = new JLabel("Developed By : Deepak,Purushottam,Anurag Kumar,Aman Anurag");
            l6.setFont(new Font("Trebuchet MS", Font.BOLD, 25));
            l6.setBounds(70, 198, 600, 35);
            contentPane.add(l6);

            JTextArea l7 = new JTextArea("A library management system is ERP software\n that is designed & developed to manage all\n the in-house functions of a library.\n A librarian requires maintaining a database of \nnew books and the books that are borrowed by \nusers along with their due dates. \nThis system completely automates all your library’s activities.\nThe best way to maintain, organize, and handle countless\n books systematically is to implement a library \nmanagement system software.");
            l7.setFont(new Font("Trebuchet MS", Font.BOLD, 20));
            l7.setBounds(70, 260, 600, 280);
            contentPane.add(l7);

            JLabel l10 = new JLabel("** Developed By Deepak,Purushottam,Anurag Kumar,Aman Anurag **");
            l10.setForeground(new Color(47, 79, 79));
            l10.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 18));
            l10.setBounds(70, 550, 600, 34);
            contentPane.add(l10);
            contentPane.setBackground(Color.WHITE);
            
            JButton b2 = new JButton("Back");
            b2.addActionListener(this);
            b2.setBorder(new CompoundBorder(new LineBorder(new Color(105, 105, 105)), null));
            b2.setFont(new Font("Trebuchet MS", Font.BOLD, 15));
            b2.setBounds(500, 578, 108, 33);
            b2.setBackground(Color.BLACK);
            b2.setForeground(Color.WHITE);
            contentPane.add(b2);
                
	}

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        this.setVisible(false);
	new Home().setVisible(true);
  
    }
        

}

