/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220181;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;


public class MenuPage extends JFrame implements ActionListener {
    JLabel infoheader = new JLabel();
    JLabel infomenu = new JLabel("Silahkan Pilih menu di bawah untuk membeli majalah");
    
    JCheckBox MajalahAnak = new JCheckBox("Majalah Anak");
    JCheckBox MajalahRemaja = new JCheckBox("Majalah Remaja");
    JCheckBox MajalahDewasa = new JCheckBox("Majalah Dewasa");
    
    JButton LanjutButton = new JButton("Silahkan Pilih");
    
    MenuPage(String Username){
         setSize(450,600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(infoheader);
        infoheader.setBounds(50, 20, 200, 30);
        infoheader.setText("Selamat Datang, " + Username);
        
        add(infomenu);
        infomenu.setBounds(50, 50, 400, 30);
        
        add(MajalahAnak);
        MajalahAnak.setBounds(100, 100, 200, 30);
        
        add(MajalahRemaja);
        MajalahRemaja.setBounds(100, 150, 200, 30);
        
        add(MajalahDewasa);
        MajalahDewasa.setBounds(100, 200, 200, 30);
        
        add(LanjutButton);
        LanjutButton.setBounds(100, 300, 200, 30);
        LanjutButton.addActionListener(this);
        
        setVisible(true);
    }

        @Override
        public void actionPerformed(ActionEvent e) 
        {
            
            if(MajalahAnak.isSelected()){
                new MajalahPage();
            }
            else if(MajalahRemaja.isSelected()){
                new MajalahPage();
            }
            else if(MajalahDewasa.isSelected())
                new MajalahPage();
            else{
                   JOptionPane.showMessageDialog(null, "Pilih Salah Satu!");
            }
        }
      
}

