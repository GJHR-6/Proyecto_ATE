package Frame;
import modelo.carrera;
import modelo.usuario;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import modelo.carrera;

public class Registro extends javax.swing.JFrame {

    public Registro() {
        initComponents();
        conectar();
        this.setLocationRelativeTo(null); //coloca el frame en el centro
    }
    //Coneción con la base de datos
    String connectionURL = "jdbc:sqlserver://dbpoov1.mssql.somee.com:1433;databaseName=dbpoov1;user=gjhr;password=PkG*UaP*q3aWrij;";
    Connection con;

    void conectar() {
        try {
            con = DriverManager.getConnection(connectionURL);
            System.out.println("conectado");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error" + e.getMessage().toString());
        }
    }
    public void cerrar() {
        try {
            con.close();
            //no se cierran cosas que ya se cerrraron.
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage().toString());
        }
    }
    usuario u;//objeto de tipo usuario
    carrera c;
    public void buscaruser(String usr) {
        u = new usuario(); //damos un espacio en memoria
        try {

            PreparedStatement at = con.prepareStatement("Select * from usuario where nomb_user = '" + usr + "'"); //manda el codigo a la db
            result = at.executeQuery(); //ejecutar el query
            if (result.getFetchSize() >= 1) { //Se mira si se encontro un resultado en la db
                result.next();//hace que seleccione la primera fila. 
                u.setId_user(result.getInt("id_user")); //selecciona lo contenido de la primera columna
                u.setNomb_user(result.getString("nomb_user"));//selecciona lo contenido de la segunda columna
            }
       } catch (Exception x) {
                              }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpingreso = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jPasswordField1 = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jPasswordField2 = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<carrera>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jpingreso.setBackground(new java.awt.Color(255, 255, 255));
        jpingreso.setForeground(new java.awt.Color(255, 255, 255));
        jpingreso.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Carrera:");
        jpingreso.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, -1, -1));

        jTextField1.setForeground(new java.awt.Color(80, 80, 80));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jpingreso.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 90, 220, 30));
        jpingreso.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, 220, 20));

        jPasswordField1.setForeground(new java.awt.Color(80, 80, 80));
        jPasswordField1.setBorder(null);
        jpingreso.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 190, 220, 30));
        jpingreso.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 220, 20));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Expand_Arrow_32px.png"))); // NOI18N
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jpingreso.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 40, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registrar_1.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registrar_on_1.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registrar_on_1.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/registrar_on_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jpingreso.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 480, 100, 40));

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/icons8_Multiply_32px.png"))); // NOI18N
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel7.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel7MouseMoved(evt);
            }
        });
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel7MouseExited(evt);
            }
        });
        jpingreso.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 0, 40, 40));

        jLabel8.setBackground(new java.awt.Color(238, 112, 82));
        jLabel8.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(238, 112, 82));
        jLabel8.setText("Contraseña: ");
        jpingreso.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));
        jpingreso.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 220, 20));

        jPasswordField2.setForeground(new java.awt.Color(80, 80, 80));
        jPasswordField2.setBorder(null);
        jpingreso.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, 220, 30));

        jLabel9.setBackground(new java.awt.Color(238, 112, 82));
        jLabel9.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(238, 112, 82));
        jLabel9.setText("Confirmar ");
        jpingreso.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 90, -1));

        jLabel10.setBackground(new java.awt.Color(238, 112, 82));
        jLabel10.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(238, 112, 82));
        jLabel10.setText("Contraseña:");
        jpingreso.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 190, -1));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancelar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancelar_on.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancelar_on.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cancelar_on.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jpingreso.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 480, 100, 40));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("Usuario:");
        jpingreso.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        jpingreso.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 400, 220, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpingreso, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jpingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 570, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Botón registrar
        //Enviar parametro usuario "Admin" a frame principal y abrir frame principal
      /*  if (jTextField1.getText().equals("Admin")) {
            Principal form = new Principal(u);
            form.setVisible(true);
            this.dispose();

            //Enviar parametro usuario "Usuario" a frame principal y abrir frame principal
        }
        if (jTextField1.getText().equals("Usuario")) {
            Principal form = new Principal(u);
            form.setVisible(true);
            this.dispose();
        }*/
        //REGISTRARSE
          if((this.jTextField1.getText().equals("")) || (this.jPasswordField1.getText().toString()=="") || this.jPasswordField2.getText()=="" || this.jComboBox1.getItemAt(0)==null) //Para verificar que el usuario haya ingresado todos los datos
        {
            JOptionPane.showMessageDialog(null, "Debe ingresar todos los datos");
        }
        else
        {
        String confir = this.jPasswordField2.getText().toString(); 
        usuario UserNuevo = new usuario();    
        UserNuevo.setCarrera((carrera)jComboBox1.getSelectedItem());
        UserNuevo.setPassword(jPasswordField1.getText());
        UserNuevo.setNomb_user(jTextField1.getText()); 
        
        buscaruser(jTextField1.getText()); //Buscar en la base de datos si ese nombre de usuario existe
        if (u.getNomb_user() == null) //En el caso de no existir entonces se procede a registrar el usuario
        {
            if (UserNuevo.getPassword().equals(confir)) {
                try {
                    PreparedStatement st = con.prepareStatement("Insert into usuario(nomb_user,password,nomb_carrera,esadmin,id_carrera) values ('" + UserNuevo.getNomb_user() + "','" + UserNuevo.getPassword() + "','" + UserNuevo.getCarrera().getNomb_carrera() + "','" + false + "'," + UserNuevo.getCarrera().getId_carrera() + ")");
                    st.execute();
                    JOptionPane.showMessageDialog(null, "Registro completado");
                     login form = new login();
                     form.setVisible(true);
                     this.dispose();
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
                }
                this.dispose();
            } 
            else {
                JOptionPane.showMessageDialog(null, "Las contraseñas no son iguales");
                this.jPasswordField1.setText("");
                this.jPasswordField2.setText("");
                 }
        } 
        else {
            JOptionPane.showMessageDialog(null, "El nombre de usuario ya existe, ingrese otro");
            this.jTextField1.setText("");
            this.jPasswordField1.setText("");
            this.jPasswordField2.setText("");
             }

    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void jLabel7MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseMoved
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel7MouseMoved

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseExited
        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel7MouseExited

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        login forma = new login();
        forma.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
   //Al darle click al jComboBox de las carreras
    this.jComboBox1.removeAllItems();
    llenar_combo();
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
      // this.jComboBox1.addItem("Seleccione carrera"); <-esto da error
       // llenar_combo();
    }//GEN-LAST:event_formWindowOpened

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }
   
    public ResultSet result;
    public void llenar_combo() { //Para llenar el jComboBox con las carreras que están en la base de datos
        try {
            PreparedStatement at = con.prepareStatement("Select id_carrera, nomb_carrera from carrera");
            result = at.executeQuery();
            carrera cr;
            while (result.next()) {
                cr = new carrera();
                cr.setId_carrera(result.getInt("id_carrera"));
                cr.setNomb_carrera(result.getString("nomb_carrera"));
                jComboBox1.addItem(cr);
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<carrera> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel jpingreso;
    // End of variables declaration//GEN-END:variables
}
