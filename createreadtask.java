
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author AHMAD BARIQ
 */
public class frame1 extends javax.swing.JFrame {
    
    /**
     * Creates new form frame1
     */
    public frame1() {
        initComponents();
    }
    
    private int Validation(){
        int flag = 0;
        String error ="";
        if(jtfname.getText().equals("")){
            flag = 1;
            error += "Name Can't be blank.n";            
        }
        if(jtflength.getText().equals("")){
            flag = 1;
            error += "Lenght Can't be blank.n";            
        }
        if (jtfwidth.getText().equals("")){
            flag = 1;
            error += "Width Can't be blank.n";            
        }
        if (jtfprice.getText().equals("")){
            flag = 1;
            error += "Price Can't be blank.n";            
        }
        else
        {
            JOptionPane.showMessageDialog(this, error);
        }
        return flag;
    }

    public void ClearForm(){
    jtfid.setText(null);
    jtfname.setText(null);
    jtflength.setText(null);
    jtfwidth.setText(null);
    jtfprice.setText(null);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblplayerX = new javax.swing.JLabel();
        lblplayerX1 = new javax.swing.JLabel();
        lblplayerX2 = new javax.swing.JLabel();
        lblplayerX3 = new javax.swing.JLabel();
        lblplayerX4 = new javax.swing.JLabel();
        jtfprice = new javax.swing.JTextField();
        jtfid = new javax.swing.JTextField();
        jtflength = new javax.swing.JTextField();
        jtfwidth = new javax.swing.JTextField();
        jtfname = new javax.swing.JTextField();
        jbtnadd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblplayerX.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblplayerX.setForeground(new java.awt.Color(255, 255, 255));
        lblplayerX.setText("PRICE");
        jPanel1.add(lblplayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 90, -1));

        lblplayerX1.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblplayerX1.setForeground(new java.awt.Color(255, 255, 255));
        lblplayerX1.setText("ID");
        jPanel1.add(lblplayerX1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, -1));

        lblplayerX2.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblplayerX2.setForeground(new java.awt.Color(255, 255, 255));
        lblplayerX2.setText("NAME");
        jPanel1.add(lblplayerX2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 90, -1));

        lblplayerX3.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblplayerX3.setForeground(new java.awt.Color(255, 255, 255));
        lblplayerX3.setText("LENGTH");
        jPanel1.add(lblplayerX3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 90, -1));

        lblplayerX4.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        lblplayerX4.setForeground(new java.awt.Color(255, 255, 255));
        lblplayerX4.setText("WIDTH");
        jPanel1.add(lblplayerX4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 90, -1));

        jtfprice.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(jtfprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 220, 30));

        jtfid.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(jtfid, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 70, 220, 30));

        jtflength.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(jtflength, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 220, 30));

        jtfwidth.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(jtfwidth, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 250, 220, 30));

        jtfname.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jPanel1.add(jtfname, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 220, 30));

        jbtnadd.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jbtnadd.setText("ADD");
        jbtnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnaddActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 400, -1, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 450));

        pack();
    }// </editor-fold>                        

    private void jbtnaddActionPerformed(java.awt.event.ActionEvent evt) {                                        
        // TODO add your handling code here:
        if(Validation() == 0){
            String id = jtfid.getText();
            String name = jtfname.getText();
            String lenght = jtflength.getText();
            String width = jtfwidth.getText();
            String price = jtfprice.getText();
    
            try
            {
                koneksi konek = new koneksi() {};
                Connection connect = konek.open();
                String sql = "insert Lapangan values (?,?,?,?,?)";
                PreparedStatement ps = koneksi.prepareStatement(sql);      
                ps.setString(1, id);
                ps.setString(2, name);
                ps.setString(3, lenght);
                ps.setString(4, width);
                ps.setString(5, price);
                
                int rows = ps.executeUpdate();
                
                if(rows!=0)
                {
                   JOptionPane.showConfirmDialog(null, "ADD SUCCES");
                }
                else
                {
                 JOptionPane.showConfirmDialog(null, "ERROR");
                }
            }
            catch(Exception e)
            {
                System.err.print(e);
            }
        }
    }                                       

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
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtnadd;
    private javax.swing.JTextField jtfid;
    private javax.swing.JTextField jtflength;
    private javax.swing.JTextField jtfname;
    private javax.swing.JTextField jtfprice;
    private javax.swing.JTextField jtfwidth;
    private javax.swing.JLabel lblplayerX;
    private javax.swing.JLabel lblplayerX1;
    private javax.swing.JLabel lblplayerX2;
    private javax.swing.JLabel lblplayerX3;
    private javax.swing.JLabel lblplayerX4;
    // End of variables declaration                   

}
