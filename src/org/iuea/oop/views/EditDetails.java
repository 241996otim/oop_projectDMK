/*
    STUDENT NAME                REG. NUMBER
 1. Thomas Otim Dominic         19/766/BIT-S
 2. Kirinya Moses Aventore      19/589/BSCS-S
 */


package org.iuea.oop.views;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import javax.swing.JOptionPane;
import org.iuea.oop.modall.Table;

/**
 *
 * @author DMK
 */
public class EditDetails extends javax.swing.JPanel {
    //..
    static int num = 0;
    
    //method to get student data to edit..
    private void getData(int num){
        try{
            jTextField1.setText(DashBoard.data[num-1][1]);//fName
            jTextField2.setText(DashBoard.data[num-1][2]);//lName
            jTextField3.setText(DashBoard.data[num-1][5]);//course
            jTextField4.setText(DashBoard.data[num-1][6]);//regNo
            //DOB..
            if(DashBoard.data[num-1][4].equals("")){
                jDateChooser1.setDate(new Date()); 
            }else{
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(DashBoard.data[num-1][4]);
                jDateChooser1.setDate(date); 
            }
            //sex..
            if(DashBoard.data[num-1][3].equals("")){
                jComboBox1.addItem("Male");
                jComboBox1.addItem("Female");
            }else{
                jComboBox1.addItem(DashBoard.data[num-1][3]);
                switch (DashBoard.data[num-1][3]) {
                    case "Male":
                        jComboBox1.addItem("Female");
                        break;
                    case "Female":
                        jComboBox1.addItem("Male");
                        break;
                }
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
    
    /**
     * Creates new form RegForm
     */
    public EditDetails(int Num) {
        initComponents();
        jDateChooser1.setLocale(Locale.US);
        jDateChooser1.setDateFormatString("dd/MM/yyyy");
        jDateChooser1.setDate(new Date());
        //..
        num = Num;
        getData(Num);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        jComboBox1.setFocusable(false);

        jLabel1.setText("First Name");

        jLabel2.setText("Last Name");

        jLabel3.setText("Sex");

        jLabel4.setText("Date of Birth");

        jLabel5.setText("Course");

        jLabel6.setText("Registration No.");

        jButton2.setBackground(new java.awt.Color(0, 204, 51));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton2.setText("Update");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jTextField1)
                        .addComponent(jTextField2)
                        .addComponent(jTextField3)
                        .addComponent(jTextField4)
                        .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE))
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try{
            //variable declaration..
            String fName = jTextField1.getText();
            String lName = jTextField2.getText();
            String course = jTextField3.getText();
            String regNo = jTextField4.getText();
            String sex = jComboBox1.getSelectedItem().toString();
            SimpleDateFormat fm = new SimpleDateFormat("dd/MM/yyyy");
            String dob = fm.format(jDateChooser1.getDate());
            
            //validating form..
            if(fName.isEmpty() && lName.isEmpty() && course.isEmpty() && regNo.isEmpty()){
                JOptionPane.showMessageDialog(null,"MISSING REQUIRED DETAILS !!!","SIS..",JOptionPane.ERROR_MESSAGE);
            }else if(fName.isEmpty()){
                JOptionPane.showMessageDialog(null,"FIRST NAME REQUIRED !!!","SIS..",JOptionPane.ERROR_MESSAGE);
            }else if(lName.isEmpty()){
                JOptionPane.showMessageDialog(null,"LAST NAME REQUIRED !!!","SIS..",JOptionPane.ERROR_MESSAGE);
            }else if(course.isEmpty()){
                JOptionPane.showMessageDialog(null,"COURSE REQUIRED !!!","SIS..",JOptionPane.ERROR_MESSAGE);
            }else if(regNo.isEmpty()){
                JOptionPane.showMessageDialog(null,"REGISTRATION NUMBER REQUIRED !!!","SIS..",JOptionPane.ERROR_MESSAGE);
            }else{
                //student data..
                DashBoard.data[num-1][0]=num+"."; 
                DashBoard.data[num-1][1]=fName; 
                DashBoard.data[num-1][2]=lName; 
                DashBoard.data[num-1][3]=sex; 
                DashBoard.data[num-1][4]=dob; 
                DashBoard.data[num-1][5]=course; 
                DashBoard.data[num-1][6]=regNo; 
                //success..
                JOptionPane.showMessageDialog(null, "Student data successfully updated..","SIS..",JOptionPane.INFORMATION_MESSAGE);
                //re-loading items table..
                DashBoard.jPanel1.removeAll();
                Table.createTable(DashBoard.jPanel1, DashBoard.headers, DashBoard.data, DashBoard.w, DashBoard.h);
                DashBoard.jPanel1.revalidate();
                DashBoard.jPanel1.repaint();
                //dispose..
                DashBoard.dialog.dispose();
            }
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            //ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
