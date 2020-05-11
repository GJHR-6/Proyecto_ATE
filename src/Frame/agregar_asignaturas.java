package Frame;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.usuario;
public class agregar_asignaturas extends javax.swing.JFrame {

    public agregar_asignaturas() {
        initComponents();
    }
    usuario user;
    internal_man_adm2 internal;// para mandar a llamar lo que esta en el internal mantenimiento del admin 
    DefaultTableModel tbmodelo;// para mandar a llamar el modelo de la tabla

    public agregar_asignaturas(DefaultTableModel tb, int accion, internal_man_adm2 i,usuario user) {
        initComponents();
        tbmodelo = tb;
        this.accion = accion;
        internal = i;
        this.user=user;
    }

    public agregar_asignaturas(DefaultTableModel tb, String iden, int accion, internal_man_adm2 x) {
        initComponents();
        tbmodelo = tb;
        ident = iden;
        internal = x;
        this.accion = accion;
        for (int i = 0; i <= tbmodelo.getRowCount() - 1; i++) {
            if (tbmodelo.getValueAt(i, 0).toString().equalsIgnoreCase(iden)) { //
                pos = i;
            }
        }
        // this.jTextField1.setText(tbmodelo.getValueAt(pos, 2).toString()); //esto es para que obtener el dato de la tabla en la posicion (descripcion)
        pos = Integer.parseInt(iden);
    }
    String ident;
    int pos; // variable posicion de la fila que modificaremos
    int accion; //accion que se ejecutara

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<String>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<String>();
        jComboBox3 = new javax.swing.JComboBox<String>();
        jComboBox4 = new javax.swing.JComboBox<String>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
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
        jPanel1.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 180, 20));

        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("Carrera:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabel3.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 102, 51));
        jLabel3.setText("Asignatura:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        jTextField2.setToolTipText("Nombre de la asignatura");
        jTextField2.setBorder(null);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 180, 30));

        jComboBox1.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox1.setToolTipText("Seleccionar usuario");
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
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 180, 30));

        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setText("Requisito 1:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 30, -1, -1));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 100, 40));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 290, 100, 40));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setText("Requisito 2:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 110, -1, -1));

        jLabel6.setFont(new java.awt.Font("Gadugi", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 51));
        jLabel6.setText("Requisito 3:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 180, -1, -1));

        jComboBox2.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox2.setToolTipText("seleccionar requisito");
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
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
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 50, 180, 30));

        jComboBox3.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox3.setToolTipText("seleccionar requisito");
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
        jPanel1.add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 180, 30));

        jComboBox4.setForeground(new java.awt.Color(51, 51, 51));
        jComboBox4.setToolTipText("seleccionar requisito");
        jComboBox4.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox4ItemStateChanged(evt);
            }
        });
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
        jPanel1.add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 200, 180, 30));

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
            .addGap(0, 371, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 371, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
   //Al darle click al jComboBox1 primero se eliminará lo que ingresamos al abrir la ventana y luego se llenará con las carreras
    this.jComboBox1.removeAllItems();
    llenar_combo_carrera();
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose(); //para el boton cancelar
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jComboBox2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox2MouseClicked
    //Al darle click al jComboBox1 primero se eliminará lo que ingresamos al abrir la ventana y luego se llenará con los requisitos
    this.jComboBox2.removeAllItems();
    llenar_combo_req1();
    }//GEN-LAST:event_jComboBox2MouseClicked

    private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox2ActionPerformed

    private void jComboBox3ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox3ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ItemStateChanged

    private void jComboBox3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox3MouseClicked
    //Al darle click al jComboBox1 primero se eliminará lo que ingresamos al abrir la ventana y luego se llenará con los requisitos
     this.jComboBox3.removeAllItems();
     llenar_combo_req2();
    }//GEN-LAST:event_jComboBox3MouseClicked

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void jComboBox4ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox4ItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ItemStateChanged

    private void jComboBox4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox4MouseClicked
    //Al darle click al jComboBox1 primero se eliminará lo que ingresamos al abrir la ventana y luego se llenará con los requisitos  
    this.jComboBox4.removeAllItems();
    llenar_combo_req3();
    }//GEN-LAST:event_jComboBox4MouseClicked

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Botón agregar
        ResultSet resul = null;
        //String carrera=(this.jComboBox1.getSelectedItem().toString());
        //int codi=Integer.valueOf(this.jTextField1.toString());
        String asig = this.jTextField2.getText();
        int req1 = (this.jComboBox2.getSelectedIndex() );
        int req2 = (this.jComboBox3.getSelectedIndex() );
        int req3 = (this.jComboBox4.getSelectedIndex() );
        //int req1=Integer.valueOf(this.jComboBox2.getSelectedItem().toString());
        //int req2=Integer.valueOf(this.jComboBox3.getSelectedItem().toString());
        //int req3=Integer.valueOf(this.jComboBox4.getSelectedItem().toString());
        switch (accion) {
        //case 1 es el de agregar
            case 1:
                actualizar();
                 {
                     if(this.jTextField2.getText().equals("") || this.jComboBox1.getItemAt(0).equals("Seleccione clase") || this.jTextField2.getText()=="" || this.jComboBox2.getItemAt(0).equals("Seleccione requisito") ||  this.jComboBox3.getItemAt(0).equals("Seleccione requisito") ||  this.jComboBox4.getItemAt(0).equals("Seleccione requisito") )
                      {
                       JOptionPane.showMessageDialog(null, "Debe llenar los datos");
                      }
                     else
                     {
                    try {
                        PreparedStatement st = internal.con.prepareStatement("Insert into clases(nomb_clase,requisito,requisito2,requisito3,id_carrera) values (?,?,?,?,?)");
                        //st.setInt(0,codi);
                        st.setString(1, asig);
                        st.setInt(2, req1);
                        st.setInt(3, req2);
                        st.setInt(4, req3);
                        st.setInt(5, (this.jComboBox1.getSelectedIndex()+1));
                        st.execute();

                        internal.llenarTabla();

                        this.dispose();
                    } catch (Exception x) {
                        JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
                    }
                }
                 }
                break;
            //case 2 es el de modificar    
            case 2:
                modificar();
                 {
                     int cod=(this.jComboBox1.getSelectedIndex()+1);
                      if(this.jTextField2.getText()=="" || this.jComboBox1.getItemAt(0).equals("Seleccione clase") || this.jTextField2.getText()=="" || this.jComboBox2.getItemAt(0).equals("Seleccione requisito") ||  this.jComboBox3.getItemAt(0).equals("Seleccione requisito") ||  this.jComboBox4.getItemAt(0).equals("Seleccione requisito") )
                      {
                       JOptionPane.showMessageDialog(null, "Debe llenar los datos");
                      }
                      else
                      {
                    try {
                        PreparedStatement st = internal.con.prepareStatement("update clases set nomb_clase='" + asig + "',requisito=" + req1 + ",requisito2=" + req2 + ",requisito3=" + req3 + ",id_carrera="+cod+" where id_clase=" + pos + "");
                        
                        st.execute();

                        internal.llenarTabla();

                        this.dispose();
                    } catch (Exception x) {
                        JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
                    }
                      }
                    break;
                }
    }//GEN-LAST:event_jButton1ActionPerformed
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // 
        this.jComboBox1.addItem("Seleccione clase");
        this.jComboBox2.addItem("Seleccione requisito");
        this.jComboBox3.addItem("Seleccione requisito");
        this.jComboBox4.addItem("Seleccione requisito");
      /*  llenar_combo_carrera();
          llenar_combo_req1();
          llenar_combo_req2();
          llenar_combo_req3();*/
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
            java.util.logging.Logger.getLogger(agregar_asignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agregar_asignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agregar_asignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agregar_asignaturas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agregar_asignaturas().setVisible(true);
            }
        });
    }

    public void modificar() {

    }

    public void actualizar() {

    }
    public ResultSet result;
    //Llenar el jComboBox1 con las carreras
    public void llenar_combo_carrera() {
        try {
            PreparedStatement at = internal.con.prepareStatement("Select nomb_carrera from carrera");
            result = at.executeQuery();

            while (result.next()) {
                jComboBox1.addItem(result.getString("nomb_carrera"));
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }
    //Llenar el jComboBox2 con los requisitos
    public void llenar_combo_req1() {
        try {
            PreparedStatement at = internal.con.prepareStatement("Select id_clase from clases");
            result = at.executeQuery();

            while (result.next()) {
                jComboBox2.addItem(result.getString("id_clase"));
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }
   //Llenar el jComboBox3 con los requisitos
    public void llenar_combo_req2() {
        try {
            PreparedStatement at = internal.con.prepareStatement("Select id_clase from clases");
            result = at.executeQuery();

            while (result.next()) {
                jComboBox3.addItem(result.getString("id_clase"));
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }
    //Llenar el jComboBox4 con los requisitos
    public void llenar_combo_req3() {
        try {
            PreparedStatement at = internal.con.prepareStatement("Select id_clase from clases");
            result = at.executeQuery();

            while (result.next()) {
                jComboBox4.addItem(result.getString("id_clase"));
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
