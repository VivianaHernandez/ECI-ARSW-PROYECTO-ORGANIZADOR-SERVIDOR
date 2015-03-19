/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.lab.Server;

import edu.eci.arsw.utils.NetUtils;
import java.awt.AWTException;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.RenderingHints;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.net.ConnectException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class DocumentoCaptureStubImpl extends UnicastRemoteObject implements DocumentoCaptureStub{
    
    private String texto="HOla";
    private Documento d=new Documento();

    
    public DocumentoCaptureStubImpl() throws RemoteException {
		super();
             
	}
    
    
    @Override
    public String getTexto() throws DocumentoCaptureException {

        texto=d.getTexto();
    //    System.out.println("texto: "+texto);
        return texto;       
    }
    
    
    @Override
  public void setTexto(int Posicion,String texto) throws DocumentoCaptureException{

        //d.setTexto(texto);
        System.out.println("palabras "+texto);
        System.out.println("posicion "+Posicion);
        
       /* for(int i=0;i<pal.size();i++){
        System.out.println("palabras"+pal.getClass().getName());
        }*/
    }

    

          
}