/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.Server;

import edu.eci.arsw.CalendarioComun.Fecha;
import edu.eci.arsw.CalendarioComun.TColaborativa;
import edu.eci.arsw.CalendarioComun.TInformativa;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.Date;

public class CalendarioCaptureStubImpl extends UnicastRemoteObject implements CalendarioCaptureStub {

    private String texto;
    final private Documento d = new Documento();
    private TColaborativa t;//=new TColaborativa();

    public CalendarioCaptureStubImpl() throws RemoteException {
        super();
    }

    @Override
    public String getTexto() throws CalendarioCaptureException {

        return texto = d.getTexto();
    }

    @Override
    public void setTexto(int Posicion, String texto) throws CalendarioCaptureException {
        d.setTexto(Posicion, texto);
    }

    @Override
    public TColaborativa getTareaColaborativa() throws CalendarioCaptureException {
        String nombre = "Tarea colabol arsw";
        Fecha fecha = new Fecha(12, 04, 2015);

        String descripcion = "Tarea colabborativa de arsw";
        t = new TColaborativa(fecha, nombre, descripcion);
        t.setDesripcion(descripcion);
        t.setFecha(fecha);
        t.setNombre(nombre);

        return t;
    }

    @Override
    public TInformativa getTareaInformativa() throws CalendarioCaptureException {
        String nombre = "Tarea informativa arsw";
        Fecha f = new Fecha(4, 5, 6);
        String descripcion = "Tarea informativa de arsw ";
        TInformativa t = new TInformativa(f, nombre, descripcion);

        return t;
    }

    @Override
    public void enviarTColaborativa(TColaborativa tc) throws CalendarioCaptureException {
        
    }

    @Override
    public void enviarTInformativa(TInformativa tc) throws CalendarioCaptureException {
       
    }
}
