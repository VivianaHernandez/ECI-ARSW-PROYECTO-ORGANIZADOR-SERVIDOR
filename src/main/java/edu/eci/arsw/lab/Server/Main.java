/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.lab.Server;

import edu.eci.arsw.utils.NetUtils;
import java.net.ConnectException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {

    public static void main(String args[])throws ConnectException {
        
            String thisHost= NetUtils.getIPAddress();
                
            System.setProperty("java.rmi.server.hostname", thisHost);
            ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
            System.out.println("Waiting for Request from Client ...");
    }
}