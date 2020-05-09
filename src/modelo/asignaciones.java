/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.Date;

/**
 *
 * @author guill
 */
public class asignaciones {
    public int asig_id;
    public String nomb_asig;
    public String desc_asig;
    public String importancia;
    public double puntaje;
    public Date fecha_entrega;
    public double notaF;
    public int id_usuario;

    public int getAsig_id() {
        return asig_id;
    }

    public void setAsig_id(int asig_id) {
        this.asig_id = asig_id;
    }

    public String getNomb_asig() {
        return nomb_asig;
    }

    public void setNomb_asig(String nomb_asig) {
        this.nomb_asig = nomb_asig;
    }

    public String getDesc_asig() {
        return desc_asig;
    }

    public void setDesc_asig(String desc_asig) {
        this.desc_asig = desc_asig;
    }

    public String getImportancia() {
        return importancia;
    }

    public void setImportancia(String importancia) {
        this.importancia = importancia;
    }

    public double getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(double puntaje) {
        this.puntaje = puntaje;
    }

    public Date getFecha_entrega() {
        return fecha_entrega;
    }

    public void setFecha_entrega(Date fecha_entrega) {
        this.fecha_entrega = fecha_entrega;
    }

    public double getNotaF() {
        return notaF;
    }

    public void setNotaF(double notaF) {
        this.notaF = notaF;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }
}
