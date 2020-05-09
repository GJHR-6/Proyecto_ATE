
package Frame;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.clases;
import modelo.notas;
import modelo.usuario;
import java.util.Collection;
import java.util.Arrays;
import javax.swing.Box;

public class internal_organigrama extends javax.swing.JInternalFrame {

    BoxLayout a, b;
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

    usuario u;

    public internal_organigrama(usuario user) {
        initComponents();
        this.u = user;
        JPanel cont = new JPanel();
        Jpanel0.setLayout(new BoxLayout(Jpanel0, BoxLayout.X_AXIS));
        cont.setLayout(new BoxLayout(cont, BoxLayout.Y_AXIS));
        cont.setSize(10, 10);
        //cont.add(new JButton("Agradecido "));
        //cont.add(new JButton("con el "));
        //cont.add(new JButton("de ARRIBA"));
        Jpanel0.add(cont);
        ((javax.swing.plaf.basic.BasicInternalFrameUI) this.getUI()).setNorthPane(null);  //Esconder la barra de titulo del internal
    }

    private ArrayList<clases> getclase() {
        clases clases;
        String query = "select * from  clases where id_carrera='" + Integer.toString(u.getId_carrera()) + "'";
        clases = new clases();
        ArrayList<clases> listado_clases = new ArrayList();
        try {
            ResultSet result;
            conectar();
            PreparedStatement at = con.prepareStatement(query);
            result = at.executeQuery(); //ejecutar el query
            while (result.next()) {
                clases = new clases();
                clases.setId_clase(result.getInt("id_clase"));
                clases.setNomb_clase(result.getString("nomb_clase"));
                clases.setRequisito(result.getInt("requisito"));
                clases.setRequisito2(result.getInt("requisito2"));
                clases.setRequisito3(result.getInt("requisito3"));
                clases.setId_carrera(result.getInt("id_carrera"));
                listado_clases.add(clases);

            }
            cerrar();
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
        return listado_clases;
    }

    private ArrayList<notas> getnotas() {
        notas notas;
        String query = "select * from  clases where id_user='" + u.getId_user() + "'";
        notas = new notas();
        ArrayList<notas> listado_notas = new ArrayList();
        try {
            ResultSet result;
            conectar();
            PreparedStatement at = con.prepareStatement(query);
            result = at.executeQuery(); //ejecutar el query
            while (result.next()) {
                notas = new notas();
                notas.setId_clase(result.getInt("id_clase"));
                notas.setNota(result.getInt("nota"));
                notas.setId_nota(result.getInt("id_nota"));
                notas.setId_user(result.getInt("id_user"));
                notas.setEstado(result.getString("estado"));

                listado_notas.add(notas);

            }
            cerrar();
        } catch (Exception x) {
            System.out.println(x.getMessage());
        }
        return listado_notas;
    }

    public boolean comparar(clases c, ArrayList<Integer> dib) {
        boolean req1 = false, req2 = false, req3 = false;

        for (int i = 0; i < dib.size(); i++) {
            if (c.getRequisito() == dib.get(i) || c.getRequisito() == 0) {
                req1 = true;
            }
        }
        for (int i = 0; i < dib.size(); i++) {
            if (c.getRequisito2() == dib.get(i) || c.getRequisito2() == 0) {
                req2 = true;
            }
        }
        for (int i = 0; i < dib.size(); i++) {
            if (c.getRequisito3() == dib.get(i) || c.getRequisito3() == 0) {
                req3 = true;
            }
        }
        if (req1 && req2 && req3) {
            return true;
        } else {
            return false;
        }
    }

    public boolean compararsiestandentro(clases l, ArrayList<Integer> dab) {
        for (int i : dab) {
            if (l.getId_clase() == i) {
                return true;
            }
        }
        return false;
    }

    public String show_requisitos(clases cl,ArrayList<clases> ele){
        String req1="",req2=", ",req3=", "; 
        for (clases i:ele) {
           if(cl.getRequisito()==i.getId_clase()){
               req1+=i.getNomb_clase();
           }
        }
        for (clases i:ele) {
           if(cl.getRequisito2()==i.getId_clase()){
               req2+=i.getNomb_clase();
           }
        }
        for (clases i:ele) {
           if(cl.getRequisito3()==i.getId_clase()){
               req3+=i.getNomb_clase();
           }
        }
      return "Esta clase depende de: "+req1+req2+req3;
    }
    public void dibujar_en_tabla() {
        JPanel cont = new JPanel();
        ArrayList<clases> listado = getclase();

        ArrayList<Integer> dibujadas = new ArrayList<>();

        for (clases cl : listado) {
            //clases generales

            if (cl.requisito == 0 && cl.requisito2 == 0 && cl.requisito3 == 0) {
                cont.setLayout(new BoxLayout(cont, BoxLayout.Y_AXIS));
                cont.setSize(10, 10);
                JButton antenas5g = new JButton(cl.getNomb_clase());
                antenas5g.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       JOptionPane.showMessageDialog(rootPane, show_requisitos(cl, listado));
                        
                    }
                });
                cont.add(antenas5g);
             
                cont.add(Box.createVerticalStrut(20));
                Jpanel0.add(cont);
                dibujadas.add(cl.id_clase);
            }

        }
        ArrayList<Integer> tetris = new ArrayList<>();
        while (listado.size() > dibujadas.size()) {
            cont = new JPanel();
            for (clases cl : listado) {

                //Primeros requisitos
                if (compararsiestandentro(cl, dibujadas)) {
                    continue;
                }
                if (comparar(cl, dibujadas)) {
                    tetris.add(cl.getId_clase());
                    cont.setLayout(new BoxLayout(cont, BoxLayout.Y_AXIS));
                    cont.setSize(10, 10);
                    JButton antenas5g = new JButton(cl.getNomb_clase());
                antenas5g.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       JOptionPane.showMessageDialog(rootPane, show_requisitos(cl, listado));
                        
                    }
                });
                cont.add(antenas5g);
                    cont.add(Box.createVerticalStrut(20));
                    Jpanel0.add(cont);

                }

            }
            for (int n : tetris) {
                dibujadas.add(n);
            }
            tetris.clear();
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        base_org = new javax.swing.JScrollPane();
        Jpanel0 = new javax.swing.JPanel();

        setBorder(null);
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

        base_org.setAutoscrolls(true);

        Jpanel0.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout Jpanel0Layout = new javax.swing.GroupLayout(Jpanel0);
        Jpanel0.setLayout(Jpanel0Layout);
        Jpanel0Layout.setHorizontalGroup(
            Jpanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1035, Short.MAX_VALUE)
        );
        Jpanel0Layout.setVerticalGroup(
            Jpanel0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 515, Short.MAX_VALUE)
        );

        base_org.setViewportView(Jpanel0);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(base_org, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(base_org, javax.swing.GroupLayout.DEFAULT_SIZE, 518, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        // TODO add your handling code here:
        dibujar_en_tabla();
    }//GEN-LAST:event_formInternalFrameOpened


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Jpanel0;
    private javax.swing.JScrollPane base_org;
    // End of variables declaration//GEN-END:variables
}
