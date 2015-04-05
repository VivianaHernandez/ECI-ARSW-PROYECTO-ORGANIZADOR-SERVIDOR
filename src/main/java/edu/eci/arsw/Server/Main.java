package edu.eci.arsw.Server;

import java.net.ConnectException;
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