/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package resturent;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oracle.jdbc.pool.OracleDataSource;

/**
 *
 * @author Admin
 */
public class Drinks extends javax.swing.JFrame {
private String B;
    DefaultListModel mod = new DefaultListModel();
Connection co;
            Statement st; 
    /**
     * Creates new form Drinks
     */
    public Drinks() {
        initComponents();
         this.setSize(693,670);
         this.setResizable(false);
          drinkList.setModel(mod);
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
            ResultSet rt=st.executeQuery("Select * from DRINKMENU");
           
           while( rt.next()){
             mod.addElement(rt.getString(1));
               
           }
           
            co.close();
           
        }catch(Exception aa){
            Logger.getLogger(Dates.class.getName()).log(Level.SEVERE,null,aa);
        }
    }
 public void setB(String aE) {
		B=aE;
	}
	public String getB() {
		return B;
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
        drinkList = new javax.swing.JList<>();
        save = new javax.swing.JButton();
        back = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        drinkArea = new javax.swing.JTextArea();
        drinkText = new javax.swing.JTextField();
        addDrink = new javax.swing.JButton();
        deleteDrink = new javax.swing.JButton();
        drinkNumber = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("قائمة المشروبات");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(240, 10, 210, 29);

        drinkList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(drinkList);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(12, 103, 240, 500);

        save.setBackground(new java.awt.Color(102, 102, 102));
        save.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        save.setForeground(new java.awt.Color(255, 255, 255));
        save.setText("تخزين الطلب");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save);
        save.setBounds(530, 270, 130, 42);

        back.setBackground(new java.awt.Color(102, 102, 102));
        back.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        back.setForeground(new java.awt.Color(255, 255, 255));
        back.setText("رجوع");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        getContentPane().add(back);
        back.setBounds(270, 550, 88, 42);

        drinkArea.setColumns(20);
        drinkArea.setFont(new java.awt.Font("Courier New", 1, 14)); // NOI18N
        drinkArea.setRows(5);
        jScrollPane2.setViewportView(drinkArea);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(260, 200, 240, 270);

        drinkText.setBackground(new java.awt.Color(242, 238, 238));
        drinkText.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        drinkText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkTextActionPerformed(evt);
            }
        });
        getContentPane().add(drinkText);
        drinkText.setBounds(370, 100, 218, 30);

        addDrink.setBackground(new java.awt.Color(102, 102, 102));
        addDrink.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        addDrink.setForeground(new java.awt.Color(255, 255, 255));
        addDrink.setText("إضافة");
        addDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDrinkActionPerformed(evt);
            }
        });
        getContentPane().add(addDrink);
        addDrink.setBounds(260, 100, 81, 30);

        deleteDrink.setBackground(new java.awt.Color(102, 102, 102));
        deleteDrink.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        deleteDrink.setForeground(new java.awt.Color(255, 255, 255));
        deleteDrink.setText("حذف");
        deleteDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteDrinkActionPerformed(evt);
            }
        });
        getContentPane().add(deleteDrink);
        deleteDrink.setBounds(260, 140, 81, 30);

        drinkNumber.setBackground(new java.awt.Color(242, 238, 238));
        drinkNumber.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        drinkNumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                drinkNumberActionPerformed(evt);
            }
        });
        getContentPane().add(drinkNumber);
        drinkNumber.setBounds(540, 140, 48, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("العدد ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(640, 150, 37, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("المشروبات ");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(600, 100, 75, 17);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resturent/الطلبات.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(-10, 0, 710, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_backActionPerformed

    private void drinkTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drinkTextActionPerformed

    private void addDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDrinkActionPerformed

        if(drinkText.getText().isEmpty())
        JOptionPane.showMessageDialog(this, "أضف طلب اولاً");
        else if(drinkNumber.getText().isEmpty())
        JOptionPane.showMessageDialog(this, "أضف رقم");
        else {
            drinkArea.append(drinkText.getText()+" - "+drinkNumber.getText()+"\n");
        }
        drinkText.setText("");
        drinkNumber.setText("");
    }//GEN-LAST:event_addDrinkActionPerformed

    private void deleteDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteDrinkActionPerformed
        if(drinkText.getText().isEmpty())
        JOptionPane.showMessageDialog(this, "أضف طلب اولاً");
        else {
            String a = drinkArea.getText();
            String[] s = a.split("\n");
            drinkArea.setText("");
            for(int i=0;i<s.length;i++){
                if(s[i].contains(drinkText.getText())){
                    s[i] = "";
                    break;
                }
            }
            for(int i =0;i<s.length;i++){
                if(s[i] != "")
                drinkArea.append(s[i]+"\n");
            }

        }
        drinkText.setText("");
        drinkNumber.setText("");
    }//GEN-LAST:event_deleteDrinkActionPerformed

    private void drinkNumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_drinkNumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_drinkNumberActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        setB(drinkArea.getText());
        drinkArea.setText("");
        drinkNumber.setText("");
        drinkText.setText("");
    }//GEN-LAST:event_saveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Drinks d = new Drinks();
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                d.setVisible(true);
                d.setSize(693,670);
                d.setResizable(false);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDrink;
    private javax.swing.JButton back;
    private javax.swing.JButton deleteDrink;
    private javax.swing.JTextArea drinkArea;
    private javax.swing.JList<String> drinkList;
    private javax.swing.JTextField drinkNumber;
    private javax.swing.JTextField drinkText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton save;
    // End of variables declaration//GEN-END:variables
}
