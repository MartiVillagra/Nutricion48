/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.EditorKit ;
/**
 *
 * @author Loboplateado77
 */
public class TipoDieta extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel(){
    
    public boolean isCellEditable(int f,int c){
    //si pongo false entonces las celdas no son editables
        return false;  
    }
     };  
    /**
     * Creates new form Comida
     */
    public TipoDieta() {
        initComponents();
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

        //import javax.swing.ImageIcon;
        ImageIcon icono  = new  ImageIcon(getClass().getResource("/Recursos/vegetales.png"));
        Image miImagenjpg = icono.getImage();
        jPanel7 = new javax.swing.JPanel(){public void paintComponent(Graphics g){
            g.drawImage(miImagenjpg,0,0,getWidth(),getHeight(),this);
        }
    }
    ;
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jCBtipoDieta = new javax.swing.JComboBox<>();
    jBagregar = new javax.swing.JButton();
    jBmodificar = new javax.swing.JButton();
    jBeliminar = new javax.swing.JButton();
    jBsalir = new javax.swing.JButton();
    filler1 = new javax.swing.Box.Filler(new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 0), new java.awt.Dimension(0, 32767));
    jScrollPane1 = new javax.swing.JScrollPane();
    jTdieta = new javax.swing.JTable();
    jLabel2 = new javax.swing.JLabel();

    setClosable(true);

    jPanel7.setForeground(new java.awt.Color(153, 153, 153));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(255, 255, 51));
    jLabel1.setText("PLAN NUTRICIONAL");

    jPanel2.setBackground(new java.awt.Color(255, 255, 204));
    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(0, 153, 153));
    jLabel7.setText("Dieta");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addContainerGap(31, Short.MAX_VALUE)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jCBtipoDieta, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(22, 22, 22))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(25, 25, 25)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(jCBtipoDieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(27, Short.MAX_VALUE))
    );

    jBagregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jBagregar.setForeground(new java.awt.Color(0, 0, 0));
    jBagregar.setText("Agregar");

    jBmodificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jBmodificar.setForeground(new java.awt.Color(51, 51, 51));
    jBmodificar.setText("Modificar");

    jBeliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jBeliminar.setForeground(new java.awt.Color(0, 0, 0));
    jBeliminar.setText("Eliminar");

    jBsalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jBsalir.setForeground(new java.awt.Color(0, 0, 0));
    jBsalir.setText("Salir");
    jBsalir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBsalirActionPerformed(evt);
        }
    });

    jTdieta.setModel(new javax.swing.table.DefaultTableModel(
        new Object [][] {
            {null, null, null},
            {null, null, null},
            {null, null, null},
            {null, null, null}
        },
        new String [] {
            "Comida", "Decripcion", "Tipo"
        }
    ));
    jScrollPane1.setViewportView(jTdieta);

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 102));
    jLabel2.setText("Comida diaria recomendada");

    javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
    jPanel7.setLayout(jPanel7Layout);
    jPanel7Layout.setHorizontalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(138, 138, 138)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel7Layout.createSequentialGroup()
                    .addGap(232, 232, 232)
                    .addComponent(jLabel1)))
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                            .addComponent(jBagregar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jBmodificar)
                            .addGap(86, 86, 86)
                            .addComponent(jBeliminar)
                            .addGap(123, 123, 123)
                            .addComponent(jBsalir))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 632, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                    .addComponent(jLabel2)
                    .addGap(182, 182, 182))))
    );
    jPanel7Layout.setVerticalGroup(
        jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
            .addGap(267, 267, 267)
            .addComponent(filler1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(74, 74, 74))
        .addGroup(jPanel7Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
            .addComponent(jLabel2)
            .addGap(18, 18, 18)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(18, 18, 18)
            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jBagregar)
                .addComponent(jBmodificar)
                .addComponent(jBeliminar)
                .addComponent(jBsalir))
            .addGap(18, 18, 18))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // salir
        setVisible(false);
    }//GEN-LAST:event_jBsalirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.Box.Filler filler1;
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JComboBox<String> jCBtipoDieta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTdieta;
    // End of variables declaration//GEN-END:variables
public void cargarCombo(){

            jCBtipoDieta.addItem("");
            EnumDietas[] dietaList = EnumDietas.values();
            for( EnumDietas dieta: dietaList){
            jCBtipoDieta.addItem(String.valueOf(dieta));
        }
}

    // carga -> cabecera de la tabla
      private void armarCabecera(){
    
        modelo.addColumn("Comida");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Tipo de Comida");
  
    jTdieta.setModel(modelo);
    }

    // se borra la fila en la tabla
    private void borrarFila(){
        int f=jTdieta.getRowCount()-1;
        for(;f>=0;f--){
            modelo.removeRow(f);
        }
    }

}
