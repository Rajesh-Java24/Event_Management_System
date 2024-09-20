/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package g_art_event.pkg1;

import java.util.*;
import javax.mail.*;
import javax.mail.internet.*;
import javax.activation.*;
import javax.swing.JOptionPane;
import java.util.Properties;
import javax.mail.Message.RecipientType;
import javax.swing.JOptionPane;
import javax.swing.JFileChooser;
import java.io.*;

/**
 *
 * @author ADMIN
 */
public class Communication_Tools_1 extends javax.swing.JFrame {

    /** Creates new form Communication_Tools */
    String path;
    public Communication_Tools_1() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        To = new javax.swing.JLabel();
        txt_To = new javax.swing.JTextField();
        Subject = new javax.swing.JLabel();
        txt_Subject = new javax.swing.JTextField();
        Message = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Message = new javax.swing.JTextArea();
        btn_Send = new javax.swing.JButton();
        btn_Attachment = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, -1, -1));

        jPanel1.setPreferredSize(new java.awt.Dimension(600, 510));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        To.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        To.setText("To");
        jPanel1.add(To, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 130, 80, -1));

        txt_To.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jPanel1.add(txt_To, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 130, 300, -1));

        Subject.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Subject.setText("Subject");
        jPanel1.add(Subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, 80, -1));

        txt_Subject.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txt_Subject.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_SubjectActionPerformed(evt);
            }
        });
        jPanel1.add(txt_Subject, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, 300, -1));

        Message.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        Message.setText("Message");
        jPanel1.add(Message, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 100, -1));

        txt_Message.setColumns(20);
        txt_Message.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        txt_Message.setRows(5);
        jScrollPane1.setViewportView(txt_Message);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 280, 310, 175));

        btn_Send.setBackground(new java.awt.Color(0, 0, 0));
        btn_Send.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        btn_Send.setForeground(new java.awt.Color(255, 255, 255));
        btn_Send.setText("Send");
        btn_Send.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SendActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Send, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 450, -1, -1));

        btn_Attachment.setBackground(new java.awt.Color(0, 0, 0));
        btn_Attachment.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btn_Attachment.setForeground(new java.awt.Color(255, 255, 255));
        btn_Attachment.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_art_event/images/attachment.png"))); // NOI18N
        btn_Attachment.setText("Attachment");
        btn_Attachment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_AttachmentActionPerformed(evt);
            }
        });
        jPanel1.add(btn_Attachment, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 240, -1, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel3.setText("Communication");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 20, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_art_event/images/mail.1.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 600, 510));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 147, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/g_art_event/images/mailbg.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1410, 730));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
        Admin_Dashboard dash = new Admin_Dashboard();
        dash.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_SubjectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_SubjectActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_SubjectActionPerformed

    private void btn_SendActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SendActionPerformed
        // TODO add your handling code here:
        String From = "mkrajesh2000@gmail.com";
        String To = txt_To.getText();
        String Subject = txt_Subject.getText();
        String Message = txt_Message.getText(); // Renamed to messageBody
        String host = "localhost";

        Properties p = new Properties();
        p.put("mail.smtp.auth", "true");
        p.put("mail.smtp.starttls.enable", "true");
        p.put("mail.smtp.host", "smtp.gmail.com");
        p.put("mail.smtp.port", "587");
        Session s = Session.getDefaultInstance(p, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication("mkrajesh2000@gmail.com", "cvsa vdyl vncl cjmp");
            }
        });
        try {
            MimeMessage m = new MimeMessage(s);
            Multipart ms = new MimeMultipart();
            MimeBodyPart pdf = new MimeBodyPart();
            m.setFrom(new InternetAddress(From)); // Added InternetAddress
            m.addRecipient(javax.mail.Message.RecipientType.TO, new InternetAddress(To)); // Fully qualified name
            m.setSubject(Subject);
            m.setText(Message); // Updated to use messageBody
            if(path==null)
            {
                Transport.send(m);
                JOptionPane.showMessageDialog(this, "Successfully sent");
            }
            else
            {
                pdf.attachFile(path);
                ms.addBodyPart(pdf);
                m.setContent(ms);
                Transport.send(m);
                JOptionPane.showMessageDialog(this,"Successfully sent");
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_btn_SendActionPerformed

    private void btn_AttachmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_AttachmentActionPerformed
        // TODO add your handling code here:
        JFileChooser ch = new JFileChooser();
        ch.showOpenDialog(null);
        File f = ch.getSelectedFile();
        path = f.getAbsolutePath();

    }//GEN-LAST:event_btn_AttachmentActionPerformed

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
            java.util.logging.Logger.getLogger(Communication_Tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Communication_Tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Communication_Tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Communication_Tools.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Communication_Tools().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Message;
    private javax.swing.JLabel Subject;
    private javax.swing.JLabel To;
    private javax.swing.JButton btn_Attachment;
    private javax.swing.JButton btn_Send;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txt_Message;
    private javax.swing.JTextField txt_Subject;
    private javax.swing.JTextField txt_To;
    // End of variables declaration//GEN-END:variables

}
