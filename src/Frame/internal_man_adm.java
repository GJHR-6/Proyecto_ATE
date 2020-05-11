
package Frame;

import modelo.usuario;
import javax.swing.JDesktopPane;

public class internal_man_adm extends javax.swing.JInternalFrame {

    JDesktopPane dpst;
    Principal printmp;

    public internal_man_adm() {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);  //Esconder la barra de titulo del internal
    }
usuario user;

    public internal_man_adm(JDesktopPane dps, Principal prin, internal_man_adm2 frm1, internal_man_adm3 frm2,usuario user) {
        initComponents();
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);  //Esconder la barra de titulo del internal
        printmp = prin;       //añade el frame principal
        dpst = dps;           //añade el JDesktopPane
        form2 = frm1;         //añade el form2
        form3 = frm2;         //añade el form3
        this.user=user;
        jLabel1.setBackground(new java.awt.Color(217, 217, 217)); //pone el boton(label) 1 con apariencia de seleccionado
        select = 1;                                               // indica que el boton 1 esta seleccionado

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setBorder(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 102, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Organigrama");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setOpaque(true);
        jLabel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel1MouseMoved(evt);
            }
        });
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 48));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Administrar Perfiles");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setOpaque(true);
        jLabel2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel2MouseMoved(evt);
            }
        });
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 270, 48));

        jLabel5.setFont(new java.awt.Font("Gadugi", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 102, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Cerrar Sesion");
        jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel5.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jLabel5MouseMoved(evt);
            }
        });
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 270, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 540));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseMoved
        if (select != 1) {
            jLabel1.setBackground(new java.awt.Color(240, 240, 240));
        } else {
            jLabel1.setBackground(new java.awt.Color(217, 217, 217));
        }
    }//GEN-LAST:event_jLabel1MouseMoved

    private void jLabel2MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseMoved
        if (select != 2) {
            jLabel2.setBackground(new java.awt.Color(240, 240, 240));
        } else {
            jLabel2.setBackground(new java.awt.Color(217, 217, 217));
        }
    }//GEN-LAST:event_jLabel2MouseMoved

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        if (select != 1) {
            jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        }

    }//GEN-LAST:event_jLabel1MouseExited

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        if (select != 2) {
            jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        }
    }//GEN-LAST:event_jLabel2MouseExited

    private void jLabel5MouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseMoved
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
    }//GEN-LAST:event_jLabel5MouseMoved

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
    }//GEN-LAST:event_jLabel5MouseExited
    internal_man_adm2 form2;
    int select = 0;
    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        form2 = new internal_man_adm2(user);
        form2.setLocation(270, 0);
        form3.dispose();
        dpst.add(form2);                //añade el nuevo form2 al JDesktopPane
        form2.setVisible(true);
        jLabel1.setBackground(new java.awt.Color(217, 217, 217));
        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        select = 1;
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        //cerrar sesion
        printmp.dispose();                 //cierra el frame principal y abre el login   
        login log = new login();
        log.setVisible(true);
    }//GEN-LAST:event_jLabel5MouseClicked
    internal_man_adm3 form3; //internal de mantenimiento de administrador para administrar usuarios
    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        //cierra cualquier form3 abierto antes               
        form3 = new internal_man_adm3(user,dpst);               //crea un nuevo form3
        form3.setLocation(270, 0);
        form2.dispose();                             //cierra el form2
        dpst.add(form3);                             //añade el nuevo form3 al JDesktopPane
        form3.setVisible(true);                     //hace visible el form3
        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setBackground(new java.awt.Color(217, 217, 217));
        select = 2;
    }//GEN-LAST:event_jLabel2MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
