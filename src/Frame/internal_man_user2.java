package Frame;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.notas;
import modelo.usuario;
import modelo.clases_periodo;
import modelo.clases;
import modelo.notas;

public class internal_man_user2 extends javax.swing.JInternalFrame {

    public internal_man_user2(usuario user) {
        initComponents();
        conectar(); //para que se conecte cuando se abra el internal
        this.user=user;
        model = (DefaultTableModel) this.jTable1.getModel();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);  //Esconder la barra de titulo del internal
    }
    usuario user;
    clases_periodo clases_periodo;
    clases clases;
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(null);
        setForeground(new java.awt.Color(255, 255, 255));
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
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

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(780, 560));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Asignatura.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Asignatura_on.png"))); // NOI18N
        jButton1.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Asignatura_on.png"))); // NOI18N
        jButton1.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/Asignatura_on.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 160, 130, 40));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar_asignatura.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar_asignatura_on.png"))); // NOI18N
        jButton2.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar_asignatura_on.png"))); // NOI18N
        jButton2.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/eliminar_asignatura_on.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 220, 130, 40));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finalizarp.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finalizarp_on.png"))); // NOI18N
        jButton3.setRolloverSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finalizarp_on.png"))); // NOI18N
        jButton3.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/image/finalizarp_on.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 130, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id", "Asignaturas Agregadas"
            }
        ));
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setMinWidth(0);
            jTable1.getColumnModel().getColumn(0).setMaxWidth(2);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 90, 370, 320));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Abrir mini_agregar_nota
        agg_asignatura_periodo form = new agg_asignatura_periodo((DefaultTableModel) jTable1.getModel(), this,user);
        form.setLocationRelativeTo(null);
        form.setVisible(true);// muestra el frame de agregar asignatura al periodo
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        llenarTabla(); //para que se llene la tabla al abrir la ventana
    }//GEN-LAST:event_formInternalFrameOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //Eliminar clase
         int s = this.jTable1.getSelectedRow();
         DefaultTableModel model = (DefaultTableModel) this.jTable1.getModel();
         int pos = Integer.parseInt(this.jTable1.getValueAt(s, 0).toString());
         if (s == -1) {
            // si no se selecciono nada en la tabla pos=-1, entonces no hara nada el boton
           }
         else
         {
            {
                try {
                PreparedStatement st = con.prepareStatement("delete from clases_periodo where id_periodo=" + pos + "");

                st.execute();

                llenarTabla();

            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
                    }  
        }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // Botón finalizar periodo
       
        int dialogo= JOptionPane.showConfirmDialog(null, "Está seguro que desea finalizar su periodo? , Se borrarán sus clases y asignaciones del programa", "Advertencia", JOptionPane.YES_NO_OPTION);
        if(dialogo== JOptionPane.YES_OPTION)
        {
            try {
      
             ArrayList<clases_periodo> clases_pe =getnotas();
             for(int i=0; i<clases_pe.size(); i++)
             {
                 if(clases_pe.get(i).getnotaF()>=65)
                 {
                    PreparedStatement st = con.prepareStatement("update notas set notaF='"+clases_pe.get(i).getnotaF()+"', estado='APB' where id_usuario= '"+user.getId_user()+"' and nomb_clase='"+clases_pe.get(i).getNomb_clase()+"' ");
  
                    st.execute();
                 }
                 else
                 {
                    PreparedStatement st = con.prepareStatement("update notas set notaF='"+clases_pe.get(i).getnotaF()+"', estado='RPB' where id_usuario= '"+user.getId_user()+"' and nomb_clase='"+clases_pe.get(i).getNomb_clase()+"' ");
  
                    st.execute();
                 }
             }
                } catch (Exception x) {
                    JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
                }
   
            
            try {
                PreparedStatement st = con.prepareStatement("delete from asignaciones where id_usuario= '"+user.getId_user()+"' "); 
                st.execute();
                llenarTabla();
    
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
            }
             try {
                PreparedStatement st = con.prepareStatement("delete from clases_periodo where id_usuario= '"+user.getId_user()+"' "); 
                st.execute();
    
            } catch (Exception x) {
                JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
            }
          llenarTabla();
           
        }
        else
        {
           
        }
          
    }//GEN-LAST:event_jButton3ActionPerformed
    
    
    public ResultSet result;

    public void llenarTabla() { //aquí llenamos la tabla con las clases que seleccionó el usuario del jComboBox
        model.setRowCount(0);
        try {
            PreparedStatement at = con.prepareStatement("Select id_periodo,nomb_clase from clases_periodo where id_usuario ='" + user.getId_user() + "'");
            result = at.executeQuery();
            while (result.next()) //llena la bd con la tabla del result
            {
                model.addRow(new Object[]{result.getInt("id_periodo"),result.getString("nomb_clase")});
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }

    }

    clases_periodo c_p;
     private ArrayList<clases_periodo> getnotas() {
        
        String query = "Select nomb_asig, sum(notaF) as nota from asignaciones where id_usuario= '" + user.getId_user() + "' group by nomb_asig";
        c_p = new clases_periodo();
        ArrayList<clases_periodo>  clases_p = new ArrayList();
        try {
            ResultSet result;
            conectar();
            PreparedStatement at = con.prepareStatement(query);
            result = at.executeQuery(); //ejecutar el query
            while (result.next()) {
                c_p = new clases_periodo();
                
                c_p.setnotaF(result.getInt("nota"));
                c_p.setNomb_clase(result.getString("nomb_asig"));
                clases_p.add(c_p);

            }
            
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
        System.out.println(clases_p);
        return clases_p;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
