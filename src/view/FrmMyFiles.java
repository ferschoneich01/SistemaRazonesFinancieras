/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AccountsController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.accountsTableModel;
import model.file;
import model.file_detail;
import view.EF.FrmBG;
import view.EF.FrmER;

/**
 *
 * @author Scarleth
 */
public class FrmMyFiles extends javax.swing.JFrame {

    private int id_user;
    AccountsController ac = new AccountsController();
    ArrayList<file> fileList;

    /**
     * Creates new form FrmMyFiles
     */
    public FrmMyFiles() {
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
        jScrollPane1 = new javax.swing.JScrollPane();
        TreeFiles = new javax.swing.JTree();
        jLabel1 = new javax.swing.JLabel();
        btnDelete = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mis archivos");

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        TreeFiles.setBackground(new java.awt.Color(102, 102, 102));
        TreeFiles.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Balance Ganeral");
        javax.swing.tree.DefaultMutableTreeNode treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("BG_ENERO_2022");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Estado de resulado");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ER_FEBRERO_2019");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Razones Financieras");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("RF_FEBRERO_2019");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        TreeFiles.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        TreeFiles.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        TreeFiles.setRootVisible(false);
        jScrollPane1.setViewportView(TreeFiles);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Mis archivos");

        btnDelete.setBackground(new java.awt.Color(204, 0, 0));
        btnDelete.setForeground(new java.awt.Color(255, 255, 255));
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close-page.png"))); // NOI18N
        btnDelete.setText("Eliminar");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 153, 255));
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/eye.png"))); // NOI18N
        jButton2.setText("Ver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        if (fileSelected(TreeFiles)) {
            if (TreeFiles.getSelectionCount() < 1) {
                JOptionPane.showMessageDialog(this, "Porfavor seleccione un archivo");
            } else {
                if (JOptionPane.showConfirmDialog(this, "¿Desea eliminar el archivo?") == 0) {

                    ac.deleteFile(getIdFIle(fileList.get(obtenerIndiceSeleccionadoEnJTree(TreeFiles) - 1).getName()));
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un archivo");
        }


    }//GEN-LAST:event_btnDeleteActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (fileSelected(TreeFiles)) {
            if (TreeFiles.getSelectionCount() < 1) {
                JOptionPane.showMessageDialog(this, "Porfavor seleccione un archivo");
            } else {

                String fileName = fileList.get(obtenerIndiceSeleccionadoEnJTree(TreeFiles) - 1).getName();
                char[] cadena = fileName.toCharArray();
                int id_file = getIdFIle(fileList.get(obtenerIndiceSeleccionadoEnJTree(TreeFiles) - 1).getName());
                if (cadena[0] == 'E' && cadena[1] == 'R') {
                    //lista de cuentas en el balance
                    ArrayList<accountsTableModel> cuentas = ac.getAccountsTable(id_file);
                    file_detail details = ac.getFileDetails(id_file);
                    //Lista de ingresos
                    ArrayList<accountsTableModel> ingresos = new ArrayList<accountsTableModel>();
                    //Lista de costos
                    ArrayList<accountsTableModel> costos = new ArrayList<accountsTableModel>();
                    //Lista de gastos
                    ArrayList<accountsTableModel> gastos = new ArrayList<accountsTableModel>();
                    //Lista de ingresos y gastos no operativos
                    ArrayList<accountsTableModel> ing_gas_no_ope = new ArrayList<accountsTableModel>();
                    //Lista de descuentos y devoluciones
                    ArrayList<accountsTableModel> desdev = new ArrayList<accountsTableModel>();

                    //Total ingresos
                    float totingresos = 0;
                    //Total descuentos y devoluciones
                    float desdevtot = 0;
                    //Total costos
                    float totcostos = 0;
                    //Total gastos
                    float totgastos = 0;
                    //Ingresos no operacionales
                    float totingnoope = 0;
                    //Gastos no operacionales
                    float totgasnoope = 0;
                    
                    for (int i = 0; i < cuentas.size(); i++) {
                        System.out.printf(cuentas.get(i).getTipo());
                        switch (cuentas.get(i).getTipo()) {
                            case "Ingresos":
                                ingresos.add(cuentas.get(i));
                                totingresos += Float.parseFloat(cuentas.get(i).Monto);
                                break;
                            case "Costos":
                                costos.add(cuentas.get(i));
                                totcostos += Float.parseFloat(cuentas.get(i).Monto);
                                break;
                            case "Gastos":
                                gastos.add(cuentas.get(i));
                                totgastos += Float.parseFloat(cuentas.get(i).Monto);
                                break;
                            case "Ingresos No Operacionales":
                                ing_gas_no_ope.add(cuentas.get(i));
                                totingnoope += Float.parseFloat(cuentas.get(i).Monto);
                                break;
                            case "Gastos No Operacionales":
                                ing_gas_no_ope.add(cuentas.get(i));
                                totgasnoope += Float.parseFloat(cuentas.get(i).Monto);
                                break;
                            case "Descuentos":
                            case "Devolciones":
                                desdev.add(cuentas.get(i));
                                desdevtot += Float.parseFloat(cuentas.get(i).Monto);
                                break;
                            default:
                                break;
                        }

                    }
                    totingresos -= desdevtot;
                    //utilidad bruta
                    float utilidadB = totingresos - totcostos;
                    //utilidad de operación
                    float utilidadOP = utilidadB - totgastos;
                    //Utilidad antes de impuestos
                    float utilidadantimp = utilidadOP + totingnoope - totgasnoope;
                    //Impuestos IR 30%
                    float  porcentaje = Float.parseFloat(details.getIr()+"") / 100;
                    float impuestos = utilidadantimp * porcentaje;
                    //Utilidad neta
                    float utilidadneta = utilidadantimp - impuestos;
                    //Utilidad retenida
                    float utilidadretenida = 0.0f;
                    if (!(details.getDividendos()+"").isEmpty()) {
                        try {
                            utilidadretenida = utilidadneta - Float.parseFloat(details.getDividendos()+"");
                        } catch (NumberFormatException ex) {
                            utilidadretenida = 0.0f;
                        }

                    }
                    
                    //Mostramos el estado de resultado
                    FrmER erGenerated = new FrmER();
                    erGenerated.setLocationRelativeTo(this);
                    erGenerated.setVisible(true);
                    erGenerated.setData(ingresos, costos, gastos, desdev, ing_gas_no_ope, details.getEmpresa(), details.getPeriodo(), totingresos, totcostos, totgastos, utilidadB, utilidadOP, utilidadantimp, impuestos, utilidadneta, utilidadretenida, details.getDividendos()+"");

                } else if (cadena[0] == 'B' && cadena[1] == 'G') {

                    //lista de cuentas en el balance
                    ArrayList<accountsTableModel> cuentas = ac.getAccountsTable(id_file);
                    file_detail details = ac.getFileDetails(id_file);
                    //Lista de activos
                    ArrayList<accountsTableModel> activos = new ArrayList<accountsTableModel>();
                    //Lista de pasivos
                    ArrayList<accountsTableModel> pasivos = new ArrayList<accountsTableModel>();
                    //Lista de capital
                    ArrayList<accountsTableModel> capital = new ArrayList<accountsTableModel>();
                    //Total activos
                    float totact = 0;
                    //Total pasivos
                    float totpas = 0;
                    //Total Capital
                    float totcap = 0;
                    //Balance
                    String balance;
                    //activos + pasivos
                    float actpas = 0;

                    for (int i = 0; i < cuentas.size(); i++) {
                        if (cuentas.get(i).getTipo().equals("activo")) {
                            activos.add(cuentas.get(i));
                            totact += Float.parseFloat(cuentas.get(i).Monto);
                        } else if (cuentas.get(i).getTipo().equals("pasivo")) {
                            pasivos.add(cuentas.get(i));
                            totpas += Float.parseFloat(cuentas.get(i).Monto);
                        } else if (cuentas.get(i).getTipo().equals("capital")) {
                            capital.add(cuentas.get(i));
                            totcap += Float.parseFloat(cuentas.get(i).Monto);
                        }
                    }

                    //suma de capital+ pasivos
                    actpas = totcap + totpas;

                    //cade de texto de balance
                    balance = totact + " = " + actpas;

                    //Mostramos el balance
                    FrmBG bgGenerated = new FrmBG();
                    bgGenerated.setLocationRelativeTo(this);
                    bgGenerated.setVisible(true);
                    bgGenerated.setData(activos, pasivos, capital, details.getEmpresa(), details.getPeriodo(), balance, totact + "", totpas + "", totcap + "");

                }
                if (cadena[0] == 'R' && cadena[1] == 'F') {

                }

            }
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor seleccione un archivo");
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private boolean fileSelected(javax.swing.JTree arbol) {
        // JTree auxiliar
        javax.swing.JTree aux = new javax.swing.JTree(arbol.getModel());
        // expande los nodos del JTree auxiliar para luego obtener el numero de fila correctamente
        for (int i = 0; i < aux.getRowCount(); i++) {
            aux.expandRow(i);
        }

        if ((aux.getRowForPath(arbol.getSelectionPath()) - 1) > 0) {
            return true;
        } else {
            return false;
        }
    }

    private int obtenerIndiceSeleccionadoEnJTree(javax.swing.JTree arbol) {
        // JTree auxiliar
        javax.swing.JTree aux = new javax.swing.JTree(arbol.getModel());
        // expande los nodos del JTree auxiliar para luego obtener el numero de fila correctamente
        for (int i = 0; i < aux.getRowCount(); i++) {
            aux.expandRow(i);
        }
        // Obtiene el numero de fila del elemento seleccionado basandose en la ruta hasta el elemento
        return aux.getRowForPath(arbol.getSelectionPath()) - 1;
    }

    public void setUser(int id_user) {
        this.id_user = id_user;
        AccountsController ac = new AccountsController();
        fileList = ac.getFiles(id_user);
        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        javax.swing.tree.DefaultMutableTreeNode treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Archivos");
        javax.swing.tree.DefaultMutableTreeNode treeNode3;
        for (int i = 0; i < fileList.size(); i++) {
            treeNode3 = new javax.swing.tree.DefaultMutableTreeNode(fileList.get(i).getName());
            treeNode2.add(treeNode3);
            System.out.println(fileList.get(i).getName());
        }

        treeNode1.add(treeNode2);
        /*treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Estado de resulado");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("ER_FEBRERO_2019");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);
        treeNode2 = new javax.swing.tree.DefaultMutableTreeNode("Razones Financieras");
        treeNode3 = new javax.swing.tree.DefaultMutableTreeNode("RF_FEBRERO_2019");
        treeNode2.add(treeNode3);
        treeNode1.add(treeNode2);*/
        TreeFiles.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));

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
            java.util.logging.Logger.getLogger(FrmMyFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMyFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMyFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMyFiles.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMyFiles().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTree TreeFiles;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
