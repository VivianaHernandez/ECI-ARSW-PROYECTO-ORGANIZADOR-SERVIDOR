/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.Server;

import edu.eci.arsw.CalendarioComun.*;


public interface CalendarioCaptureStub {

  public String getTexto() throws CalendarioCaptureException;
  public void setTexto(int Posicion,String texto) throws CalendarioCaptureException;
  
  public void enviarTColaborativa(TColaborativa tc) throws CalendarioCaptureException;
  public void enviarTInformativa(TInformativa ti) throws CalendarioCaptureException;
  
  public TColaborativa getTareaColaborativa()throws CalendarioCaptureException;
  public TInformativa getTareaInformativa()throws CalendarioCaptureException;
    
}
