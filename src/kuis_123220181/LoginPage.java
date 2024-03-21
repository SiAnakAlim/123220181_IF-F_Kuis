/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220181;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class LoginPage extends JFrame implements ActionListener {
    JLabel header = new JLabel ("Login Page");
    JLabel username = new JLabel ("Username");
    JLabel password = new JLabel ("Password");
    
    JTextField inputusername = new JTextField();
    JTextField inputpassword = new JTextField();
    
    JButton TombolLogin = new JButton("Login");
    
    LoginPage(){
        setSize(450,600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(header);
                header.setFont(new Font("Arial", Font.BOLD,20));
                header.setBounds(100, 30, 150, 30);
                
        add(username);
        username.setBounds(100, 150, 150, 30);
        
        add(password);
        password.setBounds(100, 250,150,30);
        
        add(inputusername);
                inputusername.setBounds(100,200,150,30);
                
        add(inputpassword);
                inputpassword.setBounds(100,300,150,30);
        
        add(TombolLogin);
        TombolLogin.setBounds(100, 350, 150, 30);
        TombolLogin.addActionListener(this);
                
        setVisible(true);
        
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String UserName = inputusername.getText();
            String Password = inputpassword.getText();
            
            
            if(UserName.equals("") && Password.equals("")){
                throw new Exception("Password dan Username belum diisi");
            }
            else if (UserName.equals("")){
                throw new Exception("Username belum diisi");
            }
            else if (Password.equals("")){
                throw new Exception("Password belum diisi");
            }
            else if(UserName.equals("123220181") && Password.equals("12345")){
                new MenuPage(UserName);
               
            }
        } catch (Exception error) {
            JOptionPane.showMessageDialog(this, error.getMessage());
        }
    }
   
    
    
}
