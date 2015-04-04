/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.Server;

import edu.eci.arsw.CalendarioComun.CalendarioCaptureException;
import edu.eci.arsw.CalendarioComun.CalendarioCaptureStub;
import edu.eci.arsw.CalendarioComun.Fecha;
import edu.eci.arsw.CalendarioComun.TColaborativa;
import edu.eci.arsw.CalendarioComun.TInformativa;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;

public class CalendarioCaptureStubImpl extends UnicastRemoteObject implements CalendarioCaptureStub {

    private String texto;
    final private DocumentoServidor d = new DocumentoServidor();
    final private TareaServidor ts=new TareaServidor();
    private TColaborativa t;
    public boolean estado=false;

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
    public ArrayList<TColaborativa> getTareaColaborativa() throws CalendarioCaptureException,RemoteException {
        String nombre = "Tarea colabol arsw";
        Fecha fecha = new Fecha(12, 04, 2015);

        String descripcion = "Tarea colabborativa de arsw";
        t = new TColaborativa(fecha, nombre, descripcion);
        t.setDesripcion(descripcion);
        t.setFecha(fecha);
        t.setNombre(nombre);

        return ts.getListaTColaborativas();
    }

    @Override
    public ArrayList<TInformativa> getTareaInformativa() throws CalendarioCaptureException,RemoteException {
        
        String nombre = "Tarea informativa arsw";
        Fecha f = new Fecha(4, 5, 6);
        String descripcion = "Tarea informativa de arsw ";
        TInformativa t = new TInformativa(f, nombre, descripcion);
        
        return ts.getListaTInformativas();
    }

    @Override
    public void enviarTareaInformativa(TInformativa ti) throws CalendarioCaptureException, RemoteException {
      
      ts.adicionarTareaInformativa(ti);
        
        System.out.println("desde servidro********* ");
        System.out.println("Nombre: " + ti.getNombre());
        System.out.println("descripcion: " + ti.getDescripcion());
        System.out.println("Fecha: " + ti.getFecha().getDia());
   
    }

    @Override
    public void enviarTareaColaborativa(TColaborativa tc) throws CalendarioCaptureException, RemoteException {
        
        ts.adicionarTareaColaborativa(tc);
        
        System.out.println("Nombre: " + tc.getNombre());
        System.out.println("descripcion: " + tc.getDescripcion());
        System.out.println("Fecha: " + tc.getFecha().getDia());
   
    }

    @Override
    public void notificarCambio(boolean cambio) throws CalendarioCaptureException {
      
        this.estado=cambio;
         System.out.println("Notifico estado: "+estado);
    }

    @Override
    public boolean estadoCambio() throws CalendarioCaptureException {
      
        System.out.println("estado: "+estado);
        return estado; 
    }
}
