/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberito.vistas;

import bomberito.accesoADatos.BrigadaData;
import bomberito.accesoADatos.CuartelData;
import bomberito.entidades.Brigada;
import bomberito.entidades.Cuartel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shion
 */
public class ListadoBrigada extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo=new DefaultTableModel(){
    public boolean isCellEditable(int f, int c){
        return false;
    }
};
        BrigadaData controlBri=null;
        CuartelData controlCuar=null;
        int idCuartel;
    /**
     * Creates new form ListadoBrigada
     */
    public ListadoBrigada() {
        controlBri=new BrigadaData();
        controlCuar=new CuartelData();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbxCuartel = new javax.swing.JComboBox<>();

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

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setText("Listado de Brigadas");

        jLabel2.setText("Filtrar por Cuartel");

        cbxCuartel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxCuartelActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cbxCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(254, 254, 254))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbxCuartel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbxCuartelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxCuartelActionPerformed
        borrarFilas();
        Cuartel cuarteleleccionada = (Cuartel) cbxCuartel.getSelectedItem();
        idCuartel = cuarteleleccionada.getIdCuartel();
        for (Brigada object : controlBri.traerBrigadas()) {
            if (object.getNroCuartel().getIdCuartel() == idCuartel) {
              modelo.addRow(new Object[]{
                  object.getNombreBrigada(),
                  object.getEspecialidad(),
                  object.isLibre(),
              });
            }
        }
    }//GEN-LAST:event_cbxCuartelActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<Cuartel> cbxCuartel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    private void cargarCombo() {
        for (Cuartel listita : controlCuar.traerCuarteles()) {
                cbxCuartel.addItem(new Cuartel(listita.getIdCuartel(), listita.getNombreCuartel()));                        
        }
    }
    
    private void encabezadoTabla() {
        modelo.addColumn("Nombre de Brigada");
        modelo.addColumn("Especialidad");
        modelo.addColumn("Libre");
        jTable1.setModel(modelo);
    }

    private void borrarFilas() {
        int f = jTable1.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }

}
