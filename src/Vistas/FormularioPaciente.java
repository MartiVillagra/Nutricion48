/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;

    import Data.PacienteData;
    import Entidades.Paciente;
    import javax.swing.JOptionPane;
    import java.awt.Graphics;
    import java.awt.Image;
    import javax.swing.ImageIcon;

public class FormularioPaciente extends javax.swing.JInternalFrame {

    /**
     * Creates new form Paciente
     */
    public FormularioPaciente() {
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

        label1 = new java.awt.Label();
        //import javax.swing.ImageIcon;
        ImageIcon icono  = new  ImageIcon(getClass().getResource("/Recursos/flores.png"));
        Image miImagenjpg = icono.getImage();
        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){
                g.drawImage(miImagenjpg,0,0,getWidth(),getHeight(),this);
            }
        }
        ;
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jTnroPaciente = new javax.swing.JTextField();
        jTdni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTNomYApe = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTdomicilio = new javax.swing.JTextField();
        jTtelefono = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jBBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jRMujer = new javax.swing.JRadioButton();
        jRHombre = new javax.swing.JRadioButton();
        jbRegistrar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();

        label1.setText("label1");

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Datos del Paciente");

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTnroPaciente.setEditable(false);

        jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTdniKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("N° Paciente");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 153, 153));
        jLabel3.setText("DNI");

        jTNomYApe.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTNomYApeKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 153, 153));
        jLabel4.setText("Nombre y Apellido");

        jTdomicilio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTdomicilioKeyReleased(evt);
            }
        });

        jTtelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTtelefonoKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 153, 153));
        jLabel5.setText("Domicilio");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 153, 153));
        jLabel6.setText("Tel");

        jBBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jLabel7.setForeground(new java.awt.Color(0, 153, 153));
        jLabel7.setText("Sexo");

        jRMujer.setText("F");

        jRHombre.setText("M");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(34, 34, 34)
                        .addComponent(jRMujer)
                        .addGap(40, 40, 40)
                        .addComponent(jRHombre)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(jTdomicilio)
                                .addGap(31, 31, 31)
                                .addComponent(jLabel6)
                                .addGap(18, 18, 18)
                                .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jTNomYApe)))
                        .addGap(40, 40, 40))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(31, 31, 31)
                        .addComponent(jTnroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                        .addComponent(jBBuscar)
                        .addGap(27, 27, 27))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTnroPaciente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jBBuscar))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNomYApe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTdomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jTtelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jRMujer)
                    .addComponent(jRHombre))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        jbRegistrar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbRegistrar.setText("Registrar");
        jbRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRegistrarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBModificar.setText("Modificar");
        jBModificar.setEnabled(false);
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBEliminar.setText("Eliminar");
        jBEliminar.setEnabled(false);
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBsalir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBsalir.setText("Salir");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        jBLimpiar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(jLabel1)
                .addContainerGap(260, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(48, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbRegistrar)
                        .addGap(63, 63, 63)
                        .addComponent(jBModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBLimpiar)
                        .addGap(43, 43, 43)
                        .addComponent(jBEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(jBsalir))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbRegistrar)
                    .addComponent(jBModificar)
                    .addComponent(jBEliminar)
                    .addComponent(jBsalir)
                    .addComponent(jBLimpiar))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jbRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRegistrarActionPerformed

       try{
        PacienteData pacData = new PacienteData();
        String domicilio = jTdomicilio.getText();
        String nombre = jTNomYApe.getText();
        int dni = Integer.parseInt(jTdni.getText());
        String telefono = jTtelefono.getText();
           String sexo = "";
           if (jRMujer.isSelected() == true) {
               sexo = "F";
           }
           if (jRHombre.isSelected() == true) {
               sexo = "M";
           }
            do 

            if (contiene(jTNomYApe.getText()) == true){
                JOptionPane.showMessageDialog(null, "Verifique su nombre");
                jTNomYApe.setText("");
            }else if (contiene(jTNomYApe.getText()) != true){
               
                
                if (pacData.buscarPacientexDNI(dni) != null) {
                    JOptionPane.showMessageDialog(null, "Ya existe ese dni");
                    jTdni.setText("");
                    jTNomYApe.setText("");
                    jTdomicilio.setText("");
                    jTtelefono.setText("");
                } else {
                Paciente pac = new Paciente(nombre, dni, domicilio, telefono, true,sexo);
                pacData.altaPaciente(pac);
                    jTdni.setText("");
                    jTNomYApe.setText("");
                    jTdomicilio.setText("");
                    jTtelefono.setText("");
                }
            } 
            while (contiene(jTNomYApe.getText()) == true);
            
               } catch (NumberFormatException nf) {
        if (jTdni.getText().isEmpty() || jTtelefono.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Hay campos vacios aca");
            }else{
             JOptionPane.showMessageDialog(null, "Verifique su DNI/Telefono");   
            }
        } 
    }//GEN-LAST:event_jbRegistrarActionPerformed

    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed

               
         if (jTdni.getText().isEmpty()|| jTnroPaciente.getText().isEmpty() || jTNomYApe.getText().isEmpty()
                || jTdomicilio.getText().isEmpty() || jTtelefono.getText().isEmpty()){
        } else {
             try {
              int dni = Integer.parseInt(jTdni.getText());
            int id = Integer.parseInt(jTnroPaciente.getText());
            String nomyApe = jTNomYApe.getText();
            String domicilio = jTdomicilio.getText();
            int cel = Integer.parseInt(jTtelefono.getText());
            String telefono = cel+"";
            String sexo="";
                if (jRMujer.isSelected()==true) {
                    sexo="F";
                }
                if (jRHombre.isSelected()==true) {
                    sexo="M";
                }
        Paciente pac = new Paciente(id, nomyApe, dni, domicilio, telefono, true, sexo);
        PacienteData pacDat = new PacienteData();

            pacDat.modificarPaciente(pac);
            borraCampos();
            jBModificar.setEnabled(false);      
             } catch ( NumberFormatException e) {
                 String cel = jTtelefono.getText();
                 if (cel.length()>10) {
                     JOptionPane.showMessageDialog(this, "Telefono muy largo");
                 }else{
                  JOptionPane.showMessageDialog(this, "Ingrese solo caracteres numericos");   
                 }
             }
        }     
    }//GEN-LAST:event_jBModificarActionPerformed

    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed

        try{
        int dni = Integer.parseInt(jTdni.getText());
        PacienteData pacData = new PacienteData();
        if (pacData.buscarPacientexDNI(dni)!= null){
            if ( !jTdni.getText().isEmpty()){
            
                Paciente pac = pacData.buscarPacientexDNI(dni);
                jTnroPaciente.setText(pac.getIdPaciente()+"");
                jTNomYApe.setText(pac.getNombre());
                jTdomicilio.setText(pac.getDomicilio());
                jTtelefono.setText(pac.getTelefono()+"");
            }else {JOptionPane.showMessageDialog(this, "Ingrese un dni");
            }
        }else{
            JOptionPane.showMessageDialog(this, "No existe ese paciente");
        }
        }catch (NumberFormatException nfe){
        JOptionPane.showMessageDialog(this, " Ingrese un caracter numerico");
        jTdni.setText("");
    }        
    }//GEN-LAST:event_jBBuscarActionPerformed

    private void jTdniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyReleased

        PacienteData pacData = new PacienteData();
        if (!jTdni.getText().isEmpty()) {
            int dni = Integer.parseInt(jTdni.getText());
            if (pacData.buscarPacientexDNI(dni)!=null) {
                jBEliminar.setEnabled(true);
            }else{
                jBEliminar.setEnabled(false);
            }
        }else{
            jBEliminar.setEnabled(false);
        }
        
        if (!jTdni.getText().isEmpty()&& !jTnroPaciente.getText().isEmpty() && !jTNomYApe.getText().isEmpty()
                && !jTdomicilio.getText().isEmpty() && !jTtelefono.getText().isEmpty()) {
            
            int dni = Integer.parseInt(jTdni.getText());
            if (pacData.buscarPacientexDNI(dni)!=null) {
                jBModificar.setEnabled(true);
            }else{
                jBModificar.setEnabled(false);
            }
        }else{
            jBModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jTdniKeyReleased

    private void jTNomYApeKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTNomYApeKeyReleased
        PacienteData pacData = new PacienteData();
        if (!jTdni.getText().isEmpty()&& !jTnroPaciente.getText().isEmpty() && !jTNomYApe.getText().isEmpty()
                && !jTdomicilio.getText().isEmpty() && !jTtelefono.getText().isEmpty()) {
            
            int dni = Integer.parseInt(jTdni.getText());
            if (pacData.buscarPacientexDNI(dni)!=null) {
                jBModificar.setEnabled(true);
            }else{
                jBModificar.setEnabled(false);
            }
        }else{
            jBModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jTNomYApeKeyReleased

    private void jTdomicilioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdomicilioKeyReleased
        PacienteData pacData = new PacienteData();
        if (!jTdni.getText().isEmpty()&& !jTnroPaciente.getText().isEmpty() && !jTNomYApe.getText().isEmpty()
                && !jTdomicilio.getText().isEmpty() && !jTtelefono.getText().isEmpty()) {
            
            int dni = Integer.parseInt(jTdni.getText());
            if (pacData.buscarPacientexDNI(dni)!=null) {
                jBModificar.setEnabled(true);
            }else{
                jBModificar.setEnabled(false);
            }
        }else{
            jBModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jTdomicilioKeyReleased

    private void jTtelefonoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTtelefonoKeyReleased
        PacienteData pacData = new PacienteData();
        if (!jTdni.getText().isEmpty()&& !jTnroPaciente.getText().isEmpty() && !jTNomYApe.getText().isEmpty()
                && !jTdomicilio.getText().isEmpty() && !jTtelefono.getText().isEmpty()) {
            
            int dni = Integer.parseInt(jTdni.getText());
            if (pacData.buscarPacientexDNI(dni)!=null) {
                jBModificar.setEnabled(true);
            }else{
                jBModificar.setEnabled(false);
            }
        }else{
            jBModificar.setEnabled(false);
        }
    }//GEN-LAST:event_jTtelefonoKeyReleased

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        PacienteData pacData = new PacienteData();
        if (!jTdni.getText().isEmpty()) {
            int dni = Integer.parseInt(jTdni.getText());
            Paciente pac = pacData.buscarPacientexDNI(dni);
            if (pac!=null) {
                pacData.bajaPaciente(dni);
                borraCampos();
            }
        }
    }//GEN-LAST:event_jBEliminarActionPerformed

    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
        borraCampos();
    }//GEN-LAST:event_jBLimpiarActionPerformed

    //Cosas que quedan: pacData.buscarPacientexId(Integer.parseInt(jTnroPaciente.getText))
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRHombre;
    private javax.swing.JRadioButton jRMujer;
    private javax.swing.JTextField jTNomYApe;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextField jTdomicilio;
    private javax.swing.JTextField jTnroPaciente;
    private javax.swing.JTextField jTtelefono;
    private javax.swing.JButton jbRegistrar;
    private java.awt.Label label1;
    // End of variables declaration//GEN-END:variables

       public static boolean contiene(String cadena) {
        for (char c : cadena.toCharArray()) {
            if (!Character.isLetter(c)&& !Character.isWhitespace(c)) {
                return true; // La cadena contiene caracteres no alfabéticos
            }
        }
        return false; // La cadena solo contiene letras
    } 
     //..............................................................
  //borrar campos
    public void borraCampos(){
        jTnroPaciente.setText("");
        jTdni.setText("");
        jTNomYApe.setText("");
        jTdomicilio.setText("");
        jTtelefono.setText("");       
    }
     //cambio de estado boton modificar
    public void modificarEstadoBoton(){
                PacienteData pacData = new PacienteData();
        if(!jTdni.getText().isEmpty()&& !jTnroPaciente.getText().isEmpty() && !jTNomYApe.getText().isEmpty()
                && !jTdomicilio.getText().isEmpty() && !jTtelefono.getText().isEmpty()){
            int id = Integer.parseInt(jTnroPaciente.getText());
            if (pacData.buscarPacientexId(id) != null){
                jBModificar.setEnabled(true);
            } else {jBModificar.setEnabled(false);
                }
        }
    }
}
