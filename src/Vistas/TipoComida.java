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
import javax.swing.text.EditorKit ;
/**
 *
 * @author Loboplateado77
 */
public class TipoComida extends javax.swing.JInternalFrame {
    private DefaultTableModel modelo = new DefaultTableModel(){
 
    public boolean isCellEditable(int f,int c){
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
        ImageIcon icono  = new  ImageIcon(getClass().getResource("/Recursos/fondo.png"));
        Image miImagenjpg = icono.getImage();
        jPanel1 = new javax.swing.JPanel()
        {public void paintComponent(Graphics g){
            g.drawImage(miImagenjpg,0,0,getWidth(),getHeight(),this);
        }
    }
    ;
    jScrollPane1 = new javax.swing.JScrollPane();
    jTcomida = new javax.swing.JTable();
    jLabel1 = new javax.swing.JLabel();
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jLabel3 = new javax.swing.JLabel();
    jTnombre = new javax.swing.JTextField();
    jTdetalle = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jTcalorias = new javax.swing.JTextField();
    jbAgregar = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    jTid = new javax.swing.JTextField();
    jbSalir = new javax.swing.JButton();
    jbModificar = new javax.swing.JButton();
    jbEliminar = new javax.swing.JButton();

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

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 153, 153));
    jLabel1.setText("COMIDAS");

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 153, 153));
    jLabel2.setText("Nombre");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 153, 153));
    jLabel3.setText("Detalle");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 153, 153));
    jLabel4.setText("Calorias");

    jbAgregar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jbAgregar.setForeground(new java.awt.Color(0, 153, 153));
    jbAgregar.setText("Agregar");
    jbAgregar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbAgregarActionPerformed(evt);
        }
    });

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(0, 153, 153));
    jLabel5.setText("ID");

    jTid.setEditable(false);

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(33, 33, 33)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel2)
                .addComponent(jLabel3)
                .addComponent(jLabel5))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jTnombre, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                .addComponent(jTdetalle)
                .addComponent(jTid))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel4)
                    .addGap(18, 18, 18)
                    .addComponent(jTcalorias, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jbAgregar))
            .addContainerGap(47, Short.MAX_VALUE))
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
            .addGap(29, 29, 29)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jLabel3)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdetalle, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbAgregar)))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jTid, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
    );

    jbSalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jbSalir.setForeground(new java.awt.Color(0, 153, 153));
    jbSalir.setText("Salir");
    jbSalir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbSalirActionPerformed(evt);
        }
    });

    jbModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jbModificar.setForeground(new java.awt.Color(0, 153, 153));
    jbModificar.setText("Modificar");
    jbModificar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbModificarActionPerformed(evt);
        }
    });

    jbEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jbEliminar.setForeground(new java.awt.Color(0, 153, 153));
    jbEliminar.setText("Eliminar");
    jbEliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jbEliminarActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(65, 65, 65)
                            .addComponent(jbModificar)
                            .addGap(114, 114, 114)
                            .addComponent(jbEliminar)
                            .addGap(148, 148, 148)
                            .addComponent(jbSalir))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(47, 47, 47)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(255, 255, 255)
                    .addComponent(jLabel1)))
            .addContainerGap(84, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jLabel1)
            .addGap(33, 33, 33)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(27, 27, 27)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jbModificar)
                .addComponent(jbEliminar)
                .addComponent(jbSalir)))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalirActionPerformed
           // salir
        setVisible(false);
    }//GEN-LAST:event_jbSalirActionPerformed

    private void jbAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAgregarActionPerformed
    if (jTnombre.getText().isEmpty() || jTdetalle.getText().isEmpty() || jTcalorias.getText().isEmpty()){
        
        JOptionPane.showMessageDialog(this,"compruebe los campos vacíos"); 
    }else {
       if((contiene(jTnombre.getText()) == true) || (contiene(jTdetalle.getText())== true)){
        JOptionPane.showMessageDialog(this, "revise Nombre/Detalle");}
       else {
           String nombre = jTnombre.getText();
      String detalle = jTdetalle.getText();
       
       
       try{
      
      int calorias =Integer.parseInt(jTcalorias.getText());
       Comida comida =new Comida(nombre,detalle,calorias,true);
          ComidaData comidata =new ComidaData();
       comidata.altaComida(comida);
      } catch(NumberFormatException nfe){
          JOptionPane.showMessageDialog(null, "ingrese caracter numericos en calorias");
      }
       } }
     
       
       
  
    }//GEN-LAST:event_jbAgregarActionPerformed

    private void jbEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEliminarActionPerformed
        // ELIMINAR COMIDA
        
    }//GEN-LAST:event_jbEliminarActionPerformed

    private void jTcomidaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTcomidaMouseClicked
        int fila = jTcomida.getSelectedRow();
        if (fila != -1) {
        int idComida = (int) modelo.getValueAt(fila, 0);
        ComidaData comiData = new ComidaData();
        Comida comida = comiData.buscarComidaxId(idComida);
        jTnombre.setText(comida.getNombre());
        jTcalorias.setText(comida.getCantCalorias()+"");
        jTdetalle.setText(comida.getDetalle());
        jTid.setText(comida.getIdComida()+"");
        }
        
    }//GEN-LAST:event_jTcomidaMouseClicked

    private void jbModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbModificarActionPerformed
        if (jTnombre.getText().isEmpty() && jTdetalle.getText().isEmpty() && jTcalorias.getText().isEmpty() && jTid.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "No deebn haber campos vacíos");
        
        }
        if((contiene(jTnombre.getText()) == true) || (contiene(jTdetalle.getText())== true)){
        JOptionPane.showMessageDialog(this, "revise Nombre/Detalle");}
       else {
        try {
        String nombre = jTnombre.getText();
        String detalle = jTdetalle.getText();    
        int calorias = Integer.parseInt(jTcalorias.getText());
        int id = Integer.parseInt(jTid.getText());
        Comida comida = new Comida(id, nombre, detalle, calorias, true);
        ComidaData comiData = new ComidaData();
        
        comiData.modificarComida(comida);
        } catch (NumberFormatException nf){
        JOptionPane.showMessageDialog(this, "Calorías sólo recibe números");
        }
        }
    }//GEN-LAST:event_jbModificarActionPerformed
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTcalorias;
    private javax.swing.JTable jTcomida;
    private javax.swing.JTextField jTdetalle;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTnombre;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbModificar;
    private javax.swing.JButton jbSalir;
    // End of variables declaration//GEN-END:variables

   
    
    // carga -> cabecera de la tabla
      private void armarCabecera(){
    
       // modelo.addColumn("Codigo");
         modelo.addColumn("idComida");
        modelo.addColumn("Nombre");
        modelo.addColumn("Detalle");
        modelo.addColumn("Cant. Calorias");
        
        
        jTcomida.setModel(modelo);
    }
      public static boolean contiene(String cadena) {
        for (char c : cadena.toCharArray()) {
            if (!Character.isLetter(c) &&!Character.isWhitespace(c) ) {
                return true; // La cadena contiene caracteres no alfabéticos
            }
        }
        return false; // La cadena solo contiene letras
    }  
      
    // se borra la fila en la tabla
    private void borrarFila(){
        int f=jTcomida.getRowCount()-1;
        for(;f>=0;f--){
            modelo.removeRow(f);
        }
    }
     private void cargarComidas(){
     
//       String nombre = jTnombre.getText();
//       int calorias=Integer.parseInt(jTcalorias.getText());
//       String detalle= jTdetalle.getText();
        Comida comida =new Comida();
       ComidaData comidata = new ComidaData();
//        ArrayList <Comida> comi=comidata.listarTodasComidas();
         for (Comida comida1 : comidata.listarTodasComidas()) {
            modelo.addRow(new Object[]{comida1.getIdComida(), comida1.getNombre(),comida1.getDetalle(),comida1.getCantCalorias()});
         }
      jTcomida.setModel(modelo);
        
    }
}
