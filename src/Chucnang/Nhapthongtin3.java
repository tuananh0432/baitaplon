package Chucnang;



import Bill.SinhvienT2;
import Bill.SinhvienT3;
import Login.Logout2;
import Login.Type2;
import javax.swing.JOptionPane;
import test52.Giangvien;
import test52.Score;
import test52.Sinhvien;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ASUS
 */
public class Nhapthongtin3 extends javax.swing.JFrame {
SinhvienT3 svT=new SinhvienT3();
ScoreChange sua =new ScoreChange();
    /**
     *
     */
    public Nhapthongtin3() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void resetForm() {
        ID.setText("");
        Name.setText("");
        Malop.setText("");
        nganh3.setText("");
        nganh1.setText("");
        nganh2.setText("");
        
    }

    public Score getModel() {
        Score sv = new Score();
        sv.setID(ID.getText().trim());
        sv.setMalop(Malop.getText().trim());
        sv.setTenSV(Name.getText().trim());
        sv.setNganh1(nganh1.getText().trim());
        sv.setNganh2(nganh2.getText().trim());
        sv.setNganh3(nganh3.getText().trim());
        
        return sv;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        ID = new javax.swing.JTextField();
        Name = new javax.swing.JTextField();
        Malop = new javax.swing.JTextField();
        nganh1 = new javax.swing.JTextField();
        Add = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        Luu = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        nganh2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        nganh3 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Sinh viên");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 120, 29));

        jLabel2.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel2.setText("ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 77, 30, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel3.setText("Tên Sinh viên");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 118, 110, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel4.setText("Mã lớp");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 159, 70, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel5.setText("Điểm ngành 1");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 205, 110, -1));

        ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IDActionPerformed(evt);
            }
        });
        getContentPane().add(ID, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 90, 340, 20));
        getContentPane().add(Name, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 340, 20));
        getContentPane().add(Malop, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 340, 20));
        getContentPane().add(nganh1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 200, 330, 20));

        Add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Icon Netbean/Icon Netbean/icons8-plus-+-48.png"))); // NOI18N
        Add.setText("Thêm");
        Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddActionPerformed(evt);
            }
        });
        getContentPane().add(Add, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 130, 50));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Icon Netbean/Icon Netbean/icons8-trash-can-48.png"))); // NOI18N
        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 130, 130, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Icon Netbean/Icon Netbean/icons8-edit-64.png"))); // NOI18N
        jButton3.setText("Sửa");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 130, 50));

        Luu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Icon Netbean/Icon Netbean/icons8-ok-48.png"))); // NOI18N
        Luu.setText("Lưu");
        Luu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LuuActionPerformed(evt);
            }
        });
        getContentPane().add(Luu, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, 130, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel6.setText("Điểm ngành 2");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 241, 110, -1));

        jButton5.setText("|<");
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 70, -1));

        jButton6.setText("|<");
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 70, -1));

        jButton7.setText("|<");
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 70, -1));

        jButton8.setText("|<");
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 450, 70, -1));
        getContentPane().add(nganh2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 240, 330, 20));

        jLabel8.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jLabel8.setText("Điểm ngành 3");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 110, -1));

        nganh3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nganh3ActionPerformed(evt);
            }
        });
        getContentPane().add(nganh3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 330, 20));

        jButton1.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/next2.png"))); // NOI18N
        jButton1.setText("Quay lại");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 370, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddActionPerformed
        resetForm();
    }//GEN-LAST:event_AddActionPerformed

    private void LuuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LuuActionPerformed
       Score sv= getModel();
 if( svT.add(sv)>0)
 {
       
            JOptionPane.showMessageDialog(this, "Thêm thành công");
 }
    }//GEN-LAST:event_LuuActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
 if(ID.getText().isEmpty())
       {
           JOptionPane.showMessageDialog(this, "Ban chua nhap sinh vien");
           
       }else {
           if (svT.delete(ID.getText())>0)
           {
                JOptionPane.showMessageDialog(this, "Xóa thành công");
           }       
    }//GEN-LAST:event_jButton2ActionPerformed
    }
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
 new JScore().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void nganh3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nganh3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nganh3ActionPerformed

    private void IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IDActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Type2 fLogin =new Type2();
       
       Logout2.LogOut(this, fLogin);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sinhvien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nhapthongtin3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Add;
    private javax.swing.JTextField ID;
    private javax.swing.JButton Luu;
    private javax.swing.JTextField Malop;
    private javax.swing.JTextField Name;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField nganh1;
    private javax.swing.JTextField nganh2;
    private javax.swing.JTextField nganh3;
    // End of variables declaration//GEN-END:variables
}
