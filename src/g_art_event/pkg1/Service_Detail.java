/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package g_art_event.pkg1;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ADMIN
 */
public class Service_Detail extends javax.swing.JFrame {

    /**
     * Creates new form Service_Detail
     */
    public Service_Detail() {
        initComponents();
        fetch();
    }
    public void fetch(){
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           java.sql.Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databasename=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh"); 
           PreparedStatement pst = con.prepareStatement("exec fetch_Service");
           ResultSet rs = pst.executeQuery();
           Service_Table.setModel(DbUtils.resultSetToTableModel(rs));
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
        Service_Details = new javax.swing.JLabel();
        Ventor_Id = new javax.swing.JLabel();
        txt_Ventor_Id = new javax.swing.JTextField();
        Ventor_Name = new javax.swing.JLabel();
        txt_Ventor_Name = new javax.swing.JTextField();
        txt_Ventor_Mobile = new javax.swing.JTextField();
        Ventor_Mobile = new javax.swing.JLabel();
        Ventor_Services = new javax.swing.JLabel();
        txt_Ventor_Services = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Service_Table = new javax.swing.JTable();
        btn_Add = new javax.swing.JButton();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
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

        Service_Details.setBackground(new java.awt.Color(255, 255, 255));
        Service_Details.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Service_Details.setText("Service Details");
        Service_Details.setOpaque(true);
        getContentPane().add(Service_Details, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 230, -1));

        Ventor_Id.setBackground(new java.awt.Color(255, 204, 102));
        Ventor_Id.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Ventor_Id.setText("Ventor Id");
        Ventor_Id.setOpaque(true);
        getContentPane().add(Ventor_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 150, -1));

        txt_Ventor_Id.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_Ventor_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 170, 190, -1));

        Ventor_Name.setBackground(new java.awt.Color(255, 204, 51));
        Ventor_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Ventor_Name.setText("Ventor Name");
        Ventor_Name.setOpaque(true);
        getContentPane().add(Ventor_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 240, 150, -1));

        txt_Ventor_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_Ventor_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 190, -1));

        txt_Ventor_Mobile.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_Ventor_Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 170, 190, -1));

        Ventor_Mobile.setBackground(new java.awt.Color(255, 204, 51));
        Ventor_Mobile.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Ventor_Mobile.setText("Ventor Mobile");
        Ventor_Mobile.setOpaque(true);
        getContentPane().add(Ventor_Mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 170, 160, -1));

        Ventor_Services.setBackground(new java.awt.Color(255, 204, 51));
        Ventor_Services.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Ventor_Services.setText("Ventor Services");
        Ventor_Services.setOpaque(true);
        getContentPane().add(Ventor_Services, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 240, 160, -1));

        txt_Ventor_Services.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_Ventor_Services, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 190, -1));

        Service_Table.setBackground(new java.awt.Color(255, 255, 0));
        Service_Table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Service_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ventor_Id", "Ventor Name", "Ventor Mobile", "Ventor Services"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Service_Table.setRowHeight(25);
        Service_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Service_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Service_Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 480, 788, 231));

        btn_Add.setBackground(new java.awt.Color(0, 0, 0));
        btn_Add.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_Add.setForeground(new java.awt.Color(255, 255, 255));
        btn_Add.setText("Add");
        btn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AddActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 360, 110, -1));

        btn_Update.setBackground(new java.awt.Color(0, 0, 0));
        btn_Update.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 360, 110, -1));

        btn_Delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_Delete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 360, 100, -1));

        btn_clear.setBackground(new java.awt.Color(0, 0, 0));
        btn_clear.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 360, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_art_event/images/servicebg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        Dashboard_Users dash = new Dashboard_Users();
        dash.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Service_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Service_TableMouseClicked
        // TODO add your handling code here:
        int selectedRow = Service_Table.getSelectedRow();
        txt_Ventor_Id.setText(Service_Table.getValueAt(selectedRow, 0).toString());
        txt_Ventor_Name.setText(Service_Table.getValueAt(selectedRow, 1).toString());
        txt_Ventor_Mobile.setText(Service_Table.getValueAt(selectedRow, 2).toString());
        txt_Ventor_Services.setText(Service_Table.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_Service_TableMouseClicked

    private void btn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AddActionPerformed
        // TODO add your handling code here:
        try
        {
            String Ventor_Id = txt_Ventor_Id.getText().toString();
            String Ventor_Name = txt_Ventor_Name.getText().toString();
            String Ventor_Mobile = txt_Ventor_Mobile.getText().toString();
            String Ventor_Services = txt_Ventor_Services.getText().toString();

            if(!Ventor_Id.isEmpty() && !Ventor_Name.isEmpty() && !Ventor_Mobile.isEmpty() && !Ventor_Services.isEmpty())
            {
                Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databaseName=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
                PreparedStatement pst = con.prepareStatement("exec add_service ?,?,?,?");
                pst.setString(1,Ventor_Id);
                pst.setString(2,Ventor_Name);
                pst.setString(3,Ventor_Mobile);
                pst.setString(4,Ventor_Services);
                int i = pst.executeUpdate();
                if(i!=0)
                {
                    JOptionPane.showMessageDialog(this,"Services Added Successfull","insert",JOptionPane.DEFAULT_OPTION);
                    txt_Ventor_Id.setText(null);
                    txt_Ventor_Name.setText(null);
                    txt_Ventor_Mobile.setText(null);
                    txt_Ventor_Services.setText(null);
                }
                else
                {
                    JOptionPane.showMessageDialog(this,"Something Error","Error",JOptionPane.ERROR_MESSAGE);
                }
            }
            else
            {
                JOptionPane.showMessageDialog(this,"All fields required","Error",JOptionPane.ERROR_MESSAGE);
            }

        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        fetch();
    }//GEN-LAST:event_btn_AddActionPerformed

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databaseName=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
            int row = Service_Table.getSelectedRow();
            String value = (Service_Table.getModel().getValueAt(row, 0).toString());
            PreparedStatement pst = con.prepareStatement("exec update_Service ?,?,?,?");
            pst.setString(1,txt_Ventor_Name.getText().toString());
            pst.setString(2,txt_Ventor_Mobile.getText().toString());
            pst.setString(3,txt_Ventor_Services.getText().toString());
            pst.setString(4,txt_Ventor_Id.getText().toString());
            int i = pst.executeUpdate();
            DefaultTableModel DFT = (DefaultTableModel) Service_Table.getModel();
            DFT.setRowCount(0);
            if(i!=0)
            {
                JOptionPane.showMessageDialog(this,"Services Updated Successfull","Update",JOptionPane.DEFAULT_OPTION);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"Something Error","Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        fetch();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        try
        {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databaseName=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
            int row = Service_Table.getSelectedRow();
            String value = (Service_Table.getModel().getValueAt(row, 0).toString());
            PreparedStatement pst = con.prepareStatement("exec delete_Service ?");
            pst.setString(1,txt_Ventor_Id.getText().toString());
            int i = pst.executeUpdate();
            DefaultTableModel DFT = (DefaultTableModel) Service_Table.getModel();
            DFT.setRowCount(0);
            JOptionPane.showMessageDialog(this,"Deleted Row Successfull","Delete",JOptionPane.DEFAULT_OPTION);
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
        }
        fetch();
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
         txt_Ventor_Id.setText(null);
                    txt_Ventor_Name.setText(null);
                    txt_Ventor_Mobile.setText(null);
                    txt_Ventor_Services.setText(null);
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
            java.util.logging.Logger.getLogger(Service_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Service_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Service_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Service_Detail.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Service_Detail().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Service_Details;
    private javax.swing.JTable Service_Table;
    private javax.swing.JLabel Ventor_Id;
    private javax.swing.JLabel Ventor_Mobile;
    private javax.swing.JLabel Ventor_Name;
    private javax.swing.JLabel Ventor_Services;
    private javax.swing.JButton btn_Add;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_clear;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_Ventor_Id;
    private javax.swing.JTextField txt_Ventor_Mobile;
    private javax.swing.JTextField txt_Ventor_Name;
    private javax.swing.JTextField txt_Ventor_Services;
    // End of variables declaration//GEN-END:variables
}
