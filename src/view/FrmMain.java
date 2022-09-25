/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AccountsController;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;

/**
 *
 * @author Scarleth
 */
public class FrmMain extends javax.swing.JFrame {

    public int id_user;
    public String file;
    AccountsController ac = new AccountsController();
    public PnlBG bg;
    public PnlER er;
    public PnlRF rf;

    /**
     * Creates new form FrmMain
     */
    public FrmMain() {
        initComponents();
        PnlMain fondo = new PnlMain();
        tpContent.add("¡Bienvenido!", fondo);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlContent = new javax.swing.JPanel();
        tpContent = new javax.swing.JTabbedPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        btnMyFiles = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        btnLogout = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        btnClosePage = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Inicio : Sistema de razones financieras");
        setResizable(false);

        pnlContent.setBackground(new java.awt.Color(0, 0, 0));
        pnlContent.setMaximumSize(new java.awt.Dimension(700, 500));
        pnlContent.setLayout(new java.awt.BorderLayout());

        tpContent.setBackground(new java.awt.Color(0, 0, 0));
        tpContent.setTabPlacement(javax.swing.JTabbedPane.BOTTOM);
        tpContent.setMaximumSize(new java.awt.Dimension(700, 500));
        tpContent.setMinimumSize(new java.awt.Dimension(700, 500));
        tpContent.setPreferredSize(new java.awt.Dimension(700, 500));
        pnlContent.add(tpContent, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlContent, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 0));
        jMenuBar1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuBar1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N

        btnMyFiles.setForeground(new java.awt.Color(255, 255, 255));
        btnMyFiles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/settings-icon.png"))); // NOI18N
        btnMyFiles.setText("Configuración");
        btnMyFiles.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMyFilesMouseClicked(evt);
            }
        });

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/file.png"))); // NOI18N
        jMenu6.setText("Mis archivos");
        jMenu6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu6MouseClicked(evt);
            }
        });
        btnMyFiles.add(jMenu6);

        btnLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close-box.png"))); // NOI18N
        btnLogout.setText("Cerrar sesion");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnMyFiles.add(btnLogout);

        jMenuBar1.add(btnMyFiles);

        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/bg.png"))); // NOI18N
        jMenu2.setText("Balance General");
        jMenu2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/er.png"))); // NOI18N
        jMenu3.setText("Estado de resultado");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu3MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu3);

        jMenu4.setForeground(new java.awt.Color(255, 255, 255));
        jMenu4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/rf.png"))); // NOI18N
        jMenu4.setText("Razones Financieras");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        btnClosePage.setBackground(new java.awt.Color(51, 51, 51));
        btnClosePage.setForeground(new java.awt.Color(255, 255, 255));
        btnClosePage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close-page.png"))); // NOI18N
        btnClosePage.setText("Cerrar pestaña");
        btnClosePage.setEnabled(false);
        btnClosePage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClosePageMouseClicked(evt);
            }
        });
        jMenuBar1.add(btnClosePage);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void setId(int id_user) {
        this.id_user = id_user;
    }
    private void jMenu2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        CreateFile("Balance General", "BG_");
        if (ComprobationPages("Balance General") == false) {
            JOptionPane.showMessageDialog(this, "Ya tienes abierta una pestaña.");
        } else {
            bg = new PnlBG(id_user, file);
            tpContent.add("Balance General", bg);
            btnClosePage.setEnabled(true);
        }

    }//GEN-LAST:event_jMenu2MouseClicked


    private void btnClosePageMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClosePageMouseClicked
        if (bg.guardado == false) {
            if (tpContent.getComponentCount() == 1) {
                if (JOptionPane.showConfirmDialog(this, "¿Desea cerrar la pestaña?") == 0) {
                    //No se guardaran los datos
                    tpContent.remove(tpContent.getSelectedIndex());
                    if (tpContent.getTitleAt(tpContent.getSelectedIndex()).equals("Balance General")) {
                        ac.deleteFile(getIdFIle("BG_" + bg.lblFileName.getText()));
                    } else if (tpContent.getTitleAt(tpContent.getSelectedIndex()).equals("Estado de resultado")) {
                        ac.deleteFile(getIdFIle("ER_"));
                    } else if (tpContent.getTitleAt(tpContent.getSelectedIndex()).equals("Razones FInancieras")) {
                        ac.deleteFile(getIdFIle("RF_"));
                    }
                    btnClosePage.setEnabled(false);
                }

            } else if (tpContent.getComponentCount() > 1) {
                if (JOptionPane.showConfirmDialog(this, "¿Desea cerrar el documento?") == 0) {
                    //Se guardaran los datos
                    if (tpContent.getTitleAt(tpContent.getSelectedIndex()).equals("Balance General")) {
                        ac.deleteFile(getIdFIle("BG_" + bg.lblFileName.getText()));
                    } else if (tpContent.getTitleAt(tpContent.getSelectedIndex()).equals("Estado de resultado")) {
                        ac.deleteFile(getIdFIle("ER_"));
                    } else if (tpContent.getTitleAt(tpContent.getSelectedIndex()).equals("Razones FInancieras")) {
                        ac.deleteFile(getIdFIle("RF_"));
                    }
                    tpContent.remove(tpContent.getSelectedIndex());

                }
            }
        }else{
            if (tpContent.getComponentCount() == 1) {
                if (JOptionPane.showConfirmDialog(this, "¿Desea cerrar la pestaña?") == 0) {
                    //No se guardaran los datos
                    tpContent.remove(tpContent.getSelectedIndex());                   
                    btnClosePage.setEnabled(false);
                }

            } else if (tpContent.getComponentCount() > 1) {
                if (JOptionPane.showConfirmDialog(this, "¿Desea cerrar el documento?") == 0) {
                    tpContent.remove(tpContent.getSelectedIndex());
                }
            }
        } 

    }//GEN-LAST:event_btnClosePageMouseClicked

    private void jMenu3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MouseClicked
        CreateFile("Estado de resultado", "ER_");
        if (ComprobationPages("Estado de resultado") == false) {
            JOptionPane.showMessageDialog(this, "Ya tienes abierta una pestaña.");
        } else {
            er = new PnlER();
            tpContent.add("Estado de resultado", er);
            btnClosePage.setEnabled(true);
        }
    }//GEN-LAST:event_jMenu3MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
        CreateFile("Razones Financieras", "RF_");
        if (ComprobationPages("Razones Financieras") == false) {
            JOptionPane.showMessageDialog(this, "Ya tienes abierta una pestaña.");
        } else {
            rf = new PnlRF();
            tpContent.add("Razones Financieras", rf);
            btnClosePage.setEnabled(true);
        }
    }//GEN-LAST:event_jMenu4MouseClicked

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        //cerrar sesion
        if (JOptionPane.showConfirmDialog(this, "¿Quiere cerrar su sesion?") == 0) {
            FrmLogin login = new FrmLogin();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void jMenu6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu6MouseClicked
        DlgMyFiles files = new DlgMyFiles(this, true);
        files.setLocationRelativeTo(this);
        files.setUser(id_user);
        files.setVisible(true);

    }//GEN-LAST:event_jMenu6MouseClicked

    private void btnMyFilesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMyFilesMouseClicked


    }//GEN-LAST:event_btnMyFilesMouseClicked

    private boolean ComprobationPages(String name) {
        boolean rs = true;
        for (int i = 0; i < tpContent.getComponentCount(); i++) {
            if (tpContent.getTitleAt(i).equals(name)) {
                rs = false;
            }
        }

        return rs;
    }

    private void CreateFile(String FinanceState, String AvFN) {
        boolean flag = true;
        while (flag) {
            file = JOptionPane.showInputDialog("Nombre del archivo de " + FinanceState + ":");
            if (file.isEmpty()) {
                //El archivo no tiene nombre
                flag = true;
            } else {
                //El archivo tiene nombre
                flag = false;
                ac.CreateFile(file, id_user, AvFN);
            }
        }

    }

    public int getIdFIle(String extension) {
        int id_file = 0;
        for (int j = 0; j < ac.getFiles(id_user).size(); j++) {

            if (ac.getFiles(id_user).get(j).getName().equals(extension)) {
                id_file = ac.getFiles(id_user).get(j).getId_file();
            }
        }

        return id_file;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        UIManager.put("nimbusBase", Color.BLACK);
        UIManager.put("nimbusFocus", Color.GRAY);
        UIManager.put("nimbusSelectionBackground", Color.GRAY);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMain().setVisible(true);
            }
        });
    }

    public class PnlMain extends JPanel {

        private Image imagen;

        public PnlMain() {

            imagen = new ImageIcon(getClass().getResource("/resources/background-img.png")).getImage();

        }

        @Override
        public void paint(Graphics g) {
            g.drawImage(imagen, 0, 0, getWidth(), getHeight(),
                    this);

            setOpaque(false);
            super.paint(g);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu btnClosePage;
    private javax.swing.JMenu btnLogout;
    private javax.swing.JMenu btnMyFiles;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel pnlContent;
    private javax.swing.JTabbedPane tpContent;
    // End of variables declaration//GEN-END:variables
}
