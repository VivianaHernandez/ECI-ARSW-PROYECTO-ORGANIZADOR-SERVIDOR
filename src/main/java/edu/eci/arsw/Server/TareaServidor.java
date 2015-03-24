/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.eci.arsw.Server;

import edu.eci.arsw.CalendarioComun.TColaborativa;
import edu.eci.arsw.CalendarioComun.TInformativa;
import java.util.ArrayList;

/**
 *
 * @author Viviana
 */
public class TareaServidor {
    
    ArrayList<TColaborativa> listaTColaborativas=new ArrayList<TColaborativa>();
    ArrayList<TInformativa> listaTInformativas=new ArrayList<TInformativa>();
    
    public TareaServidor()
    {
    
    }
    
    public void adicionarTareaColaborativa(TColaborativa tc)
    {
    listaTColaborativas.add(tc);
    }
    
    public void adicionarTareaInformativa(TInformativa ti)
    {
    listaTInformativas.add(ti);
    }
    
    public ArrayList<TColaborativa> getListaTColaborativas() {
        return listaTColaborativas;
    }

    public ArrayList<TInformativa> getListaTInformativas() {
        return listaTInformativas;
    }
}
