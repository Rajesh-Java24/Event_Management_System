/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package g_art_event.pkg1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author ADMIN
 */
public class Resources_1 extends javax.swing.JFrame {

    /**
     * Creates new form Resources
     */
    public Resources_1() {
        initComponents();
        fetch();
    }
    public void fetch(){
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databasename=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh"); 
           PreparedStatement pst = con.prepareStatement("exec fetch_resource");
           ResultSet rs = pst.executeQuery();
           Resources_Table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(this, ex);
        }
    }
            
    //fill combobox
    public void com_Resource_Name(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databasename=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
            PreparedStatement pst = con.prepareStatement("exec resource_Name");
            ResultSet rs = pst.executeQuery();  
            com_Resource_Name.removeAllItems();
            while(rs.next()){
              com_Resource_Name.addItem(rs.getString("Mahal_Name"));
            }  
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
    } 
    public void com_Event_Name(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databasename=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
            PreparedStatement pst = con.prepareStatement("exec event_Name");
            ResultSet rs = pst.executeQuery();  
                com_Event_Name.removeAllItems();
            while(rs.next()){
              com_Event_Name.addItem(rs.getString("Event_Name"));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
        
  } 
        
    public void com_Customer_Name(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databasename=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
            PreparedStatement pst = con.prepareStatement("exec customer_Name");
            ResultSet rs = pst.executeQuery();  
            com_Customer_Name.removeAllItems();
            while(rs.next()){
              com_Customer_Name.addItem(rs.getString("customer_Name"));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }
  } 

    public void com_Services(){
        try{
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection con=DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databasename=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
            PreparedStatement pst = con.prepareStatement("exec com_Services");
            ResultSet rs = pst.executeQuery();  
             com_Services.removeAllItems();
            while(rs.next()){
              com_Services.addItem(rs.getString("Ventor_Srvices"));
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
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

        Resources = new javax.swing.JLabel();
        Id = new javax.swing.JLabel();
        txt_Id = new javax.swing.JTextField();
        Resource_Name = new javax.swing.JLabel();
        Event_Name = new javax.swing.JLabel();
        Customer_Name = new javax.swing.JLabel();
        Services = new javax.swing.JLabel();
        Ventor_Name = new javax.swing.JLabel();
        txt_Ventor_Name = new javax.swing.JTextField();
        Event_Start_Date = new javax.swing.JLabel();
        Event_End_Date = new javax.swing.JLabel();
        Mahal_Rent = new javax.swing.JLabel();
        txt_Mahal_Rent = new javax.swing.JTextField();
        com_Resource_Name = new javax.swing.JComboBox<>();
        com_Event_Name = new javax.swing.JComboBox<>();
        com_Customer_Name = new javax.swing.JComboBox<>();
        com_Services = new javax.swing.JComboBox<>();
        txt_Start_Date = new com.toedter.calendar.JDateChooser();
        txt_End_Date = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        Resources_Table = new javax.swing.JTable();
        btn_Update = new javax.swing.JButton();
        btn_Delete = new javax.swing.JButton();
        btn_Insert = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btn_clear = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Resources.setBackground(new java.awt.Color(0, 255, 0));
        Resources.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        Resources.setText("Resources");
        Resources.setOpaque(true);
        getContentPane().add(Resources, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 70, 170, -1));

        Id.setBackground(new java.awt.Color(255, 102, 102));
        Id.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Id.setText(" Id");
        Id.setOpaque(true);
        getContentPane().add(Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 160, -1));

        txt_Id.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 160, 146, -1));

        Resource_Name.setBackground(new java.awt.Color(255, 102, 102));
        Resource_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Resource_Name.setText("Resource Name");
        Resource_Name.setOpaque(true);
        getContentPane().add(Resource_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 160, 160, -1));

        Event_Name.setBackground(new java.awt.Color(255, 102, 102));
        Event_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Event_Name.setText("Event Name");
        Event_Name.setOpaque(true);
        getContentPane().add(Event_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 160, 129, -1));

        Customer_Name.setBackground(new java.awt.Color(255, 102, 102));
        Customer_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Customer_Name.setText("Customer Name");
        Customer_Name.setOpaque(true);
        getContentPane().add(Customer_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        Services.setBackground(new java.awt.Color(255, 102, 102));
        Services.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Services.setText("Services");
        Services.setOpaque(true);
        getContentPane().add(Services, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, 160, -1));

        Ventor_Name.setBackground(new java.awt.Color(255, 102, 102));
        Ventor_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Ventor_Name.setText("Vendor Name");
        Ventor_Name.setOpaque(true);
        getContentPane().add(Ventor_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 220, 140, -1));

        txt_Ventor_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txt_Ventor_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Ventor_NameActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Ventor_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 220, 145, -1));

        Event_Start_Date.setBackground(new java.awt.Color(255, 102, 102));
        Event_Start_Date.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Event_Start_Date.setText("Event_Sart Date");
        Event_Start_Date.setOpaque(true);
        getContentPane().add(Event_Start_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 160, -1));

        Event_End_Date.setBackground(new java.awt.Color(255, 102, 102));
        Event_End_Date.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Event_End_Date.setText("Event_End Date");
        Event_End_Date.setOpaque(true);
        getContentPane().add(Event_End_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 290, -1, -1));

        Mahal_Rent.setBackground(new java.awt.Color(255, 102, 102));
        Mahal_Rent.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        Mahal_Rent.setText("Amount");
        Mahal_Rent.setOpaque(true);
        getContentPane().add(Mahal_Rent, new org.netbeans.lib.awtextra.AbsoluteConstraints(870, 290, 129, -1));

        txt_Mahal_Rent.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txt_Mahal_Rent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Mahal_RentActionPerformed(evt);
            }
        });
        getContentPane().add(txt_Mahal_Rent, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 290, 145, -1));

        com_Resource_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        com_Resource_Name.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                com_Resource_NameItemStateChanged(evt);
            }
        });
        com_Resource_Name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                com_Resource_NameActionPerformed(evt);
            }
        });
        getContentPane().add(com_Resource_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 160, 145, -1));

        com_Event_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(com_Event_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 150, 145, -1));

        com_Customer_Name.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(com_Customer_Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 146, -1));

        com_Services.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(com_Services, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 220, 145, -1));

        txt_Start_Date.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_Start_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 146, 27));

        txt_End_Date.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        getContentPane().add(txt_End_Date, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 290, 145, 27));

        Resources_Table.setBackground(new java.awt.Color(102, 255, 255));
        Resources_Table.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        Resources_Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Resources Name", "Event Name", "Customer Name", "Services", "Ventor_Name", "Event Start Date", "Event End Date", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        Resources_Table.setRowHeight(40);
        Resources_Table.setSelectionBackground(new java.awt.Color(255, 153, 0));
        Resources_Table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Resources_TableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Resources_Table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 1040, 287));

        btn_Update.setBackground(new java.awt.Color(0, 0, 0));
        btn_Update.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_Update.setForeground(new java.awt.Color(255, 255, 255));
        btn_Update.setText("Update");
        btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_UpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Update, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 360, 110, -1));

        btn_Delete.setBackground(new java.awt.Color(0, 0, 0));
        btn_Delete.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_Delete.setForeground(new java.awt.Color(255, 255, 255));
        btn_Delete.setText("Delete");
        btn_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_DeleteActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 360, 110, -1));

        btn_Insert.setBackground(new java.awt.Color(0, 0, 0));
        btn_Insert.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_Insert.setForeground(new java.awt.Color(255, 255, 255));
        btn_Insert.setText("Insert");
        btn_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_InsertActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Insert, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 360, 110, -1));

        jButton2.setBackground(new java.awt.Color(255, 0, 0));
        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton2.setText("X");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, -1));

        btn_clear.setBackground(new java.awt.Color(0, 0, 0));
        btn_clear.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_clear.setForeground(new java.awt.Color(255, 255, 255));
        btn_clear.setText("Clear");
        btn_clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_clearActionPerformed(evt);
            }
        });
        getContentPane().add(btn_clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 360, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_art_event/images/Wedding_bg.jpeg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1400, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txt_Ventor_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Ventor_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Ventor_NameActionPerformed

    private void txt_Mahal_RentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Mahal_RentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Mahal_RentActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        com_Resource_Name();
        com_Event_Name();
        com_Customer_Name();
        com_Services();
    }//GEN-LAST:event_formWindowOpened
    //public static String Mahal_Name;
    private void com_Resource_NameItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_com_Resource_NameItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_com_Resource_NameItemStateChanged

    private void btn_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_InsertActionPerformed
        // TODO add your handling code here:
        if (com_Resource_Name.getSelectedItem() == null || 
        com_Event_Name.getSelectedItem() == null || 
        com_Customer_Name.getSelectedItem() == null || 
        com_Services.getSelectedItem() == null || 
        txt_Ventor_Name.getText().equals("")||
        txt_Start_Date.getDate() == null || 
        txt_End_Date.getDate() == null ||
        txt_Mahal_Rent.getText().equals("")) 
        {
        JOptionPane.showMessageDialog(null, "Please Enter All Data", "Insert", JOptionPane.ERROR_MESSAGE);
        return; // Exit the method if validation fails
        }
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           java.sql.Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databaseName=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
           PreparedStatement pst = con.prepareStatement("exec add_resource ?,?,?,?,?,?,?,?");
           pst.setString(1, com_Resource_Name.getSelectedItem().toString());
           pst.setString(2, com_Event_Name.getSelectedItem().toString());
           pst.setString(3, com_Customer_Name.getSelectedItem().toString());
           pst.setString(4, com_Services.getSelectedItem().toString());
           pst.setString(5, txt_Ventor_Name.getText());
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           String date1 = sdf.format(txt_Start_Date.getDate());
           pst.setString(6, date1);
           SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
           String date2 = sdf1.format(txt_End_Date.getDate());
           pst.setString(7, date2);
           pst.setString(8, txt_Mahal_Rent.getText());
           int i = pst.executeUpdate();
           // Store entered data into string array      
           if(i!=0)
           {
               JOptionPane.showMessageDialog(this,"Resources Inserted Successfull","insert",JOptionPane.DEFAULT_OPTION);
               // Clear input fields
               com_Resource_Name.setSelectedIndex(-1);
               com_Event_Name.setSelectedIndex(-1);
               com_Customer_Name.setSelectedIndex(-1);
               com_Services.setSelectedIndex(-1);
               txt_Ventor_Name.setText(null);
               txt_Start_Date.setDate(null);
               txt_End_Date.setDate(null);
               txt_Mahal_Rent.setText(null);
           }
           else
            {
                JOptionPane.showMessageDialog(this,"Please fill all Field ","warning",JOptionPane.WARNING_MESSAGE);
            }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        fetch();
    }//GEN-LAST:event_btn_InsertActionPerformed

    private void Resources_TableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Resources_TableMouseClicked
        // TODO add your handling code here:
           int selectedRow = Resources_Table.getSelectedRow();
        // Set values to corresponding fields
           txt_Id.setText(Resources_Table.getValueAt(selectedRow, 0).toString());
           String com_Resource = Resources_Table.getValueAt(selectedRow,1).toString();
           for(int i=0; i<com_Resource_Name.getItemCount(); i++){
           if(com_Resource_Name.getItemAt(i).toString().equalsIgnoreCase(com_Resource)){
           com_Resource_Name.setSelectedIndex(i);
           }
           }
           String com_Event = Resources_Table.getValueAt(selectedRow,2).toString();
           for(int i=0; i<com_Event_Name.getItemCount(); i++){
           if(com_Event_Name.getItemAt(i).toString().equalsIgnoreCase(com_Event)){
           com_Event_Name.setSelectedIndex(i);
           }
           }
           String com_Customer = Resources_Table.getValueAt(selectedRow,3).toString();
           for(int i=0; i<com_Customer_Name.getItemCount(); i++){
           if(com_Customer_Name.getItemAt(i).toString().equalsIgnoreCase(com_Customer)){
           com_Customer_Name.setSelectedIndex(i);
           }
           }
            String com_Service = Resources_Table.getValueAt(selectedRow,4).toString();
           for(int i=0; i<com_Services.getItemCount(); i++){
           if(com_Services.getItemAt(i).toString().equalsIgnoreCase(com_Service)){
           com_Services.setSelectedIndex(i);
           }
           }
           txt_Start_Date.setDate((Date) Resources_Table.getValueAt(selectedRow, 6));
           txt_End_Date.setDate((Date) Resources_Table.getValueAt(selectedRow, 7));
           txt_Ventor_Name.setText(Resources_Table.getValueAt(selectedRow, 5).toString());
           txt_Mahal_Rent.setText(Resources_Table.getValueAt(selectedRow, 8).toString());
    }//GEN-LAST:event_Resources_TableMouseClicked

    private void btn_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_UpdateActionPerformed
        // TODO add your handling code here:
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databaseName=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
           int row = Resources_Table.getSelectedRow();
           String value = (Resources_Table.getModel().getValueAt(row, 0).toString());
           PreparedStatement pst = con.prepareStatement("exec update_resource ?,?,?,?,?,?,?,?,?");
           pst.setString(1, com_Resource_Name.getSelectedItem().toString());
           pst.setString(2, com_Event_Name.getSelectedItem().toString());
           pst.setString(3, com_Customer_Name.getSelectedItem().toString());
           pst.setString(4, com_Services.getSelectedItem().toString());
           pst.setString(5, txt_Ventor_Name.getText());
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           String date1 = sdf.format(txt_Start_Date.getDate());
           pst.setString(6, date1);
           SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
           String date2 = sdf1.format(txt_End_Date.getDate());
           pst.setString(7, date2);
           pst.setString(8, txt_Mahal_Rent.getText());
           pst.setString(9, txt_Id.getText());
           int i = pst.executeUpdate();
           if(i!=0)
           {
                JOptionPane.showMessageDialog(this,"Resources Updated Successfull","Update",JOptionPane.DEFAULT_OPTION);
           }
           else
           {
               JOptionPane.showMessageDialog(this,"Please fill all Field ","warning",JOptionPane.WARNING_MESSAGE);
           }
        }
        catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
        fetch();
    }//GEN-LAST:event_btn_UpdateActionPerformed

    private void btn_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_DeleteActionPerformed
        // TODO add your handling code here:
        try
        {
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           Connection con = DriverManager.getConnection("jdbc:sqlserver://DESKTOP-QBNMT1Q;databaseName=G_Art_Event_1;TrustServerCertificate=True;user=Rajesh;password=Rajesh");
           int row = Resources_Table.getSelectedRow();
           String value = (Resources_Table.getModel().getValueAt(row, 0).toString());
           PreparedStatement pst = con.prepareStatement("exec delete_resource ?");
           pst.setString(1, txt_Id.getText());
           int i = pst.executeUpdate();
           DefaultTableModel DFT = (DefaultTableModel) Resources_Table.getModel();
           DFT.setRowCount(0);
           if(i!=0)
           {
               JOptionPane.showMessageDialog(this,"Resources Deleted Successfull","Delete",JOptionPane.DEFAULT_OPTION);
           }
           else
           {
               JOptionPane.showMessageDialog(this,"Something Error ","Error",JOptionPane.ERROR_MESSAGE);
           }
        }
        catch(Exception ex)
        {
             JOptionPane.showMessageDialog(this, ex);
        }
        fetch();
    }//GEN-LAST:event_btn_DeleteActionPerformed

    private void com_Resource_NameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_com_Resource_NameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_com_Resource_NameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         dispose();
        Admin_Dashboard dash = new Admin_Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_clearActionPerformed
        // TODO add your handling code here:
        txt_Id.setText(null);
        com_Resource_Name.setSelectedIndex(-1);
        com_Event_Name.setSelectedIndex(-1);
        com_Customer_Name.setSelectedIndex(-1);
        com_Services.setSelectedIndex(-1);
        txt_Ventor_Name.setText(null);
        txt_Start_Date.setDate(null);
        txt_End_Date.setDate(null);
        txt_Mahal_Rent.setText(null);
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
            java.util.logging.Logger.getLogger(Resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resources.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resources().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Customer_Name;
    private javax.swing.JLabel Event_End_Date;
    private javax.swing.JLabel Event_Name;
    private javax.swing.JLabel Event_Start_Date;
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Mahal_Rent;
    private javax.swing.JLabel Resource_Name;
    private javax.swing.JLabel Resources;
    private javax.swing.JTable Resources_Table;
    private javax.swing.JLabel Services;
    private javax.swing.JLabel Ventor_Name;
    private javax.swing.JButton btn_Delete;
    private javax.swing.JButton btn_Insert;
    private javax.swing.JButton btn_Update;
    private javax.swing.JButton btn_clear;
    private javax.swing.JComboBox<String> com_Customer_Name;
    private javax.swing.JComboBox<String> com_Event_Name;
    private javax.swing.JComboBox<String> com_Resource_Name;
    private javax.swing.JComboBox<String> com_Services;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser txt_End_Date;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Mahal_Rent;
    private com.toedter.calendar.JDateChooser txt_Start_Date;
    private javax.swing.JTextField txt_Ventor_Name;
    // End of variables declaration//GEN-END:variables
class Items{
      private String Id; 
     public Items(String Id){
         this.Id = Id;
     }
     @Override
     public String toString(){
         return Id;
     }
}
}
