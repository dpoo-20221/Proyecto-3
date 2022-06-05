
package uniandes.dpoo.proyecto2.interfaz;
import uniandes.dpoo.proyecto2.mundo.ConsolaAplicacion;
import uniandes.dpoo.proyecto2.mundo.Nodo;
import uniandes.dpoo.proyecto2.mundo.PaqueteTrabajo;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import uniandes.dpoo.proyecto2.mundo.Actividad;
import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.LineBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

/**
 *
 * @author Usuario
 */
public class InterfazAdministrador extends javax.swing.JFrame implements TreeSelectionListener, ActionListener, ListSelectionListener{
    
    public ConsolaAplicacion consola;
    private Actividad actividad;
    
    private javax.swing.JPanel PanelInformacion;
    private javax.swing.JPanel PanelOpciones;
    private javax.swing.JButton btnCompletarActividad;
    private javax.swing.JButton btnCompletarProyecto;
    private javax.swing.JLabel iconAgregarActividad;
    private javax.swing.JLabel iconAgregarParticipante;
    private javax.swing.JLabel iconCrearProyecto;
    private javax.swing.JLabel iconReporteActividad;
    private javax.swing.JLabel iconReporteParticipante;
    private javax.swing.JLabel iconReporteProyecto;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lblActividades;
    private javax.swing.JLabel lblAgregarActividad;
    private javax.swing.JLabel lblAgregarParticipante;
    private javax.swing.JLabel lblCrearProyecto;
    private javax.swing.JLabel lblDescripcionActividad;
    private javax.swing.JLabel lblDescripcionProyecto;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblFechaFinalActividad;
    private javax.swing.JLabel lblFechaFinalProyecto;
    private javax.swing.JLabel lblFechaInicialActividad;
    private javax.swing.JLabel lblFechaInicialProyecto;
    private javax.swing.JLabel lblIdProyecto;
    private javax.swing.JLabel lblParticipante;
    private javax.swing.JLabel lblProyectos;
    private javax.swing.JLabel lblReporteActividad;
    private javax.swing.JLabel lblReporteParticipante;
    private javax.swing.JLabel lblReporteProyecto;
    private javax.swing.JLabel lblTipo;
    private javax.swing.JList lstActividades;
    private javax.swing.JList lstProyectos;
    private javax.swing.JScrollPane pnlScrollActividades;
    private javax.swing.JScrollPane pnlScrollProyectos;
    private javax.swing.JTextArea txtDescripcionActividad;
    private javax.swing.JTextArea txtDescripcionProyecto;
    private javax.swing.JTextField txtFechaFinalActividad;
    private javax.swing.JTextField txtFechaFinalProyecto;
    private javax.swing.JTextField txtFechaInicialActividad;
    private javax.swing.JTextField txtFechaInicialProyecto;
    private javax.swing.JTextField txtIdProyecto;
    private javax.swing.JTextField txtParticipante;
    private javax.swing.JTextField txtTipo;

	private PaqueteTrabajo paqueteTrabajoRaiz;
	private JTree tree;
	private DefaultMutableTreeNode raizJtree;
	
	private Nodo nodoSeleccionado;
	private Actividad actividadSeleccionada;
    

    public InterfazAdministrador(ConsolaAplicacion pConsola) {
        initComponents();
        
        consola = pConsola;
        
        paqueteTrabajoRaiz = consola.darPaqueteTrabajoRaiz();
        
        lstProyectos = new JList<>(paqueteTrabajoRaiz.darPreorden().toArray());
        lstProyectos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                proyectosValueChanged(evt);
            }
        });
        
		actualizar(paqueteTrabajoRaiz);
		seleccionarNodo(paqueteTrabajoRaiz.darNombre());
        
        lblAgregarActividad.setVisible(true);
        lblAgregarParticipante.setVisible(true);
        lblReporteProyecto.setVisible(true);
        lblReporteActividad.setVisible(true);
        
        iconAgregarActividad.setVisible(true);
        iconAgregarParticipante.setVisible(true);
        iconReporteProyecto.setVisible(true);
        iconReporteActividad.setVisible(true);
        
        lblFechaFinalActividad.setVisible(false);
        txtFechaFinalActividad.setVisible(false);
        txtParticipante.setVisible(false);
        lblIdProyecto.setVisible(false);
        txtIdProyecto.setVisible(false);
        lblParticipante.setVisible(false);
        
        
        lblCrearProyecto.setText("Agregar Trabajo");
        lblAgregarParticipante.setText("Agregar Tarea");
        lblAgregarActividad.setText("Agregar Actividad");
    }

    private void initComponents() {

        PanelOpciones = new javax.swing.JPanel();
        lblCrearProyecto = new javax.swing.JLabel();
        iconCrearProyecto = new javax.swing.JLabel();
        iconAgregarParticipante = new javax.swing.JLabel();
        lblAgregarParticipante = new javax.swing.JLabel();
        iconAgregarActividad = new javax.swing.JLabel();
        lblAgregarActividad = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        iconReporteActividad = new javax.swing.JLabel();
        lblReporteActividad = new javax.swing.JLabel();
        lblReporteParticipante = new javax.swing.JLabel();
        iconReporteParticipante = new javax.swing.JLabel();
        iconReporteProyecto = new javax.swing.JLabel();
        lblReporteProyecto = new javax.swing.JLabel();
        PanelInformacion = new javax.swing.JPanel();
        pnlScrollProyectos = new javax.swing.JScrollPane();
        lstProyectos = new javax.swing.JList<>();
        pnlScrollActividades = new javax.swing.JScrollPane();
        lstActividades = new javax.swing.JList<>();
        lblProyectos = new javax.swing.JLabel();
        lblActividades = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDescripcionProyecto = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtDescripcionActividad = new javax.swing.JTextArea();
        lblDescripcionProyecto = new javax.swing.JLabel();
        lblDescripcionActividad = new javax.swing.JLabel();
        txtFechaInicialProyecto = new javax.swing.JTextField();
        lblFechaInicialProyecto = new javax.swing.JLabel();
        txtFechaFinalProyecto = new javax.swing.JTextField();
        lblFechaFinalProyecto = new javax.swing.JLabel();
        lblIdProyecto = new javax.swing.JLabel();
        txtIdProyecto = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        lblFechaInicialActividad = new javax.swing.JLabel();
        txtFechaInicialActividad = new javax.swing.JTextField();
        lblFechaFinalActividad = new javax.swing.JLabel();
        txtFechaFinalActividad = new javax.swing.JTextField();
        lblTipo = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        lblParticipante = new javax.swing.JLabel();
        txtParticipante = new javax.swing.JTextField();
        btnCompletarActividad = new javax.swing.JButton();
        btnCompletarProyecto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("AdministradorProyectos");
        setUndecorated(true);
        setResizable(false);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelOpciones.setBackground(new java.awt.Color(21, 25, 28));
        PanelOpciones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblCrearProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblCrearProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblCrearProyecto.setText("Crear Proyecto");
        PanelOpciones.add(lblCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 46, -1, -1));

        iconCrearProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconCrearProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniandes/dpoo/proyecto2/interfaz/IconoAgregarProyecto.png"))); 
        iconCrearProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconCrearProyectoMouseClicked(evt);
            }
        });
        PanelOpciones.add(iconCrearProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 90, 60));

        iconAgregarParticipante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconAgregarParticipante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniandes/dpoo/proyecto2/interfaz/IconoAgregarParticipante.png"))); 
        iconAgregarParticipante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconAgregarParticipanteMouseClicked(evt);
            }
        });
        PanelOpciones.add(iconAgregarParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 0, 110, 60));

        lblAgregarParticipante.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblAgregarParticipante.setForeground(new java.awt.Color(16, 95, 149));
        lblAgregarParticipante.setText("Agregar Participante");
        PanelOpciones.add(lblAgregarParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(118, 46, -1, -1));

        iconAgregarActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconAgregarActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniandes/dpoo/proyecto2/interfaz/IconoAgregarActividad.png"))); 
        iconAgregarActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconAgregarActividadMouseClicked(evt);
            }
        });
        PanelOpciones.add(iconAgregarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 100, 60));

        lblAgregarActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblAgregarActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblAgregarActividad.setText("Agregar Actividad");
        PanelOpciones.add(lblAgregarActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(234, 46, -1, -1));

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
        PanelOpciones.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(954, 6, 20, 20));

        iconReporteActividad.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconReporteActividad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniandes/dpoo/proyecto2/interfaz/IconoReporteActividad.png"))); 
        iconReporteActividad.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconReporteActividadMouseClicked(evt);
            }
        });
        PanelOpciones.add(iconReporteActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 90, 60));

        lblReporteActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblReporteActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblReporteActividad.setText("Reporte Actividad");
        PanelOpciones.add(lblReporteActividad, new org.netbeans.lib.awtextra.AbsoluteConstraints(866, 46, -1, -1));

        lblReporteParticipante.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblReporteParticipante.setForeground(new java.awt.Color(16, 95, 149));
        lblReporteParticipante.setText("Reporte Participante");
        PanelOpciones.add(lblReporteParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(748, 46, -1, -1));

        iconReporteParticipante.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconReporteParticipante.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniandes/dpoo/proyecto2/interfaz/IconoReporteParticipante.png"))); 
        iconReporteParticipante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconReporteParticipanteMouseClicked(evt);
            }
        });
        PanelOpciones.add(iconReporteParticipante, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 110, 60));

        iconReporteProyecto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconReporteProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniandes/dpoo/proyecto2/interfaz/IconoReporteProyecto.png"))); 
        iconReporteProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                iconReporteProyectoMouseClicked(evt);
            }
        });
        PanelOpciones.add(iconReporteProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 0, 100, 60));

        lblReporteProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblReporteProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblReporteProyecto.setText("Reporte Proyecto");
        PanelOpciones.add(lblReporteProyecto, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 46, -1, -1));

        getContentPane().add(PanelOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -4, 980, 70));

        PanelInformacion.setBackground(new java.awt.Color(34, 40, 44));

        lstProyectos.setBackground(new java.awt.Color(21, 25, 28));
        lstProyectos.setBorder(null);
        lstProyectos.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lstProyectos.setForeground(new java.awt.Color(255, 255, 255));
        lstProyectos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstProyectos.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstProyectosValueChanged(evt);
            }
        });
        pnlScrollProyectos.setViewportView(lstProyectos);

        lstActividades.setBackground(new java.awt.Color(21, 25, 28));
        lstActividades.setBorder(null);
        lstActividades.setFont(new java.awt.Font("Times New Roman", 0, 14)); 
        lstActividades.setForeground(new java.awt.Color(255, 255, 255));
        lstActividades.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstActividades.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstActividadesValueChanged(evt);
            }
        });
        pnlScrollActividades.setViewportView(lstActividades);

        lblProyectos.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        lblProyectos.setForeground(new java.awt.Color(16, 95, 149));
        lblProyectos.setText("Proyectos");

        lblActividades.setFont(new java.awt.Font("Times New Roman", 1, 14)); 
        lblActividades.setForeground(new java.awt.Color(16, 95, 149));
        lblActividades.setText("Actividades");

        txtDescripcionProyecto.setEditable(false);
        txtDescripcionProyecto.setBackground(new java.awt.Color(21, 25, 28));
        txtDescripcionProyecto.setColumns(20);
        txtDescripcionProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtDescripcionProyecto.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcionProyecto.setLineWrap(true);
        txtDescripcionProyecto.setRows(5);
        jScrollPane1.setViewportView(txtDescripcionProyecto);

        txtDescripcionActividad.setEditable(false);
        txtDescripcionActividad.setBackground(new java.awt.Color(21, 25, 28));
        txtDescripcionActividad.setColumns(20);
        txtDescripcionActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtDescripcionActividad.setForeground(new java.awt.Color(255, 255, 255));
        txtDescripcionActividad.setLineWrap(true);
        txtDescripcionActividad.setRows(5);
        jScrollPane2.setViewportView(txtDescripcionActividad);

        lblDescripcionProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblDescripcionProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblDescripcionProyecto.setText("Descripción proyecto");

        lblDescripcionActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblDescripcionActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblDescripcionActividad.setText("Descripción actividad");

        txtFechaInicialProyecto.setEditable(false);
        txtFechaInicialProyecto.setBackground(new java.awt.Color(21, 25, 28));
        txtFechaInicialProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtFechaInicialProyecto.setForeground(new java.awt.Color(255, 255, 255));

        lblFechaInicialProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblFechaInicialProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaInicialProyecto.setText("Fecha inicial");

        txtFechaFinalProyecto.setEditable(false);
        txtFechaFinalProyecto.setBackground(new java.awt.Color(21, 25, 28));
        txtFechaFinalProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtFechaFinalProyecto.setForeground(new java.awt.Color(255, 255, 255));

        lblFechaFinalProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblFechaFinalProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaFinalProyecto.setText("Fecha final");

        lblIdProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblIdProyecto.setForeground(new java.awt.Color(16, 95, 149));
        lblIdProyecto.setText("Id proyecto");

        txtIdProyecto.setEditable(false);
        txtIdProyecto.setBackground(new java.awt.Color(21, 25, 28));
        txtIdProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtIdProyecto.setForeground(new java.awt.Color(255, 255, 255));

        lblFechaInicialActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblFechaInicialActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaInicialActividad.setText("Fecha inicial");

        txtFechaInicialActividad.setEditable(false);
        txtFechaInicialActividad.setBackground(new java.awt.Color(21, 25, 28));
        txtFechaInicialActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtFechaInicialActividad.setForeground(new java.awt.Color(255, 255, 255));

        lblFechaFinalActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblFechaFinalActividad.setForeground(new java.awt.Color(16, 95, 149));
        lblFechaFinalActividad.setText("Fecha final");

        txtFechaFinalActividad.setEditable(false);
        txtFechaFinalActividad.setBackground(new java.awt.Color(21, 25, 28));
        txtFechaFinalActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtFechaFinalActividad.setForeground(new java.awt.Color(255, 255, 255));

        lblTipo.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblTipo.setForeground(new java.awt.Color(16, 95, 149));
        lblTipo.setText("Tipo de actividad");

        txtTipo.setEditable(false);
        txtTipo.setBackground(new java.awt.Color(21, 25, 28));
        txtTipo.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtTipo.setForeground(new java.awt.Color(255, 255, 255));

        lblParticipante.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        lblParticipante.setForeground(new java.awt.Color(16, 95, 149));
        lblParticipante.setText("Participante");

        txtParticipante.setEditable(false);
        txtParticipante.setBackground(new java.awt.Color(21, 25, 28));
        txtParticipante.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        txtParticipante.setForeground(new java.awt.Color(255, 255, 255));

        btnCompletarActividad.setBackground(new java.awt.Color(25, 44, 99));
        btnCompletarActividad.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        btnCompletarActividad.setForeground(new java.awt.Color(255, 255, 255));
        btnCompletarActividad.setText("Completar actividad");
        btnCompletarActividad.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnCompletarActividad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompletarActividadActionPerformed(evt);
            }
        });

        btnCompletarProyecto.setBackground(new java.awt.Color(25, 44, 99));
        btnCompletarProyecto.setFont(new java.awt.Font("Times New Roman", 0, 12)); 
        btnCompletarProyecto.setForeground(new java.awt.Color(255, 255, 255));
        btnCompletarProyecto.setText("Completar Proyecto");
        btnCompletarProyecto.setActionCommand("Completar Proyecto");
        btnCompletarProyecto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        javax.swing.GroupLayout PanelInformacionLayout = new javax.swing.GroupLayout(PanelInformacion);
        PanelInformacion.setLayout(PanelInformacionLayout);
        PanelInformacionLayout.setHorizontalGroup(
            PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInformacionLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(PanelInformacionLayout.createSequentialGroup()
                                .addComponent(lblProyectos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jSeparator2))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, PanelInformacionLayout.createSequentialGroup()
                                .addComponent(lblActividades)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 869, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 18, Short.MAX_VALUE))
                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                        .addComponent(pnlScrollActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcionActividad, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInformacionLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaInicialActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaInicialActividad)
                                    .addComponent(lblTipo)
                                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaFinalActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaFinalActividad)
                                    .addComponent(lblParticipante)
                                    .addComponent(txtParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInformacionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnCompletarActividad, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(152, 152, 152))))
                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                        .addComponent(pnlScrollProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcionProyecto, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(92, 92, 92)
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFechaInicialProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFechaInicialProyecto)
                            .addGroup(PanelInformacionLayout.createSequentialGroup()
                                .addComponent(lblIdProyecto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtIdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInformacionLayout.createSequentialGroup()
                                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtFechaFinalProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblFechaFinalProyecto))
                                .addGap(74, 74, 74))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelInformacionLayout.createSequentialGroup()
                                .addComponent(btnCompletarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(64, 64, 64))))))
        );
        PanelInformacionLayout.setVerticalGroup(
            PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelInformacionLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblProyectos)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInformacionLayout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(lblDescripcionProyecto)
                                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(PanelInformacionLayout.createSequentialGroup()
                                                .addComponent(lblFechaFinalProyecto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFechaFinalProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(PanelInformacionLayout.createSequentialGroup()
                                                .addComponent(lblFechaInicialProyecto)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(txtFechaInicialProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGap(31, 31, 31)
                                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblIdProyecto)
                                            .addComponent(txtIdProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(btnCompletarProyecto)))))
                            .addComponent(pnlScrollProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblActividades))
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlScrollActividades, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescripcionActividad)
                            .addComponent(btnCompletarActividad))
                        .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelInformacionLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(PanelInformacionLayout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                                        .addComponent(lblFechaFinalActividad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaFinalActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                                        .addComponent(lblFechaInicialActividad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtFechaInicialActividad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(34, 34, 34)
                                .addGroup(PanelInformacionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                                        .addComponent(lblTipo)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(PanelInformacionLayout.createSequentialGroup()
                                        .addComponent(lblParticipante)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtParticipante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        getContentPane().add(PanelInformacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 980, 480));

        pack();
        setLocationRelativeTo(null);
    }

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }
    
    private void formMousePressed(java.awt.event.MouseEvent evt) {
        FiveCodMoverJFrame.MousePressed(evt);
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }
    public ConsolaAplicacion getConsola(){
    	return consola;
    }

    private void lstProyectosValueChanged(javax.swing.event.ListSelectionEvent evt) 
    {
        try
        {
        	//System.out.println(lstProyectos.getSelectedValue());
        }
        catch(Exception e)
        {
        	
        }
    }

    private void lstActividadesValueChanged(javax.swing.event.ListSelectionEvent evt) {
        try
        {
            lblReporteActividad.setVisible(true);
            iconReporteActividad.setVisible(true);
            txtFechaFinalActividad.setVisible(true);
            lblFechaFinalActividad.setVisible(true);
            
            actividad = nodoSeleccionado.buscarActividad( (String) lstActividades.getModel().getElementAt(lstActividades.getSelectedIndex()) );
            actividadSeleccionada = actividad;
            txtDescripcionActividad.setText(actividad.getDescripcion());
            String listaFechaI[] = actividad.getfechaInicio().toString().split("T");
            String listaTiempoI[] = listaFechaI[1].split(":");
            String texto1 = listaFechaI[0]+" "+listaTiempoI[0]+":"+listaTiempoI[1];
            txtFechaInicialActividad.setText(texto1);
            if(actividad.isCompletada())
            {
                String listaFechaF[] = actividad.getFechaRealizacion().toString().split("T");
                String listaTiempoF[] = listaFechaF[1].split(":");
                String texto2 = listaFechaF[0]+" "+listaTiempoF[0]+":"+listaTiempoF[1];
                txtFechaFinalActividad.setText(texto2);
                btnCompletarActividad.setVisible(false);
                
            }
            else
            {
                txtFechaFinalActividad.setVisible(false);
                lblFechaFinalActividad.setVisible(false);
                btnCompletarActividad.setVisible(true);

            }
            txtTipo.setText(actividad.getTipo());
        }
        catch(Exception e)
        {
            
        }
    }

    private void iconCrearProyectoMouseClicked(java.awt.event.MouseEvent evt) {
        
        FrameAgregarProyecto frameAgregarProyecto = new FrameAgregarProyecto(consola, this, nodoSeleccionado.darNombre());
        frameAgregarProyecto.setVisible(true);
    }

    private void iconAgregarParticipanteMouseClicked(java.awt.event.MouseEvent evt) {
       
        if(nodoSeleccionado.darTipo().equals("PaqueteTrabajo"))
        {
        	FrameAgregarPartipante frameAgregarParticipante = new FrameAgregarPartipante(consola, this, nodoSeleccionado.darNombre());
            frameAgregarParticipante.setVisible(true);  
        }
        else
        {
        	JOptionPane.showMessageDialog(null,"No se puede agregar una tarea a otra");
        }
    }

    private void iconAgregarActividadMouseClicked(java.awt.event.MouseEvent evt) {
        if(!(nodoSeleccionado instanceof PaqueteTrabajo))
        {
        	FrameAgregarActividadFinal frameAgregarActividad = new FrameAgregarActividadFinal(consola, this, nodoSeleccionado.darNombre());
            frameAgregarActividad.setVisible(true);
        }
        else
        {
        	JOptionPane.showMessageDialog(null,"No se puede agregar una actividad a un paquete de trabajo");
        }
    }
    
    private void iconReporteProyectoMouseClicked(java.awt.event.MouseEvent evt) {
    	//String mensaje = "El nombre del proyecto: "+ proyecto.getNombre()+"\n"+"El numero de participantes es: "+proyecto.getParticipantes().size()+"\n"+"El numero de actividades es: "+proyecto.getActividades().size()+"\n"+"La fecha de inicio es: "+proyecto.getFechaInicio()+"\n"+"La fecha final es: "+proyecto.getFechaFinal();
    	//JOptionPane.showMessageDialog(null,mensaje);
    }

    private void iconReporteParticipanteMouseClicked(java.awt.event.MouseEvent evt) {        
        
    //JOptionPane.showMessageDialog(null, "<html><h1 style=\"font-family: 'Times New Roman', Times, serif;\"><center>"+consola.getUsuario().getNombre()+"</center></h1><p style=\"font-family: 'Times New Roman', Times, serif;\">"+consola.getUsuario().generarReporte()+"</p></html>", "Reporte de participante", JOptionPane.INFORMATION_MESSAGE);
    }
    private void iconReporteActividadMouseClicked(java.awt.event.MouseEvent evt) {
    	
    	String mensaje = "";

    	
    	if (actividad.isCompletada())
    	{
    		//mensaje = "El nombre de la actividad es: "+ actividad.getTitulo()+"\n"+"El participnate es: "+ actividad.getParticipante().getNombre() +"\nDescripcion de la actividad: "+actividad.getDescripcion()+"\n"+ "La actividad fue terminada " + "\nLa fecha de inicio es: "+ actividad.getfechaInicio()+"\n"+"La fecha en la que se finalizo es: "+actividad.getFechaRealizacion();
    	}
    	
    	else
    	{
    		//mensaje = "El nombre de la actividad es: "+ actividad.getTitulo()+"\n"+"El participnate es: "+ actividad.getParticipante() +"\nDescripcion de la actividad: "+actividad.getDescripcion()+"\n"+ "La actividad no ha sido terminada " + "\nLa fecha de inicio es: "+ actividad.getfechaInicio()+"\n";
    	}
    	
    	JOptionPane.showMessageDialog(null,mensaje);
    }

    private void btnCompletarActividadActionPerformed(ActionEvent evt) {
    	LocalDateTime  diaActividad =  LocalDateTime.now();
    	
    	actividad.agregarFechaRealizacion(diaActividad);
    	
    	
    	
    } 
    
	public String darIdSeleccionado()
	{
		if (tree == null || raizJtree == null || tree.getSelectionPath() == null)
		{
			return null;
		}

		DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) tree.getSelectionPath().getLastPathComponent();
		return ((Nodo) treeNode.getUserObject()).darNombre();

	}
	
	public void update()
	{
		actualizar(paqueteTrabajoRaiz);
	}
    
    public void actualizar(PaqueteTrabajo pRaiz)
	{
		String idSeleccionado = darIdSeleccionado();
		List<String> abiertos = new ArrayList<>();
		if (tree != null)
		{
			for (int i = 0; i < tree.getRowCount() - 1; i++)
			{
				TreePath pathActual = tree.getPathForRow(i);
				TreePath pathSiguiente = tree.getPathForRow(i + 1);
				if (pathActual.isDescendant(pathSiguiente))
				{
					DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) pathActual.getLastPathComponent();
					abiertos.add(((Nodo) treeNode.getUserObject()).darNombre());
				}
			}
		}

		paqueteTrabajoRaiz = pRaiz;
		lstProyectos = new JList<>((paqueteTrabajoRaiz.darPreorden().toArray()));
		lstProyectos.addListSelectionListener(this);

		raizJtree = new DefaultMutableTreeNode(pRaiz);
		agregarHijos(raizJtree, pRaiz);

		tree = new JTree(raizJtree);
		pnlScrollProyectos.setViewportView(tree);


		ImageIcon imageIcon = new ImageIcon("./data/imagenes/marca.png");
		DefaultTreeCellRenderer renderer = new ProyectoCellRender();
		renderer.setLeafIcon(imageIcon);

		tree.setCellRenderer(renderer);
		tree.addTreeSelectionListener(this);

		for (String id : abiertos)
		{
			DefaultMutableTreeNode treeNode = buscar(id);
			if (treeNode != null)
			{
				tree.expandPath(new TreePath(treeNode.getPath()));
			}
		}

		if (idSeleccionado != null)
		{
			seleccionarNodo(idSeleccionado);
		}
	}
    
	public void agregarHijos(DefaultMutableTreeNode pNodo, PaqueteTrabajo pCategoria)
	{
		for (Nodo nodoAlmacen : pCategoria.darNodos())
		{
			DefaultMutableTreeNode nodoArbol = new DefaultMutableTreeNode(nodoAlmacen);
			if (nodoAlmacen instanceof PaqueteTrabajo)
			{
				agregarHijos(nodoArbol, (PaqueteTrabajo) nodoAlmacen);
			}
			pNodo.add(nodoArbol);
		}
	}

	private DefaultMutableTreeNode buscar(String pIdNodo)
	{
		Enumeration<TreeNode> e = raizJtree.depthFirstEnumeration();
		while (e.hasMoreElements())
		{
			DefaultMutableTreeNode nodoJtree = (DefaultMutableTreeNode) e.nextElement();
			Nodo nodoAlmacen = (Nodo) nodoJtree.getUserObject();
			if (nodoAlmacen.darNombre().equalsIgnoreCase(pIdNodo))
			{
				return nodoJtree;
			}
		}
		return null;
	}
	
	public void seleccionarNodo(String pIdNodo)
	{
		seleccionarNodoArbol(pIdNodo);

		seleccionarNodoLista(pIdNodo);
	}
	
	private void seleccionarNodoArbol(String pIdNodo)
	{
		DefaultMutableTreeNode treeNode = buscar(pIdNodo);
		if (treeNode != null)
		{
			tree.setSelectionPath(new TreePath(treeNode.getPath()));
			tree.scrollPathToVisible(new TreePath(treeNode.getPath()));
			tree.expandPath(new TreePath(treeNode.getPath()));
		}
	}
	
	private void seleccionarNodoLista(String pIdNodo)
	{
		if (lstProyectos != null)
		{
			for (int i = 0; i < lstProyectos.getModel().getSize(); i++)
			{
				Nodo p = (Nodo) lstProyectos.getModel().getElementAt(i);
				if (p.darNombre().equals(pIdNodo))
				{
					lstProyectos.setSelectedIndex(i);
					break;
				}
			}
		}
	}
	
	public void updateActividades()
	{
		if(!(nodoSeleccionado instanceof PaqueteTrabajo))
		{
			DefaultListModel<String> modeloLista = new DefaultListModel<>();
			for(Actividad a:nodoSeleccionado.darActividades())
			{
				modeloLista.addElement(a.getTitulo());
			}
			lstActividades.setModel(modeloLista);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	public void valueChanged(TreeSelectionEvent pEvento)
	{
		DefaultMutableTreeNode treeNode = (DefaultMutableTreeNode) pEvento.getPath().getLastPathComponent();
		Nodo nodo = (Nodo) treeNode.getUserObject();
		nodoSeleccionado = nodo;
		
		lblReporteProyecto.setVisible(true);
        iconReporteProyecto.setVisible(true);
        lblAgregarParticipante.setVisible(true);
        iconAgregarParticipante.setVisible(true);
        lblAgregarActividad.setVisible(true);
        iconAgregarActividad.setVisible(true);
        
        txtDescripcionProyecto.setText(nodo.darDescripcion());
    
        String listaFechaI[] = nodo.darFechaInicio().toString().split("T");
        String listaTiempoI[] = listaFechaI[1].split(":");
        String texto1 = listaFechaI[0]+" "+listaTiempoI[0]+":"+listaTiempoI[1];
        txtFechaInicialProyecto.setText(texto1);
        
        btnCompletarActividad.setVisible(false);
        
        if(nodoSeleccionado instanceof PaqueteTrabajo)
        {
        	txtDescripcionActividad.setText("");
        	txtFechaFinalActividad.setText("");
        	txtFechaInicialActividad.setText("");
        	txtTipo.setText("");
        	lstActividades.setModel(new DefaultListModel<>());
        }
        
        updateActividades();
	}

	public void proyectosValueChanged(ListSelectionEvent pEvento)
	{
		
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
