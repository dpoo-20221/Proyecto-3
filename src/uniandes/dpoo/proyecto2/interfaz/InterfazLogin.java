package uniandes.dpoo.proyecto2.interfaz;


import FiveCodMover.FiveCodMoverJFrame;
import java.awt.Color;
import java.awt.event.KeyEvent;
import uniandes.dpoo.proyecto2.mundo.ConsolaAplicacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuario
 */
public class InterfazLogin extends javax.swing.JFrame {

    private ConsolaAplicacion consola;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblImagenLogin;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JPanel panelImagenLogin;
    private javax.swing.JPanel panelLogin;
    private javax.swing.JSeparator separador;
    private javax.swing.JSeparator separador1;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtNombre;
    

    public InterfazLogin() {
        initComponents();
        panelImagenLogin.setBackground(new Color(0,0,0,100));
        consola = new ConsolaAplicacion();       
    }

    private void initComponents() {

        panelLogin = new javax.swing.JPanel();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        separador = new javax.swing.JSeparator();
        separador1 = new javax.swing.JSeparator();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        lblExit = new javax.swing.JLabel();
        panelImagenLogin = new javax.swing.JPanel();
        lblImagenLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
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
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelLogin.setBackground(new java.awt.Color(32, 33, 35));
        panelLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNombre.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblNombre.setForeground(new java.awt.Color(16, 95, 149));
        lblNombre.setText("Nombre");
        panelLogin.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        txtNombre.setBackground(new java.awt.Color(32, 33, 35));
        txtNombre.setForeground(new java.awt.Color(255, 255, 255));
        txtNombre.setBorder(null);
        txtNombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txtNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreActionPerformed(evt);
            }
        });
        txtNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNombreKeyTyped(evt);
            }
        });
        panelLogin.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 330, -1));
        panelLogin.add(separador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, 330, 10));
        panelLogin.add(separador1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 260, 330, 10));

        lblCorreo.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        lblCorreo.setForeground(new java.awt.Color(16, 95, 149));
        lblCorreo.setText("Correo");
        panelLogin.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        txtCorreo.setBackground(new java.awt.Color(32, 33, 35));
        txtCorreo.setForeground(new java.awt.Color(255, 255, 255));
        txtCorreo.setBorder(null);
        txtCorreo.setCaretColor(new java.awt.Color(255, 255, 255));
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        txtCorreo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtCorreoKeyTyped(evt);
            }
        });
        panelLogin.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, 330, -1));

        btnIngresar.setBackground(new java.awt.Color(46, 33, 100));
        btnIngresar.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(255, 255, 255));
        btnIngresar.setText("Ingresar");
        btnIngresar.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        panelLogin.add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 370, 250, 50));

        lblExit.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lblExit.setForeground(new java.awt.Color(61, 71, 100));
        lblExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblExit.setText("x");
        lblExit.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });
        panelLogin.add(lblExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 10, 20, 20));

        getContentPane().add(panelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(533, 0, 440, 540));

        panelImagenLogin.setBackground(new java.awt.Color(0, 0, 0));
        panelImagenLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelImagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 540));

        lblImagenLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/uniandes/dpoo/proyecto2/interfaz/ImagenLogin.png"))); // NOI18N
        getContentPane().add(lblImagenLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 540));

        pack();
        setLocationRelativeTo(null);
    }

    private void txtNombreActionPerformed(java.awt.event.ActionEvent evt) {
        
    }

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {
       
    }

    private void formMousePressed(java.awt.event.MouseEvent evt) {
        FiveCodMoverJFrame.MousePressed(evt);
    }

    private void formMouseDragged(java.awt.event.MouseEvent evt) {
        FiveCodMoverJFrame.MouseDraggedFrame(evt, this);
    }

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {
        System.exit(0);
    }

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {

    }

    private void formKeyPressed(java.awt.event.KeyEvent evt) {
        
    }

    private void txtNombreKeyTyped(java.awt.event.KeyEvent evt) {
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        {
            btnIngresar.doClick();
        }
    }

    private void txtCorreoKeyTyped(java.awt.event.KeyEvent evt) {
        if(evt.getKeyChar()==KeyEvent.VK_ENTER)
        {
            btnIngresar.doClick();
        }
    }
    
    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {
        try
        {
            consola.ingreso(txtNombre.getText(), txtCorreo.getText());
            InterfazAdministrador interfazAdministrador = new InterfazAdministrador(consola);
            interfazAdministrador.setVisible(true);
            this.dispose();
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error", JOptionPane.INFORMATION_MESSAGE);
        }
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazLogin().setVisible(true);
            }
        });
    }
}
