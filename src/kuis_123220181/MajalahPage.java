/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kuis_123220181;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Lab Informatika
 */
public class MajalahPage extends JFrame implements ActionListener {
    JLabel header = new JLabel("Halaman Pembelian");
    JLabel kategori = new JLabel("Kategori");
    JLabel Harga = new JLabel("Harga");
    JLabel Jumlah = new JLabel("Jumlah");
    JLabel Total = new JLabel("Total Pembelian");
    JLabel HargaSatuan = new JLabel("Harga Satuan");
    JLabel JumlahTotal = new JLabel("Jumlah");
    JLabel TotalHarga = new JLabel("Total Harga");
    
    JLabel infoKategori = new JLabel();
    JLabel infoHarga = new JLabel();
    JLabel infoHargaSatuan = new JLabel();
    JLabel infoJumlahTotal = new JLabel();
    JLabel infoTotalHarga = new JLabel();
    
    JTextField inputjumlah = new JTextField();
    
    JButton TombolKembali = new JButton("Kembali");
    JButton TombolBeli = new JButton("Beli");
    
    MajalahPage(){
        setSize(450,600);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        add(header);
        header.setBounds(50, 30, 170, 30);
        
        add(kategori);
        kategori.setBounds(50, 70, 100, 30);
        
        add(infoKategori);
        infoKategori.setBounds(100, 70, 100, 30);
        infoKategori.setText("Majalah Anak");
        
        add(Harga);
        Harga.setBounds(50, 100, 100, 30);
        
        add(infoHarga);
        infoHarga.setBounds(100, 100, 100, 30);
        infoHarga.setText("Rp15.200 / pcs");
        
        add(Jumlah);
        Jumlah.setBounds(50, 130, 100, 30);
        
        add(inputjumlah);
        inputjumlah.setBounds(100, 130, 150, 30);
        
        add(TombolKembali);
        TombolKembali.setBounds(50, 170, 100, 30);
        
        add(TombolBeli);
        TombolBeli.setBounds(200, 170, 100, 30);
        
        add(Total);
        Total.setBounds(50, 200, 100, 30);
        
        add(HargaSatuan);
        HargaSatuan.setBounds(50, 240, 100, 30);
        
        add(infoHargaSatuan);
        infoHargaSatuan.setBounds(90, 240, 100, 30);
        infoHargaSatuan.setText("Rp15.200");
        
        add(JumlahTotal);
        JumlahTotal.setBounds(50, 270, 100, 30);
        
        add(infoJumlahTotal);
        infoJumlahTotal.setBounds(90, 270, 100, 30);
        infoHargaSatuan.setText("8 pcs");
        
        
        add(TotalHarga);
        TotalHarga.setBounds(50, 300, 100, 30);
        
        add(infoTotalHarga);
        infoTotalHarga.setBounds(90, 300, 100, 30);
        infoTotalHarga.setText("RP121.600");
        
        TombolKembali.addActionListener(this);
        TombolBeli.addActionListener(this);
        
        
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
}
