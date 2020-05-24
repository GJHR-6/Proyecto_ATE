package Frame;
import modelo.clases_periodo;
import modelo.usuario;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class agg_asignatura_periodo extends javax.swing.JDialog {

    internal_man_user2 internal;
    public agg_asignatura_periodo() {
        initComponents();
        this.setModal(true);//hace que esta ventana sea prioridad e inhabilita las demas hasta que se cierre
    }

    DefaultTableModel tbmodelo;// para mandar a llamar el modelo de la tabla en la que se va a agregar la asignatura
   usuario user;
    public agg_asignatura_periodo(DefaultTableModel tb, internal_man_user2 in,usuario user) { 
        initComponents();
        this.setModal(true);//hace que esta ventana sea prioridad e inhabilita las demas hasta que se cierre
        tbmodelo = tb;
        internal = in;
        this.user=user;
  
    }
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jPanel1.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, 220, 30));

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
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 130, 100, 40));

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
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 100, 40));

        jLabel3.setBackground(new java.awt.Color(238, 112, 82));
        jLabel3.setFont(new java.awt.Font("Franklin Gothic Demi", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(238, 112, 82));
        jLabel3.setText("Seleccione la asignatura");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 420, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //Esto se hizo para buscar en la bd si el usuario ya ingreso una clase, para así evitar que vuelva a ingresar la misma clase
    clases_periodo cp;
    public ResultSet result;
    public void buscarnc(String no) {
        cp = new clases_periodo(); //damos un espacio en memoria
        try {

            PreparedStatement at = internal.con.prepareStatement("Select * from clases_periodo where nomb_clase = '" + no+ "' and id_usuario="+user.getId_user()+" "); //manda el codigo a la db
            result = at.executeQuery(); //ejecutar el query
            while (result.getFetchSize() >= 1) { //Se mira si se encontro un resultado en la db
                result.next();//hace que seleccione la primera fila. 
                cp.setNomb_clase(result.getString("nomb_clase")); //selecciona lo contenido de la primera columna
            }
        } catch (Exception x) {
            //borré el catch ya que al no encontrar el user o password siempre va a mostrar un error de que no se encontró el result
        }

    }
    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jComboBox1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBox1MouseClicked
    //Al darle click al botón de escoger clase se llenará el combobox con las clases de su carrera para agregarlas
    this.jComboBox1.removeAllItems(); 
    llenar_combo();
    }//GEN-LAST:event_jComboBox1MouseClicked

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose(); //para el boton cancelar
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Botón agregar
        //Aquí insertamos las clases que seleccionamos del jComboBox a una nueva tabla en la base de datos llamada "clases_periodo"     
        buscarnc(this.jComboBox1.getSelectedItem().toString());
        if(this.jComboBox1.getItemAt(0).equals("Seleccione clase"))
            {
               JOptionPane.showMessageDialog(null,"Debe seleccionar la clase"); //Verificamos que el usuario haya seleccionado la clase del jcombobox
            }
        else
        {
            if(cp.getNomb_clase()!=null) //Si la clase ya fue ingresada por el usuario no se le permitirá volver a agregarla a la tabla
            {
            JOptionPane.showMessageDialog(null, "Esa clase ya fue ingresada"); 
            }
            else //Si el usuario ya seleccionó una nueva clase para ingresar
            {
           String clas = (this.jComboBox1.getSelectedItem().toString()); 
        try {
            PreparedStatement at = internal.con.prepareStatement("insert into clases_periodo(nomb_clase,id_usuario,nomb_user) values(?,?,?)"); //manda el codigo al pergamino
            at.setString(1, clas);
            at.setString(2, Integer.toString(user.getId_user()));
            at.setString(3, user.getNomb_user());
            at.execute();
            internal.llenarTabla();
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
    }//GEN-LAST:event_jButton1ActionPerformed
    }
        }
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //Al abrir la ventana
        this.jComboBox1.addItem("Seleccione clase"); //Esto estará en el combobox al abrir la ventana
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
            java.util.logging.Logger.getLogger(agg_asignatura_periodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(agg_asignatura_periodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(agg_asignatura_periodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(agg_asignatura_periodo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new agg_asignatura_periodo().setVisible(true);
            }
        });
    }
 
    public void llenar_combo() { //Para llenar el jComboBox con las clases que están en la base de datos
        try {
            PreparedStatement at = internal.con.prepareStatement("Select nomb_clase from clases where id_carrera='"+user.getId_carrera()+"' ");
            result = at.executeQuery();
            //internal.llenarTabla();
            while (result.next()) //llena la bd con la tabla del result
            {
                jComboBox1.addItem(result.getString("nomb_clase"));
            }
        } catch (Exception x) {
            JOptionPane.showMessageDialog(null, "error" + x.getMessage().toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
