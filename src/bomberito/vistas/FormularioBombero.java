/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberito.vistas;

import bomberito.accesoADatos.BomberoData;
import bomberito.accesoADatos.BrigadaData;
import bomberito.entidades.Bombero;
import bomberito.entidades.Brigada;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shion
 */
public class FormularioBombero extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo=new DefaultTableModel(){
    public boolean isCellEditable(int f, int c){
        return false;
    }
};
    BrigadaData controlBri=null;
    BomberoData controlBom=null;
    int numViejo;
    String locuraString;
    int locura;
    
    /**
     * Creates new form FormularioBombero
     */
    public FormularioBombero() {
        controlBri=new BrigadaData();
        controlBom=new BomberoData();
        initComponents();
        encabezadoTabla();
        cargarCombo();
        cargarMiembros();
        btnModificar.setEnabled(false);
        btnDarBaja.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtDNI = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        txtGrupo = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        cbxBrigadas = new javax.swing.JComboBox<>();
        btnBuscarDNI = new javax.swing.JButton();
        btnAplicar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnDarBaja = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        txtCantFaltante = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        dcNacimiento = new com.toedter.calendar.JDateChooser();
        cbxGrupoSan = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Formulario Bomberos");

        jLabel2.setText("DNI");

        jLabel3.setText("Apellido");

        jLabel4.setText("Nombre");

        jLabel5.setText("Fecha de Nacimiento");

        jLabel6.setText("Grupo Sanguineo");

        jLabel7.setText("Celular");

        jLabel8.setText("Brigada Asiganada");

        txtDNI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDNIKeyTyped(evt);
            }
        });

        txtApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtApellidoKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtApellidoKeyTyped(evt);
            }
        });

        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtNombreKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });

        txtGrupo.setEditable(false);

        cbxBrigadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBrigadasActionPerformed(evt);
            }
        });

        btnBuscarDNI.setText("Buscar");
        btnBuscarDNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarDNIActionPerformed(evt);
            }
        });

        btnAplicar.setText("Seleccionar");
        btnAplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAplicarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnDarBaja.setText("Dar de Baja");
        btnDarBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDarBajaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        txtCantFaltante.setEditable(false);

        jLabel9.setText("Quedan disponibles: ");

        cbxGrupoSan.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-" }));
        cbxGrupoSan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxGrupoSanActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(btnNuevo)
                        .addGap(58, 58, 58)
                        .addComponent(btnModificar)
                        .addGap(57, 57, 57)
                        .addComponent(btnDarBaja)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre)
                            .addComponent(txtCelular)
                            .addComponent(cbxBrigadas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtApellido)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbxGrupoSan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnBuscarDNI))
                                    .addComponent(dcNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCantFaltante, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnAplicar)
                    .addComponent(btnSalir))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(362, 362, 362))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(txtDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBuscarDNI))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel3)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(dcNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(cbxGrupoSan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(cbxBrigadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnAplicar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCantFaltante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevo)
                            .addComponent(btnModificar)
                            .addComponent(btnDarBaja)
                            .addComponent(btnSalir))
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(36, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxBrigadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBrigadasActionPerformed
        Brigada brigadaSelec = (Brigada) cbxBrigadas.getSelectedItem();
        Brigada modificar = controlBri.traerBrigadaID(brigadaSelec.getIdBrigada());
        int muestra = controlBom.bomberosEnUnaBrigada(modificar.getIdBrigada());
        txtCantFaltante.setText((5 - muestra) + "");
    }//GEN-LAST:event_cbxBrigadasActionPerformed

    private void btnBuscarDNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarDNIActionPerformed
        btnModificar.setEnabled(true);
        btnDarBaja.setEnabled(true);
        btnNuevo.setEnabled(false);
        if (txtDNI.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Coloque un DNI a buscar");
        } else {
            for (Bombero listaBombero : controlBom.traerBomberos()) {
                int comparar = Integer.parseInt(txtDNI.getText());
                if (comparar == listaBombero.getDni()) {
                    numViejo = listaBombero.getIdBombero();
                    txtApellido.setText(listaBombero.getApellido());
                    txtNombre.setText(listaBombero.getNombre());
                    Date date = java.sql.Date.valueOf(listaBombero.getFechaNacimiento());
                    dcNacimiento.setDate(date);
                    txtGrupo.setText(listaBombero.getGrupoSanguineo());
                    txtCelular.setText(listaBombero.getCelular());
                    int maspruebas = Integer.parseInt(txtDNI.getText());
                    for (Bombero object : controlBom.traerBomberos()) {
                        if (maspruebas == object.getDni()) {
                            locuraString = object.getCodBrigada().getNombreBrigada();
                        }
                    }
                    int itemCount = cbxBrigadas.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        String item = cbxBrigadas.getItemAt(i).getNombreBrigada();
                        if (locuraString.contains(item)) {
                            cbxBrigadas.setSelectedIndex(i);
                        }
                    }
                    break;
                }
            }
        }
    }//GEN-LAST:event_btnBuscarDNIActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        if (txtDNI.getText().equals("")||txtApellido.getText().equals("")||txtCelular.getText().equals("")||txtNombre.getText().equals("")||txtGrupo.getText().equals("")||dcNacimiento.equals("")) {
            JOptionPane.showMessageDialog(null, "No puede haber campos vacios");
        } else {
            int dni = Integer.parseInt(txtDNI.getText());
            String apellido = txtApellido.getText();
            String nombre = txtNombre.getText();
            Date fechaNacimiento = dcNacimiento.getDate();
            LocalDate fechita = fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String grupoSan = txtGrupo.getText();
            String celular = txtCelular.getText();
            Brigada brigadaSelec = (Brigada) cbxBrigadas.getSelectedItem();
            int cant=controlBom.bomberosEnUnaBrigada(brigadaSelec.getIdBrigada());
            if (cant>4) {
                JOptionPane.showMessageDialog(null, "No se puede agregar mas de 5 miembros a una brigada");               
            }else{
            boolean activo=true;
            Bombero bomba = new Bombero(dni, apellido, nombre, fechita, grupoSan, celular, brigadaSelec, activo);
            controlBom.nuevoBombero(bomba);
            }
        }
        limpiar();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnAplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAplicarActionPerformed
        if (jTable1.getSelectedRow() != -1) {
            btnModificar.setEnabled(true);
            btnDarBaja.setEnabled(true);
            btnNuevo.setEnabled(false);
            String probando = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
            int masPruebas = Integer.parseInt(probando);
            for (Bombero listaBombero : controlBom.traerBomberos()) {
                if (masPruebas == listaBombero.getDni()) {
                    numViejo = listaBombero.getIdBombero();
                    txtDNI.setText(listaBombero.getDni() + "");
                    txtApellido.setText(listaBombero.getApellido());
                    txtNombre.setText(listaBombero.getNombre());
                    Date date = java.sql.Date.valueOf(listaBombero.getFechaNacimiento());
                    dcNacimiento.setDate(date);
                    txtGrupo.setText(listaBombero.getGrupoSanguineo());
                    txtCelular.setText(listaBombero.getCelular());

                    String probando2 = String.valueOf(jTable1.getValueAt(jTable1.getSelectedRow(), 0));
                    int maspruebas = Integer.parseInt(probando2);
                    for (Bombero object : controlBom.traerBomberos()) {
                        if (maspruebas == object.getDni()) {
                            locuraString = object.getCodBrigada().getNombreBrigada();
                        }
                    }
                    int itemCount = cbxBrigadas.getItemCount();
                    for (int i = 0; i < itemCount; i++) {
                        String item = cbxBrigadas.getItemAt(i).getNombreBrigada();
                        if (locuraString.contains(item)) {
                            cbxBrigadas.setSelectedIndex(i);
                        }
                    }
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "No se a seleccionado nada de la lista");
        }
    }//GEN-LAST:event_btnAplicarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int cambio = Integer.parseInt(txtDNI.getText());
        Date fechaNacimiento=dcNacimiento.getDate();
        LocalDate fechita=fechaNacimiento.toInstant().atZone(ZoneId.systemDefault()).toLocalDate(); 
        for (Bombero listita : controlBom.traerBomberos()) {         
            if (cambio==listita.getDni()||cambio!=listita.getDni()) {
                Bombero nuevito=new Bombero();
                nuevito.setIdBombero(numViejo);
                nuevito.setDni(Integer.parseInt(txtDNI.getText()));
                nuevito.setApellido(txtApellido.getText());
                nuevito.setNombre(txtNombre.getText());
                nuevito.setFechaNacimiento(fechita);
                nuevito.setGrupoSanguineo(txtGrupo.getText());
                nuevito.setCelular(txtCelular.getText());
                Brigada brigadaSelec = (Brigada) cbxBrigadas.getSelectedItem();
                nuevito.setCodBrigada(brigadaSelec);
                controlBom.modificarBombero(nuevito);
                limpiar();
                btnNuevo.setEnabled(true);
                btnModificar.setEnabled(false);
                return;                
            }
        }        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnDarBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDarBajaActionPerformed
        for (Bombero listita : controlBom.traerBomberos()) {
            int cambio = Integer.parseInt(txtDNI.getText());
            if (cambio==listita.getDni()) {
                controlBom.bajaBombero(listita.getIdBombero());
            }
        }
    }//GEN-LAST:event_btnDarBajaActionPerformed

    private void txtApellidoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyReleased
        borrarFilas();
        for (Bombero prod : controlBom.traerBomberos()) {
            if (prod.getApellido().toLowerCase().contains(txtApellido.getText().toLowerCase())) {
                modelo.addRow(new Object[]{
                    prod.getDni(),
                    prod.getApellido(),
                    prod.getNombre()});
            }
        }
    }//GEN-LAST:event_txtApellidoKeyReleased

    private void txtApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtApellidoKeyTyped
    if (txtApellido.getText().length()>=20) {
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean enieMin = key == 'ñ';
        boolean enieMay = key == 'Ñ';
       
        if (!mayusculas && !minusculas && !espacio && !enieMin && !enieMay) {
            evt.consume();
        }
    }//GEN-LAST:event_txtApellidoKeyTyped

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyTyped
      if (txtNombre.getText().length()>=20) {
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;
        boolean enieMin = key == 'ñ';
        boolean enieMay = key == 'Ñ';
       
        if (!mayusculas && !minusculas && !espacio && !enieMin && !enieMay) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNombreKeyTyped

    private void txtNombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNombreKeyReleased
          borrarFilas();
        for (Bombero prod : controlBom.traerBomberos()) {
            if (prod.getNombre().toLowerCase().contains(txtNombre.getText().toLowerCase())) {
                modelo.addRow(new Object[]{
                    prod.getDni(),
                    prod.getApellido(),
                    prod.getNombre()});
            }
        }
    }//GEN-LAST:event_txtNombreKeyReleased

    private void txtDNIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDNIKeyTyped
        if (txtDNI.getText().length()>=8) {
            evt.consume();
        }
        int key = evt.getKeyChar();
        boolean num= key >= 48 && key <= 57;
        if (!num) {
            evt.consume();
        }
    }//GEN-LAST:event_txtDNIKeyTyped

    private void cbxGrupoSanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxGrupoSanActionPerformed
        txtGrupo.setText(cbxGrupoSan.getSelectedItem().toString());
    }//GEN-LAST:event_cbxGrupoSanActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAplicar;
    private javax.swing.JButton btnBuscarDNI;
    private javax.swing.JButton btnDarBaja;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<Brigada> cbxBrigadas;
    private javax.swing.JComboBox<String> cbxGrupoSan;
    private com.toedter.calendar.JDateChooser dcNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCantFaltante;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtDNI;
    private javax.swing.JTextField txtGrupo;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
    private void cargarCombo() {
        for (Brigada listita : controlBri.traerBrigadas()) {
            if (controlBom.bomberosEnUnaBrigada(listita.getIdBrigada())<5) {
                cbxBrigadas.addItem(new Brigada(listita.getIdBrigada(), listita.getNombreBrigada()));
            }            
        }
    }
    
    private void encabezadoTabla() {
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        jTable1.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    
    private void cargarMiembros(){
        for (Brigada i: controlBri.traerBrigadas()) {
            if (controlBom.bomberosEnUnaBrigada(i.getIdBrigada())>5) {
                System.out.println("Se a superado los 5 miembros ");
            }
            int muestra=controlBom.bomberosEnUnaBrigada(i.getIdBrigada());
            System.out.println("Nombre Brigada = "+i.getNombreBrigada());
            System.out.println("Cantidad de Miembros = "+muestra);
        }
    }
    
    private void limpiar(){
        txtDNI.setText("");
        txtApellido.setText("");
        txtNombre.setText("");
        dcNacimiento.setDate(null);
        cbxGrupoSan.setSelectedIndex(0);
        txtCelular.setText("");
        Brigada brigadaSelec = (Brigada) cbxBrigadas.getSelectedItem();
        Brigada modificar = controlBri.traerBrigadaID(brigadaSelec.getIdBrigada());
        int muestra = controlBom.bomberosEnUnaBrigada(modificar.getIdBrigada());
        txtCantFaltante.setText((5 - muestra) + "");
    }
}
