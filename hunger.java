/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * hunger.java
 *
 * Created on 17 Aug, 2017, 12:15:09 AM
 */

package frames;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author MockingJay
 */
public class hunger extends javax.swing.JFrame {

    /** Creates new form hunger */
    public hunger() {
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
        c1 = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        q5 = new javax.swing.JTextField();
        cb3 = new javax.swing.JComboBox();
        jLabel3 = new javax.swing.JLabel();
        c2 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        q2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        c3 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        q3 = new javax.swing.JTextField();
        cb2 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        c4 = new javax.swing.JCheckBox();
        jLabel8 = new javax.swing.JLabel();
        q1 = new javax.swing.JTextField();
        cb1 = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        c5 = new javax.swing.JCheckBox();
        jLabel10 = new javax.swing.JLabel();
        q4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hg1.jpg"))); // NOI18N

        c1.setFont(new java.awt.Font("Hunger Games", 0, 18)); // NOI18N
        c1.setText("CINNA T-SHIRT");
        c1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                c1ActionPerformed(evt);
            }
        });

        jLabel2.setText("QUANTITY");

        cb3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hg2.jpg"))); // NOI18N

        c2.setFont(new java.awt.Font("Hunger Games", 0, 18)); // NOI18N
        c2.setText("SALUTE SHIRT");

        jLabel4.setText("QUANTITY");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hg3.jpg"))); // NOI18N

        c3.setFont(new java.awt.Font("Hunger Games", 0, 18)); // NOI18N
        c3.setText("HG TRAINING SUIT");

        jLabel6.setText("QUANTITY");

        cb2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hg4.jpg"))); // NOI18N

        c4.setFont(new java.awt.Font("Hunger Games", 0, 18)); // NOI18N
        c4.setText("MOCKINGJAY PIN");

        jLabel8.setText("QUANTITY");

        cb1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "XS", "S", "M", "L", "XL", "XXL" }));

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/fandom/hg5.jpg"))); // NOI18N

        c5.setFont(new java.awt.Font("Hunger Games", 0, 18)); // NOI18N
        c5.setText("HUNGER GAMES MUG");

        jLabel10.setText("QUANTITY");

        jButton1.setFont(new java.awt.Font("Hunger Games", 0, 24)); // NOI18N
        jButton1.setText("BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel11.setText("PRICE :Rs 299");

        jLabel12.setText("PRICE :Rs 399");

        jLabel13.setText("PRICE :Rs 249");

        jLabel14.setText("PRICE :Rs 249");

        jLabel15.setText("PRICE :Rs 99");

        jButton2.setFont(new java.awt.Font("Hunger Games", 0, 24)); // NOI18N
        jButton2.setText("ADD TO CART");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1)
                            .addGap(70, 70, 70)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(c1)
                            .addGap(81, 81, 81)
                            .addComponent(c2)
                            .addGap(79, 79, 79)
                            .addComponent(c3))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(9, 9, 9)
                            .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(98, 98, 98)
                            .addComponent(jLabel4)
                            .addGap(9, 9, 9)
                            .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10)
                            .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(108, 108, 108)
                            .addComponent(jLabel6)
                            .addGap(9, 9, 9)
                            .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(20, 20, 20)
                            .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel12)
                                .addComponent(jLabel7))
                            .addGap(70, 70, 70)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel9))
                            .addGap(60, 60, 60)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel14)
                                .addComponent(jButton2)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(40, 40, 40)
                                    .addComponent(jButton1))))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(c4)
                            .addGap(59, 59, 59)
                            .addComponent(c5))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel10)
                            .addGap(9, 9, 9)
                            .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(170, 170, 170)
                            .addComponent(jLabel8)
                            .addGap(19, 19, 19)
                            .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(221, 221, 221)
                            .addComponent(jLabel11)))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 624, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel1))
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c1)
                        .addComponent(c2)
                        .addComponent(c3))
                    .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(q1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4)
                        .addComponent(q2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6)
                        .addComponent(q3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cb3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(6, 6, 6)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel13)
                            .addGap(16, 16, 16)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(jLabel14)
                            .addGap(69, 69, 69)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(37, 37, 37)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(c4)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addComponent(c5)))
                    .addGap(3, 3, 3)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel10)
                        .addComponent(q4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8)
                        .addComponent(q5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel15)
                        .addComponent(jLabel11))
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void c1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_c1ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_c1ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
books n= new books();
        n.setVisible(true);
        dispose();
        // TODO add your handling code here:
}//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if((c1.isSelected()==false)&&(c2.isSelected()==false)&&(c3.isSelected()==false)&&(c4.isSelected()==false)&&(c5.isSelected()==false))
{JOptionPane.showMessageDialog(null, "PLEASE SELECT ALTEAST 1 ITEM");}


 if(c1.isSelected()==true)
{String z=q1.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String) cb1.getSelectedItem()  ;
   String itnam=c1.getText();
   int tot=0,price=0;
   String fandom = null,procod = "HG111";
  method1(fandom,procod,a,itnam,size,price,tot);}}




if(c2.isSelected()==true)
{String z=q2.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String) cb2.getSelectedItem()  ;
   String itnam=c2.getText();
   int tot=0,price=0;
   String fandom = null,procod = "HG112";
  method1(fandom,procod,a,itnam,size,price,tot);}}



if(c3.isSelected()==true)
{String z=q3.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size=(String)cb3.getSelectedItem()  ;
   String itnam=c3.getText();
   int tot=0,price=0;
   String fandom = null,procod = "HG113";
  method1(fandom,procod,a,itnam,size,price,tot);}}




   if(c4.isSelected()==true)
{String z=q4.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size="null"  ;
   String itnam=c4.getText();
   int tot=0,price=0;
   String fandom = null,procod = "HG121";
  method1(fandom,procod,a,itnam,size,price,tot);}}



   if(c5.isSelected()==true)
{String z=q5.getText();
 if(z.equals(""))
 {JOptionPane.showMessageDialog(null, "Please enter the Quantity.");
 }
 else{
 int a=Integer.parseInt(z);
  String size="null";
   String itnam=c5.getText();
   int tot=0,price=0;
   String fandom = null,procod = "HG131";
  method1(fandom,procod,a,itnam,size,price,tot);}}


NewJFrame n=new NewJFrame();
n.setVisible(true);

}//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new hunger().setVisible(true);
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
    private javax.swing.JTextField q1;
    private javax.swing.JTextField q2;
    private javax.swing.JTextField q3;
    private javax.swing.JTextField q4;
    private javax.swing.JTextField q5;
    // End of variables declaration//GEN-END:variables

}
