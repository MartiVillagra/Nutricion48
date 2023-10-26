/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package Vistas;
import Data.DietaComidaData;
import Data.DietaData;
import Data.PacienteData;
import Entidades.Dieta;
import Entidades.Paciente;
import java.awt.Graphics;
import java.awt.Image;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
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
      jDfechaI.setCalendar(Calendar.getInstance());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        //import javax.swing.ImageIcon;
        ImageIcon icono  = new  ImageIcon(getClass().getResource("/Recursos/verduras1.png"));
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
    jLdni = new javax.swing.JLabel();
    jTdni = new javax.swing.JTextField();
    jBbuscar = new javax.swing.JButton();
    jLabel5 = new javax.swing.JLabel();
    jBimc = new javax.swing.JButton();
    jPanel3 = new javax.swing.JPanel();
    jLabel7 = new javax.swing.JLabel();
    jLabel8 = new javax.swing.JLabel();
    jDfechaF = new com.toedter.calendar.JDateChooser();
    jDfechaI = new com.toedter.calendar.JDateChooser();
    jBeliminar = new javax.swing.JButton();
    jBmodificar = new javax.swing.JButton();
    jBagregar = new javax.swing.JButton();
    jBsalir = new javax.swing.JButton();
    jPanel4 = new javax.swing.JPanel();
    jLabel1 = new javax.swing.JLabel();

    jTextArea2.setColumns(20);
    jTextArea2.setRows(5);
    jScrollPane2.setViewportView(jTextArea2);

    setClosable(true);

    jPanel1.setBackground(new java.awt.Color(153, 153, 153));

    jPanel2.setBackground(new java.awt.Color(204, 204, 204));
    jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel2.setForeground(new java.awt.Color(0, 153, 153));

    jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(0, 153, 153));
    jLabel4.setText("Peso Inicial");

    jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel11.setForeground(new java.awt.Color(0, 153, 153));
    jLabel11.setText("Paciente n°");

    jTid.setEditable(false);

    jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(0, 153, 153));
    jLabel3.setText("Altura");

    jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel12.setForeground(new java.awt.Color(0, 153, 153));
    jLabel12.setText("Sexo");

    jRmujer.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jRmujer.setText("F");
    jRmujer.setEnabled(false);
    jRmujer.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRmujerActionPerformed(evt);
        }
    });

    jRhombre.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jRhombre.setText("M");
    jRhombre.setEnabled(false);
    jRhombre.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jRhombreActionPerformed(evt);
        }
    });

    jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel10.setForeground(new java.awt.Color(0, 153, 153));
    jLabel10.setText("Peso Final");

    jTpesoF.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jTpesoFActionPerformed(evt);
        }
    });

    jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(0, 153, 153));
    jLabel2.setText("IMC");

    jTimc.setEditable(false);

    jTdieta.setEditable(false);

    jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel6.setForeground(new java.awt.Color(0, 153, 153));
    jLabel6.setText("Dieta Sugerida");

    jLdni.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLdni.setForeground(new java.awt.Color(0, 153, 153));
    jLdni.setText("DNI");

    jTdni.addKeyListener(new java.awt.event.KeyAdapter() {
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jTdniKeyReleased(evt);
        }
    });

    jBbuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jBbuscar.setForeground(new java.awt.Color(0, 153, 153));
    jBbuscar.setText("Buscar");
    jBbuscar.setEnabled(false);
    jBbuscar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBbuscarActionPerformed(evt);
        }
    });

    jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(0, 153, 153));
    jLabel5.setText("cm");

    jBimc.setBackground(new java.awt.Color(204, 255, 204));
    jBimc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
    jBimc.setForeground(new java.awt.Color(0, 153, 153));
    jBimc.setText("Calculo Peso");
    jBimc.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBimcActionPerformed(evt);
        }
    });

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(23, 23, 23)
                    .addComponent(jLabel11)
                    .addGap(18, 18, 18)
                    .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(56, 56, 56)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jTaltura, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(47, 47, 47)
                            .addComponent(jRmujer)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jRhombre)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jLabel5)))
            .addGap(6, 6, 6)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addComponent(jLdni)
                    .addGap(27, 27, 27)
                    .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGap(0, 0, Short.MAX_VALUE)
                            .addComponent(jLabel6))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(202, 202, 202)
                                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(22, 22, 22)
                                    .addComponent(jBimc, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(50, 50, 50)
                                    .addComponent(jLabel2))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addGap(184, 184, 184)
                                    .addComponent(jLabel10)))
                            .addGap(0, 47, Short.MAX_VALUE)))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTpesoF, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTimc, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jTdieta, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(100, 100, 100))))
    );
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel2Layout.createSequentialGroup()
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLdni)
                            .addComponent(jTdni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jBbuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBimc, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jTdieta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel12))
                    .addGap(19, 19, 19))
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTpeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jTpesoF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(32, 32, 32)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTimc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(31, 31, 31)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(jTaltura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5))))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jRmujer)
                        .addComponent(jRhombre))
                    .addGap(26, 26, 26))))
    );

    jPanel3.setBackground(new java.awt.Color(204, 204, 204));
    jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
    jPanel3.setForeground(new java.awt.Color(255, 255, 255));

    jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(0, 153, 153));
    jLabel7.setText("Fecha  Inicial");

    jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jLabel8.setForeground(new java.awt.Color(0, 153, 153));
    jLabel8.setText("Fecha Final");

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addGap(35, 35, 35)
            .addComponent(jLabel7)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
            .addComponent(jDfechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(58, 58, 58)
            .addComponent(jLabel8)
            .addGap(18, 18, 18)
            .addComponent(jDfechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(59, Short.MAX_VALUE))
    );
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel3Layout.createSequentialGroup()
            .addContainerGap()
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(jDfechaI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(jDfechaF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING)))
            .addContainerGap(10, Short.MAX_VALUE))
    );

    jBeliminar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jBeliminar.setText("Eliminar");
    jBeliminar.setEnabled(false);
    jBeliminar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBeliminarActionPerformed(evt);
        }
    });

    jBmodificar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jBmodificar.setText("Modificar");
    jBmodificar.setEnabled(false);
    jBmodificar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBmodificarActionPerformed(evt);
        }
    });

    jBagregar.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jBagregar.setText("Agregar");
    jBagregar.setEnabled(false);
    jBagregar.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBagregarActionPerformed(evt);
        }
    });

    jBsalir.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
    jBsalir.setText("Salir");
    jBsalir.addActionListener(new java.awt.event.ActionListener() {
        public void actionPerformed(java.awt.event.ActionEvent evt) {
            jBsalirActionPerformed(evt);
        }
    });

    jPanel4.setBackground(new java.awt.Color(204, 255, 153));

    jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(0, 0, 0));
    jLabel1.setText("DIETA DEL PACIENTE");

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addGap(321, 321, 321))
    );
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
            .addContainerGap(7, Short.MAX_VALUE)
            .addComponent(jLabel1)
            .addContainerGap())
    );

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(176, 176, 176))
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addComponent(jBagregar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(70, 70, 70)
                    .addComponent(jBmodificar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(278, 278, 278)
                    .addComponent(jBeliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(49, 49, 49)
                    .addComponent(jBsalir, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(72, 72, 72))))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(71, 71, 71)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(0, 88, Short.MAX_VALUE))
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addContainerGap()
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addContainerGap())
    );
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
        .addGroup(jPanel1Layout.createSequentialGroup()
            .addGap(29, 29, 29)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(36, 36, 36)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGap(41, 41, 41)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(jBsalir)
                .addComponent(jBeliminar)
                .addComponent(jBagregar)
                .addComponent(jBmodificar))
            .addGap(63, 63, 63))
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
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
    );

    pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
        // salir
        setVisible(false);
    }//GEN-LAST:event_jBsalirActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
       
        try {
            if (!jTpeso.getText().isEmpty() && !jTaltura.getText().isEmpty() && !jTid.getText().isEmpty() && jDfechaF.getDate() != null) {
                
                int idPaciente = Integer.parseInt(jTid.getText());
                String nombre = jTdieta.getText();
                double pesoI = Double.parseDouble(jTpeso.getText());
                double pesoF = Double.parseDouble(jTpesoF.getText());
                LocalDate fechaI = jDfechaI.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                LocalDate fechaF = jDfechaF.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
                Double altura=Double.parseDouble(jTaltura.getText());
                String sexo="";
                if (jRmujer.isSelected()==true) {
                    sexo="F";
                }else{
                //if (jRhombre.isSelected()==true) {
                    sexo="M";
                }
                double imc=Double.parseDouble(jTimc.getText());
                if( fechaF.isBefore(fechaI)){
                    JOptionPane.showMessageDialog(null, "Revisa la fecha final ");
                }else {
                    DietaData dietaData = new DietaData();
                    Dieta dieta = new Dieta(nombre, idPaciente, fechaI, pesoI, pesoF, fechaF, altura, imc);
                    dietaData.altaDieta(dieta);
                    borrarCampos();
                    jTdni.setText("");
                    jBagregar.setEnabled(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "No deben haber espacios vacios o controle la fecha ");
            }
        } catch (NumberFormatException nfe) {
            JOptionPane.showMessageDialog(null, "ingrese solo caracteres numericos");
        }
    }//GEN-LAST:event_jBagregarActionPerformed
    
    private void jBeliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBeliminarActionPerformed
        DietaData dietadata = new DietaData();
        DietaComidaData dietaComidaData = new DietaComidaData();
        int idpaciente= Integer.parseInt(jTid.getText());
        Dieta dieta = dietadata.buscarDietaPorPaciente(idpaciente);
        if(dieta!=null){
            int iddieta = dieta.getIdDieta();
            dietaComidaData.eliminarDietaComidaxDieta(iddieta);
            dietadata.eliminarDieta(iddieta);
            borrarCampos();
            jTdni.setText("");
            eliBusModF();
        }
    }//GEN-LAST:event_jBeliminarActionPerformed

    private void jRhombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRhombreActionPerformed
        jRmujer.setSelected(false);
    }//GEN-LAST:event_jRhombreActionPerformed

    private void jRmujerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRmujerActionPerformed
        jRhombre.setSelected(false);
    }//GEN-LAST:event_jRmujerActionPerformed

    private void jBimcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBimcActionPerformed
        // calculo de indice de masa corporal
        try{
            
        if (jTpeso.getText().isEmpty() || jTaltura.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null,"No deben haber espacios vacios ");}
            if(jRmujer.isSelected()==false && jRhombre.isSelected()==false){
                JOptionPane.showMessageDialog(this, "Selecione su sexo");
            }else{
                imc();
                pesoIdeal();
            }
        }catch(NumberFormatException nfe){
        JOptionPane.showMessageDialog(null,"ingrese solo caracteres numericos"); 
        }
    }//GEN-LAST:event_jBimcActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        
        if(jTid.getText().isEmpty() || jTaltura.getText().isEmpty() || jTdni.getText().isEmpty() || jTpeso.getText().isEmpty() || jTpesoF.getText().isEmpty()
                || jTdieta.getText().isEmpty() || jTimc.getText().isEmpty() || jDfechaF.getDate() == null || jDfechaI.getDate() == null){
            JOptionPane.showMessageDialog(null, "Debe rellenar todos los campos");
        }
        try {
            int idpac = Integer.parseInt(jTid.getText());
            DietaData dietaData = new DietaData();
            Dieta dieta = dietaData.buscarDietaPorPaciente(idpac);
            int idDieta = dieta.getIdDieta();
            double pesoi = Double.parseDouble(jTpeso.getText());
            double pesoF = Double.parseDouble(jTpesoF.getText());
            LocalDate fechaI = jDfechaI.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            LocalDate fechaF = jDfechaF.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            String nombrediet = jTdieta.getText();
            double altura = Double.parseDouble(jTaltura.getText());
            double imc = Double.parseDouble(jTimc.getText());
            Dieta dieta1 = new Dieta(idDieta, nombrediet, idpac, fechaI, pesoi, pesoF, fechaF, altura, imc);
            
       
            if( fechaF.isBefore(fechaI)){
                JOptionPane.showMessageDialog(null, "Revisa la fecha final ");
            }else{   
                dietaData.modificarDieta(dieta1);
                borrarCampos();
                jTdni.setText("");
                jBmodificar.setEnabled(false);
                jBeliminar.setEnabled(false);
            }
            
        } catch (NumberFormatException nf){
            JOptionPane.showMessageDialog(null, "Ingrese sólo caracteres numéricos");
        }  
        
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jTdniKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTdniKeyReleased
        PacienteData pacData = new PacienteData();
        DietaData dieData= new DietaData();
        if (!jTdni.getText().isEmpty()) {
            int dni = Integer.parseInt(jTdni.getText());
            if (pacData.buscarPacientexDNI(dni) != null) {
                jTid.setText(pacData.buscarPacientexDNI(dni).getIdPaciente() + "");
                int id= Integer.parseInt(jTid.getText());
                
                if ( dieData.buscarDietaPorPaciente(id)==null) {
                    jBagregar.setEnabled(true);
                    eliBusModF();
                }
                
                if ( dieData.buscarDietaPorPaciente(id)!=null) {
                    jBbuscar.setEnabled(true); 
                    jBmodificar.setEnabled(true);
                    jBagregar.setEnabled(false);
                    jBeliminar.setEnabled(true);
                }

                if (pacData.buscarPacientexDNI(dni).getSexo().equals("M")) {
                    jRhombre.setSelected(true);
                    jRmujer.setSelected(false);
                }
                if (pacData.buscarPacientexDNI(dni).getSexo().equals("F")) {
                    jRmujer.setSelected(true);
                    jRhombre.setSelected(false);
                }
            } else {
                jTid.setText("");
                jRmujer.setSelected(false);
                jRhombre.setSelected(false);
                jBagregar.setEnabled(false);
                eliBusModF();
                borrarCampos();    
            }
        } 
    }//GEN-LAST:event_jTdniKeyReleased

    private void jBbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBbuscarActionPerformed
        // TODO add your handling code here:
        
        DietaData dieData= new DietaData();
        Paciente paci= new Paciente();
        int id= Integer.parseInt(jTid.getText());
        
        if(dieData.buscarDietaPorPaciente(id)!=null){
            Dieta dieta= dieData.buscarDietaPorPaciente(id); 
            jTpeso.setText(dieta.getPesoInicial()+"");
            jTpesoF.setText(dieta.getPesoFinal()+"");
            jTaltura.setText(dieta.getAltura()+"");
            jTimc.setText(dieta.getImc()+"");
            jTdieta.setText(dieta.getNombre());
            Date date = Date.from(dieta.getFechaInicial().atStartOfDay(ZoneId.systemDefault()).toInstant());
            jDfechaI.setDate(date);
            Date date2 = Date.from(dieta.getFechaFinal().atStartOfDay(ZoneId.systemDefault()).toInstant());
            jDfechaF.setDate(date2);  
        }      
    }//GEN-LAST:event_jBbuscarActionPerformed

    private void jTpesoFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTpesoFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTpesoFActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBbuscar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBimc;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JButton jBsalir;
    private com.toedter.calendar.JDateChooser jDfechaF;
    private com.toedter.calendar.JDateChooser jDfechaI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLdni;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JRadioButton jRhombre;
    private javax.swing.JRadioButton jRmujer;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTaltura;
    private javax.swing.JTextField jTdieta;
    private javax.swing.JTextField jTdni;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField jTid;
    private javax.swing.JTextField jTimc;
    private javax.swing.JTextField jTpeso;
    private javax.swing.JTextField jTpesoF;
    // End of variables declaration//GEN-END:variables
    

    
    public void imc(){
        double peso = Double.parseDouble(jTpeso.getText());
        double altura = Double.parseDouble(jTaltura.getText());
        altura=altura/100;
        double imc= peso/(altura*altura);
        
        if (imc<16) {
            JOptionPane.showMessageDialog(null, "Infrapeso: Delgadez Severa");
            jTdieta.setText("Calorica");
        }
        if (imc>16.00 && imc<16.99) {
            JOptionPane.showMessageDialog(null, "Infrapeso: Delgadez moderada");
             jTdieta.setText("Calorica");
        }
        if (imc>17.00 && imc<18.49) {
            JOptionPane.showMessageDialog(null, "Infrapeso: Delgadez aceptable");
             jTdieta.setText("Proteica");
        }
        if (imc>18.50 && imc<24.99) {
            JOptionPane.showMessageDialog(null, "Peso Normal");
             jTdieta.setText("Mediterranea");
        }
        if (imc>25.00 && imc<29.99) {
            JOptionPane.showMessageDialog(null, "Sobrepeso");
             jTdieta.setText("Mediterranea");
        }
        if (imc>30.00 && imc<34.99) {
            JOptionPane.showMessageDialog(null, "Obeso: Tipo I");
             jTdieta.setText("Hipocalorica");
        }
        if (imc>35.00 && imc<40.00) {
            JOptionPane.showMessageDialog(null, "Obeso: Tipo II");
             jTdieta.setText("Hipocalorica");
        }
        if (imc>40.00) {
            JOptionPane.showMessageDialog(null, "Obeso: Tipo III");
             jTdieta.setText("Hipocalorica");
        }
        
        BigDecimal bd = new BigDecimal(imc);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        jTimc.setText(bd+"");
    }
    
    public void pesoIdeal(){
        double peso = Double.parseDouble(jTpeso.getText());
        double altura = Double.parseDouble(jTaltura.getText());
        double pesoIdeal;
        if (jRmujer.isSelected()==true) {
            
            pesoIdeal=(((altura)-100)-((altura)-150)/2);
            jTpesoF.setText(pesoIdeal+"");
        }
        if (jRhombre.isSelected()==true) {
            
            pesoIdeal=(((altura)-100)-((altura)-150)/4);
            jTpesoF.setText(pesoIdeal+"");
        }
        
    }
    public void borrarCampos(){
//            jTdni.setText("");
        jTid.setText("");
        jTpeso.setText("");
        jTpesoF.setText("");
        jTaltura.setText("");
        jTimc.setText("");
        jTdieta.setText("");
        jDfechaI.setCalendar(Calendar.getInstance());
        jDfechaF.setDate(null);
        jRhombre.setSelected(false);
        jRmujer.setSelected(false);
           
    }  
    public void eliBusModF(){
        jBeliminar.setEnabled(false);
        jBmodificar.setEnabled(false);
        jBbuscar.setEnabled(false);
    }
}
