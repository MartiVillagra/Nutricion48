/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;
import Data.DietaData;
import Entidades.Dieta;
import java.awt.Graphics;
import java.awt.Image;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
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
//        jDfechaI.setCalendar(Calendar.getInstance());
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
        ImageIcon icono  = new  ImageIcon(getClass().getResource("/Recursos/ramillete.png"));
        Image miImagenjpg = icono.getImage();
        jPanel1 = new javax.swing.JPanel()   {public void paintComponent(Graphics g){
            g.drawImage(miImagenjpg,0,0,getWidth(),getHeight(),this);
        }
    }
    ;
    jPanel2 = new javax.swing.JPanel();
    jLabel4 = new javax.swing.JLabel();
    jTpeso = new javax.swing.JTextField();
    jLabel11 = new javax.swing.JLabel();
    jTid = new javax.swing.JTextField();
    jTaltura = new javax.swing.JTextField();
    jLabel3 = new javax.swing.JLabel();
    jLabel12 = new javax.swing.JLabel();
    jRmujer = new javax.swing.JRadioButton();
    jRhombre = new javax.swing.JRadioButton();
    jLabel10 = new javax.swing.JLabel();
    jTpesoF = new javax.swing.JTextField();
    jLabel2 = new javax.swing.JLabel();
    jTimc = new javax.swing.JTextField();
    jTdieta = new javax.swing.JTextField();
    jLabel6 = new javax.swing.JLabel();
    jLabel1 = new javax.swing.JLabel();
    jPanel3 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jBeliminar = new javax.swing.JButton();
    jBmodificar = new javax.swing.JButton();
    jBagregar = new javax.swing.JButton();
    jBsalir = new javax.swing.JButton();
    jBimc = new javax.swing.JButton();

    setClosable(true);

    jPanel1.setBackground(new java.awt.Color(153, 153, 153));

    jPanel2.setBackground(new java.awt.Color(204, 204, 204));
    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.setForeground(new java.awt.Color(0, 153, 153));

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 153, 153));
    jLabel4.setText("Peso Inicial");

    jTpeso.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTpesoActionPerformed(evt);
        }
    });

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(0, 153, 153));
    jLabel11.setText("Paciente n°");

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 153, 153));
    jLabel3.setText("Altura");

    jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(0, 153, 153));
    jLabel12.setText("Sexo");

    jRmujer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jRmujer.setForeground(new java.awt.Color(0, 0, 0));
    jRmujer.setText("F");
    jRmujer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRmujerActionPerformed(evt);
        }
    });

    jRhombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jRhombre.setForeground(new java.awt.Color(0, 0, 0));
    jRhombre.setText("M");
    jRhombre.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRhombreActionPerformed(evt);
        }
    });

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(0, 153, 153));
    jLabel10.setText("Peso Final");

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 153, 153));
    jLabel2.setText("IMC");

    jTimc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTimcActionPerformed(evt);
        }
    });

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(0, 153, 153));
    jLabel6.setText("Dieta");

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(42, 42, 42)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLabel11)
                    .addGap(21, 21, 21)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)))
            .addGap(29, 29, 29)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jRmujer)
                    .addGap(42, 42, 42)
                    .addComponent(jRhombre))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTpeso, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                    .addComponent(jTaltura)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(72, 72, 72)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel10))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addGap(46, 46, 46)))
            .addGap(6, 6, 6)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                .addComponent(jTimc, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
                .addComponent(jTpesoF)
                .addComponent(jTdieta))
            .addContainerGap(23, Short.MAX_VALUE))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGap(20, 20, 20)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel11)
                .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jTpesoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(18, 18, 18)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addComponent(jTimc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRmujer)
                        .addComponent(jRhombre)
                        .addComponent(jLabel12)
                        .addComponent(jLabel6))
                    .addContainerGap(34, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addComponent(jTdieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(35, Short.MAX_VALUE))))
    );

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 102, 102));
    jLabel1.setText("DIETA - PACIENTE");

    jPanel3.setBackground(new java.awt.Color(204, 204, 204));
    jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(102, 153, 255));
    jLabel7.setText("Fecha  Inicial");

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(102, 153, 255));
    jLabel8.setText("Fecha Final");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jLabel7)
            .addGap(158, 158, 158)
            .addComponent(jLabel8)
            .addContainerGap(255, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(14, 14, 14)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jLabel7)
                .addComponent(jLabel8))
            .addContainerGap(17, Short.MAX_VALUE))
    );

    jBeliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jBeliminar.setForeground(new java.awt.Color(204, 102, 255));
    jBeliminar.setText("Eliminar");
    jBeliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBeliminarActionPerformed(evt);
        }
    });

    jBmodificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jBmodificar.setForeground(new java.awt.Color(204, 102, 255));
    jBmodificar.setText("Modificar");

    jBagregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jBagregar.setForeground(new java.awt.Color(204, 102, 255));
    jBagregar.setText("Agregar");
    jBagregar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBagregarActionPerformed(evt);
        }
    });

    jBsalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jBsalir.setForeground(new java.awt.Color(204, 102, 255));
    jBsalir.setText("Salir");
    jBsalir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBsalirActionPerformed(evt);
        }
    });

    jBimc.setBackground(new java.awt.Color(204, 255, 204));
    jBimc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jBimc.setForeground(new java.awt.Color(0, 153, 153));
    jBimc.setText("Calculo Peso");
    jBimc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBimcActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jLabel1)
                    .addGap(292, 292, 292))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jBagregar)
                            .addGap(60, 60, 60)
                            .addComponent(jBmodificar)
                            .addGap(75, 75, 75)
                            .addComponent(jBeliminar)
                            .addGap(77, 77, 77)
                            .addComponent(jBsalir))
                        .addComponent(jBimc))
                    .addGap(92, 92, 92))))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(134, 134, 134)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(97, 97, 97)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGap(0, 87, Short.MAX_VALUE))
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(16, 16, 16)
            .addComponent(jLabel1)
            .addGap(18, 18, 18)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(34, 34, 34)
            .addComponent(jBimc)
            .addGap(41, 41, 41)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jBagregar)
                .addComponent(jBmodificar)
                .addComponent(jBeliminar)
                .addComponent(jBsalir))
            .addGap(50, 50, 50))
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

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // salir
        setVisible(false);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        int idPaciente=Integer.parseInt(jTid.getText());
        String nombre = jTdieta.getText();
        double pesoI=Double.parseDouble(jTpeso.getText());
        double pesoF=Double.parseDouble(jTpesoF.getText());
        //      LocalDate fechaI=jDfechaI.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        //      LocalDate fechaF=jDfechaF.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        DietaData dietaData = new DietaData();
        //      Dieta dieta = new Dieta(nombre, idPaciente, fechaI, pesoI, pesoF, fechaF);
        //      dietaData.altaDieta(dieta);
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jRhombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRhombreActionPerformed
        jRmujer.setSelected(false);
    }//GEN-LAST:event_jRhombreActionPerformed

    private void jRmujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRmujerActionPerformed
        jRhombre.setSelected(false);
    }//GEN-LAST:event_jRmujerActionPerformed

    private void jBimcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimcActionPerformed
        // calculo de indice de masa corporal
        if (!jTpeso.getText().isEmpty() && !jTaltura.getText().isEmpty()) {
            if(jRmujer.isSelected()==false && jRhombre.isSelected()==false){
                JOptionPane.showMessageDialog(this, "Selecione su sexo");
            }else{
                imc();
                pesoIdeal();
            }
        }

    }//GEN-LAST:event_jBimcActionPerformed

    private void jTimcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTimcActionPerformed

    }//GEN-LAST:event_jTimcActionPerformed

    private void jTpesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpesoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpesoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBimc;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton jRhombre;
    private javax.swing.JRadioButton jRmujer;
    private javax.swing.JTextField jTaltura;
    private javax.swing.JTextField jTdieta;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTimc;
    private javax.swing.JTextField jTpeso;
    private javax.swing.JTextField jTpesoF;
    // End of variables declaration//GEN-END:variables
    

    
    public void imc(){
        double peso = Double.parseDouble(jTpeso.getText());
        double altura = Double.parseDouble(jTaltura.getText());
        double imc= peso/(altura*altura);
        
        if (imc<16) {
            JOptionPane.showMessageDialog(null, "Infrapeso: Delgadez Severa");
        }
        if (imc>16.00 && imc<16.99) {
            JOptionPane.showMessageDialog(null, "Infrapeso: Delgadez moderada");
        }
        if (imc>17.00 && imc<18.49) {
            JOptionPane.showMessageDialog(null, "Infrapeso: Delgadez aceptable");
        }
        if (imc>18.50 && imc<24.99) {
            JOptionPane.showMessageDialog(null, "Peso Normal");
        }
        if (imc>25.00 && imc<29.99) {
            JOptionPane.showMessageDialog(null, "Sobrepeso");
        }
        if (imc>30.00 && imc<34.99) {
            JOptionPane.showMessageDialog(null, "Obeso: Tipo I");
        }
        if (imc>35.00 && imc<40.00) {
            JOptionPane.showMessageDialog(null, "Obeso: Tipo II");
        }
        if (imc>40.00) {
            JOptionPane.showMessageDialog(null, "Obeso: Tipo III");
        }

        jTimc.setText(String.format("%.2f", imc));
    }
    
    public void pesoIdeal(){
        double peso = Double.parseDouble(jTpeso.getText());
        double altura = Double.parseDouble(jTaltura.getText());
        double pesoIdeal;
        if (jRmujer.isSelected()==true) {
            
            pesoIdeal=(((altura*100)-100)-((altura*100)-150)/2);
            jTpesoF.setText(pesoIdeal+"");
        }
        if (jRhombre.isSelected()==true) {
            
            pesoIdeal=(((altura*100)-100)-((altura*100)-150)/4);
            jTpesoF.setText(pesoIdeal+"");
        }
        
    }
    
    
}
