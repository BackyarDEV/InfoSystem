/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infosystem;
import com.sun.glass.events.KeyEvent;
import java.awt.HeadlessException;
import java.sql.*;
import javax.swing.*;

/**
 *
 * @author MayankMS
 */
public class MainWindow extends javax.swing.JFrame {
    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    Statement st;
    
    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
        conn=db_conn.java_db();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        ext = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        loginLBL = new javax.swing.JLabel();
        TF_USER = new javax.swing.JTextField();
        PW = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Training Management System");
        setLocation(new java.awt.Point(0, 0));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(32, 45, 65));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(0, 100, 128));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        ext.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ext.setForeground(new java.awt.Color(255, 255, 255));
        ext.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ext.setText("Exit");
        ext.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ext, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ext, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
        );

        jPanel3.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 440, 80, 30));

        jPanel1.setBackground(new java.awt.Color(0, 100, 128));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));

        loginLBL.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        loginLBL.setForeground(new java.awt.Color(255, 255, 255));
        loginLBL.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        loginLBL.setText("Login");
        loginLBL.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        loginLBL.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                loginLBLMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(loginLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 440, 80, 30));

        TF_USER.setBackground(new java.awt.Color(32, 45, 65));
        TF_USER.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        TF_USER.setForeground(new java.awt.Color(255, 255, 255));
        TF_USER.setBorder(null);
        jPanel3.add(TF_USER, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 280, 190, 20));

        PW.setBackground(new java.awt.Color(32, 45, 65));
        PW.setForeground(new java.awt.Color(255, 255, 255));
        PW.setBorder(null);
        PW.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                PWKeyPressed(evt);
            }
        });
        jPanel3.add(PW, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 190, 20));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PASSWORD");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 330, 140, 20));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("USER NAME");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 250, 140, 20));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 380, 190, 10));
        jPanel3.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 300, 190, 10));

        jPanel4.setBackground(new java.awt.Color(0, 100, 128));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("AND INFORMATION TECHNOLOGY");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 590, 40));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("NATIONAL INSTITUTE OF ELECTRICAL");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 590, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("PATNA");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, 590, 30));

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 90, 590, 500));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/infosystem/NIELIT-Logo.png"))); // NOI18N
        jPanel7.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 90));

        jLabel1.setFont(new java.awt.Font("Century Gothic", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("TRAINING MANAGEMENT SYSTEM");
        jPanel7.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 30, 590, -1));

        jPanel3.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 90));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 560));

        setBounds(0, 0, 920, 589);
    }// </editor-fold>//GEN-END:initComponents

    private void loginLBLMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_loginLBLMouseClicked
        // TODO add your handling code here:
     try{
            String Sql="select * from admins where username=? and password=?";
            pst=conn.prepareStatement(Sql);
            pst.setString(1, TF_USER.getText());
            pst.setString(2, PW.getText());
            rs=pst.executeQuery();
            if(rs.next()){
                 
                 WelcomeUser.head =("WELCOME "+TF_USER.getText().toUpperCase());
                WelcomeUser j = new WelcomeUser();
                       j.setLocationRelativeTo(null); 
                       j.setVisible(true);
                        this.dispose();
            }
            else{
                JOptionPane.showMessageDialog(null,"Invalid Username or Password","Action Deinied",JOptionPane.ERROR_MESSAGE);
                
            }
        }
         catch(HeadlessException | SQLException e){
          JOptionPane.showMessageDialog(null, e);  
        }
       finally {
            
            try{
                rs.close();
                pst.close();
                
            }
            catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);    
            }
        }
       
       
    }//GEN-LAST:event_loginLBLMouseClicked

    private void extMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extMouseClicked
        // TODO add your handling code here:
         int p = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit?","Exit",JOptionPane.YES_NO_OPTION);
        if(p==0){
         System.exit(0);
        }
    }//GEN-LAST:event_extMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       this.setLocationRelativeTo(null);
    }//GEN-LAST:event_formWindowOpened

    private void PWKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PWKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){

            try{
                String sql="select * from admins where username=? and password=?";
                pst=conn.prepareStatement(sql);
                pst.setString(1, TF_USER.getText());
                pst.setString(2, PW.getText());
                rs=pst.executeQuery();
                if(rs.next()){
                    WelcomeUser.head =("WELCOME "+TF_USER.getText().toUpperCase());
                    WelcomeUser j = new WelcomeUser();
                    j.setLocationRelativeTo(null);
                    j.setVisible(true);
                    this.dispose();
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid Username or Password","Action Deinied",JOptionPane.ERROR_MESSAGE);

                }
            }
            catch(Exception e){

            }
            finally {

                try{
                    rs.close();
                    pst.close();

                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
    }//GEN-LAST:event_PWKeyPressed

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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PW;
    private javax.swing.JTextField TF_USER;
    private javax.swing.JLabel ext;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel loginLBL;
    // End of variables declaration//GEN-END:variables
}