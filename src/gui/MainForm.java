/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.sql.Connection;
import java.awt.Color;
import javax.swing.ImageIcon;
import server.shareData;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.*;
import net.sf.jasperreports.view.*;
import com.microsoft.sqlserver.jdbc.SQLServerDriver;
import java.sql.DriverManager;

/**
 *
 * @author Hòa Bum
 */
public class MainForm extends javax.swing.JFrame {
     
    ImageIcon icon;
    private Menu menu;
    public MainForm() {
        
            
               
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

        tbpan = new javax.swing.JPanel();
        pnMenu = new javax.swing.JPanel();
        btnNhanVien = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnThongKe = new javax.swing.JButton();
        btnOrder = new javax.swing.JButton();
        btnDsCho = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        tabMain = new javax.swing.JTabbedPane();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        btMenu = new rsbuttom.RSButtonMetro();
        jButton1 = new javax.swing.JButton();
        txtTk = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtchuvu = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setResizable(false);
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        tbpan.setBackground(new java.awt.Color(255, 255, 255));
        tbpan.setForeground(new java.awt.Color(255, 255, 255));
        tbpan.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tbpanAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });

        pnMenu.setBackground(new java.awt.Color(204, 255, 255));
        pnMenu.setForeground(new java.awt.Color(255, 255, 255));

        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnNhanVien.setForeground(new java.awt.Color(255, 255, 255));
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Person-Male-Light-icon-48.png"))); // NOI18N
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnNhanVienMouseExited(evt);
            }
        });
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnMenu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnMenu.setForeground(new java.awt.Color(255, 255, 255));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Top Menu_48px.png"))); // NOI18N
        btnMenu.setText("Menu");
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMenuMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMenuMouseExited(evt);
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnThongKe.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnThongKe.setForeground(new java.awt.Color(255, 255, 255));
        btnThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Report Card_48px.png"))); // NOI18N
        btnThongKe.setText("Thống Kê");
        btnThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnThongKeMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnThongKeMouseExited(evt);
            }
        });
        btnThongKe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThongKeActionPerformed(evt);
            }
        });

        btnOrder.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnOrder.setForeground(new java.awt.Color(255, 255, 255));
        btnOrder.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/Shopping Basket_48px.png"))); // NOI18N
        btnOrder.setText("Order");
        btnOrder.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnOrderMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnOrderMouseExited(evt);
            }
        });
        btnOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderActionPerformed(evt);
            }
        });

        btnDsCho.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnDsCho.setForeground(new java.awt.Color(255, 255, 255));
        btnDsCho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/logout-icon-48.png"))); // NOI18N
        btnDsCho.setText("Đăng Xuât"); // NOI18N
        btnDsCho.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDsChoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDsChoMouseExited(evt);
            }
        });
        btnDsCho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDsChoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnMenuLayout = new javax.swing.GroupLayout(pnMenu);
        pnMenu.setLayout(pnMenuLayout);
        pnMenuLayout.setHorizontalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(pnMenuLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnDsCho, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnThongKe, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnOrder, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnMenuLayout.setVerticalGroup(
            pnMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnMenuLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(173, 173, 173)
                .addComponent(btnDsCho)
                .addGap(64, 64, 64)
                .addComponent(btnOrder)
                .addGap(64, 64, 64)
                .addComponent(btnThongKe)
                .addGap(64, 64, 64)
                .addComponent(btnMenu)
                .addGap(64, 64, 64)
                .addComponent(btnNhanVien)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabMain.setBackground(new java.awt.Color(204, 204, 204));
        tabMain.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                tabMainAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        tabMain.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                tabMainStateChanged(evt);
            }
        });

        kGradientPanel1.setkEndColor(new java.awt.Color(255, 153, 255));
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 255, 255));

        btMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IMG/icons8-menu-64.png"))); // NOI18N
        btMenu.setColorHover(new java.awt.Color(204, 255, 255));
        btMenu.setColorNormal(new java.awt.Color(204, 255, 255));
        btMenu.setColorPressed(new java.awt.Color(255, 255, 255));
        btMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btMenuActionPerformed(evt);
            }
        });

        jButton1.setText("Tài Khoản");

        txtTk.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jButton2.setText("Chức Vụ");

        txtchuvu.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Edwardian Script ITC", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hello, Welcome to Cafe Funky");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addComponent(btMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(271, 271, 271)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(34, 34, 34)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTk, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtchuvu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTk, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(0, 3, Short.MAX_VALUE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtchuvu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(btMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout tbpanLayout = new javax.swing.GroupLayout(tbpan);
        tbpan.setLayout(tbpanLayout);
        tbpanLayout.setHorizontalGroup(
            tbpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tbpanLayout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(tbpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(tbpanLayout.createSequentialGroup()
                        .addComponent(pnMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 1431, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        tbpanLayout.setVerticalGroup(
            tbpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tbpanLayout.createSequentialGroup()
                .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(tbpanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tbpanLayout.createSequentialGroup()
                        .addComponent(tabMain, javax.swing.GroupLayout.PREFERRED_SIZE, 897, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tbpan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(tbpan, javax.swing.GroupLayout.PREFERRED_SIZE, 889, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(5, 5, 5))
        );

        tbpan.getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        
                NhanVien nv = new NhanVien();
               nv.setLocationRelativeTo(null);
               nv.setTitle("Quản Lí Nhân Viên");
               nv.setVisible(true);
             

    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnNhanVienMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseEntered
        // TODO add your handling code here:
        btnNhanVien.setBackground(Color.green); //[255,255,255]
        btnNhanVien.setOpaque(true);
        
    }//GEN-LAST:event_btnNhanVienMouseEntered

    private void btnNhanVienMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseExited
        // TODO add your handling code here:
        btnNhanVien.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_btnNhanVienMouseExited

    private void btnMenuMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseEntered
        // TODO add your handling code here:
        btnMenu.setBackground(Color.green);
        btnMenu.setOpaque(true);
    }//GEN-LAST:event_btnMenuMouseEntered

    private void btnMenuMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseExited
        // TODO add your handling code here:
        btnMenu.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_btnMenuMouseExited

    private void btnThongKeMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseEntered
        // TODO add your handling code here:
        btnThongKe.setBackground(Color.green);
         btnThongKe.setOpaque(true);
    }//GEN-LAST:event_btnThongKeMouseEntered

    private void btnThongKeMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnThongKeMouseExited
        // TODO add your handling code here:
        btnThongKe.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_btnThongKeMouseExited

    private void btnOrderMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseEntered
        // TODO add your handling code here:
        btnOrder.setBackground(Color.green);
        btnOrder.setOpaque(true);
    }//GEN-LAST:event_btnOrderMouseEntered

    private void btnOrderMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderMouseExited
        // TODO add your handling code here:
        btnOrder.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_btnOrderMouseExited

    private void btnDsChoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDsChoMouseEntered
        // TODO add your handling code here:
        btnDsCho.setBackground(Color.green);
        btnDsCho.setOpaque(true);
    }//GEN-LAST:event_btnDsChoMouseEntered

    private void btnDsChoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDsChoMouseExited
        // TODO add your handling code here:
        btnDsCho.setBackground(new Color(51,153,255));
    }//GEN-LAST:event_btnDsChoMouseExited

    private void loginSuccessful(){
        txtTk.setText(shareData.nguoiDangNhap.getTenDangNhap());
        txtchuvu.setText(shareData.nguoiDangNhap.getVaitro());
        if(shareData.nguoiDangNhap.getVaitro().equals("admin"))
        {
            btnNhanVien.setEnabled(true);
            btnThongKe.setEnabled(true );
        }
        else if(shareData.nguoiDangNhap.getVaitro().equals("NhanVien"))
        {
           btnNhanVien.setEnabled(false);
            btnThongKe.setEnabled(false );
        }
       
    }
    private void btMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btMenuActionPerformed
        // TODO add your handling code here:
        int posicion = this.pnMenu.getX();
        if(posicion >-1){
            Animacion.Animacion.mover_izquierda(0, -200, 2, 2, pnMenu);
           
        }
        else{
            Animacion.Animacion.mover_derecha(-200, 0, 2, 2, pnMenu);
        }
        loginSuccessful();
    }//GEN-LAST:event_btMenuActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
       
        Menu mn = new Menu();
        mn.setTitle("Quản Lí Menu");
        mn.setLocationRelativeTo(null);
        

            mn.setVisible(true);
     
        
        
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnThongKeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThongKeActionPerformed
        try {
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            String connectionUrl ="jdbc:sqlserver://localhost:1433;databaseName=BTL_QLCF";
            String dbusername = "sa";
            String password ="123";
            Connection conn = (Connection) DriverManager.getConnection(connectionUrl,dbusername,password);
            JasperReport report=JasperCompileManager.compileReport("C:\\Users\\Hoa Bum\\Documents\\NetBeansProjects\\Demo_Java_swing\\src\\gui\\XuatThongKe.jrxml");
            
            JasperPrint jp = JasperFillManager.fillReport(report, null,conn);
            JasperViewer.viewReport(jp,false);
           
        } catch (Exception e) {
            e.printStackTrace();
        }
       
    }//GEN-LAST:event_btnThongKeActionPerformed

    private void tabMainAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tabMainAncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_tabMainAncestorAdded

    private void tabMainStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_tabMainStateChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_tabMainStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        SignUp login = new SignUp();
        login.setVisible(true);
         

        
    }//GEN-LAST:event_formWindowOpened

    private void tbpanAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_tbpanAncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_tbpanAncestorAdded

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        // TODO add your handling code here:
          loginSuccessful();
    }//GEN-LAST:event_formMouseClicked

    private void btnOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderActionPerformed
        Oder oder = new Oder();
        oder.setTitle("Order");
        oder.setVisible(true);
        
    }//GEN-LAST:event_btnOrderActionPerformed

    private void btnDsChoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDsChoActionPerformed
        SignUp login = new SignUp();
        login.setLocationRelativeTo(null);
        login.setVisible(true);
    }//GEN-LAST:event_btnDsChoActionPerformed

    private void btnNhanVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnNhanVienMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnNhanVienMouseClicked

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
                MainForm mainform = new MainForm();
               mainform.setLocationRelativeTo(null);
               mainform.setTitle("Quán cafe funky");
               mainform.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private rsbuttom.RSButtonMetro btMenu;
    private javax.swing.JButton btnDsCho;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnOrder;
    private javax.swing.JButton btnThongKe;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JPanel pnMenu;
    private javax.swing.JTabbedPane tabMain;
    private javax.swing.JPanel tbpan;
    private javax.swing.JLabel txtTk;
    private javax.swing.JLabel txtchuvu;
    // End of variables declaration//GEN-END:variables

   
}