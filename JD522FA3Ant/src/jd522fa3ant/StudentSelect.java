/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package jd522fa3ant;

import com.sun.jdi.connect.spi.Connection;
import java.io.*;
import java.math.RoundingMode;
import javax.swing.JOptionPane;
import java.sql.*;
import java.text.DecimalFormat;
import java.util.*;

/**
 *
 * @author heinl
 */
public class StudentSelect extends javax.swing.JFrame {

    final String JDBC_Driver = "com.mysql.cj.jdbc.Driver";
    final String DB_URL = "jdbc:mysql://localhost:3306/studentresult";
    Connection connect = null;
    ArrayList<String> list = new ArrayList<>();
    String id;
    int high, low;
    double avg;
    /**
     * Creates new form StudentSelect
     */
    
    public StudentSelect() {
        initComponents();
        //
        // POPULATE LISTBOX
        //
        try {
            File myObj = new File("C:\\Users\\heinl\\Documents\\NetBeansProjects\\JD522FA3Ant\\Student.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {

                int x = 0;
                String data = myReader.nextLine();
                list.add(data);
                while (x < 3) {
                    myReader.nextLine();
                    x++;
                }

            }   

        String[] studentID = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            studentID[i] = list.get(i);
        }       
        idList.setListData(studentID);

        myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        idList = new javax.swing.JList<>();
        btnSave = new javax.swing.JButton();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtHigh = new javax.swing.JLabel();
        txtLow = new javax.swing.JLabel();
        txtAvg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        idList.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                idListValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(idList);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setText("Highest Rating:");

        jLabel2.setText("Average:");

        jLabel3.setText("Lowest Rating:");

        txtHigh.setText("--");

        txtLow.setText("--");

        txtAvg.setText("--");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtAvg, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtLow, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(txtHigh, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtHigh))
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtLow))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtAvg))))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSave)
                    .addComponent(btnSearch))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName(JDBC_Driver);
            java.sql.Connection conn = DriverManager.getConnection(DB_URL,"root","@H31n123");
            
            String query = "INSERT into resulttable(StudentNumber,HighestResult,LowestResult,Average)"+
                    "Values(?,?,?,?)";
            
            String high = (txtHigh.getText());
            String low = (txtLow.getText());
            String avg = (txtAvg.getText());
            
            PreparedStatement preparedstmt = conn.prepareStatement(query);
            preparedstmt.setInt(1, Integer.parseInt(id));
            preparedstmt.setString(2,high);
            preparedstmt.setString(3,low);
            preparedstmt.setString(4,avg);
            
            preparedstmt.execute();
            conn.close();
            
            JOptionPane.showMessageDialog(this, "Record saved to database.");
            
        }catch(Exception e){
            System.err.println("Got an exception");
            System.err.println(e.getMessage());
            
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        id = idList.getSelectedValue();
    int testResult = 0, assignementResult = 0, markResult = 0;
    
    try{
        File myObj = new File("C:\\Users\\heinl\\Documents\\NetBeansProjects\\JD522FA3Ant\\Student.txt");
        Scanner myReader = new Scanner(myObj);
        while (myReader.hasNextLine()) {
        if (myReader.nextLine().equals(id)){
            testResult = Integer.parseInt(myReader.nextLine());
            assignementResult = Integer.parseInt(myReader.nextLine());
            markResult = Integer.parseInt(myReader.nextLine());
        }
    }
        double high = Math.max(Math.max(testResult, assignementResult),markResult);
       double low = Math.min(Math.min(testResult, assignementResult),markResult);
       DecimalFormat df = new DecimalFormat("0.00");
       df.setRoundingMode(RoundingMode.UP);
       double avg = (testResult + assignementResult + markResult) / 3;
       txtAvg.setText(df.format(avg)+ " %");
       txtHigh.setText(df.format(high)+ " %");
       txtLow.setText(df.format(low)+ " %");
       
       myReader.close();
       
    }catch(FileNotFoundException e){
        System.out.println("An Error Occured");
    }
        
        
    }//GEN-LAST:event_btnSearchActionPerformed

    private void idListValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_idListValueChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_idListValueChanged

    
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
            java.util.logging.Logger.getLogger(StudentSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentSelect.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentSelect().setVisible(true);
                
                
            }
        });
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSearch;
    private javax.swing.JList<String> idList;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel txtAvg;
    private javax.swing.JLabel txtHigh;
    private javax.swing.JLabel txtLow;
    // End of variables declaration//GEN-END:variables
}