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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shion
 */
public class ListadoBombero extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo=new DefaultTableModel(){
    public boolean isCellEditable(int f, int c){
        return false;
    }
};
        BrigadaData controlBri=null;
        BomberoData controlBom=null;
        int idBrigada;
    /**
     * Creates new form ListadoBombero
     */
    public ListadoBombero() {
        controlBri=new BrigadaData();
        controlBom=new BomberoData();
        initComponents();
        encabezadoTabla();
        cargarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        cbxBrigada = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

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

        cbxBrigada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxBrigadaActionPerformed(evt);
            }
        });

        jLabel1.setText("Filtrar por Brigada");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setText("Lista de Bomberos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(cbxBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(309, 309, 309)
                                .addComponent(jLabel2)))
                        .addGap(0, 318, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbxBrigada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxBrigadaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxBrigadaActionPerformed
        borrarFilas();
        Brigada brigadaSeleccionada = (Brigada) cbxBrigada.getSelectedItem();
        idBrigada = brigadaSeleccionada.getIdBrigada();
        for (Bombero object : controlBom.traerBomberos()) {
            if (object.getCodBrigada().getIdBrigada() == idBrigada) {
              modelo.addRow(new Object[]{
                  object.getDni(),
                  object.getApellido(),
                  object.getNombre(),
                  object.getFechaNacimiento(),
                  object.getGrupoSanguineo(),
                  object.getCelular(),
                  object.isActivo()
              });
            }
        }
    }//GEN-LAST:event_cbxBrigadaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Brigada> cbxBrigada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        for (Brigada listita : controlBri.traerBrigadas()) {
                cbxBrigada.addItem(new Brigada(listita.getIdBrigada(), listita.getNombreBrigada()));                        
        }
    }
    
    private void encabezadoTabla() {
        modelo.addColumn("DNI");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Fecha de Nacimiento");
        modelo.addColumn("Grupo Sangineo");
        modelo.addColumn("Celular");
        modelo.addColumn("Activo");
        jTable1.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}
