package Frame;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.carrera;
import modelo.usuario;
import modelo.clases;
public class internal_man_adm2 extends javax.swing.JInternalFrame {

    public internal_man_adm2(usuario user) {
        initComponents();
        conectar(); //para que se conecte cuando se abra el internal
        model = (DefaultTableModel) this.jTable1.getModel();
        this.user=user;
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);  //Esconder la barra de titulo del internal
    }
    usuario user;
    clases cla;
    carrera c;
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

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage().toString());
        }
    }
    DefaultTableModel model;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(153, 153, 153));
        setBorder(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de asignatura", "Asignatura", "requisito", "requisito2", "requisito3"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(2).setMinWidth(75);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(75);
            jTable1.getColumnModel().getColumn(3).setMinWidth(75);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(75);
            jTable1.getColumnModel().getColumn(4).setMinWidth(75);
            jTable1.getColumnModel().getColumn(4).setMaxWidth(75);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 50, 490, 470));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aggcarrera.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aggcarrera_on.png"))); // NOI18N
        jButton4.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aggcarrera_on.png"))); // NOI18N
        jButton4.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/aggcarrera_on.png"))); // NOI18N
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 240, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modificarlong.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modificarlong_on.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modificarlong_on.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modificarlong_on.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 240, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminarlong.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminarlong_on.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminarlong_on.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminarlong_on.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, 240, 40));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Asignaturalong.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Asignaturalong_on.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Asignaturalong_on.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Asignaturalong_on.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 240, 40));

        jComboBox1.setBackground(new java.awt.Color(255, 153, 0));
        jComboBox1.setToolTipText("Seleccionar carrera");
        jComboBox1.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jComboBox1PopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jComboBox1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBox1MouseClicked(evt);
            }
        });
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 240, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 780, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       //Abrir la ventana min_agregar_carrera
        mini_agregar_carrera form = new mini_agregar_carrera((DefaultTableModel) jTable1.getModel(), this,user);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       //abrir la ventana agregar_asignaturas
        agregar_asignaturas form = new agregar_asignaturas((DefaultTableModel) jTable1.getModel(), 1, this,user);
        form.setLocationRelativeTo(null);
        form.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      //Botón modificar
        int pos = this.jTable1.getSelectedRow();
        if (pos == -1) {
            // si no se selecciono nada en la tabla pos=-1, entonces no hara nada el boton
        } else { //modificar la clase de la fila seleccionada
            String identificador = this.jTable1.getModel().getValueAt(pos, 0).toString();
            agregar_asignaturas forma = new agregar_asignaturas((DefaultTableModel) jTable1.getModel(), identificador, 2, this); //this para mandar como parametro el internal para trabajarlo en el agregar
            forma.setLocationRelativeTo(null);
            forma.setVisible(true); //mostrar ventana agregar_asignaturas
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // al abrir se llena la tabla con las clases y requisitos
      //  llenarTabla();
       // this.jComboBox1.removeAllItems();
       // this.jComboBox1.addItem("Seleccione carrera");
        llenar_combo();
        llenarTabla();
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Botón eliminar
        int s = this.jTable1.getSelectedRow();
        if (s == -1) {
            // si no se selecciono nada en la tabla s=-1, entonces no hara nada el boton
        } else { //en caso contrario realizara la opcion de eliminar, eliminar una clase
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            int pos = Integer.parseInt(model.getValueAt(s, 0).toString());
            try {
                PreparedStatement st = con.prepareStatement("delete from clases where id_clase=" + pos + "");

                st.execute();

                llenarTabla();

            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        // TODO add your handling code here:
    }//GEN-LAST:event_formInternalFrameClosing

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
        // cerrar conexión
          cerrar();
    }//GEN-LAST:event_formInternalFrameClosed

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
        // TODO add your handling code here:
      //  llenarTabla();
      /*  this.jComboBox1.removeAll();
        llenar_combo();*/
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1PopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jComboBox1PopupMenuWillBecomeInvisible
        // TODO add your handling code here:
        llenarTabla();
    }//GEN-LAST:event_jComboBox1PopupMenuWillBecomeInvisible
    //Llenar la tabla con las clases de cada carrera y sus requisitos   
    public ResultSet result;
    public void llenarTabla() {
        clases cl= new clases();
        model.setRowCount(0); 
        cl.setCarrera((carrera)jComboBox1.getSelectedItem()); 
       try {

            PreparedStatement at = con.prepareStatement("Select id_clase, nomb_clase,requisito,requisito2,requisito3 from clases where id_carrera ="+cl.getCarrera().getId_carrera()+""); //manda el codigo al pergamino
            result = at.executeQuery(); //ejecutar el query
            while (result.next()) //llena la bd con la tabla del result
            {
                model.addRow(new Object[]{result.getInt("id_clase"), result.getString("nomb_clase"), result.getInt("requisito"), result.getInt("requisito2"), result.getInt("requisito3")});
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }
    public void llenar_combo() { //Para llenar el jComboBox con las carreras que están en la base de datos
        try {
            PreparedStatement at = con.prepareStatement("Select id_carrera, nomb_carrera from carrera");
            result = at.executeQuery();
            carrera cr;
            while (result.next()) {
                cr = new carrera();
                cr.setNomb_carrera(result.getString("nomb_carrera"));
                cr.setId_carrera(result.getInt("id_carrera"));
                
                jComboBox1.addItem(cr);
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }
    
    /*
     public void llenarTabla() {
        clases cl= new clases();
        model.setRowCount(0); 
         int c=this.jComboBox1.getSelectedIndex();
      if(this.jComboBox1.getSelectedItem().equals("Seleccione carrera"))
      {
          try {

            PreparedStatement at = con.prepareStatement("Select id_clase, nomb_clase,requisito,requisito2,requisito3 from clases"); //manda el codigo al pergamino
            result = at.executeQuery(); //ejecutar el query
            while (result.next()) //llena la bd con la tabla del result
            {
                model.addRow(new Object[]{result.getInt("id_clase"), result.getString("nomb_clase"), result.getInt("requisito"), result.getInt("requisito2"), result.getInt("requisito3")});
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
      }
        else
        {
        try {

            PreparedStatement at = con.prepareStatement("Select id_clase, nomb_clase,requisito,requisito2,requisito3 from clases where id_carrera ="+c+""); //manda el codigo al pergamino
            result = at.executeQuery(); //ejecutar el query
            while (result.next()) //llena la bd con la tabla del result
            {
                model.addRow(new Object[]{result.getInt("id_clase"), result.getString("nomb_clase"), result.getInt("requisito"), result.getInt("requisito2"), result.getInt("requisito3")});
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }
    }
    */
    
    /*public void llenar_combo() { //Para llenar el jComboBox con las carreras que están en la base de datos
        try {
            PreparedStatement at = con.prepareStatement("Select nomb_carrera from carrera");
            result = at.executeQuery();
            while (result.next()) {
                 jComboBox1.addItem(result.getString("nomb_carrera"));
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }*/
     
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
