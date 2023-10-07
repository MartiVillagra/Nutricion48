/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.text.EditorKit ;
/**
 *
 * @author Loboplateado77
 */
public class FormularioDieta extends javax.swing.JInternalFrame {

    /**
     * Creates new form DIieta
     */
    public FormularioDieta() {
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

        //import javax.swing.ImageIcon;
        ImageIcon icono  = new  ImageIcon(getClass().getResource("/Recursos/flores.png"));
        Image miImagenjpg = icono.getImage();
        jPanel1 = new javax.swing.JPanel()   {public void paintComponent(Graphics g){
            g.drawImage(miImagenjpg,0,0,getWidth(),getHeight(),this);
        }
    }
    ;
    jPanel2 = new javax.swing.JPanel();
    jLabel2 = new javax.swing.JLabel();
    jTextField1 = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jTaltura = new javax.swing.JTextField();
    jLabel4 = new javax.swing.JLabel();
    jTpeso = new javax.swing.JTextField();
    jTimc = new javax.swing.JTextField();
    jBimc = new javax.swing.JButton();
    jLabel6 = new javax.swing.JLabel();
    jTnomYApe = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    jTid = new javax.swing.JTextField();
    jLabel1 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jLabel9 = new javax.swing.JLabel();
    jLabel10 = new javax.swing.JLabel();
    jTextField2 = new javax.swing.JTextField();
    jTextField3 = new javax.swing.JTextField();
    jButton1 = new javax.swing.JButton();
    jButton2 = new javax.swing.JButton();
    jButton3 = new javax.swing.JButton();
    jButton4 = new javax.swing.JButton();

    setClosable(true);

    jPanel1.setBackground(new java.awt.Color(153, 153, 153));

    jPanel2.setBackground(new java.awt.Color(204, 204, 204));
    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.setForeground(new java.awt.Color(0, 153, 153));

    jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 153, 153));
    jLabel2.setText("DNI");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 153, 153));
    jLabel3.setText("Altura");

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 153, 153));
    jLabel4.setText("Peso");

    jTpeso.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTpesoActionPerformed(evt);
        }
    });

    jTimc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTimcActionPerformed(evt);
        }
    });

    jBimc.setBackground(new java.awt.Color(204, 255, 204));
    jBimc.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
    jBimc.setForeground(new java.awt.Color(0, 153, 153));
    jBimc.setText("Calculo IMC");
    jBimc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBimcActionPerformed(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(0, 153, 153));
    jLabel6.setText("Nombre y Apellido");

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(0, 153, 153));
    jLabel11.setText("Paciente n°");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel11)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel4)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGap(17, 17, 17)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63)
                    .addComponent(jLabel2)
                    .addGap(108, 108, 108)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel3)
                    .addGap(18, 18, 18)
                    .addComponent(jTaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(27, 27, 27)
                    .addComponent(jBimc)
                    .addGap(41, 41, 41)
                    .addComponent(jTimc, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel6)
                    .addGap(18, 18, 18)
                    .addComponent(jTnomYApe, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addContainerGap(32, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(17, 17, 17)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel2)
                .addComponent(jLabel11)
                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(29, 29, 29)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel6)
                .addComponent(jTnomYApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGap(24, 24, 24)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jTaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel3)
                .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jLabel4)
                .addComponent(jBimc)
                .addComponent(jTimc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(16, Short.MAX_VALUE))
    );

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 204, 204));
    jLabel1.setText("DIETA - PACIENTE");

    jPanel3.setBackground(new java.awt.Color(204, 204, 204));
    jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(102, 153, 255));
    jLabel7.setText("Fecha  Inicxial");

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(102, 153, 255));
    jLabel8.setText("Fecha Final");

    jLabel9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel9.setForeground(new java.awt.Color(102, 153, 255));
    jLabel9.setText("Peso Inicial");

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(102, 153, 255));
    jLabel10.setText("Peso Final");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel8)
                .addComponent(jLabel7))
            .addGap(217, 217, 217)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel9)
                .addComponent(jLabel10))
            .addGap(54, 54, 54)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addContainerGap(43, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel7)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(32, 32, 32)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
            .addContainerGap(20, Short.MAX_VALUE))
    );

    jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton1.setForeground(new java.awt.Color(204, 102, 255));
    jButton1.setText("Eliminar");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton1ActionPerformed(evt);
        }
    });

    jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jButton2.setForeground(new java.awt.Color(204, 102, 255));
    jButton2.setText("Modificar");

    jButton3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
    jButton3.setForeground(new java.awt.Color(204, 102, 255));
    jButton3.setText("Agregar");

    jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jButton4.setForeground(new java.awt.Color(204, 102, 255));
    jButton4.setText("Salir");
    jButton4.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jButton4ActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(253, 253, 253)
            .addComponent(jLabel1)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(29, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jButton3)
                            .addGap(102, 102, 102)
                            .addComponent(jButton2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addGap(110, 110, 110)
                            .addComponent(jButton4))
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGap(24, 24, 24))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addComponent(jLabel1)
            .addGap(33, 33, 33)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(39, 39, 39)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jButton3)
                .addComponent(jButton2)
                .addComponent(jButton1)
                .addComponent(jButton4))
            .addGap(32, 32, 32))
    );

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTimcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTimcActionPerformed

    }//GEN-LAST:event_jTimcActionPerformed

    private void jTpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpesoActionPerformed

    private void jBimcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimcActionPerformed
        // calculo de indice de masa corporal
        
        double peso = Double.parseDouble(jTpeso.getText());
        double altura = Double.parseDouble(jTaltura.getText());
        double imc= peso/(altura*altura);
        
        jTimc.setText(imc + "");
    }//GEN-LAST:event_jBimcActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // salir
        setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBimc;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTaltura;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTimc;
    private javax.swing.JTextField jTnomYApe;
    private javax.swing.JTextField jTpeso;
    // End of variables declaration//GEN-END:variables
}
