/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * percy.java
 *
 * Created on 17 Apr, 2017, 3:49:09 PM
 */

package frames;

import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author mridulamadhur
 */
public class percy extends javax.swing.JFrame {

    /** Creates new form percy */
    public percy() {
        initComponents();
    }
 public void method1(String fandom,String h,int q,String g,String size,int price,int tot)
    { int f=0;
      try{
   Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","candy123");
Statement stmt=conn.createStatement();
 String qwe="select item,size from cart ;";
 ResultSet rs=stmt.executeQuery(qwe);
 while(rs.next()){
 String hey=rs.getString("item");
 String siz=rs.getString("size");
if((g.equals(hey))&&(size.equals(siz)))
f++;}}
 catch(Exception e)
 {}
      if(f!=0)
          {try
 {
Connection cw=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","candy123");
Statement set=cw.createStatement();
        String qw="update cart set quantity=quantity+"+q+" where item_no=\""+h+"\";";
         String qwer="update cart set total=rate*quantity;";
        set.executeUpdate(qw);
        set.executeUpdate(qwer);
 JOptionPane.showMessageDialog(null,"Quantity sucessfully changed");
 }
catch(Exception e){JOptionPane.showMessageDialog(null, "Technical Errors");}
}
else{
     try
 {
 Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","candy123");
Statement stm=con.createStatement();
 String qwe="select * from products where product_code=\""+h+"\";";
 ResultSet rd=stm.executeQuery(qwe);
 while(rd.next()){
 fandom=rd.getString("fandoms");
price=rd.getInt("price");
 h=rd.getString("product_Code");
 tot=price*q;}
 }
catch(Exception e){JOptionPane.showMessageDialog(null,"error in connectivity");}
try{
    Connection cone=DriverManager.getConnection("jdbc:mysql://localhost:3306/ipproject","root","candy123");
  Statement stamt=cone.createStatement();
String qwer="insert into cart values(\""+fandom+"\",\""+h+"\",\""+g+"\","+q+",\""+size+"\","+price+","+tot+");";
stamt.executeUpdate(qwer);
JOptionPane.showMessageDialog(null, "Your Item has been Successfully Added to Your Cart.");
}
catch(Exception e)
{JOptionPane.showMessageDialog(null,"Error in connectivity");}}}







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
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        n2 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        n3 = new javax.swing.JTextField();
        c2 = new javax.swing.JCheckBox();
        c3 = new javax.swing.JCheckBox();
        c1 = new javax.swing.JCheckBox();
        c5 = new javax.swing.JCheckBox();
        c4 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        cb5 = new javax.swing.JComboBox();
        n5 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        n1 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        n4 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        cb4 = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/pj1.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 20, -1, 160));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/pj2.jpg"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 20, -1, 160));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/pj3.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/pj4.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 280, -1, -1));

        jLabel9.setFont(new java.awt.Font("Windlass", 0, 12)); // NOI18N
        jLabel9.setText("quantity");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, -1, -1));
        getContentPane().add(n2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, 40, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/pj5.jpg"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 160));

        jLabel12.setFont(new java.awt.Font("Windlass", 0, 12)); // NOI18N
        jLabel12.setText("quantity");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, -1, -1));
        getContentPane().add(n3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 230, 30, 20));

        c2.setFont(new java.awt.Font("Windlass", 1, 14)); // NOI18N
        c2.setText("camp half-blood mug");
        getContentPane().add(c2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, -1, -1));

        c3.setFont(new java.awt.Font("Windlass", 1, 14)); // NOI18N
        c3.setText("demigods in training mug");
        getContentPane().add(c3, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 200, -1, -1));

        c1.setFont(new java.awt.Font("Windlass", 1, 14)); // NOI18N
        c1.setText("pegasus mug ");
        getContentPane().add(c1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        c5.setFont(new java.awt.Font("Windlass", 1, 14)); // NOI18N
        c5.setText("camp half-blood t-shirt");
        getContentPane().add(c5, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 440, -1, -1));

        c4.setFont(new java.awt.Font("Windlass", 1, 14)); // NOI18N
        c4.setText("spqr t-shirt");
        getContentPane().add(c4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 450, -1, -1));

        jButton1.setFont(new java.awt.Font("Windlass", 0, 18)); // NOI18N
        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 410, -1, 40));

        jLabel13.setFont(new java.awt.Font("Windlass", 0, 12)); // NOI18N
        jLabel13.setText("quantity");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, -1, -1));

        cb5.setFont(new java.awt.Font("Windlass", 0, 12)); // NOI18N
        cb5.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        getContentPane().add(cb5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 470, 60, 20));
        getContentPane().add(n5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, 40, -1));

        jLabel14.setFont(new java.awt.Font("Windlass", 0, 12)); // NOI18N
        jLabel14.setText("quantity");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, -1, -1));
        getContentPane().add(n1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 230, 40, -1));

        jLabel11.setFont(new java.awt.Font("Windlass", 0, 12)); // NOI18N
        jLabel11.setText("quantity");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, -1));
        getContentPane().add(n4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 40, -1));

        jButton2.setFont(new java.awt.Font("Windlass", 0, 18)); // NOI18N
        jButton2.setText("add to cart");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 330, -1, 40));

        cb4.setFont(new java.awt.Font("Windlass", 0, 12)); // NOI18N
        cb4.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));
        cb4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb4ActionPerformed(evt);
            }
        });
        getContentPane().add(cb4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 480, 60, 20));

        jLabel2.setText("Price:Rs 299");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, -1, -1));

        jLabel4.setText("Price:Rs 299");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 260, -1, -1));

        jLabel6.setText("Price:Rs 299");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, -1, -1));

        jLabel8.setText("Price:Rs 299");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 500, -1, -1));

        jLabel15.setText("Price:Rs 299");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 books n= new books();
        n.setVisible(true);
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if((c1.isSelected()==false)&&(c2.isSelected()==false)&&(c3.isSelected()==false)&&(c4.isSelected()==false)&&(c5.isSelected()==false))
{JOptionPane.showMessageDialog(null, "PLEASE SELECT ALTEAST 1 ITEM");}


 if(c1.isSelected()==true)
{String z=n1.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size="null"  ;
   String itnam=c1.getText();
   int tot=0,price=0;
   String fandom = null,procod = "PJ211";
  method1(fandom,procod,a,itnam,size,price,tot);}}




if(c2.isSelected()==true)
{String z=n2.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size="null"  ;
   String itnam=c2.getText();
   int tot=0,price=0;
   String fandom = null,procod = "PJ212";
  method1(fandom,procod,a,itnam,size,price,tot);}}



if(c3.isSelected()==true)
{String z=n3.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size="null" ;
   String itnam=c3.getText();
   int tot=0,price=0;
   String fandom = null,procod = "PJ213";
  method1(fandom,procod,a,itnam,size,price,tot);}}




   if(c4.isSelected()==true)
{String z=n4.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String)cb4.getSelectedItem()  ;
   String itnam=c4.getText();
   int tot=0,price=0;
   String fandom = null,procod = "PJ221";
  method1(fandom,procod,a,itnam,size,price,tot);}}



   if(c5.isSelected()==true)
{String z=n5.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String)cb5.getSelectedItem();
   String itnam=c5.getText();
   int tot=0,price=0;
   String fandom = null,procod = "PJ222";
  method1(fandom,procod,a,itnam,size,price,tot);}}


NewJFrame n=new NewJFrame();
n.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void cb4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cb4ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new percy().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox c1;
    private javax.swing.JCheckBox c2;
    private javax.swing.JCheckBox c3;
    private javax.swing.JCheckBox c4;
    private javax.swing.JCheckBox c5;
    private javax.swing.JComboBox cb4;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
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