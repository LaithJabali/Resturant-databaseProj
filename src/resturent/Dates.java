/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturent;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Admin
 */
public class Dates extends javax.swing.JFrame {

     Connection co;
            Statement st;
    /**
     * Creates new form Dates
     */
    public Dates() {
        initComponents();
        this.setSize(810,698);
        this.setResizable(false);
        
       /* NameSearch.setBackground(new Color(0,0,0,64));
        
        newDate.setBackground(new Color(0,0,0,64));
        newPhone.setBackground(new Color(0,0,0,64));
        newTableNum.setBackground(new Color(0,0,0,64));*/
       showDate.setEditable(false);
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        showDate = new javax.swing.JTextArea();
        showAll = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NameSearch = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        newDate = new javax.swing.JTextField();
        edit1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        newTableNum = new javax.swing.JTextField();
        edit2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        newPhone = new javax.swing.JTextField();
        edit3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        back = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("الحجوزات");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(330, 13, 81, 22);

        showDate.setColumns(20);
        showDate.setRows(5);
        jScrollPane1.setViewportView(showDate);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 71, 379, 579);

        showAll.setBackground(new java.awt.Color(204, 0, 51));
        showAll.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        showAll.setForeground(new java.awt.Color(255, 255, 255));
        showAll.setText("عرض كل الحجوزات");
        showAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllActionPerformed(evt);
            }
        });
        getContentPane().add(showAll);
        showAll.setBounds(610, 71, 159, 34);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("البحث عن حجز (حسب الاسم) :");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(562, 136, 207, 17);

        NameSearch.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        NameSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameSearchActionPerformed(evt);
            }
        });
        getContentPane().add(NameSearch);
        NameSearch.setBounds(471, 171, 207, 25);

        search.setBackground(new java.awt.Color(204, 0, 51));
        search.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        search.setForeground(new java.awt.Color(255, 255, 255));
        search.setText("بحث");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search);
        search.setBounds(690, 171, 79, 25);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("تعديل موعد الحجز :");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(643, 238, 126, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel4.setText("الموعد الجديد");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(689, 277, 80, 16);

        newDate.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(newDate);
        newDate.setBounds(584, 273, 100, 25);

        edit1.setBackground(new java.awt.Color(204, 0, 51));
        edit1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        edit1.setForeground(new java.awt.Color(255, 255, 255));
        edit1.setText("تعديل");
        edit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit1ActionPerformed(evt);
            }
        });
        getContentPane().add(edit1);
        edit1.setBounds(441, 273, 67, 25);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 0, 0));
        jLabel5.setText("تعديل عدد الطاولات :");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(630, 340, 136, 17);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel7.setText("عدد الطاولات الجديد");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(650, 380, 118, 16);

        newTableNum.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(newTableNum);
        newTableNum.setBounds(530, 380, 90, 25);

        edit2.setBackground(new java.awt.Color(204, 0, 51));
        edit2.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        edit2.setForeground(new java.awt.Color(255, 255, 255));
        edit2.setText("تعديل");
        edit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit2ActionPerformed(evt);
            }
        });
        getContentPane().add(edit2);
        edit2.setBounds(440, 380, 67, 25);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(153, 0, 0));
        jLabel8.setText("تعديل رقم الهاتف :");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(649, 434, 120, 17);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel9.setText("رقم الهاتف الجديد");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(664, 473, 105, 16);

        newPhone.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        getContentPane().add(newPhone);
        newPhone.setBounds(526, 469, 126, 25);

        edit3.setBackground(new java.awt.Color(204, 0, 51));
        edit3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        edit3.setForeground(new java.awt.Color(255, 255, 255));
        edit3.setText("تعديل");
        edit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit3ActionPerformed(evt);
            }
        });
        getContentPane().add(edit3);
        edit3.setBounds(441, 469, 67, 25);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 0, 0));
        jLabel10.setText("حذف الحجز :");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(685, 539, 84, 17);

        delete.setBackground(new java.awt.Color(204, 0, 51));
        delete.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("حذف");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete);
        delete.setBounds(574, 536, 78, 25);
        getContentPane().add(jSeparator1);
        jSeparator1.setBounds(409, 507, 371, 10);
        getContentPane().add(jSeparator2);
        jSeparator2.setBounds(409, 209, 371, 10);

        back.setBackground(new java.awt.Color(204, 0, 51));
        back.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("رجوع");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(410, 605, 100, 40);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturent/index2.jpg"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(0, 0, 810, 670);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void showAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllActionPerformed
        // TODO add your handling code here:
        try{
            //  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            OracleDataSource oda = new OracleDataSource();
            String host="jdbc:oracle:thin:@localhost:1522:orcl";
            String name= "project";
            String pass="123456";
            oda.setURL(host);
            oda.setUser(name);
            oda.setPassword(pass);
              co=oda.getConnection();
             st=co.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE*/);
            ResultSet rt=st.executeQuery("Select * from reservation");
            this.showDate.setText("ID"+"          "+"Name"+"                       "+"Phone"+"           "+"Number of tabels"+"          "+"time"+"\n");
            this.showDate.append("-----------------------------------------------------------------------------------------"+"\n");
           while( rt.next()){
            int a= rt.getInt(1);
            String b= rt.getString(2);
            int c= rt.getInt(3);
            int d= rt.getInt(4);
            String e= rt.getString(5);
            this.showDate.append(a+"          "+b+"          "+c+"          "+d+"                                     "+e+"\n");
           }
            co.close();
           
        }catch(Exception aa){
            Logger.getLogger(Dates.class.getName()).log(Level.SEVERE,null,aa);
        }
    }//GEN-LAST:event_showAllActionPerformed

    private void NameSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameSearchActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        showDate.setText("");
        NameSearch.setText("");
        
        newDate.setText("");
        newPhone.setText("");
        newTableNum.setText("");
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
          try{
            //  DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            OracleDataSource oda = new OracleDataSource();
            String host="jdbc:oracle:thin:@localhost:1522:orcl";
            String name= "project";
            String pass="123456";
            oda.setURL(host);
            oda.setUser(name);
            oda.setPassword(pass);
              co=oda.getConnection();
             st=co.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE*/);
            ResultSet rt=st.executeQuery("Select * from reservation where PERSON_NAME='"+this.NameSearch.getText()+"'");
            this.showDate.setText("ID"+"          "+"Name"+"                       "+"Phone"+"           "+"Number of tabels"+"          "+"time"+"\n");
            this.showDate.append("-----------------------------------------------------------------------------------------"+"\n");
           while( rt.next()){
            int a= rt.getInt(1);
            String b= rt.getString(2);
            int c= rt.getInt(3);
            int d= rt.getInt(4);
            String e= rt.getString(5);
            this.showDate.append(a+"          "+b+"          "+c+"          "+d+"                                     "+e+"\n");
           }
            co.close();
           
        }catch(Exception aa){
            Logger.getLogger(Dates.class.getName()).log(Level.SEVERE,null,aa);
        }
    }//GEN-LAST:event_searchActionPerformed
     department1 dep = new department1();
    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        // TODO add your handling code here:
        try{
              DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String host="jdbc:oracle:thin:@localhost:1522:orcl";
            String name= "project";
            String pass="123456";
             co=DriverManager.getConnection(host, name, pass);
             st=co.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE*/);
            String SQL ="DELETE FROM reservation where PERSON_NAME='"+this.NameSearch.getText()+"'";
           st.executeUpdate(SQL);
           co.commit();
           co.close();
        }catch(SQLException aa){
            
        }
        
    }//GEN-LAST:event_deleteActionPerformed

    private void edit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit1ActionPerformed
        // TODO add your handling code here:
        try{
              DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String host="jdbc:oracle:thin:@localhost:1522:orcl";
            String name= "project";
            String pass="123456";
             co=DriverManager.getConnection(host, name, pass);
             st=co.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE*/);
            String SQL ="update reservation set RES_TIME = '"+this.newDate.getText()+"' where PERSON_NAME='"+this.NameSearch.getText()+"'";
           st.executeUpdate(SQL);
           co.commit();
           co.close();
        }catch(SQLException aa){
            
        }
    }//GEN-LAST:event_edit1ActionPerformed

    private void edit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit2ActionPerformed
        // TODO add your handling code here:
        try{
              DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String host="jdbc:oracle:thin:@localhost:1522:orcl";
            String name= "project";
            String pass="123456";
             co=DriverManager.getConnection(host, name, pass);
             st=co.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE*/);
            String SQL ="update reservation set RES_TIME = '"+this.newTableNum.getText()+"' where PERSON_NAME='"+this.NameSearch.getText()+"'";
           st.executeUpdate(SQL);
           co.commit();
           co.close();
        }catch(SQLException aa){
            
        }
    }//GEN-LAST:event_edit2ActionPerformed

    private void edit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit3ActionPerformed
        // TODO add your handling code here:
        try{
              DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
            String host="jdbc:oracle:thin:@localhost:1522:orcl";
            String name= "project";
            String pass="123456";
             co=DriverManager.getConnection(host, name, pass);
             st=co.createStatement(/*ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_UPDATABLE*/);
            String SQL ="update reservation set RES_TIME = '"+this.newPhone.getText()+"' where PERSON_NAME='"+this.NameSearch.getText()+"'";
           st.executeUpdate(SQL);
           co.commit();
           co.close();
        }catch(SQLException aa){
            
        }
    }//GEN-LAST:event_edit3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        Dates date = new Dates();
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                date.setVisible(true);
                date.setSize(810,698);
                date.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField NameSearch;
    private javax.swing.JButton back;
    private javax.swing.JButton delete;
    private javax.swing.JButton edit1;
    private javax.swing.JButton edit2;
    private javax.swing.JButton edit3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField newDate;
    private javax.swing.JTextField newPhone;
    private javax.swing.JTextField newTableNum;
    private javax.swing.JButton search;
    private javax.swing.JButton showAll;
    private javax.swing.JTextArea showDate;
    // End of variables declaration//GEN-END:variables
}
