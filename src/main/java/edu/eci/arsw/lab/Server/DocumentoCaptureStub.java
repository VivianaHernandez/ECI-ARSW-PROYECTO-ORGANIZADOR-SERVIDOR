/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.lab.Server;

import java.awt.image.BufferedImage;
import java.rmi.RemoteException;

/**
 *
 * @author viviana
 */
public interface DocumentoCaptureStub{

  public String getTexto() throws DocumentoCaptureException;
   public void setTexto(String texto) throws DocumentoCaptureException;
 
    
}
