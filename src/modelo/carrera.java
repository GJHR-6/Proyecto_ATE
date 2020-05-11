
package modelo;

public class carrera {

    public int id_carrera;
    public String nomb_carrera;

    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }

    public String getNomb_carrera() {
        return nomb_carrera;
    }

    public void setNomb_carrera(String nomb_carrera) {
        this.nomb_carrera = nomb_carrera;
    }

    @Override
    public String toString() {
        return this.nomb_carrera;
    }
}
