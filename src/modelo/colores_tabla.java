/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package modelo;
import java.awt.Color;
import java.awt.Component;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import java.util.ArrayList;
import java.util.function.ObjDoubleConsumer;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author cyrax
 */

public class colores_tabla extends DefaultTableCellRenderer {//clase para cambiar el color de las celdas de la tabla
    Color color;
    public int x=0;
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, boolean isSelected, boolean hasFocus, int row, int column) {
         
        if(table.getModel().getValueAt(row, 3).toString().equals("Baja")){ //cambia el color de las celdas segun importancia
            color = new Color(197, 224, 180);
            setBackground(color);
        }
        if(table.getModel().getValueAt(row, 3).toString().equals("Media")){
            color = new Color(255,230, 153);
            setBackground(color);
        }
        if(table.getModel().getValueAt(row, 3).toString().equals("Alta")){
            color = new Color(255, 67, 67);
            setBackground(color);
            
        }
        String fecha1=table.getModel().getValueAt(row, 5).toString();
        Calendar c= new GregorianCalendar();
        String dia = Integer.toString(c.get(Calendar.DATE));// obtiene el dia actual
        String mes = Integer.toString(c.get(Calendar.MONTH)+1);// obtiene el mes actual
        String annio = Integer.toString(c.get(Calendar.YEAR));// obtiene el año actual
        String hoy=annio+"-"+mes+"-"+dia;
        SimpleDateFormat formato= new SimpleDateFormat("yyyy-MM-dd");// formatos para fecha
        Date fechas1,fechahoy; //variables fecha
        int i=0;
        try {
            fechahoy=formato.parse(hoy);  //convierte la fecha de hoy en formato fecha
            fechas1=formato.parse(fecha1);//convierte la fecha de la tarea a formato fecha
            i=fechas1.compareTo(fechahoy);// compara la fecha de la tarea con la fecha de hoy y regresa un valor -1 si es antes, 0 si igual o 1 si despues
        } catch (ParseException ex) {
            Logger.getLogger(colores_tabla.class.getName()).log(Level.SEVERE, null, ex);
        }
        if(i<0){// cambia el color de la fila si la fecha es antes de la actual
            color = new Color(170, 170, 170);
            setBackground(color);
        }
        return super.getTableCellRendererComponent(table, value, isSelected, hasFocus, row, column); //To change body of generated methods, choose Tools | Templates.
        
    }
    
    
}
