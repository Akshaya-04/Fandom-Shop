/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * minions.java
 *
 * Created on 19 Apr, 2017, 7:53:17 AM
 */

package frames;

import javax.swing.JOptionPane;

/**
 *
 * @author mridulamadhur
 */
public class minions extends javax.swing.JFrame {

    /** Creates new form minions */
    public minions() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        n3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        n5 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        n2 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        n4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        c5 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        cb3 = new javax.swing.JComboBox();
        cb5 = new javax.swing.JComboBox();
        cb1 = new javax.swing.JComboBox();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/mi1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel3.setText("Quantity");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, -1, -1));
        getContentPane().add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 230, 30, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/mn2.jpg"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/mn3.jpg"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, -1, 180));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel7.setText("Price: Rs 449");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 30, -1));

        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, -1, -1));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel9.setText("Quantity");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 480, -1, -1));
        getContentPane().add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 30, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/mn4.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, -1, -1));

        jLabel12.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel12.setText("Quantity");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));
        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, 30, -1));

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/mn5.jpg"))); // NOI18N
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 270, -1, 170));

        jLabel15.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel15.setText("Quantity");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 480, -1, -1));
        getContentPane().add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, 30, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 390, -1, -1));

        c5.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        c5.setText("Minion Bag");
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 450, -1, -1));

        c1.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        c1.setText("Minion t-Shirt");
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, -1, -1));

        c2.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        c2.setText("Minions t-Shirt");
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 200, -1, -1));

        c3.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        c3.setText("Despicable me t-Shirt");
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 200, -1, -1));

        c4.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        c4.setText("one_in_a_minion t-Shirt");
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, -1, -1));

        cb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, -1, -1));

        cb5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, -1, -1));

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 230, -1, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("ADD TO CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, -1, -1));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel8.setText("Quantity");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel11.setText("Price: Rs 249");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel14.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel14.setText("Price: Rs 299");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jLabel16.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel16.setText("Price: Rs 299");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel17.setFont(new java.awt.Font("Times New Roman", 0, 11)); // NOI18N
        jLabel17.setText("Price: Rs 449");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 480, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
  movies n=new movies();
  n.setVisible(true);
  dispose();
  // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new minions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JComboBox cb1;
    private javax.swing.JComboBox cb2;
    private javax.swing.JComboBox cb3;
    private javax.swing.JComboBox cb5;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField n1;
    private javax.swing.JTextField n2;
    private javax.swing.JTextField n3;
    private javax.swing.JTextField n4;
    private javax.swing.JTextField n5;
    // End of variables declaration//GEN-END:variables

}