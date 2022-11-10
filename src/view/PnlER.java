/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.AccountsController;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.accounts;
import model.accountsTableModel;
import model.accounts_finance_state;
import view.EF.FrmER;

/**
 *
 * @author Scarleth
 */
public class PnlER extends javax.swing.JPanel {
    AccountsController ac = new AccountsController();
    ArrayList<accounts_finance_state> lista = ac.getAccounts("ER");
    ArrayList<accounts> listaAccounts = new ArrayList<accounts>();
    public int id_user;
    public String file_name;
    public int id_file;
    //variable que indica si el archivo esta guardado
    public boolean guardado = false;
    /**
     * Creates new form PnlER
     */
    public PnlER(int id_user, String file_name, int id_file) {
        initComponents();
        for (int i = 0; i < ac.getAccounts("ER").size(); i++) {
            cbxCuentas.addItem(lista.get(i).getName());
        }
        this.id_user = id_user;
        this.file_name = file_name;
        lblFileName.setText(file_name);
        this.id_file = id_file;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        pnlContentControlss = new javax.swing.JPanel();
        cbxCuentas = new javax.swing.JComboBox<>();
        txtPeriodo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtAgregarCuenta = new javax.swing.JTextField();
        btnGuardarcuenta = new javax.swing.JButton();
        cbxTipoCuentas = new javax.swing.JComboBox<>();
        btnAgregarCuenta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        txtNombreEmpresa = new javax.swing.JTextField();
        btnEliminarCuenta = new javax.swing.JButton();
        txtAmount = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        spContentTable = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        btnGenerarBalance = new javax.swing.JButton();
        lblFileName = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtIR = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtDividendos = new javax.swing.JTextField();

        setBackground(new java.awt.Color(0, 0, 0));
        setMaximumSize(new java.awt.Dimension(700, 500));
        setMinimumSize(new java.awt.Dimension(700, 500));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("ESTADO DE RESULTADO");

        pnlContentControlss.setBackground(new java.awt.Color(0, 0, 0));

        cbxCuentas.setBackground(new java.awt.Color(0, 0, 0));
        cbxCuentas.setForeground(new java.awt.Color(255, 255, 255));
        cbxCuentas.setToolTipText("");
        cbxCuentas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(255, 255, 255), new java.awt.Color(255, 255, 255), new java.awt.Color(0, 0, 0), new java.awt.Color(102, 102, 102)));

        txtPeriodo.setBackground(new java.awt.Color(0, 0, 0));
        txtPeriodo.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtPeriodo.setForeground(new java.awt.Color(204, 204, 204));
        txtPeriodo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPeriodo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccionar Cuenta:");

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Periodo:");

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Agregar cuenta a la lista:");

        txtAgregarCuenta.setBackground(new java.awt.Color(0, 0, 0));
        txtAgregarCuenta.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtAgregarCuenta.setForeground(new java.awt.Color(204, 204, 204));
        txtAgregarCuenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAgregarCuenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btnGuardarcuenta.setBackground(new java.awt.Color(0, 153, 51));
        btnGuardarcuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnGuardarcuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/save-icon.png"))); // NOI18N
        btnGuardarcuenta.setText("Agregar");
        btnGuardarcuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarcuentaActionPerformed(evt);
            }
        });

        cbxTipoCuentas.setBackground(new java.awt.Color(0, 0, 0));
        cbxTipoCuentas.setForeground(new java.awt.Color(255, 255, 255));
        cbxTipoCuentas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Tipo de Cuenta", "Ingresos", "Costos", "Gastos", "Ingresos No Operacionales", "Gastos No Operacionales", "Descuentos", "Devoluciones" }));

        btnAgregarCuenta.setBackground(new java.awt.Color(0, 51, 255));
        btnAgregarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnAgregarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/content-save.png"))); // NOI18N
        btnAgregarCuenta.setText("Guardar");
        btnAgregarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarCuentaActionPerformed(evt);
            }
        });

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Nombre de la empresa:");

        txtNombreEmpresa.setBackground(new java.awt.Color(0, 0, 0));
        txtNombreEmpresa.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtNombreEmpresa.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreEmpresa.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombreEmpresa.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        btnEliminarCuenta.setBackground(new java.awt.Color(204, 0, 0));
        btnEliminarCuenta.setForeground(new java.awt.Color(255, 255, 255));
        btnEliminarCuenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close-icon.png"))); // NOI18N
        btnEliminarCuenta.setText("Eliminar");
        btnEliminarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarCuentaActionPerformed(evt);
            }
        });

        txtAmount.setBackground(new java.awt.Color(0, 0, 0));
        txtAmount.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtAmount.setForeground(new java.awt.Color(204, 204, 204));
        txtAmount.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtAmount.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Monto C$:");

        javax.swing.GroupLayout pnlContentControlssLayout = new javax.swing.GroupLayout(pnlContentControlss);
        pnlContentControlss.setLayout(pnlContentControlssLayout);
        pnlContentControlssLayout.setHorizontalGroup(
            pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentControlssLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentControlssLayout.createSequentialGroup()
                        .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContentControlssLayout.createSequentialGroup()
                                .addComponent(txtAgregarCuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxTipoCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pnlContentControlssLayout.createSequentialGroup()
                                .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbxCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9)
                                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlContentControlssLayout.createSequentialGroup()
                                .addComponent(btnGuardarcuenta)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnEliminarCuenta)
                                .addGap(43, 43, 43))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentControlssLayout.createSequentialGroup()
                                .addComponent(btnAgregarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(149, 149, 149))))
                    .addGroup(pnlContentControlssLayout.createSequentialGroup()
                        .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPeriodo)
                            .addGroup(pnlContentControlssLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(149, 149, 149))))
        );
        pnlContentControlssLayout.setVerticalGroup(
            pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlContentControlssLayout.createSequentialGroup()
                .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlContentControlssLayout.createSequentialGroup()
                        .addGap(0, 27, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtNombreEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(pnlContentControlssLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPeriodo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAgregarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtAgregarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cbxTipoCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlContentControlssLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbxCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuardarcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        spContentTable.setBackground(new java.awt.Color(0, 0, 0));

        Tabla.setBackground(new java.awt.Color(51, 51, 51));
        Tabla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        Tabla.setForeground(new java.awt.Color(255, 255, 255));
        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Tipo", "Monto C$"
            }
        ));
        Tabla.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Tabla.setSelectionBackground(new java.awt.Color(153, 153, 153));
        Tabla.setSelectionForeground(new java.awt.Color(0, 0, 0));
        spContentTable.setViewportView(Tabla);

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("LISTA DE CUENTAS");

        btnGenerarBalance.setBackground(new java.awt.Color(0, 153, 51));
        btnGenerarBalance.setForeground(new java.awt.Color(255, 255, 255));
        btnGenerarBalance.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/er.png"))); // NOI18N
        btnGenerarBalance.setText("GENERAR ESTADO DE RESULTADO");
        btnGenerarBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarBalanceActionPerformed(evt);
            }
        });

        lblFileName.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        lblFileName.setForeground(new java.awt.Color(204, 204, 204));
        lblFileName.setText("Nombre archivo");

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("IR%:");

        txtIR.setBackground(new java.awt.Color(0, 0, 0));
        txtIR.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtIR.setForeground(new java.awt.Color(204, 204, 204));
        txtIR.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtIR.setText("30");
        txtIR.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Dividendos C$:");

        txtDividendos.setBackground(new java.awt.Color(0, 0, 0));
        txtDividendos.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtDividendos.setForeground(new java.awt.Color(204, 204, 204));
        txtDividendos.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtDividendos.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtIR, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtDividendos, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblFileName)
                                .addGap(120, 120, 120)
                                .addComponent(jLabel2))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnGenerarBalance)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(pnlContentControlss, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(spContentTable)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(279, 279, 279)
                        .addComponent(jLabel8)))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblFileName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlContentControlss, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDividendos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(spContentTable, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnGenerarBalance)
                .addContainerGap(38, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarcuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarcuentaActionPerformed
        String cuenta = cbxCuentas.getSelectedItem() + "";
        int id_fs = 0;
        accounts acs = new accounts();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getName().equals(cuenta)) {
                id_fs = lista.get(i).getId_finance_state();
            }
        }

        if (!txtAmount.getText().isEmpty()) {
            float amount;
            try{
                amount = Float.parseFloat(txtAmount.getText());
                acs.setId_finance_state(id_fs);
                acs.setId_file(getIdFIle("ER_"));
                acs.setAmount(Float.parseFloat(txtAmount.getText()));
                ac.addAccountFN(acs);
                updateTable();
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this, "Porfavor ingresa solamente números");
            }

        }else{
            JOptionPane.showMessageDialog(this, "Porfavor ingresa un monto para la cuenta seleccionada");
        }
    }//GEN-LAST:event_btnGuardarcuentaActionPerformed

    private void btnAgregarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarCuentaActionPerformed

        if (!txtAgregarCuenta.getText().isEmpty() && cbxTipoCuentas.getSelectedIndex() > 0) {
            //guardar nuevas cuentas del balance general
            accounts_finance_state afs = new accounts_finance_state();
            afs.setName(txtAgregarCuenta.getText());
            afs.setType(cbxTipoCuentas.getSelectedItem() + "");
            ac.addAccount(afs, "ER");
            cbxCuentas.removeAllItems();
            lista = ac.getAccounts("ER");
            for (int i = 0; i < ac.getAccounts("ER").size(); i++) {
                cbxCuentas.addItem(lista.get(i).getName());
            }
        } else {
            JOptionPane.showMessageDialog(this, "Porfavor ingresar el nombre de la cuenta y seleccione el tipo.");
        }
    }//GEN-LAST:event_btnAgregarCuentaActionPerformed

    private void btnEliminarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarCuentaActionPerformed

        if(Tabla.getSelectedRowCount() > 0){
            ac.deleteAccount(ac.getAccountsTable(getIdFIle("ER_")).get(Tabla.getSelectedRow()).getCuenta());
        }else{
            JOptionPane.showMessageDialog(this, "Debe seleccionar una cuenta para eliminar");
        }

    }//GEN-LAST:event_btnEliminarCuentaActionPerformed

    private void btnGenerarBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarBalanceActionPerformed
        guardado = true;
        //lista de cuentas en el balance
        ArrayList<accountsTableModel> cuentas = ac.getAccountsTable(id_file);

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
        float totingresos= 0;
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

        for(int i = 0; i < cuentas.size(); i++){
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
        float utilidadantimp = utilidadOP + totingnoope - totgasnoope  ;
        //Impuestos IR 30%
        float porcentaje = 0;
        try{
                porcentaje = Float.parseFloat(txtIR.getText()) / 100;
        }catch(NumberFormatException ex){
                porcentaje = 0;
        }
       
        float impuestos = utilidadantimp * porcentaje;
        //Utilidad neta
        float utilidadneta = utilidadantimp - impuestos;
        //Utilidad retenida
        float utilidadretenida = 0.0f;
        if(!txtDividendos.getText().isEmpty()){
            try{
                utilidadretenida = utilidadneta - Float.parseFloat(txtDividendos.getText());
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(this,"Porfavor solo ingresar números");
            }
            
        }
        
        ac.saveFileDetails(id_file, txtNombreEmpresa.getText(), txtPeriodo.getText(),txtDividendos.getText(),txtIR.getText());
        //Mostramos el estado de resultado
        FrmER erGenerated = new FrmER();
        erGenerated.setLocationRelativeTo(this);
        erGenerated.setVisible(true);
        erGenerated.setData(ingresos,costos,gastos,desdev,ing_gas_no_ope,txtNombreEmpresa.getText(),txtPeriodo.getText(),totingresos,totcostos,totgastos,utilidadB,utilidadOP,utilidadantimp,impuestos,utilidadneta,utilidadretenida,txtDividendos.getText());

    }//GEN-LAST:event_btnGenerarBalanceActionPerformed
    
    public void updateTable() {
        String[][] contentTable = new String[ac.getAccountsTable(getIdFIle("ER_")).size()][3];
        for (int i = 0; i < ac.getAccountsTable(getIdFIle("ER_")).size(); i++) {
            contentTable[i][0] = ac.getAccountsTable(getIdFIle("ER_")).get(i).getCuenta();
            contentTable[i][1] = ac.getAccountsTable(getIdFIle("ER_")).get(i).getTipo();
            contentTable[i][2] = ac.getAccountsTable(getIdFIle("ER_")).get(i).getMonto();
        }

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
                contentTable,
                new String[]{
                    "Cuenta", "Tipo", "Monto C$"
                }
        ));
    }
    
    public int getIdFIle(String extension) {
        int id_file = 0;
        for (int j = 0; j < ac.getFiles(id_user).size(); j++) {

            if (ac.getFiles(id_user).get(j).getName().equals(extension + file_name)) {
                id_file = ac.getFiles(id_user).get(j).getId_file();
            }
        }

        return id_file;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla;
    private javax.swing.JButton btnAgregarCuenta;
    private javax.swing.JButton btnEliminarCuenta;
    private javax.swing.JButton btnGenerarBalance;
    private javax.swing.JButton btnGuardarcuenta;
    private javax.swing.JComboBox<String> cbxCuentas;
    private javax.swing.JComboBox<String> cbxTipoCuentas;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public javax.swing.JLabel lblFileName;
    private javax.swing.JPanel pnlContentControlss;
    private javax.swing.JScrollPane spContentTable;
    private javax.swing.JTextField txtAgregarCuenta;
    private javax.swing.JTextField txtAmount;
    private javax.swing.JTextField txtDividendos;
    private javax.swing.JTextField txtIR;
    private javax.swing.JTextField txtNombreEmpresa;
    private javax.swing.JTextField txtPeriodo;
    // End of variables declaration//GEN-END:variables
}
