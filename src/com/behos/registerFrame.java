/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.behos;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author aydin
 */
public class registerFrame extends javax.swing.JFrame {

    /**
     * Creates new form registerFrame
     */
    public static Connection baglan;
    public registerFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        loginPanel = new javax.swing.JPanel();
        loginLabel = loginLabel = new JLabel(new ImageIcon("res/login.png"));
        tcNoLoginLabel = new javax.swing.JLabel();
        tcNoLoginTextField = new javax.swing.JTextField();
        sifreLoginLabel = new javax.swing.JLabel();
        sifreLoginField = new javax.swing.JPasswordField();
        girisYapButton = new javax.swing.JButton();
        registerPanel = new javax.swing.JPanel();
        adSoyadLabel = new javax.swing.JLabel();
        adSoyadTextField = new javax.swing.JTextField();
        cinsiyetLabel = new javax.swing.JLabel();
        tcNoTextField = new javax.swing.JTextField();
        tcNoLabel = new javax.swing.JLabel();
        cinsiyetComboBox = new javax.swing.JComboBox<>();
        yasLabel = new javax.swing.JLabel();
        yasComboBox = new javax.swing.JComboBox<>();
        kiloLabel = new javax.swing.JLabel();
        kiloComboBox = new javax.swing.JComboBox<>();
        boyLabel = new javax.swing.JLabel();
        boyComboBox = new javax.swing.JComboBox<>();
        sifreLabel = new javax.swing.JLabel();
        sifreTextField = new javax.swing.JPasswordField();
        resimLabel = new javax.swing.JLabel();
        sifreTekrarTextField = new javax.swing.JPasswordField();
        sifreTekrarLabel = new javax.swing.JLabel();
        resimButton = new javax.swing.JButton();
        kayitOlButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        loginPanel.setBackground(new java.awt.Color(192, 85, 85));

        tcNoLoginLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNoLoginLabel.setText("TC No");

        tcNoLoginTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        sifreLoginLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreLoginLabel.setText("Şifre");

        girisYapButton.setText("Giriş");
        girisYapButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                girisYapButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout loginPanelLayout = new javax.swing.GroupLayout(loginPanel);
        loginPanel.setLayout(loginPanelLayout);
        loginPanelLayout.setHorizontalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addComponent(sifreLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(sifreLoginField))
                            .addGroup(loginPanelLayout.createSequentialGroup()
                                .addComponent(tcNoLoginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(tcNoLoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(loginPanelLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(girisYapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68))
        );
        loginPanelLayout.setVerticalGroup(
            loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginPanelLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(loginLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLoginLabel)
                    .addComponent(tcNoLoginTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(loginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreLoginLabel)
                    .addComponent(sifreLoginField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(girisYapButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        registerPanel.setBackground(new java.awt.Color(255, 200, 92));

        adSoyadLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        adSoyadLabel.setText("Ad Soyad");

        adSoyadTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        cinsiyetLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        cinsiyetLabel.setText("Cinsiyet");

        tcNoTextField.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        tcNoLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        tcNoLabel.setText("TC No");

        cinsiyetComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Bay", "Bayan" }));

        yasLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        yasLabel.setText("Yaş");

        yasComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100" }));

        kiloLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        kiloLabel.setText("Kilo");

        kiloComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199" }));

        boyLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        boyLabel.setText("Boy");

        boyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100", "101", "102", "103", "104", "105", "106", "107", "108", "109", "110", "111", "112", "113", "114", "115", "116", "117", "118", "119", "120", "121", "122", "123", "124", "125", "126", "127", "128", "129", "130", "131", "132", "133", "134", "135", "136", "137", "138", "139", "140", "141", "142", "143", "144", "145", "146", "147", "148", "149", "150", "151", "152", "153", "154", "155", "156", "157", "158", "159", "160", "161", "162", "163", "164", "165", "166", "167", "168", "169", "170", "171", "172", "173", "174", "175", "176", "177", "178", "179", "180", "181", "182", "183", "184", "185", "186", "187", "188", "189", "190", "191", "192", "193", "194", "195", "196", "197", "198", "199", "200", "201", "202", "203", "204", "205", "206", "207", "208", "209", "210", "211", "212", "213", "214", "215", "216", "217", "218", "219", "220", "221", "222", "223", "224", "225", "226", "227", "228", "229", "230", "231", "232", "233", "234", "235", "236", "237", "238", "239", "240", "241", "242", "243", "244", "245", "246", "247", "248", "249" }));

        sifreLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreLabel.setText("Şifre");

        resimLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        resimLabel.setText("Fotoğraf");

        sifreTekrarLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        sifreTekrarLabel.setText("Şifre Tekrar");

        resimButton.setText("Dosya Seç");
        resimButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resimButtonActionPerformed(evt);
            }
        });

        kayitOlButton.setText("Kayıt Ol");
        kayitOlButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kayitOlButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout registerPanelLayout = new javax.swing.GroupLayout(registerPanel);
        registerPanel.setLayout(registerPanelLayout);
        registerPanelLayout.setHorizontalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(adSoyadLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(adSoyadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(resimLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(resimButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(sifreTekrarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(sifreTekrarTextField))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(sifreLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sifreTextField))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(boyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boyComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(kiloLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(kiloComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(yasLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(yasComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(cinsiyetLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cinsiyetComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(tcNoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(tcNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 69, Short.MAX_VALUE))
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(registerPanelLayout.createSequentialGroup()
                    .addGap(84, 84, 84)
                    .addComponent(kayitOlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(107, Short.MAX_VALUE)))
        );
        registerPanelLayout.setVerticalGroup(
            registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(registerPanelLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(adSoyadLabel)
                    .addComponent(adSoyadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tcNoLabel)
                    .addComponent(tcNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cinsiyetLabel)
                    .addComponent(cinsiyetComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(yasLabel)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(yasComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kiloLabel)
                    .addComponent(kiloComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boyLabel)
                    .addComponent(boyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sifreLabel)
                    .addComponent(sifreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sifreTekrarLabel)
                    .addComponent(sifreTekrarTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addComponent(resimLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(registerPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(resimButton, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)))
                .addGap(101, 101, 101))
            .addGroup(registerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, registerPanelLayout.createSequentialGroup()
                    .addContainerGap(606, Short.MAX_VALUE)
                    .addComponent(kayitOlButton, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(29, 29, 29)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(loginPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(registerPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(loginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(registerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void resimButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resimButtonActionPerformed
        // TODO add your handling code here:
        JFileChooser dosya = new JFileChooser();
        dosya.showOpenDialog(null);
        File f = dosya.getSelectedFile();
        CONST.dosyaKonumu = f.getAbsolutePath();
        
    }//GEN-LAST:event_resimButtonActionPerformed

    private void girisYapButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_girisYapButtonActionPerformed
        // TODO add your handling code here:
         CONST.guncelKullanici = tcNoLoginTextField.getText();
         CONST.guncelSifre = new String(sifreLoginField.getPassword());
                baglantiAc();
                bul(CONST.guncelKullanici);
                
            if(CONST.guncelSifre.equals(CONST.userSifre)){
                try {
                    JOptionPane.showMessageDialog(null, "Giriş Başarılı.. Hoşgeldin " + CONST.results.getString("ad_soyad"));
                    JFrame mainFrame = new mainFrame();
                    mainFrame.setVisible(true);
                    mainFrame.setLocationRelativeTo(null);
                    frameKapat();
                  
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Hatalı Kullanıcı Adı Veya Şifre");
                }
            }else{
                JOptionPane.showMessageDialog(null, "Hatalı Kullanıcı Adı Veya Şifre");
            }
    }//GEN-LAST:event_girisYapButtonActionPerformed

    private void kayitOlButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kayitOlButtonActionPerformed
        // TODO add your handling code here:
         baglantiAc();
         ekle();
         baglantiKapat();
    }//GEN-LAST:event_kayitOlButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(registerFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JFrame frame = new registerFrame();
                frame.setVisible(true);
                frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                frame.setLocationRelativeTo(null);
            }
        });
    }
    
    public void frameKapat(){
        super.dispose();
    }
    //Sql Bağlantısını açmak için gerekli Fonksiyon
    public static void baglantiAc(){
        try{
            Class.forName(CONST.JDBC_DRIVER);
            baglan = DriverManager.getConnection(CONST.DB_URL,CONST.USER,CONST.PASS);
            //  JOptionPane.showMessageDialog(null,"Baglantı Başarılı");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,e);
        }
    }
    //Sql bağlantısını kapatmak için gerekli fonksiyon
    public static void baglantiKapat(){
        try{
            baglan.close();
            // JOptionPane.showMessageDialog(null,"Bağlantı Başarıyla Kapatıldı");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null,"Bağlantı Kapatılamadı!");
        }
    }
    
     //Database'e Kayıt eklemek için yapılan fonksiyon
    public void ekle(){
        String ad_soyad = adSoyadTextField.getText() ;
        Long tc = Long.parseLong(tcNoTextField.getText());
        int cinsiyet = cinsiyetComboBox.getSelectedIndex();
        int  yas = Integer.parseInt((String) yasComboBox.getItemAt(yasComboBox.getSelectedIndex()));
        int  kilo = Integer.parseInt((String) kiloComboBox.getItemAt(kiloComboBox.getSelectedIndex()));
        int  boy = Integer.parseInt((String) boyComboBox.getItemAt(boyComboBox.getSelectedIndex()));
        CONST.dosyaKonumu = CONST.dosyaKonumu.replaceAll("\\\\", "?");
        String sifre = new String(sifreTextField.getPassword());
        String sifreTekrar = new String(sifreTekrarTextField.getPassword());
        boolean ayniMi =true;
        String ekle_sorgusu = "insert into bilgiler (ad_soyad,tc_no,cinsiyet,yas,kilo,boy,sifre,dosya_konumu) " +
                "values ('"+ad_soyad+"','"+tc+"','"+cinsiyet+"','"+yas+"','"+kilo+"','"+boy+"','"+sifre+"','"+CONST.dosyaKonumu+"')";
       
        try{
            Statement calistir = baglan.createStatement();
            do{
                if(sifre.equals(sifreTekrar)){
                  calistir.execute(ekle_sorgusu);
                  ayniMi=false;
                  
                  JOptionPane.showMessageDialog(null,"Kayıt Başarıyla Eklendi :)");

                }else{
                  JOptionPane.showMessageDialog(null, "Şifreler Aynı Değil" + sifre + "Sifre 2" + sifreTekrar);
                  ayniMi=false;
                }
            }while(ayniMi);     
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Hata Oluştu!  " + e);
        }
    }
    
    
    public static void kullaniciBilgileriKaydet(){
        try {
            CONST.userAdiSoyadi = CONST.results.getString("ad_soyad");
            CONST.userTcNo = Long.parseLong(CONST.results.getString("tc_no"));
            CONST.userCinsiyet =Integer.parseInt(CONST.results.getString("cinsiyet"));
            CONST.userYas =Integer.parseInt(CONST.results.getString("yas"));
            CONST.userKilo =Integer.parseInt(CONST.results.getString("kilo"));
            CONST.userBoy =Integer.parseInt(CONST.results.getString("boy"));
            CONST.userSifre = CONST.results.getString("sifre");
            CONST.dosyaKonumu = CONST.results.getString("dosya_konumu");
            CONST.dosyaKonumu = CONST.dosyaKonumu.replaceAll("\\?", "/");
           // JOptionPane.showMessageDialog(null, CONST.dosyaKonumu);
            
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
    
    public static void bul(String login){
        String bul_komutu = "select* from bilgiler where tc_no="+login;
        try{
            Statement statement = baglan.createStatement();
            CONST.results = statement.executeQuery(bul_komutu);
            CONST.results.next();
            kullaniciBilgileriKaydet();
        }
        catch (SQLException e){
            JOptionPane.showMessageDialog(null,"Hatalı Tc Kimlik Numarası");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adSoyadLabel;
    private javax.swing.JTextField adSoyadTextField;
    private javax.swing.JComboBox<String> boyComboBox;
    private javax.swing.JLabel boyLabel;
    private javax.swing.JComboBox<String> cinsiyetComboBox;
    private javax.swing.JLabel cinsiyetLabel;
    private javax.swing.JButton girisYapButton;
    private javax.swing.JButton kayitOlButton;
    private javax.swing.JComboBox<String> kiloComboBox;
    private javax.swing.JLabel kiloLabel;
    private javax.swing.JLabel loginLabel;
    private javax.swing.JPanel loginPanel;
    private javax.swing.JPanel registerPanel;
    private javax.swing.JButton resimButton;
    private javax.swing.JLabel resimLabel;
    private javax.swing.JLabel sifreLabel;
    private javax.swing.JPasswordField sifreLoginField;
    private javax.swing.JLabel sifreLoginLabel;
    private javax.swing.JLabel sifreTekrarLabel;
    private javax.swing.JPasswordField sifreTekrarTextField;
    private javax.swing.JPasswordField sifreTextField;
    private javax.swing.JLabel tcNoLabel;
    private javax.swing.JLabel tcNoLoginLabel;
    private javax.swing.JTextField tcNoLoginTextField;
    private javax.swing.JTextField tcNoTextField;
    private javax.swing.JComboBox<String> yasComboBox;
    private javax.swing.JLabel yasLabel;
    // End of variables declaration//GEN-END:variables
}
