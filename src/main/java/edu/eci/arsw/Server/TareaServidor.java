/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.Server;

import edu.eci.arsw.CalendarioComun.CalendarioCaptureException;
import edu.eci.arsw.CalendarioComun.TColaborativa;
import edu.eci.arsw.CalendarioComun.TInformativa;
import java.rmi.RemoteException;
import java.util.ArrayList;

public class TareaServidor {

    ArrayList<TColaborativa> listaTColaborativas = new ArrayList<TColaborativa>();
    ArrayList<TInformativa> listaTInformativas = new ArrayList<TInformativa>();

    public TareaServidor() {

    }

    public void adicionarTareaColaborativa(TColaborativa tc) {
        listaTColaborativas.add(tc);
    }

    public void adicionarTareaInformativa(TInformativa ti) {
        listaTInformativas.add(ti);
    }

    public ArrayList<TColaborativa> getListaTColaborativas() {
        return listaTColaborativas;
    }

    public ArrayList<TInformativa> getListaTInformativas() {
        return listaTInformativas;
    }

    public void modificarTareaI(TInformativa ti) throws CalendarioCaptureException, RemoteException {

        for (int i = 0; i < listaTInformativas.size(); i++) {
            if (listaTInformativas.get(i).equals(ti)) {
                listaTInformativas.get(i).setNombre(ti.getNombre());
                listaTInformativas.get(i).setDescripcion(ti.getDescripcion());
            }
          
        }
    }

    public void modificarTareaC(TColaborativa tc) throws CalendarioCaptureException, RemoteException {

        
        for (int i = 0; i < listaTColaborativas.size(); i++) {
            if (listaTColaborativas.get(i).equals(tc)) {
                listaTColaborativas.get(i).setNombre(tc.getNombre());
                listaTColaborativas.get(i).setDesripcion(tc.getDescripcion());
            }
       
        }
        
        
    }
}


