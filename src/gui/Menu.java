/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import dao.menuDao;
import java.util.List;
import javax.swing.JFileChooser;
import java.awt.Component;
import java.awt.Image;
import java.io.File;

import javax.swing.ImageIcon;

import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import model.MeNu;


import server.DataValidator;
import server.MessageDialogHelper;
import server.imagehelper;


public class Menu extends javax.swing.JFrame {

    private MainForm parentForm;
   private DefaultTableModel tblModel;
   private byte[] personalImage;
    public Menu() {
        initComponents();
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        initTable();
        LoadData();
    }

    private void initTable(){
        tblModel = new DefaultTableModel();
        tblModel.setColumnIdentifiers(new String[]{"Mã Món","Tên Món","Đơn Gíá","Mã Loại Món"});
        menuTable.setModel(tblModel);
    }
public void LoadData(){
        try {
            menuDao dao=new menuDao();
            List<MeNu> list= dao.findAll();
            tblModel.setRowCount(0);// reset nội dung trong bảng =0;
            for (MeNu menu : list) {
                tblModel.addRow(new Object[]{
                    menu.getMaMon(),menu.getTenMon(),menu.getDonGia(),
                    menu.getMaLoaiMon()
                });
            }
        tblModel.fireTableDataChanged();
        } catch (Exception e) {
                e.printStackTrace();
                MessageDialogHelper.showErrorDialog(parentForm, e.getMessage(), "Lỗi");
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblbrowse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtMaMon = new javax.swing.JTextField();
        txttMaloaimon1 = new javax.swing.JComboBox<>();
        txtTenMon = new javax.swing.JTextField();
        Btnthem = new javax.swing.JButton();
        btnsua = new javax.swing.JButton();
        btnxoa = new javax.swing.JButton();
        lblImage = new javax.swing.JLabel();
        txtDonGia = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        menuTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 407));

        lblbrowse.setBackground(new java.awt.Color(102, 153, 255));
        lblbrowse.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Login-icon-16.png"))); // NOI18N
        lblbrowse.setText("Thêm ẢNh");
        lblbrowse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lblbrowseActionPerformed(evt);
            }
        });

        jLabel2.setText("Mã Món:");

        jLabel3.setText("Loại:");

        jLabel4.setText("Tên Món:");

        jLabel5.setText("Giá Bán:");

        txtMaMon.setText("HT 01");

        txttMaloaimon1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cafe", "Nước ngọt", "Nước Ép", "Sinh Tố" }));
        txttMaloaimon1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttMaloaimon1ActionPerformed(evt);
            }
        });

        txtTenMon.setText("Cafe");
        txtTenMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTenMonActionPerformed(evt);
            }
        });

        Btnthem.setBackground(new java.awt.Color(102, 153, 255));
        Btnthem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Save-icon.png"))); // NOI18N
        Btnthem.setText("Thêm");
        Btnthem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 13), new java.awt.Color(102, 102, 255))); // NOI18N
        Btnthem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnthemActionPerformed(evt);
            }
        });

        btnsua.setBackground(new java.awt.Color(102, 153, 255));
        btnsua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Actions-document-edit-icon-16.png"))); // NOI18N
        btnsua.setText("Sữa ");
        btnsua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsuaActionPerformed(evt);
            }
        });

        btnxoa.setBackground(new java.awt.Color(102, 153, 255));
        btnxoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Button-Close-icon-16.png"))); // NOI18N
        btnxoa.setText("Xóa");
        btnxoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnxoaActionPerformed(evt);
            }
        });

        lblImage.setBackground(new java.awt.Color(204, 204, 204));
        lblImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Full Image_96px.png"))); // NOI18N
        lblImage.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        lblImage.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        lblImage.setDoubleBuffered(true);
        lblImage.setFocusCycleRoot(true);

        txtDonGia.setText("15000");
        txtDonGia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDonGiaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(lblbrowse))
                            .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txttMaloaimon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(108, 108, 108)
                        .addComponent(Btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(151, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(lblImage, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(txtMaMon, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenMon, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(txttMaloaimon1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDonGia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblbrowse)))
                .addGap(56, 56, 56)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btnthem, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnsua, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnxoa, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menuTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        menuTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menuTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(menuTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 606, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblbrowseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lblbrowseActionPerformed
        JFileChooser chooser = new JFileChooser();
        chooser.setFileFilter(new FileFilter() {
            @Override
            public boolean accept(File f) {
                if(f.isDirectory()){
                    return true;
                } else{
                    return f.getName().toLowerCase().endsWith(".jpg");}
            }
            @Override
            public String getDescription() {
                return "Image File (*.jpg)";
            }
        } );
        Component parentForm;
        if (chooser.showOpenDialog(this.parentForm) == JFileChooser.CANCEL_OPTION){
            return;
        }
        File file = chooser.getSelectedFile();
        try {
            ImageIcon icon = new ImageIcon(file.getPath());
            Image img = imagehelper.resize(icon.getImage(), 100, 120);
            ImageIcon resizedIcon = new ImageIcon(img);
            lblImage.setIcon(resizedIcon);
            personalImage = imagehelper.toByteArray(img, "jpg");

        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showMessageDialog(this.parentForm,e.getMessage(),"loi");
        }

    }//GEN-LAST:event_lblbrowseActionPerformed

    private void txttMaloaimon1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttMaloaimon1ActionPerformed
        String []arr = {"Cafe","Nước Ngot","Sinh Tố"};

    }//GEN-LAST:event_txttMaloaimon1ActionPerformed

    private void txtTenMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTenMonActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_txtTenMonActionPerformed

    private void BtnthemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnthemActionPerformed
        // TODO add your handling code here:

        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMaMon, sb, "Mã món không được để trống");
        DataValidator.validateEmpty(txtTenMon, sb, "Tên mónkhông được để trống");
        DataValidator.validateEmpty(txtDonGia, sb, "Đơn giá không được để trống");

        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try {

            MeNu mn = new MeNu();
            mn.setMaMon(txtMaMon.getText());
            mn.setTenMon(txtTenMon.getText());
            mn.setDonGia(txtDonGia.getText());
            mn.setMaLoaiMon((String) txttMaloaimon1.getSelectedItem());
            mn.setHinh(personalImage);

            menuDao dao = new menuDao();
            if(dao.insert(mn)){
                MessageDialogHelper.showMessageDialog(parentForm, "món đã được lưu","thông báo");
                LoadData();

            }else{
                MessageDialogHelper.showConfirmDialog(parentForm,"món không được lưu do lỗi", "cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,
                e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_BtnthemActionPerformed

    private void btnsuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsuaActionPerformed
        // TODO add your handling code here:

        StringBuilder sb = new StringBuilder();

        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        try {

            MeNu mn = new MeNu();
            mn.setMaMon(txtMaMon.getText());
            mn.setTenMon(txtTenMon.getText());
            mn.setDonGia(txtDonGia.getText());

            mn.setMaLoaiMon((String) txttMaloaimon1.getSelectedItem());
            mn.setHinh(personalImage);
            menuDao dao = new menuDao();
            if(dao.update(mn)){
                MessageDialogHelper.showMessageDialog(parentForm, "Menu đã được cập nhật","thông báo");
                LoadData();

            }else{
                MessageDialogHelper.showConfirmDialog(parentForm,"Menu không được cập nhật do lỗi", "cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,
                e.getMessage(), "Lỗi");

        }
    }//GEN-LAST:event_btnsuaActionPerformed

    private void btnxoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnxoaActionPerformed

        StringBuilder sb = new StringBuilder();
        DataValidator.validateEmpty(txtMaMon, sb, "Mã món không được để trống");
        if(sb.length()>0){
            MessageDialogHelper.showErrorDialog(parentForm, sb.toString(), "Lỗi");
            return;
        }
        if(MessageDialogHelper.showConfirmDialog(parentForm,
            "Bạn có muốn xóa món không ", "Hỏi")==JOptionPane.NO_OPTION){
        return;
        }
        try {
            menuDao dao = new menuDao();
            if(dao.delete(txtMaMon.getText())){
                MessageDialogHelper.showMessageDialog(parentForm, "món đã được xóa","thông báo");
                LoadData();

            }else{
                MessageDialogHelper.showConfirmDialog(parentForm,"món không được xóa do lỗi", "cảnh báo");
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,
                e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_btnxoaActionPerformed

    private void txtDonGiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDonGiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDonGiaActionPerformed

    private void menuTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menuTableMouseClicked
        try {
            int row = menuTable.getSelectedRow();

            if(row >= 0){
                String id = (String) menuTable.getValueAt(row, 0);
                menuDao dao = new menuDao();
                MeNu mn = dao.findbyId(id);
                if(mn != null){
                    txtMaMon.setText(mn.getMaMon());
                    txtTenMon.setText(mn.getTenMon());
                    // txtMaLoaiMon.setText(mn.getMaLoaiMon());
                    txttMaloaimon1.setSelectedItem(mn.getMaLoaiMon());
                    txtDonGia.setText(mn.getDonGia());
                    if(mn.getHinh() != null){
                        Image img = imagehelper.createImageFromByteArray(mn.getHinh(), "jpg");
                        lblImage.setIcon(new ImageIcon(img));
                        personalImage = mn.getHinh();
                    }else{
                        personalImage = mn.getHinh();
                        ImageIcon icon = new ImageIcon(getClass().getResource("/IMG/Full Image_96px.png"));
                        lblImage.setIcon(icon);

                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            MessageDialogHelper.showErrorDialog(parentForm,
                e.getMessage(), "Lỗi");
        }
    }//GEN-LAST:event_menuTableMouseClicked

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Btnthem;
    private javax.swing.JButton btnsua;
    private javax.swing.JButton btnxoa;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JButton lblbrowse;
    private javax.swing.JTable menuTable;
    private javax.swing.JTextField txtDonGia;
    private javax.swing.JTextField txtMaMon;
    private javax.swing.JTextField txtTenMon;
    private javax.swing.JComboBox<String> txttMaloaimon1;
    // End of variables declaration//GEN-END:variables
}
