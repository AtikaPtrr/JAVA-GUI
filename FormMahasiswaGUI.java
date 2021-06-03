
package nimjavagui;

import javax.swing.JOptionPane;

public class FormMahasiswaGUI extends javax.swing.JFrame {
//variable input
        private String Nama ;
        private String nim;
        
//variable output
        private String Hasil;
        public FormMahasiswaGUI(String Hasil){
        this.nim = nim;
        }
        
        //jenis kelamin
        public String getJenisKelamin(){
        char kodeJk = nim.charAt(6);
        if(kodeJk == '1'){
            return "Laki-laki";
        }else if(kodeJk == '2'){
            return "Perempuan";
        }
        return "UNKNOWN";
    }
        
        //jenjang pendidikan
        public String getJenjang(){
        char kodeJ = nim.charAt(0);
        if(kodeJ == '1'){
            return "S1(Sarjana)";
        }else if(kodeJ == '2'){
            return "S2(Magister)";
        }else if(kodeJ == '2'){
            return "S3(Doktor)";
        }
            return "UNKNOWN";
    }
        
        //Tahun Angkatan
        public String getTahun(){
        String kodeT = nim.substring(1,3);
        return "20"+kodeT;
    }
        
        //fakultas
        public String getFakultas(){
        char kodeF = nim.charAt(3);
        if(kodeF == '1'){
            return"Tarbiah dan Keguruan";
        }else if(kodeF == '2'){
            return "Syariah dan Hukum";
        }else if(kodeF == '3'){
            return "Ushuluddin";    
        }else if(kodeF == '4'){
            return "Dakwah & Komunikasi";
        }else if(kodeF == '5'){
            return "Sains & Teknologi";      
        }else if(kodeF == '6'){
            return "Psikologi";
        }else if(kodeF == '7'){
            return "Ekonomi & Ilmu Sosial";
        }else if(kodeF == '8'){
            return "Pertanian & Peternakan";
        }
        return "UNKNOWN";
    }
        
        //jurusan
        public String getJurusan(){
        char kodeP = nim.charAt(5);
        if(kodeP == '1'){
            return"Teknik Informatika";
        }else if(kodeP == '2'){
            return "Teknik Industri";
        }else if(kodeP == '3'){
            return "Sistem Informasi";    
        }else if(kodeP == '4'){
            return "Matematika";
        }else if(kodeP == '5'){
            return "Teknik Elektro";
        }
        return "UNKNOWN";
    }
        
        //nomor urut
        public String getNomorUrut(){
        String kodeN = nim.substring(7);
        return kodeN;
    }
                  
    public FormMahasiswaGUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNama = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNIM = new javax.swing.JTextField();
        ButtonCari = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("FORM MAHASISWA");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("NAMA :");

        txtNama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNamaActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("NIM :");

        ButtonCari.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        ButtonCari.setText("CARI");
        ButtonCari.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCariActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtNama)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(txtNIM))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(68, 68, 68)
                .addComponent(ButtonCari)
                .addContainerGap(83, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNIM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(ButtonCari)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNamaActionPerformed
       
    }//GEN-LAST:event_txtNamaActionPerformed

    private void ButtonCariActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCariActionPerformed
        //proses mengambil nilai dari inputan
        Nama = txtNama.getText();
        nim = txtNIM.getText();
        
        
        
        //menampilkan output
        Hasil  = "Nama Mahasiswa : "+ Nama + "\n";
        Hasil += "NIM : "+ nim + "\n"; 
        Hasil += "Jenis Kelamin : " + getJenisKelamin() +"\n";
        Hasil += "Jenjang Pendidikan : " +getJenjang() + "\n";
        Hasil += "Angkatan : "+ getTahun()+ "\n";
        Hasil += "Fakultas : "+ getFakultas()+"\n";
        Hasil += "Jurusan : "+ getJurusan()+"\n";
        Hasil += "Nomor Urut : "+ getNomorUrut()+"\n";
        
        JOptionPane.showMessageDialog(null, Hasil);
    }//GEN-LAST:event_ButtonCariActionPerformed

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
            java.util.logging.Logger.getLogger(FormMahasiswaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormMahasiswaGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new FormMahasiswaGUI().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCari;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtNIM;
    private javax.swing.JTextField txtNama;
    // End of variables declaration//GEN-END:variables
}
