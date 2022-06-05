package uniandes.dpoo.proyecto2.interfaz;


import uniandes.dpoo.proyecto2.mundo.Participante;
import uniandes.dpoo.proyecto2.mundo.ConsolaAplicacion;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class FrameAgregarPartipante extends javax.swing.JFrame{

    private Participante user;
    private javax.swing.JPanel PanelInformacion;
    private javax.swing.JPanel PanelLabel;
    private javax.swing.JButton btnCrear;
    private javax.swing.JCheckBox checkFechaFinalizacion;
    private com.toedter.calendar.JDateChooser dateFechaFinal;
    private com.toedter.calendar.JDateChooser dateFechaInicial;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAgregarProyecto;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFechaFinal;
    private javax.swing.JLabel lblFechaInicio;
    private javax.swing.JLabel lblInformacionTiposDisponibles;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblTiposDisponibles;
    private javax.swing.JTextArea txtDescripcion;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTiposDisponibles;
    private ConsolaAplicacion consola;
    public String Nombre;
    public String Descripcion;
    private String Tipo; 
    public ArrayList<String> actividades;
    private InterfazAdministrador interfaz;
    private String nombrePadre;
    

    public FrameAgregarPartipante(ConsolaAplicacion consola, InterfazAdministrador pInterfaz, String pNombrePadre) {
        initComponents();
        lblFechaFinal.setEnabled(false);
        dateFechaFinal.setEnabled(false);
        this.consola = consola;
        interfaz = pInterfaz;
        nombrePadre = pNombrePadre;
        
        lblAgregarProyecto.setText("AGREGAR TAREA");
        lblNombre.setText("Nombre de la tarea");
        
        lblFechaInicio.setVisible(false);
        dateFechaInicial.setVisible(false);
        lblTiposDisponibles.setText("Tipo de tarea");
        lblInformacionTiposDisponibles.setVisible(false);
    }


    private void initComponents() {

        PanelLabel = new javax.swing.JPanel();
        lblExit = new javax.swing.JLabel();
        lblAgregarProyecto = new javax.swing.JLabel();
        PanelInformacion = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        lblFechaInicio = new javax.swing.JLabel();
        dateFechaInicial = new com.toedter.calendar.JDateChooser();
        lblDescripcion = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcion = new javax.swing.JTextArea();
        lblTiposDisponibles = new javax.swing.JLabel();
        txtTiposDisponibles = new javax.swing.JTextField();
        lblInformacionTiposDisponibles = new javax.swing.JLabel();
        checkFechaFinalizacion = new javax.swing.JCheckBox();
        lblFechaFinal = new javax.swing.JLabel();
        dateFechaFinal = new com.toedter.calendar.JDateChooser();
        btnCrear = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelLabel.setBackground(new java.awt.Color(21, 25, 28));
        PanelLabel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 18)); 
        lblExit.setForeground(new java.awt.Color(61, 71, 100));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("x");
        lblExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        lblAgregarProyecto.setFont(new java.awt.Font("Times New Roman", 0, 24)); 
        lblAgregarProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblAgregarProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAgregarProyecto.setText("AGREGAR PROYECTO");
        lblAgregarProyecto.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout PanelLabelLayout = new javax.swing.GroupLayout(PanelLabel);
        PanelLabel.setLayout(PanelLabelLayout);
        PanelLabelLayout.setHorizontalGroup(
            PanelLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelLabelLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(lblAgregarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelLabelLayout.setVerticalGroup(
            PanelLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLabelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLabelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelLabelLayout.createSequentialGroup()
                        .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(lblAgregarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                .addContainerGap())
        );

        getContentPane().add(PanelLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 60));

        PanelInformacion.setBackground(new java.awt.Color(34, 40, 44));
        PanelInformacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        PanelInformacion.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblNombre.setForeground(new java.awt.Color(16, 95, 149));
        lblNombre.setText("Nombre del proyecto");
        PanelInformacion.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, -1, -1));

        txtNombre.setBackground(new java.awt.Color(21, 25, 28));
        txtNombre.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        PanelInformacion.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 180, -1));

        lblFechaInicio.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblFechaInicio.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaInicio.setText("Fecha de inicio");
        PanelInformacion.add(lblFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        dateFechaInicial.setBackground(new java.awt.Color(255, 255, 255));
        PanelInformacion.add(dateFechaInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 180, -1));

        lblDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblDescripcion.setForeground(new java.awt.Color(16, 95, 149));
        lblDescripcion.setText("Descripci�n");
        PanelInformacion.add(lblDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        txtDescripcion.setBackground(new java.awt.Color(21, 25, 28));
        txtDescripcion.setColumns(20);
        txtDescripcion.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setLineWrap(true);
        txtDescripcion.setRows(5);
        jScrollPane1.setViewportView(txtDescripcion);

        PanelInformacion.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 100, 190, -1));

        lblTiposDisponibles.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblTiposDisponibles.setForeground(new java.awt.Color(16, 95, 149));
        lblTiposDisponibles.setText("Tipos de actividades");
        PanelInformacion.add(lblTiposDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        txtTiposDisponibles.setBackground(new java.awt.Color(21, 25, 28));
        txtTiposDisponibles.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtTiposDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        PanelInformacion.add(txtTiposDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, 180, -1));

        lblInformacionTiposDisponibles.setFont(new java.awt.Font("Times New Roman", 0, 10)); 
        lblInformacionTiposDisponibles.setForeground(new java.awt.Color(255, 255, 255));
        lblInformacionTiposDisponibles.setText("* Separe cada tipo de actividad con una coma.");
        PanelInformacion.add(lblInformacionTiposDisponibles, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 230, -1, -1));

        checkFechaFinalizacion.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        checkFechaFinalizacion.setForeground(new java.awt.Color(16, 95, 149));
        checkFechaFinalizacion.setText("Se conoce la fecha de finalización");
        checkFechaFinalizacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkFechaFinalizacionActionPerformed(evt);
            }
        });
        PanelInformacion.add(checkFechaFinalizacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        lblFechaFinal.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblFechaFinal.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaFinal.setText("Fecha de finalizaci�n");
        PanelInformacion.add(lblFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        dateFechaFinal.setBackground(new java.awt.Color(255, 255, 255));
        PanelInformacion.add(dateFechaFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 300, 180, -1));

        btnCrear.setBackground(new java.awt.Color(25, 44, 99));
        btnCrear.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        btnCrear.setForeground(new java.awt.Color(255, 255, 255));
        btnCrear.setText("Crear");
        btnCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearActionPerformed(evt);
            }
        });
        PanelInformacion.add(btnCrear, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 360, 120, 40));

        getContentPane().add(PanelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 350, 420));

        pack();
        setLocationRelativeTo(null);
        lblFechaFinal.setVisible(false);
        dateFechaFinal.setVisible(false);
        checkFechaFinalizacion.setVisible(false);
    }

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {
        dispose();
    }
    
    private void btnCrearActionPerformed(java.awt.event.ActionEvent evt) 
    {

        Nombre = txtNombre.getText();
        Descripcion = txtDescripcion.getText();
        Tipo = txtTiposDisponibles.getText();
        

        consola.agregarNodo(nombrePadre, "Tarea", Nombre, Descripcion, Tipo);
        interfaz.update();
		JOptionPane.showMessageDialog(null, "Tarea creada el d�a "+ LocalDateTime.now().getDayOfMonth()+" del mes de "+LocalDateTime.now().getMonth(), "Crear proyecto", JOptionPane.INFORMATION_MESSAGE);
		dispose();
    }

    private void checkFechaFinalizacionActionPerformed(java.awt.event.ActionEvent evt) {
        if (!lblFechaFinal.isEnabled())
        {
            lblFechaFinal.setEnabled(true);
            dateFechaFinal.setEnabled(true);
        }
        else
        {
            lblFechaFinal.setEnabled(false);
            dateFechaFinal.setEnabled(false);
        }
    }   
}
