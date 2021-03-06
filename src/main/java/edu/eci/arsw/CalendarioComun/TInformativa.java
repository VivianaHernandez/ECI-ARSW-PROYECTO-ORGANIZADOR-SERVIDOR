package edu.eci.arsw.CalendarioComun;

import java.io.Serializable;

public class TInformativa implements Serializable{
    private String nombre;
    private Fecha fecha;
    private String descripcion;
    private Alarma alarma;

    public TInformativa(Fecha fecha, String nombre, String descripcion){
        this.fecha=fecha;
        this.nombre=nombre;
        this.descripcion=descripcion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public Alarma getAlarma() {
        return alarma;
    }

    public void setAlarma(Alarma alarma) {
        this.alarma = alarma;
    }
}
