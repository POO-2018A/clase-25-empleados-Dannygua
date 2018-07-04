
package fabrica;

import java.util.Objects;

public class Trabajadores {
    
    private String nombre;
    private String apellido;
    private String cargo;

    public Trabajadores(String nombre, String apellido, String cargo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Trabajadores other = (Trabajadores) obj;
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Trabajadores{" + "nombre=" + nombre + ", apellido=" + apellido + ", cargo=" + cargo + '}';
    }

    
    
}
