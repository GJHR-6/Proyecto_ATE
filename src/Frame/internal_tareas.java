package Frame;
import modelo.asignaciones;
import modelo.usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javafx.scene.paint.Color;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class internal_tareas extends javax.swing.JInternalFrame {

    usuario user;

    public internal_tareas(usuario user) {
        initComponents();
        this.user = user;
        conectar(); //para que se conecte cuando se abra el internal
        model = (DefaultTableModel) this.jTable1.getModel();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);  //Esconder la barra de titulo del internal

        //this.jButton1.setBackground();
    }

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

        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBorder(null);
        setFrameIcon(null);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
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

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(1050, 540));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 100, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modifiar.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modificar_on.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modificar_on.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/modificar_on.png"))); // NOI18N
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 100, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar_on.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar_on.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar_on.png"))); // NOI18N
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton3MouseExited(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 240, 100, 40));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agnota.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agnota_on.png"))); // NOI18N
        jButton5.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agnota_on.png"))); // NOI18N
        jButton5.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/agnota_on.png"))); // NOI18N
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 300, 100, 40));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 540));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "nombre asignación", "Descripción", "Importancia", "Puntaje", "fecha de entrega", "nota final"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(120);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(120);
            jTable1.getColumnModel().getColumn(1).setMinWidth(280);
            jTable1.getColumnModel().getColumn(1).setMaxWidth(280);
            jTable1.getColumnModel().getColumn(2).setMinWidth(90);
            jTable1.getColumnModel().getColumn(2).setMaxWidth(90);
            jTable1.getColumnModel().getColumn(3).setMinWidth(70);
            jTable1.getColumnModel().getColumn(3).setMaxWidth(70);
            jTable1.getColumnModel().getColumn(5).setMinWidth(80);
            jTable1.getColumnModel().getColumn(5).setMaxWidth(80);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 750, 500));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 750, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        agregar_tareas forma = new agregar_tareas((DefaultTableModel) jTable1.getModel(), 1, this, user); //this para mandar como parametro el internal para trabajarlo en el agregar
        forma.setLocationRelativeTo(null);
        forma.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int pos = this.jTable1.getSelectedRow();
        if (pos == -1) {
            // si no se selecciono nada en la tabla pos=-1, entonces no hara nada el boton
        } else { //en caso contrario realizara la opcion de modificar
            String identificador = this.jTable1.getModel().getValueAt(pos, 0).toString();
            agregar_tareas forma = new agregar_tareas((DefaultTableModel) jTable1.getModel(), identificador, 2, this); //this para mandar como parametro el internal para trabajarlo en el agregar
            forma.setLocationRelativeTo(null);
            forma.setVisible(true); //mostrar ventana agregar_tareas
        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //BOTON ELIMINAR
        int s = this.jTable1.getSelectedRow();
        if (s == -1) {
            // si no se selecciono nada en la tabla s=-1, entonces no hara nada el boton
        } else { //en caso contrario realizara la opcion de eliminar
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            int pos = Integer.parseInt(model.getValueAt(s, 0).toString());
            try {
                PreparedStatement st = con.prepareStatement("delete from asignaciones where asig_id=" + pos + "");

                st.execute();

                llenarTabla();

            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        llenarTabla();
        //bloquear(false);
    }//GEN-LAST:event_formInternalFrameOpened
    public void bloquear(boolean b) {
        this.jButton2.setEnabled(b);
        this.jButton3.setEnabled(b);
        this.jButton5.setEnabled(b);
    }
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // agregar nota f
        int s = this.jTable1.getSelectedRow(); //devuelve el numero de la fila que se seleccionó
        if (s == -1) {
            // si no se selecciono nada en la tabla s=-1, entonces no hara nada el boton
        } else { //en caso contrario realizara la opcion de agregar nota
            DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
            int pos = Integer.parseInt(model.getValueAt(s, 0).toString()); //el getvalueat devuelve es una variable de tipo value, entonces lo convertimos a string para convertirlo luego a int

            double nf = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese su nota final").toString()); //mensaje donde el usuario puede ingresar algo
            if (nf > Double.parseDouble(model.getValueAt(s, 4).toString()) || nf < 0) {
                JOptionPane.showMessageDialog(null, "Su nota final no puede ser mayor al puntaje");
            } else {
                try {
                    PreparedStatement st = con.prepareStatement("update asignaciones set notaF=" + nf + " where asig_id=" + pos + "");
                    st.execute();
                    JOptionPane.showMessageDialog(null, "Su nota fue ingresada correctamente");
                    llenarTabla();

                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
                }
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // click en la tabla
        bloquear(true);//Desbloqueo de los botones al seleccionar la tabla.
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        //bloquear(false);//Bloqueo de boton modificar al dejar de seleccionarlo
    }//GEN-LAST:event_jButton2MouseExited

    private void jButton3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseExited
        // TODO add your handling code here:
        // bloquear(false);//Bloqueo de boton Eliminar al dejar de seleccionarlo
    }//GEN-LAST:event_jButton3MouseExited

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        //bloquear(false);//Bloqueo de boton Agregar nota al dejar de seleccionarlo
    }//GEN-LAST:event_jButton5MouseExited

    private void formInternalFrameClosed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosed
     cerrar();//cierre de la base de datos.
    }//GEN-LAST:event_formInternalFrameClosed
    public ResultSet result; //con el result obtiene la tabla de la bd
    public Statement s;

    public void llenarTabla() {
        model.setRowCount(0);
        try {

            PreparedStatement at = con.prepareStatement("select nomb_asig,desc_asig,importancia,puntaje,fecha_entrega,notaF from asignaciones where id_usuario ='" + user.getId_user() + "'"); //manda el codigo al pergamino
            result = at.executeQuery(); //ejecutar el query
            while (result.next()) //llena la bd con la tabla del result
            {
                model.addRow(new Object[]{result.getString("nomb_asig"), result.getString("desc_asig"), result.getString("importancia"), result.getDouble("puntaje"), result.getString("fecha_entrega"), result.getDouble("notaF")});
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}