/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package g_art_event.pkg1;
import java.sql.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author ADMIN
 */
public class Add_Venues_1 extends javax.swing.JFrame {

    /**
     * Creates new form Add_Venues
     */
    public Add_Venues_1() {
        initComponents();
          fetch();
    }
    public void fetch(){
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databasename=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh"); 
           PreparedStatement pst = con.prepareStatement("exec sp_fetch_venue");
           ResultSet rs = pst.executeQuery();
           tbl_venue_dgv.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
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

        jButton2 = new javax.swing.JButton();
        Add_Venues = new javax.swing.JLabel();
        Venue_Id = new javax.swing.JLabel();
        txt_Venue_Id = new javax.swing.JTextField();
        Mahal_Name = new javax.swing.JLabel();
        txt_Mahal_Name = new javax.swing.JTextField();
        Capacity = new javax.swing.JLabel();
        txt_Capacity = new javax.swing.JTextField();
        Address = new javax.swing.JLabel();
        txt_Address = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbl_venue_dgv = new javax.swing.JTable();
        btn_Insert = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1400, 730));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 10, -1, -1));

        Add_Venues.setBackground(new java.awt.Color(255, 255, 0));
        Add_Venues.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Add_Venues.setText("ADD VENUES");
        Add_Venues.setOpaque(true);
        getContentPane().add(Add_Venues, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 50, -1, -1));

        Venue_Id.setBackground(new java.awt.Color(255, 153, 0));
        Venue_Id.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Venue_Id.setText("Id");
        Venue_Id.setOpaque(true);
        getContentPane().add(Venue_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, 140, 31));

        txt_Venue_Id.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_Venue_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 130, 190, 31));

        Mahal_Name.setBackground(new java.awt.Color(255, 153, 0));
        Mahal_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Mahal_Name.setText("Mahal_Name");
        Mahal_Name.setOpaque(true);
        getContentPane().add(Mahal_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 210, 140, 31));

        txt_Mahal_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_Mahal_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 210, 190, 31));

        Capacity.setBackground(new java.awt.Color(255, 153, 0));
        Capacity.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Capacity.setText("Capacity");
        Capacity.setOpaque(true);
        getContentPane().add(Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 130, 140, 31));

        txt_Capacity.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_Capacity, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 130, 190, 31));

        Address.setBackground(new java.awt.Color(255, 153, 0));
        Address.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Address.setText("Address");
        Address.setOpaque(true);
        getContentPane().add(Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 210, 140, 31));

        txt_Address.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_Address, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 210, 190, 31));

        tbl_venue_dgv.setBackground(new java.awt.Color(51, 255, 255));
        tbl_venue_dgv.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbl_venue_dgv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Mahal_Name", "Capacity", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_venue_dgv.setRowHeight(25);
        tbl_venue_dgv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_venue_dgvMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tbl_venue_dgv);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 820, 270));

        btn_Insert.setBackground(new java.awt.Color(0, 0, 0));
        btn_Insert.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_Insert.setForeground(new java.awt.Color(255, 255, 255));
        btn_Insert.setText("Insert");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 300, 90, -1));

        btn_Update.setBackground(new java.awt.Color(0, 0, 0));
        btn_Update.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, -1, -1));

        btn_Delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_Delete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 300, -1, -1));

        btn_clear.setBackground(new java.awt.Color(0, 0, 0));
        btn_clear.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 300, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_art_event/images/Add venue.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         dispose();
        String UserName = null;
        Admin_Dashboard dash = new Admin_Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void tbl_venue_dgvMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_venue_dgvMouseClicked
        // TODO add your handling code here:
        int selectedRow=tbl_venue_dgv.getSelectedRow();
        txt_Mahal_Name.setText(tbl_venue_dgv.getValueAt(selectedRow, 1).toString());
        txt_Capacity.setText(tbl_venue_dgv.getValueAt(selectedRow, 2).toString());
        txt_Address.setText(tbl_venue_dgv.getValueAt(selectedRow, 3).toString());
        txt_Venue_Id.setText(tbl_venue_dgv.getValueAt(selectedRow, 0).toString());
    }//GEN-LAST:event_tbl_venue_dgvMouseClicked

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        try
        {
            String Id = txt_Venue_Id.getText().toString();
            String Mahal_Name = txt_Mahal_Name.getText().toString();
            String Capacity = txt_Capacity.getText().toString();
            String Address = txt_Address.getText().toString();
            if(!Id.isEmpty() && !Mahal_Name.isEmpty() && !Capacity.isEmpty() && !Address.isEmpty()){
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databasename=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
                PreparedStatement pst = con.prepareStatement("exec sp_addvenue ?,?,?,?");
                pst.setString(1, Id);
                pst.setString(2,Mahal_Name);
                pst.setString(3,Capacity);
                pst.setString(4,Address);
                int i = pst.executeUpdate();
                if(i!=0)
                {

                    // Show_venue_In_tbl_venue();
                    JOptionPane.showMessageDialog(this,"Data Inserted","insert",JOptionPane.DEFAULT_OPTION);
                    txt_Venue_Id.setText(null);
                    txt_Mahal_Name.setText(null);
                    txt_Capacity.setText(null);
                    txt_Address.setText(null);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Something Error","SignUp",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"All Field Required","warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        fetch();
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databasename=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
            int row = tbl_venue_dgv.getSelectedRow();
            String value = (tbl_venue_dgv.getModel().getValueAt(row, 0).toString());
            PreparedStatement pst = con.prepareStatement("exec update_venue ?,?,?,?");
            pst.setString(1, txt_Mahal_Name.getText());
            pst.setString(2,txt_Capacity.getText());
            pst.setString(3, txt_Address.getText());
            pst.setString(4,txt_Venue_Id.getText());
            pst.executeUpdate();
            DefaultTableModel DFT = (DefaultTableModel) tbl_venue_dgv.getModel();
            DFT.setRowCount(0);
            JOptionPane.showMessageDialog(this, "Updated Successful","Update",JOptionPane.DEFAULT_OPTION);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
        fetch();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databasename=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
            int row = tbl_venue_dgv.getSelectedRow();
            String value = (tbl_venue_dgv.getModel().getValueAt(row, 0).toString());
            PreparedStatement pst = con.prepareStatement("exec sp_delete ?");
            pst.setString(1, txt_Venue_Id.getText());
            pst.executeUpdate();
            DefaultTableModel DFT = (DefaultTableModel) tbl_venue_dgv.getModel();
            DFT.setRowCount(0);
            JOptionPane.showMessageDialog(this, "Row Deleted Successful","Delete",JOptionPane.DEFAULT_OPTION);
            txt_Venue_Id.setText(null);
            txt_Mahal_Name.setText(null);
            txt_Capacity.setText(null);
            txt_Address.setText(null);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
        fetch();
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_Venue_Id.setText(null);
        txt_Mahal_Name.setText(null);
        txt_Capacity.setText(null);
        txt_Address.setText(null);
    }//GEN-LAST:event_btn_clearActionPerformed

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
            java.util.logging.Logger.getLogger(Add_Venues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Venues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Venues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Venues.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Venues().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Add_Venues;
    private javax.swing.JLabel Address;
    private javax.swing.JLabel Capacity;
    private javax.swing.JLabel Mahal_Name;
    private javax.swing.JLabel Venue_Id;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tbl_venue_dgv;
    private javax.swing.JTextField txt_Address;
    private javax.swing.JTextField txt_Capacity;
    private javax.swing.JTextField txt_Mahal_Name;
    private javax.swing.JTextField txt_Venue_Id;
    // End of variables declaration//GEN-END:variables
}
