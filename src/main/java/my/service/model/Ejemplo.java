package my.service.model;

import java.util.Objects;

public class Ejemplo {
    private int id;
    private String nombre;
    private boolean fumador;
    private double sueldo;
    public Ejemplo() {
    }
    public Ejemplo(int id, String nombre, boolean fumador, double sueldo) {
        this.id = id;
        this.nombre = nombre;
        this.fumador = fumador;
        this.sueldo = sueldo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public boolean isFumador() {
        return fumador;
    }
    public void setFumador(boolean fumador) {
        this.fumador = fumador;
    }
    public double getSueldo() {
        return sueldo;
    }
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    @Override
    public String toString() {
        return "Ejemplo [id=" + id + ", nombre=" + nombre + ", fumador=" + fumador + ", sueldo=" + sueldo + "]";
    }
    @Override
    public int hashCode() {
        return Objects.hash(fumador, id, nombre, sueldo);
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Ejemplo)) {
            return false;
        }
        Ejemplo other = (Ejemplo) obj;
        return fumador == other.fumador && id == other.id && Objects.equals(nombre, other.nombre)
                && Double.doubleToLongBits(sueldo) == Double.doubleToLongBits(other.sueldo);
    }
}
