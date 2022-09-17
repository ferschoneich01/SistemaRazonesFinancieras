/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.UsersController;
import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import model.users;

/**
 *
 * @author Fernando
 */
public class FrmLogin extends javax.swing.JFrame {

    private UsersController uc = new UsersController();

    /**
     * Creates new form FrmLogin
     */
    public FrmLogin() {
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnlContentLogin = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtNombreUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnAcceder = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        pnlContentRegister = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        txtContrasenaReg = new javax.swing.JPasswordField();
        jLabel8 = new javax.swing.JLabel();
        btnGuardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtNombreCompleto = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtNombreUsuarioReg = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtConfirmarContrasenaReg = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Iniciar sesion");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        pnlContentLogin.setBackground(new java.awt.Color(102, 102, 102));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre de usuario:");

        txtNombreUsuario.setBackground(new java.awt.Color(102, 102, 102));
        txtNombreUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNombreUsuario.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUsuario.setText("admin");
        txtNombreUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        btnAcceder.setBackground(new java.awt.Color(0, 153, 51));
        btnAcceder.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnAcceder.setForeground(new java.awt.Color(255, 255, 255));
        btnAcceder.setText("Acceder");
        btnAcceder.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 51), 1, true));
        btnAcceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAccederActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Iniciar sesion");

        txtContrasena.setBackground(new java.awt.Color(102, 102, 102));
        txtContrasena.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtContrasena.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasena.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasena.setText("admin123");
        txtContrasena.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        javax.swing.GroupLayout pnlContentLoginLayout = new javax.swing.GroupLayout(pnlContentLogin);
        pnlContentLogin.setLayout(pnlContentLoginLayout);
        pnlContentLoginLayout.setHorizontalGroup(
            pnlContentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLoginLayout.createSequentialGroup()
                .addGroup(pnlContentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentLoginLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(pnlContentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(txtNombreUsuario)
                            .addComponent(txtContrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)))
                    .addGroup(pnlContentLoginLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pnlContentLoginLayout.setVerticalGroup(
            pnlContentLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentLoginLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(btnAcceder, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pnlContentRegister.setBackground(new java.awt.Color(102, 102, 102));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contraseña:");

        txtContrasenaReg.setBackground(new java.awt.Color(102, 102, 102));
        txtContrasenaReg.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtContrasenaReg.setForeground(new java.awt.Color(255, 255, 255));
        txtContrasenaReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtContrasenaReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nombre completo:");

        btnGuardar.setBackground(new java.awt.Color(0, 51, 255));
        btnGuardar.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 102, 51), 1, true));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Registrarme");

        txtNombreCompleto.setBackground(new java.awt.Color(102, 102, 102));
        txtNombreCompleto.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreCompleto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreCompleto.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Nombre de usuario:");

        txtNombreUsuarioReg.setBackground(new java.awt.Color(102, 102, 102));
        txtNombreUsuarioReg.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtNombreUsuarioReg.setForeground(new java.awt.Color(255, 255, 255));
        txtNombreUsuarioReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreUsuarioReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Confirmar contraseña:");

        txtConfirmarContrasenaReg.setBackground(new java.awt.Color(102, 102, 102));
        txtConfirmarContrasenaReg.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        txtConfirmarContrasenaReg.setForeground(new java.awt.Color(255, 255, 255));
        txtConfirmarContrasenaReg.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtConfirmarContrasenaReg.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 153, 153), 1, true));

        javax.swing.GroupLayout pnlContentRegisterLayout = new javax.swing.GroupLayout(pnlContentRegister);
        pnlContentRegister.setLayout(pnlContentRegisterLayout);
        pnlContentRegisterLayout.setHorizontalGroup(
            pnlContentRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentRegisterLayout.createSequentialGroup()
                .addGroup(pnlContentRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentRegisterLayout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(pnlContentRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContentRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel10)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9)
                                .addComponent(jLabel8)
                                .addComponent(txtNombreCompleto)
                                .addComponent(txtContrasenaReg, javax.swing.GroupLayout.DEFAULT_SIZE, 283, Short.MAX_VALUE)
                                .addComponent(txtNombreUsuarioReg))
                            .addComponent(jLabel11)
                            .addComponent(txtConfirmarContrasenaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlContentRegisterLayout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        pnlContentRegisterLayout.setVerticalGroup(
            pnlContentRegisterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentRegisterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombreUsuarioReg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContrasenaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtConfirmarContrasenaReg, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Sistema de razones financieras");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("¡Bienvenido!");

        jLabel6.setForeground(new java.awt.Color(0, 255, 51));
        jLabel6.setText("Inciar sesion para comenzar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(17, Short.MAX_VALUE)
                        .addComponent(pnlContentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(pnlContentRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pnlContentRegister, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel6)
                        .addGap(8, 8, 8)
                        .addComponent(pnlContentLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cleanInputs() {
        txtNombreUsuario.setText("");
        txtContrasena.setText("");
        txtNombreCompleto.setText("");
        txtNombreUsuarioReg.setText("");
        txtContrasenaReg.setText("");
        txtConfirmarContrasenaReg.setText("");
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        users u = new users();
        //extraemos contraseña de passwordfield
        char[] arrayCreg = txtContrasenaReg.getPassword();
        String passreg = new String(arrayCreg);
        char[] arrayC = txtContrasena.getPassword();
        String pass = new String(arrayC);
        char[] arrayCC = txtConfirmarContrasenaReg.getPassword();
        String passC = new String(arrayCC);

        //comprobamos si los campos estan llenos
        if (!txtNombreCompleto.getText().equals("") && !txtNombreUsuarioReg.getText().equals("") && !passreg.equals("") && !passC.equals("")) {
            if (passC.equals(passreg)) {
                u.setFullname(txtNombreCompleto.getText());
                u.setUsername(txtNombreUsuarioReg.getText());
                u.setPassword(passreg);
                //Agregamos un nuevo usuario
                uc.AgregarUsuarios(u);
                cleanInputs();
            } else {
                JOptionPane.showMessageDialog(this, "Contraseñas no coiciden");
                cleanInputs();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor Complete todos los campos");
            cleanInputs();
        }

    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAccederActionPerformed
        // TODO add your handling code here:
        //comprobamos si el usuario existe

        users u = new users();
        char[] arrayC = txtContrasena.getPassword();
        String pass = new String(arrayC);

        if (!txtNombreUsuario.getText().equals("") && !txtContrasena.getText().equals("")) {
            if (uc.getUser(txtNombreUsuario.getText()).getId_user() > 0) {
                u = uc.getUser(txtNombreUsuario.getText());
                if (pass.equals(u.getPassword())) {
                    JOptionPane.showMessageDialog(this, "¡Bienvenido al sistema!");
                    FrmMain main = new FrmMain();
                    main.setLocationRelativeTo(this);
                    main.setVisible(true);
                    main.setId(uc.getUser(txtNombreUsuario.getText()).getId_user());
                    this.dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Contraseña incorrecta");
                    cleanInputs();
                }
            } else {
                JOptionPane.showMessageDialog(this, "El usuario no existe");
                cleanInputs();
            }
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor rellene todos los campos");
            cleanInputs();
        }

    }//GEN-LAST:event_btnAccederActionPerformed

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
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAcceder;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnlContentLogin;
    private javax.swing.JPanel pnlContentRegister;
    private javax.swing.JPasswordField txtConfirmarContrasenaReg;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JPasswordField txtContrasenaReg;
    private javax.swing.JTextField txtNombreCompleto;
    private javax.swing.JTextField txtNombreUsuario;
    private javax.swing.JTextField txtNombreUsuarioReg;
    // End of variables declaration//GEN-END:variables
}
