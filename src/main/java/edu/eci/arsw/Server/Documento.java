
package edu.eci.arsw.Server;

import java.util.logging.Logger;
import javax.swing.JFrame;

public class Documento
{
    private final String texto=""; 
    
    public Documento() {
        initComponents();
        jf.setSize(500,400);
        jf.setVisible(false);
      }
    
    @SuppressWarnings("unchecked")
                             
    private void initComponents() {
        jf=new JFrame();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        textjsp = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        saveMenuItem = new javax.swing.JMenuItem();
        loadMenuItem = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();

        jFormattedTextField1.setText("jFormattedTextField1");

        jf.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        textjsp.setViewportView(textArea);

        jf.getContentPane().add(textjsp, java.awt.BorderLayout.CENTER);
        jMenu1.setText("File");
        
        saveMenuItem.setText("save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(saveMenuItem);

        loadMenuItem.setText("load");
        loadMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loadMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(loadMenuItem);

        exitMenuItem.setText("Quit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        jMenu1.add(exitMenuItem);
        jMenuBar1.add(jMenu1);
        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);
        jf.setJMenuBar(jMenuBar1);
        jf.pack();
        
    }                        

    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
          try {
            //mec.Guardar(evt, textArea, defaultPath);
        } catch (Exception ex) {
            Logger.getLogger(Documento.class.getName()).log(null, null, ex);
        }
    }                                            

    private void loadMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {
            //mec.cargar(textArea, defaultPath);
        } catch (Exception ex) {
            Logger.getLogger(Documento.class.getName()).log(null, null, ex);
        }
    }                                            

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {                                             
        System.exit(0);
    }             
    public void setTexto(int posicion, String tex) {
        textArea.insert(tex, posicion);
    }

    public String getTexto() {
        return textArea.getText();
    }
    
    // Variables declarationy 
    private javax.swing.JFrame jf;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem loadMenuItem;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JTextArea textArea;
    private javax.swing.JScrollPane textjsp;
}