/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author Jovi Julian
 */
import java.sql.*;
import javax.swing.table.DefaultTableModel;
public class FormJurusan extends javax.swing.JInternalFrame {

    Connection con;
    DefaultTableModel tm;
    public FormJurusan() {
        initComponents();
        connect();
        refreshTable();
    }

    private void connect() {
        con = null;
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/dbtugas", "root", "");
        } catch(Exception e){
            System.out.println("Error koneksi ke database\n" + e);
        }
    }
    
    private void refreshTable(){
        tm = new DefaultTableModel(
        null, new Object[]{"Kode Jurusan" , "Nama Jurusan"}
        );
        tbjurusan.setModel(tm);
        tm.getDataVector().removeAllElements();
        
        try{
            PreparedStatement s = con.prepareStatement("SELECT * FROM jurusan");
            ResultSet r = s.executeQuery();
            while(r.next()){
                Object[] data = {
                    r.getString(1),
                    r.getString(2)
                };
                tm.addRow(data);
            }
        } catch (Exception e){
            System.out.print("Error Query ke database: \n" + e + "\n\n");
        }      
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        tfkodejurusan = new javax.swing.JTextField();
        tfnamajurusan = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbjurusan = new javax.swing.JTable();

        jMenu1.setText("jMenu1");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Data Jurusan");

        jLabel2.setText("Kode Jurusan");

        jLabel3.setText("Nama Jurusan");

        tfkodejurusan.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfkodejurusanKeyTyped(evt);
            }
        });

        tfnamajurusan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfnamajurusanActionPerformed(evt);
            }
        });

        jButton1.setText("Tambah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Ubah");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Hapus");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        tbjurusan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbjurusan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbjurusanMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbjurusan);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(240, 240, 240)
                        .addComponent(jLabel1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(85, 85, 85)
                            .addComponent(jButton1)
                            .addGap(121, 121, 121)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(58, 58, 58)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addGap(180, 180, 180)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(tfkodejurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(tfnamajurusan, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(tfkodejurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jLabel2)
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(tfnamajurusan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbjurusanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbjurusanMouseClicked
        tfkodejurusan.setText(tm.getValueAt(tbjurusan.getSelectedRow(),0). toString());
        tfnamajurusan.setText(tm.getValueAt(tbjurusan.getSelectedRow(),1). toString());
     
    }//GEN-LAST:event_tbjurusanMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       try{
           PreparedStatement ps = con.prepareStatement("INSERT INTO jurusan VALUES (?,?)");
           ps.setString(1, tfkodejurusan.getText());
           ps.setString(2, tfnamajurusan.getText());
           ps.executeUpdate();
           
           refreshTable();
           tfkodejurusan.setText("");
           tfnamajurusan.setText("");
       }catch (Exception e){
           System.out.print("Error Query ke database:\n" + e + "\n\n");
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       try{
           PreparedStatement ps = con.prepareStatement("UPDATE jurusan SET namajurusan=? WHERE kodejurusan=?");
           ps.setString(1, tfnamajurusan.getText());
           ps.setString(2, tfkodejurusan.getText());
           ps.executeUpdate();
           
           refreshTable();
           tfkodejurusan.setText("");
           tfnamajurusan.setText("");
       }catch (Exception e){
           System.out.print("Error Query ke Database:\n" + e + "\n\n");
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        try{
           PreparedStatement ps = con.prepareStatement("DELETE FROM jurusan WHERE kodejurusan=?");
           ps.setString(1, tfkodejurusan.getText());
           ps.executeUpdate();
           
           refreshTable();
           tfkodejurusan.setText("");
           tfnamajurusan.setText("");
       }catch (Exception e){
           System.out.print("Error Query ke Database:\n" + e + "\n\n");
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void tfnamajurusanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfnamajurusanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfnamajurusanActionPerformed

    private void tfkodejurusanKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfkodejurusanKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_tfkodejurusanKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbjurusan;
    private javax.swing.JTextField tfkodejurusan;
    private javax.swing.JTextField tfnamajurusan;
    // End of variables declaration//GEN-END:variables
}
