/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Akshaya Gangurde
 */
public class admindash extends javax.swing.JFrame {

    /**
     * Creates new form admindash
     */
    public admindash() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        code = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        fan = new javax.swing.JTextField();
        pro = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        qty = new javax.swing.JTextField();
        pri = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        l = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ADMIN PANEL");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 260, 30));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Enter product type:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));
        getContentPane().add(code, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 200, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Enter the product code: ");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, 20));
        getContentPane().add(fan, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 100, 260, -1));
        getContentPane().add(pro, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 140, 230, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Enter quantity: ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Enter price: ");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 20));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Enter Fandom:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, -1, -1));
        getContentPane().add(qty, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 260, -1));
        getContentPane().add(pri, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 290, -1));

        jButton1.setText("Delete Item");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 320, -1, -1));

        jButton2.setText("Add Item");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        jButton3.setText("Change Price");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 320, -1, -1));

        jButton4.setText("Change Quantity");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 320, -1, -1));

        l.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/aa.jpg"))); // NOI18N
        getContentPane().add(l, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 550, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
try
 {
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","candy123");
 Statement stm=con.createStatement();
 String fandom=fan.getText();
 String protype=pro.getText();
 String quan=qty.getText();
 int quantity=Integer.parseInt(quan);
 String pric=pri.getText();
 int price=Integer.parseInt(pric);
 String productcode=code.getText();
 String qwe="insert into products values(\""+fandom+"\",\""+protype+"\",\""+quantity+"\","+price+",\""+productcode+"\");";
 stm.executeUpdate(qwe);
 JOptionPane.showMessageDialog(null,"New Item successfully added!");

 }
catch(Exception e){JOptionPane.showMessageDialog(null,"error in connectivity");}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     try
 {
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","candy123");
 Statement stm=con.createStatement();
 
 String pric=pri.getText();
 int price=Integer.parseInt(pric);
 String productcode=code.getText();
 String qwe="update products set price=\""+price+"\"where product_code=\""+productcode+"\";";
 stm.executeUpdate(qwe);
 JOptionPane.showMessageDialog(null,"Price changed successfully");

 }
catch(Exception e){JOptionPane.showMessageDialog(null,"error in connectivity");}
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
     try
 {
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","candy123");
 Statement stm=con.createStatement();
 String quan=qty.getText();
 int quantity=Integer.parseInt(quan);
 String productcode=code.getText();
 String qwe="update products set quantity=\""+quantity+"\"where product_code=\""+productcode+"\";";
 stm.executeUpdate(qwe);
 JOptionPane.showMessageDialog(null,"Quantity changed successfully");

 }
catch(Exception e){JOptionPane.showMessageDialog(null,"error in connectivity");}    // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     try
 {
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","candy123");
 Statement stm=con.createStatement();
 
 String productcode=code.getText();
 String qwe="delete from products where product_code=\""+productcode+"\";";
 stm.executeUpdate(qwe);
 JOptionPane.showMessageDialog(null,"Product deleted successfully");

 }
catch(Exception e){JOptionPane.showMessageDialog(null,"error in connectivity");}    // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(admindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admindash.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admindash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField code;
    private javax.swing.JTextField fan;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel l;
    private javax.swing.JTextField pri;
    private javax.swing.JTextField pro;
    private javax.swing.JTextField qty;
    // End of variables declaration//GEN-END:variables
}
