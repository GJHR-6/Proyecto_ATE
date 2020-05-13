package Frame;

import modelo.usuario;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.util.GregorianCalendar;
import java.util.Calendar;
import modelo.asignaciones;

public final class agregar_tareas extends javax.swing.JFrame{

    internal_tareas internal; //para llamar lo que está en la clase internal (en la que está la conexión)
    Calendar f = new GregorianCalendar();
    usuario user;

    public agregar_tareas() {
        initComponents();
    }
    DefaultTableModel tbmodelo;// para mandar a llamar el modelo de la tabla

    public agregar_tareas(DefaultTableModel tb, int accion, internal_tareas i, usuario user){
        initComponents();
        this.user = user;
        tbmodelo = tb;
        this.accion = accion;
        internal = i;
    }
    String ident;
    int pos=0;
    int accion;

    public agregar_tareas(DefaultTableModel tb, String iden, int accion, internal_tareas x,usuario user) {
        initComponents();
        tbmodelo = tb; 
        ident = iden;  
        internal = x;
        this.user=user;
        this.accion = accion;
        for (int i = 0; i <=tbmodelo.getRowCount()-1; i++) {
            if (tbmodelo.getValueAt(i, 0).toString().equalsIgnoreCase(ident)) { 
                pos = i; 
            }
        }
        this.jTextField1.setText(tbmodelo.getValueAt(pos, 2).toString()); //esto es para que obtener el dato de la tabla en la posicion (descripcion)
        this.jComboBox1.setSelectedItem(tbmodelo.getValueAt(pos, 3).toString());
       
        pos = Integer.parseInt(iden);
        // JOptionPane.showMessageDialog(null, pos);           
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agregar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agregar_on.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agregar_on.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agregar_on.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 290, 100, 40));

        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 60, 220, 30));
        jPanel1.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 90, 220, 20));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Descripción:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 40, -1, -1));

        jLabel4.setBackground(new java.awt.Color(238, 112, 82));
        jLabel4.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(238, 112, 82));
        jLabel4.setText("Importancia:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Baja", "Media", "Alta" }));
        jComboBox1.setToolTipText("Importancia");
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 220, 30));

        jLabel5.setBackground(new java.awt.Color(238, 112, 82));
        jLabel5.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(238, 112, 82));
        jLabel5.setText("Asignatura:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jComboBox2.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox2.setToolTipText("Clases");
        jComboBox2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox2MouseClicked(evt);
            }
        });
        jComboBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox2ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, 220, 30));

        jLabel6.setBackground(new java.awt.Color(238, 112, 82));
        jLabel6.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(238, 112, 82));
        jLabel6.setText("Valor:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jComboBox3.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox3.setToolTipText("Mes");
        jComboBox3.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox3ItemStateChanged(evt);
            }
        });
        jComboBox3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox3MouseClicked(evt);
            }
        });
        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 140, 110, 30));

        jComboBox4.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox4.setToolTipText("Día");
        jComboBox4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox4MouseClicked(evt);
            }
        });
        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, -1, 30));

        jLabel7.setBackground(new java.awt.Color(238, 112, 82));
        jLabel7.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(238, 112, 82));
        jLabel7.setText("Fecha:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, -1, -1));

        jSpinner1.setToolTipText("Valor");
        jSpinner1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSpinner1MouseClicked(evt);
            }
        });
        jPanel1.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, 70, -1));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 100, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 604, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 604, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 358, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    int dias;
    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed

    }//GEN-LAST:event_jComboBox4ActionPerformed
   
    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        //Llenar el jComboBox4 con los días dependiendo del mes
        int valor = jComboBox3.getSelectedIndex() + 1;
        if (valor == 1 || valor == 3 || valor == 5 || valor == 7 || valor == 8 || valor == 10 || valor == 12) { //si el mes es enero,marzo,mayo,julio,agosto,octubre o diciembre
            dias = 31; //El número de días será 31
        }
        if (valor == 4 || valor == 11 || valor == 9 || valor == 6) { //si el mes seleccionado es abril,noviembre,septiembre o junio
            dias = 30; //El número de días será 30
        } else {
        }
        if (valor == 2) { //Si el mes es febrero
            if (año % 4 == 0) { //Validación de si es año bisiesto o no 
                dias = 29;
            } else {
                dias = 28;
            }
        }
        jComboBox4.removeAllItems();
        for (int i = 1; i <= dias; i++) { //Llenar el jComboBox con los días
            jComboBox4.addItem("" + i);
        }
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged

    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseClicked
    

    }//GEN-LAST:event_jComboBox3MouseClicked
    int año = f.get(Calendar.YEAR);
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose(); //para el boton cancelar
    }//GEN-LAST:event_jButton2ActionPerformed
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if(this.jTextField1.getText().trim().equals("") || this.jComboBox2.getSelectedItem().toString().equals("")){
            JOptionPane.showMessageDialog(rootPane, "Debe llenar todos los campos");
        }
        else{
        asignaciones tarea= new asignaciones();
        ResultSet resul = null;
          
                        int mes = (this.jComboBox3.getSelectedIndex()+1);
                        int dia = (this.jComboBox4.getSelectedIndex() + 1);
                        tarea.setNomb_asig((String)jComboBox2.getSelectedItem());
                        tarea.setDesc_asig(jTextField1.getText());
                        tarea.setImportancia((String)jComboBox1.getSelectedItem());
                        tarea.setPuntaje(Double.valueOf(jSpinner1.getValue().toString()));
                        tarea.setFecha_entrega(mes + "/" + dia + "/" + año);        
   
        switch (accion) {
        //En el caso de agregar tareas
            case 1:
                
        
                try {
                    PreparedStatement st = internal.con.prepareStatement("Insert into asignaciones(nomb_asig,desc_asig,importancia,puntaje,fecha_entrega,id_usuario) values (?,?,?,?,?,?)");
                    st.setString(1, tarea.getNomb_asig());
                    st.setString(2, tarea.getDesc_asig());
                    st.setString(3, tarea.getImportancia());
                    st.setDouble(4, tarea.getPuntaje());
                    st.setString(5, tarea.getFecha_entrega());
                    st.setString(6, Integer.toString(user.getId_user()));
                    st.execute();

                    internal.llenarTabla();

                    this.dispose();
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
                }
               
                break;
            //En el caso de modificar tareas    
            case 2:
                
                try {
                    PreparedStatement st = internal.con.prepareStatement("update asignaciones set nomb_asig='" + tarea.getNomb_asig() + "',desc_asig='" + tarea.getDesc_asig() + "',importancia='" + tarea.getImportancia() + "',puntaje=" + tarea.getPuntaje() + ",fecha_entrega='" + tarea.getFecha_entrega() + "' where asig_id=" + ident + "");

                    st.execute();

                    internal.llenarTabla();

                    this.dispose();
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
                }
                break;
        }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //al abrir la ventana se llenará el jComboBox2 con las clases
        llenar_combo();
        //Llenar jCombobox3 con los meses
        jComboBox3.removeAllItems();
        jComboBox3.addItem("Enero");
        jComboBox3.addItem("Febrero");
        jComboBox3.addItem("Marzo");
        jComboBox3.addItem("Abril");
        jComboBox3.addItem("Mayo");
        jComboBox3.addItem("Junio");
        jComboBox3.addItem("Julio");
        jComboBox3.addItem("Agosto");
        jComboBox3.addItem("Septiembre");
        jComboBox3.addItem("Octubre");
        jComboBox3.addItem("Noviembre");
        jComboBox3.addItem("Diciembre");
    }//GEN-LAST:event_formWindowOpened

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked

    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
   // TODO add your handling code here:
        /*this.jComboBox2.removeAllItems();
        llenar_combo();*/
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jComboBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox4MouseClicked
   
    }//GEN-LAST:event_jComboBox4MouseClicked

    private void jSpinner1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSpinner1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jSpinner1MouseClicked
 
    //Llenar el jComboBox2 con las clases que el usuario está llevando 
    public ResultSet result;
    public void llenar_combo() { //Para llenar el jComboBox con las clases que están en la base de datos en la parte de clases_periodo las cuales insertamos en agg_asignatura_user2
        try {
            PreparedStatement at = internal.con.prepareStatement("Select nomb_clase from clases_periodo where id_usuario ='" + user.getId_user() + "'");
            result = at.executeQuery();
            //internal.llenarTabla();
            while (result.next()) //llena la bd con la tabla del result
            {
                jComboBox2.addItem(result.getString("nomb_clase"));
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }
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
            java.util.logging.Logger.getLogger(agregar_tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar_tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar_tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar_tareas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar_tareas().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
