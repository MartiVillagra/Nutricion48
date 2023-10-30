/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

    import Data.ComidaData;
    import Data.ComidaData;
    import Entidades.Comida;
    import java.awt.Graphics;
    import java.awt.Image;
    import java.util.ArrayList;
    import javax.swing.ImageIcon;
    import javax.swing.JOptionPane;
    import javax.swing.table.DefaultTableModel;
    import javax.swing.text.EditorKit;

/**
 *
 * @author Loboplateado77
 */
public class TipoComida extends javax.swing.JInternalFrame {

    private DefaultTableModel modelo = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            //si pongo false entonces las celdas no son editables
            return false;
        }
    };
    private DefaultTableModel modelo2 = new DefaultTableModel() {
        public boolean isCellEditable(int f, int c) {
            //si pongo false entonces las celdas no son editables
            return false;
        }
    };

    /**
     * Creates new form ComponentesComida
     */
    public TipoComida() {
        initComponents();
        armarCabecera();
        cargarComidas();
        armarCabecera2();
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        //import javax.swing.ImageIcon;
        ImageIcon icono  = new  ImageIcon(getClass().getResource("/Recursos/alimentospng.png"));
        Image miImagenjpg = icono.getImage();
        jPanel1 = new javax.swing.JPanel()
        {public void paintComponent(Graphics g){
            g.drawImage(miImagenjpg,0,0,getWidth(),getHeight(),this);
        }
    }
    ;
    jScrollPane1 = new javax.swing.JScrollPane();
    jTcomida = new javax.swing.JTable();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jTnombre = new javax.swing.JTextField();
    jTdetalle = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jTcalorias = new javax.swing.JTextField();
    jbAgregar = new javax.swing.JButton();
    jbSalir = new javax.swing.JButton();
    jbModificar = new javax.swing.JButton();
    jbEliminar = new javax.swing.JButton();
    jScrollPane2 = new javax.swing.JScrollPane();
    jComidas2 = new javax.swing.JTable();
    jLabel6 = new javax.swing.JLabel();
    jTcalorias2 = new javax.swing.JTextField();
    jbLimpiar = new javax.swing.JButton();
    jScrollPane3 = new javax.swing.JScrollPane();
    jTextArea1 = new javax.swing.JTextArea();
    jPanel3 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();
    jPanel4 = new javax.swing.JPanel();
    jLabel5 = new javax.swing.JLabel();

    jButton2.setText("jButton2");

    setClosable(true);

    jTcomida.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "idComida", "Nombre", "Detalle", "Cant. Calorias"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jTcomida.addMouseListener(new java.awt.event.MouseAdapter() {
        public void mouseClicked(java.awt.event.MouseEvent evt) {
            jTcomidaMouseClicked(evt);
        }
    });
    jScrollPane1.setViewportView(jTcomida);

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 153, 153));
    jLabel2.setText("Nombre");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 153, 153));
    jLabel3.setText("Detalle");

    jTnombre.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTnombreKeyReleased(evt);
        }
    });

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 153, 153));
    jLabel4.setText("Calorias");

    jbAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jbAgregar.setText("Agregar");
    jbAgregar.setEnabled(false);
    jbAgregar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbAgregarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel2)
                .addComponent(jLabel3))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jTnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addComponent(jTdetalle))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(jTcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jbAgregar))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(15, 15, 15)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jTnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4)
                .addComponent(jTcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(32, 32, 32)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTdetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(jbAgregar))
            .addContainerGap(60, Short.MAX_VALUE))
    );

    jbSalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jbSalir.setText("Salir");
    jbSalir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbSalirActionPerformed(evt);
        }
    });

    jbModificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jbModificar.setText("Modificar");
    jbModificar.setEnabled(false);
    jbModificar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbModificarActionPerformed(evt);
        }
    });

    jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jbEliminar.setText("Eliminar");
    jbEliminar.setEnabled(false);
    jbEliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbEliminarActionPerformed(evt);
        }
    });

    jComidas2.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null},
            {null, null, null, null}
        },
        new String [] {
            "idComida", "Nombre", "Detalle", "Cant. Calorias"
        }
    ) {
        boolean[] canEdit = new boolean [] {
            false, false, false, false
        };

        public boolean isCellEditable(int rowIndex, int columnIndex) {
            return canEdit [columnIndex];
        }
    });
    jScrollPane2.setViewportView(jComidas2);

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(255, 255, 102));
    jLabel6.setText("Calorias");

    jTcalorias2.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTcalorias2ActionPerformed(evt);
        }
    });
    jTcalorias2.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTcalorias2KeyReleased(evt);
        }
    });

    jbLimpiar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jbLimpiar.setText("Limpiar");
    jbLimpiar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbLimpiarActionPerformed(evt);
        }
    });

    jTextArea1.setEditable(false);
    jTextArea1.setBackground(new java.awt.Color(255, 255, 255));
    jTextArea1.setColumns(20);
    jTextArea1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jTextArea1.setForeground(new java.awt.Color(0, 153, 153));
    jTextArea1.setRows(5);
    jTextArea1.setText("\n                                      \n                                        Ingrese las calorias\n                                  para mostrar las comidas\n                                       por debajo de estas");
    jTextArea1.setBorder(null);
    jScrollPane3.setViewportView(jTextArea1);

    jPanel3.setBackground(new java.awt.Color(255, 255, 102));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setText("COMIDAS");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
            .addContainerGap(215, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(184, 184, 184))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addContainerGap(15, Short.MAX_VALUE))
    );

    jPanel4.setBackground(new java.awt.Color(255, 255, 102));

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel5.setText("CALORIAS");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap(214, Short.MAX_VALUE)
            .addComponent(jLabel5)
            .addGap(201, 201, 201))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel4Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel5)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(18, 18, 18)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addComponent(jbEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54)
                            .addComponent(jbLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 577, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(206, 206, 206)
                            .addComponent(jLabel6)
                            .addGap(18, 18, 18)
                            .addComponent(jTcalorias2, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jScrollPane3)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jbSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(20, 20, 20))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGap(35, 35, 35)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3))
            .addGap(12, 12, 12)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(jTcalorias2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
            .addGap(46, 46, 46)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbModificar)
                .addComponent(jbEliminar)
                .addComponent(jbLimpiar)
                .addComponent(jbSalir))
            .addContainerGap(21, Short.MAX_VALUE))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
        // salir
        setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
        ComidaData comiData1 = new ComidaData();
        Comida comi1 = comiData1.buscarComidaxNombre(jTnombre.getText());
        if (comi1 == null) {
            if (jTnombre.getText().isEmpty() || jTdetalle.getText().isEmpty() || jTcalorias.getText().isEmpty()) {

                JOptionPane.showMessageDialog(this, "Compruebe los campos vacíos");
            } else {
                if ((contiene(jTnombre.getText()) == true) || (contiene(jTdetalle.getText()) == true)) {
                    JOptionPane.showMessageDialog(this, "Revise Nombre/Detalle");
                } else {
                    String nombre = jTnombre.getText();
                    String detalle = jTdetalle.getText();

                    try {

                        int calorias = Integer.parseInt(jTcalorias.getText());
                        Comida comida = new Comida(nombre, detalle, calorias, true);
                        ComidaData comidata = new ComidaData();
                        comidata.altaComida(comida);
                        cargarComidas();
                        borrarCampos();
                        jbAgregar.setEnabled(false);
                    } catch (NumberFormatException nfe) {
                        JOptionPane.showMessageDialog(null, "Ingrese caracteres numéricos en calorías");
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Ya existe la comida" + jTnombre.getText());
        }
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // ELIMINAR COMIDA
        int fila = jTcomida.getSelectedRow();
        if (fila != -1) {
            int idComida = (int) modelo.getValueAt(fila, 0);
            ComidaData comidaData = new ComidaData();
            comidaData.eliminarComida(idComida);
            cargarComidas();
            borrarCampos();    
        }
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jTcomidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTcomidaMouseClicked
        int fila = jTcomida.getSelectedRow();
        if (fila != -1) {
            jbModificar.setEnabled(true);
            jbEliminar.setEnabled(true);
            int idComida = (int) modelo.getValueAt(fila, 0);
            ComidaData comiData = new ComidaData();
            Comida comida = comiData.buscarComidaxId(idComida);
            jTnombre.setText(comida.getNombre());
            jTcalorias.setText(comida.getCantCalorias() + "");
            jTdetalle.setText(comida.getDetalle());
        }

    }//GEN-LAST:event_jTcomidaMouseClicked

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed

        int fila = jTcomida.getSelectedRow();
        if (fila != -1) {

            int idComida = (int) modelo.getValueAt(fila, 0);
            if (jTnombre.getText().isEmpty() && jTdetalle.getText().isEmpty() && jTcalorias.getText().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Hay campos vacios");

            }
            if ((contiene(jTnombre.getText()) == true) || (contiene(jTdetalle.getText()) == true)) {
                JOptionPane.showMessageDialog(this, "Revise nombre/detalle");
            } else {
                try {
                    String nombre = jTnombre.getText();
                    String detalle = jTdetalle.getText();
                    int calorias = Integer.parseInt(jTcalorias.getText());

                    Comida comida = new Comida(idComida, nombre, detalle, calorias, true);
                    ComidaData comiData = new ComidaData();

                    comiData.modificarComida(comida);
                    cargarComidas();
                    borrarCampos();
                    jbModificar.setEnabled(false);
                   
                } catch (NumberFormatException nf) {
                    JOptionPane.showMessageDialog(this, "Calorías sólo admite números");
                }
            }
        }
    }//GEN-LAST:event_jbModificarActionPerformed

    private void jTcalorias2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTcalorias2KeyReleased
        try {
            if (!jTcalorias2.getText().isEmpty()) {
                int calorias = Integer.parseInt(jTcalorias2.getText());
                borrarFila2();
                Comida comida = new Comida();
                ComidaData comidata = new ComidaData();
                for (Comida comida1 : comidata.listaDeComidasxCalorias(calorias)) {
                    modelo2.addRow(new Object[]{comida1.getIdComida(), comida1.getNombre(), comida1.getDetalle(), comida1.getCantCalorias()});
                }
                jComidas2.setModel(modelo2);
            }
        } catch (NumberFormatException nf) {
            JOptionPane.showMessageDialog(this, "Ingrese caracteres numéricos");
            jTcalorias2.setText("");
        }
    }//GEN-LAST:event_jTcalorias2KeyReleased

    private void jTnombreKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTnombreKeyReleased
        if (!jTnombre.getText().isEmpty()) {
            String nombre = jTnombre.getText();
            ComidaData comiData = new ComidaData();
            Comida comida = comiData.buscarComidaxNombre(nombre);
            if (comida == null) {
                jbAgregar.setEnabled(true);
            } else {
                if (comida != null) {
                    jbAgregar.setEnabled(false);
                }
            }
        } else {
            jbAgregar.setEnabled(false);
        }
    }//GEN-LAST:event_jTnombreKeyReleased

    private void jbLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimpiarActionPerformed
        cargarComidas();
        borrarCampos();
        jbModificar.setEnabled(false);
    }//GEN-LAST:event_jbLimpiarActionPerformed

    private void jTcalorias2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTcalorias2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTcalorias2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JTable jComidas2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTcalorias;
    private javax.swing.JTextField jTcalorias2;
    private javax.swing.JTable jTcomida;
    private javax.swing.JTextField jTdetalle;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbLimpiar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables

    // carga -> cabecera de la tabla
    private void armarCabecera() {

        modelo.addColumn("idComida");
        modelo.addColumn("Nombre");
        modelo.addColumn("Detalle");
        modelo.addColumn("Cant. Calorias");
        jTcomida.setModel(modelo);
    }

    private void armarCabecera2() {

        modelo2.addColumn("idComida");
        modelo2.addColumn("Nombre");
        modelo2.addColumn("Detalle");
        modelo2.addColumn("Cant. Calorias");
        jComidas2.setModel(modelo2);
    }

    public static boolean contiene(String cadena) {
        for (char c : cadena.toCharArray()) {
            if (!Character.isLetter(c) && !Character.isWhitespace(c)) {
                return true; // La cadena contiene caracteres no alfabéticos
            }
        }
        return false; // La cadena solo contiene letras
    }

    // se borra la fila en la tabla 1
    private void borrarFila() {
        int f = jTcomida.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo.removeRow(f);
        }
    }
    // se borra la fila en la tabla 2
    private void borrarFila2() {
        int f = jComidas2.getRowCount() - 1;
        for (; f >= 0; f--) {
            modelo2.removeRow(f);
        }
    }

    private void cargarComidas() {
        borrarFila();
        Comida comida = new Comida();
        ComidaData comidata = new ComidaData();
        for (Comida comida1 : comidata.listarTodasComidas()) {
            modelo.addRow(new Object[]{comida1.getIdComida(), comida1.getNombre(), comida1.getDetalle(), comida1.getCantCalorias()});
        }
        jTcomida.setModel(modelo);

    }
    
    public void borrarCampos(){
        jTnombre.setText("");
        jTcalorias.setText("");
        jTdetalle.setText("");
        jbEliminar.setEnabled(false);
        jTcalorias2.setText("");
    }

}
