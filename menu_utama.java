/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seleksi_pegawai;

/**
 *
 * @author ALFIANSAH
 */
public class menu_utama extends BaseClass {

    /**
     * Creates new form menu_utama
     */
    public menu_utama() {
        initComponents();
        akses();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu3 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        admin = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        utama = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        user = new javax.swing.JMenuItem();
        signup = new javax.swing.JMenuItem();
        logout = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        master_data = new javax.swing.JMenu();
        jabatan = new javax.swing.JMenuItem();
        kriteria = new javax.swing.JMenuItem();
        rating = new javax.swing.JMenuItem();
        pelamar = new javax.swing.JMenuItem();
        menu_penilaian = new javax.swing.JMenu();
        penilaian = new javax.swing.JMenuItem();
        hasil = new javax.swing.JMenuItem();
        menu = new javax.swing.JMenu();
        laporan = new javax.swing.JMenuItem();
        print = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu Utama");
        setBackground(new java.awt.Color(0, 153, 0));

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sistem Pendukung Keputusan");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Seleksi Tenaga Kerja");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/seleksi_pegawai/organisasi.png"))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Administrator :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(admin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1228, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 418, Short.MAX_VALUE)
        );

        jButton1.setText("Logout  >");

        jMenu1.setText("File");

        utama.setText("Menu Utama");
        utama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utamaActionPerformed(evt);
            }
        });
        jMenu1.add(utama);

        jMenu2.setText("User Management");

        user.setText("Data User");
        user.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userActionPerformed(evt);
            }
        });
        jMenu2.add(user);

        signup.setText("Sign up");
        signup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signupActionPerformed(evt);
            }
        });
        jMenu2.add(signup);

        jMenu1.add(jMenu2);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu1.add(logout);

        jMenuItem1.setText("Exit");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        master_data.setText("Master Data");

        jabatan.setText("Data Jabatan");
        jabatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jabatanActionPerformed(evt);
            }
        });
        master_data.add(jabatan);

        kriteria.setText("Data Kriteria");
        kriteria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kriteriaActionPerformed(evt);
            }
        });
        master_data.add(kriteria);

        rating.setText("Data Rating");
        rating.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ratingActionPerformed(evt);
            }
        });
        master_data.add(rating);

        pelamar.setText("Data Pelamar");
        pelamar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pelamarActionPerformed(evt);
            }
        });
        master_data.add(pelamar);

        jMenuBar1.add(master_data);

        menu_penilaian.setText("Penilaian");

        penilaian.setText("Mulai Penilaian");
        penilaian.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penilaianActionPerformed(evt);
            }
        });
        menu_penilaian.add(penilaian);

        hasil.setText("Lihat Hasil");
        hasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hasilActionPerformed(evt);
            }
        });
        menu_penilaian.add(hasil);

        jMenuBar1.add(menu_penilaian);

        menu.setText("Laporan");

        laporan.setText("Lihat");
        laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanActionPerformed(evt);
            }
        });
        menu.add(laporan);

        print.setText("Print");
        print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printActionPerformed(evt);
            }
        });
        menu.add(print);

        jMenuBar1.add(menu);

        jMenu6.setText("Help");

        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        jMenu6.add(about);

        jMenuBar1.add(jMenu6);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(275, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//==================================Jmenubar 1==================================
    private void pelamarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pelamarActionPerformed
    dispose();
    new data_pelamar().setVisible(true);
    }//GEN-LAST:event_pelamarActionPerformed

    private void utamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utamaActionPerformed
    dispose();
    new menu_utama().setVisible(true);
    }//GEN-LAST:event_utamaActionPerformed

    private void signupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signupActionPerformed
    dispose();
    new sign_up().setVisible(true);
    }//GEN-LAST:event_signupActionPerformed

    private void userActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userActionPerformed
        dispose();
        new user_management().setVisible(true);
    }//GEN-LAST:event_userActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        new login().show();
        this.dispose();
    }//GEN-LAST:event_logoutActionPerformed

    private void jabatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jabatanActionPerformed
         dispose();
        new data_jabatan().setVisible(true);
    }//GEN-LAST:event_jabatanActionPerformed

    private void kriteriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kriteriaActionPerformed
        dispose();
        new data_kriteria().setVisible(true);
    }//GEN-LAST:event_kriteriaActionPerformed

    private void ratingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ratingActionPerformed
        dispose();
        new data_rating().setVisible(true);
    }//GEN-LAST:event_ratingActionPerformed

    private void penilaianActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penilaianActionPerformed
    dispose();
    new menu_penilaian().setVisible(true);
    }//GEN-LAST:event_penilaianActionPerformed

    private void hasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hasilActionPerformed
    dispose();
    new hasil_penilaian().setVisible(true);
    }//GEN-LAST:event_hasilActionPerformed

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
    dispose();
    new menu_laporan().setVisible(true);
    }//GEN-LAST:event_laporanActionPerformed

    private void printActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printActionPerformed
    dispose();
    new print().setVisible(true);
    }//GEN-LAST:event_printActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
    System.exit(0);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
    new menu_about().setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

//==================================Jmenubar==================================

    
//============================================================================
    
    
    
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
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menu_utama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menu_utama().setVisible(true);
            }
        });
    }
    
    
    public void akses(){
        
     if (this.HakAkses.equals("admin")){
     utama.setEnabled(true);
     user.setEnabled(false);
     signup.setEnabled(false);
     jMenuItem1.setEnabled(true); //exit
     logout.setEnabled(true);
     master_data.setEnabled(true);
     penilaian.setEnabled(true);
     hasil.setEnabled(true);
     laporan.setEnabled(true);
     print.setEnabled(true);
     about.setEnabled(true);
      }
     else if (this.HakAkses.equals("direktur")){
     utama.setEnabled(true);
     user.setEnabled(true);
     signup.setEnabled(true);
     jMenuItem1.setEnabled(true);//exit
     logout.setEnabled(true);
     master_data.setEnabled(false);
     penilaian.setEnabled(false);
     hasil.setEnabled(false);
     laporan.setEnabled(true);
     print.setEnabled(true);
     about.setEnabled(true);
     }
    }       

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JTextField admin;
    private javax.swing.JMenuItem hasil;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JMenuItem jabatan;
    private javax.swing.JMenuItem kriteria;
    private javax.swing.JMenuItem laporan;
    private javax.swing.JMenuItem logout;
    private javax.swing.JMenu master_data;
    private javax.swing.JMenu menu;
    private javax.swing.JMenu menu_penilaian;
    private javax.swing.JMenuItem pelamar;
    private javax.swing.JMenuItem penilaian;
    private javax.swing.JMenuItem print;
    private javax.swing.JMenuItem rating;
    private javax.swing.JMenuItem signup;
    private javax.swing.JMenuItem user;
    private javax.swing.JMenuItem utama;
    // End of variables declaration//GEN-END:variables
}
