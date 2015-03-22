/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.lab.Server;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class DocumentoCaptureStubImpl extends UnicastRemoteObject implements DocumentoCaptureStub{
    
    private String texto;
    final private Documento d=new Documento();

    public DocumentoCaptureStubImpl() throws RemoteException {
		super();
	}

    @Override
    public String getTexto() throws DocumentoCaptureException {
        
        return texto=d.getTexto();
    }
    
    @Override
  public void setTexto(int Posicion,String texto) throws DocumentoCaptureException{
        d.setTexto(Posicion,texto);
    }      
}