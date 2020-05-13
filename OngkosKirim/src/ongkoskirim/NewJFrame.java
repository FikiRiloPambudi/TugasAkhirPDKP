package ongkoskirim;

public class NewJFrame extends javax.swing.JFrame {
    int Total;
    public NewJFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Apengirim = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Npengirim = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        Npenerima = new javax.swing.JTextField();
        Apenerima = new javax.swing.JTextField();
        Kpos = new javax.swing.JTextField();
        Kec = new javax.swing.JTextField();
        Kab = new javax.swing.JTextField();
        PROV = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        berat1 = new javax.swing.JRadioButton();
        berat2 = new javax.swing.JRadioButton();
        berat3 = new javax.swing.JRadioButton();
        JML = new javax.swing.JTextField();
        Hberat = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        kelas1 = new javax.swing.JRadioButton();
        kelas2 = new javax.swing.JRadioButton();
        Hkelas = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        TotalHarga = new javax.swing.JTextField();
        asuransi = new javax.swing.JTextField();
        hitung = new javax.swing.JButton();
        clear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));

        jLabel1.setFont(new java.awt.Font("Bodoni Bk BT", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ONGKOS KIRIM BARANG");

        jLabel2.setText("NAMA PENGIRIM  :");

        jLabel3.setText("ALAMAT                :");

        Apengirim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApengirimActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fiki RP\\Pictures\\—newwwPngtree—delivery man uses a mask_5367256-min.png")); // NOI18N

        jLabel9.setText("NAMA PENERIMA :");

        jLabel10.setText("ALAMAT                :");

        jLabel11.setText("KODE POS            :");

        jLabel12.setText("KECAMATAN        :");

        jLabel13.setText("KABUPATEN        :");

        jLabel14.setText("PROVINSI           :");

        Npenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NpenerimaActionPerformed(evt);
            }
        });

        Apenerima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApenerimaActionPerformed(evt);
            }
        });

        Kab.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KabActionPerformed(evt);
            }
        });

        PROV.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--PILIH PROVINSI--", "DKI JAKARTA", "JAWA BARAT", "JAWA TENGAH", "JAWA TIMUR", "KALIMANTAN", "SUMATERA", "BALI", "LUAR NEGERI" }));
        PROV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PROVActionPerformed(evt);
            }
        });

        jLabel4.setText("JUMLAH BARANG :");

        jLabel5.setText("BERAT BARANG :");

        berat1.setBackground(new java.awt.Color(153, 204, 255));
        berat1.setText("0-15 KG");
        berat1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berat1ActionPerformed(evt);
            }
        });

        berat2.setBackground(new java.awt.Color(153, 204, 255));
        berat2.setText("16-30 KG");
        berat2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berat2ActionPerformed(evt);
            }
        });

        berat3.setBackground(new java.awt.Color(153, 204, 255));
        berat3.setText("31-50 KG");
        berat3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                berat3ActionPerformed(evt);
            }
        });

        jLabel6.setText("KELAS PENGIRIMAN :");

        kelas1.setBackground(new java.awt.Color(153, 204, 255));
        kelas1.setText("EKONOMIS");
        kelas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelas1ActionPerformed(evt);
            }
        });

        kelas2.setBackground(new java.awt.Color(153, 204, 255));
        kelas2.setText("EXPRESS");
        kelas2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelas2ActionPerformed(evt);
            }
        });

        jLabel16.setText("ASURANSI                 :");

        jLabel17.setText("TOTAL ONGKOS KIRIM :");

        hitung.setBackground(new java.awt.Color(255, 255, 255));
        hitung.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        hitung.setForeground(new java.awt.Color(102, 204, 255));
        hitung.setText("HITUNG");
        hitung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hitungActionPerformed(evt);
            }
        });

        clear.setBackground(new java.awt.Color(255, 255, 255));
        clear.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        clear.setForeground(new java.awt.Color(102, 204, 255));
        clear.setText("BARU");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel12)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Kec, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Npengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel11)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Kpos, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Apengirim, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(Npenerima, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(18, 18, 18)
                                .addComponent(Apenerima, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Kab, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PROV, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 455, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(JML))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(berat1)
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                    .addComponent(berat2)
                                                    .addGap(18, 18, 18)
                                                    .addComponent(berat3))
                                                .addComponent(Hberat)))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(20, 20, 20)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(kelas1)
                                                .addComponent(Hkelas, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(kelas2)
                                                .addComponent(asuransi, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGap(9, 9, 9))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel17)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(10, 10, 10)))
                            .addComponent(jLabel16))))
                .addComponent(jLabel7)
                .addGap(97, 97, 97))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(282, 282, 282))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Npengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(JML, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(Apengirim, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(berat1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel9)
                        .addComponent(Npenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(berat3)
                        .addComponent(berat2)))
                .addGap(12, 12, 12)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(Apenerima, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hberat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(Kpos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(kelas1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(Kec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(kelas2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Kab, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Hkelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(asuransi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(236, 236, 236)
                        .addComponent(jLabel7))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(PROV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel16)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(hitung, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(10, 10, 10)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel17)
                                    .addComponent(TotalHarga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(clear, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ApengirimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApengirimActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApengirimActionPerformed

    private void NpenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NpenerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NpenerimaActionPerformed

    private void berat1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berat1ActionPerformed
    if(berat1.isSelected()){
      Hberat.setText("20000");
        }
    }//GEN-LAST:event_berat1ActionPerformed

    private void PROVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PROVActionPerformed
        if(PROV.getSelectedItem().equals("DKI JAKARTA")){
            asuransi.setText("10000");
        }
        if(PROV.getSelectedItem().equals("JAWA BARAT")){
            asuransi.setText("8000");
        }
        if(PROV.getSelectedItem().equals("JAWA TENGAH")){
            asuransi.setText("10000");
        }
        if(PROV.getSelectedItem().equals("JAWA TIMUR")){
            asuransi.setText("10000");
        }
        if(PROV.getSelectedItem().equals("KALIMANTAN")){
            asuransi.setText("10000");
        }
        if(PROV.getSelectedItem().equals("SUMATERA")){
            asuransi.setText("10000");
        }
        if(PROV.getSelectedItem().equals("BALI")){
            asuransi.setText("10000");
        }
        if(PROV.getSelectedItem().equals("LUAR NEGERI")){
            asuransi.setText("10000");
        }
             // TODO add your handling code here:
    }//GEN-LAST:event_PROVActionPerformed

    private void berat2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berat2ActionPerformed
    if(berat2.isSelected()){
            Hberat.setText("25000");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_berat2ActionPerformed

    private void berat3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_berat3ActionPerformed
    if(berat3.isSelected()){
            Hberat.setText("30000");
        }        // TODO add your handling code here:
    }//GEN-LAST:event_berat3ActionPerformed

    private void kelas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelas1ActionPerformed
        if(kelas1.isSelected())
            if(PROV.getSelectedItem().equals("DKI JAKARTA")){
                Hkelas.setText("10000");
            }
        if(kelas1.isSelected())
            if(PROV.getSelectedItem().equals("JAWA BARAT")){
                Hkelas.setText("10000");
            }
        if(kelas1.isSelected())
            if(PROV.getSelectedItem().equals("JAWA TENGAH")){
                Hkelas.setText("15000");
            }
        if(kelas1.isSelected())
            if(PROV.getSelectedItem().equals("JAWA TIMUR")){
                Hkelas.setText("15000");
            }
        if(kelas1.isSelected())
            if(PROV.getSelectedItem().equals("KALIMANTAN")){
                Hkelas.setText("15000");
            }
        if(kelas1.isSelected())
            if(PROV.getSelectedItem().equals("SUMATERA")){
                Hkelas.setText("15000");
            }
        if(kelas1.isSelected())
            if(PROV.getSelectedItem().equals("BALI")){
                Hkelas.setText("20000");
            }
        if(kelas1.isSelected())
            if(PROV.getSelectedItem().equals("LUAR NEGERI")){
                Hkelas.setText("100000");
            }        // TODO add your handling code here:
    }//GEN-LAST:event_kelas1ActionPerformed

    private void kelas2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelas2ActionPerformed
        if(kelas2.isSelected())
            if(PROV.getSelectedItem().equals("DKI JAKARTA")){
                Hkelas.setText("35000");
            }
        if(kelas2.isSelected())
            if(PROV.getSelectedItem().equals("JAWA BARAT")){
                Hkelas.setText("35000");
            }
        if(kelas2.isSelected())
            if(PROV.getSelectedItem().equals("JAWA TENGAH")){
                Hkelas.setText("40000");
            }
        if(kelas2.isSelected())
            if(PROV.getSelectedItem().equals("JAWA TIMUR")){
                Hkelas.setText("45000");
            }
        if(kelas2.isSelected())
            if(PROV.getSelectedItem().equals("KALIMANTAN")){
                Hkelas.setText("45000");
            }
        if(kelas2.isSelected())
            if(PROV.getSelectedItem().equals("SUMATERA")){
                Hkelas.setText("45000");
            }
        if(kelas2.isSelected())
            if(PROV.getSelectedItem().equals("BALI")){
                Hkelas.setText("50000");
            }
        if(kelas2.isSelected())
            if(PROV.getSelectedItem().equals("LUAR NEGERI")){
                Hkelas.setText("200000");
            }        // TODO add your handling code here:
    }//GEN-LAST:event_kelas2ActionPerformed

    private void hitungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hitungActionPerformed
 int a=Integer.parseInt(JML.getText());
        int b=Integer.parseInt(Hberat.getText());
        int c=Integer.parseInt(Hkelas.getText());
        int d=Integer.parseInt(asuransi.getText());
        int hasil=(b+c+d)*a;
            Total=hasil;
            TotalHarga.setText(String.valueOf(Total));
    // TODO add your handling code here:
    }//GEN-LAST:event_hitungActionPerformed

    private void ApenerimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApenerimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ApenerimaActionPerformed

    private void KabActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KabActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_KabActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        Npengirim.setText("");
        Apengirim.setText("");
        Npenerima.setText("");
        Apenerima.setText("");
        Kpos.setText("");
        Kec.setText("");
        Kab.setText("");
        PROV.setSelectedIndex(0);
        JML.setText("");
        Hberat.setText("");
        Hkelas.setText("");
        asuransi.setText(null);
        TotalHarga.setText("");
            // TODO add your handling code here:
    }//GEN-LAST:event_clearActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Apenerima;
    private javax.swing.JTextField Apengirim;
    private javax.swing.JTextField Hberat;
    private javax.swing.JTextField Hkelas;
    private javax.swing.JTextField JML;
    private javax.swing.JTextField Kab;
    private javax.swing.JTextField Kec;
    private javax.swing.JTextField Kpos;
    private javax.swing.JTextField Npenerima;
    private javax.swing.JTextField Npengirim;
    private javax.swing.JComboBox<String> PROV;
    private javax.swing.JTextField TotalHarga;
    private javax.swing.JTextField asuransi;
    private javax.swing.JRadioButton berat1;
    private javax.swing.JRadioButton berat2;
    private javax.swing.JRadioButton berat3;
    private javax.swing.JButton clear;
    private javax.swing.JButton hitung;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton kelas1;
    private javax.swing.JRadioButton kelas2;
    // End of variables declaration//GEN-END:variables
}
