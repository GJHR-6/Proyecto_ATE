
package modelo;

public class usuario {
    
    public int id_user;
    public String nomb_user;
    public String password;
    public boolean esadmin;
    public int id_carrera;
    public carrera Carrera;

    public carrera getCarrera() {
        return Carrera;
    }

    public void setCarrera(carrera Carrera) {
        this.Carrera = Carrera;
    }

    public int getId_user() {
        return id_user;
    }

    public void setId_user(int id_user) {
        this.id_user = id_user;
    }

    public String getNomb_user() {
        return nomb_user;
    }

    public void setNomb_user(String nomb_user) {
        this.nomb_user = nomb_user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEsadmin() {
        return esadmin;
    }

    public void setEsadmin(boolean esadmin) {
        this.esadmin = esadmin;
    }
    
    public int getId_carrera() {
        return id_carrera;
    }

    public void setId_carrera(int id_carrera) {
        this.id_carrera = id_carrera;
    }
    public usuario() {
    }
   
}
