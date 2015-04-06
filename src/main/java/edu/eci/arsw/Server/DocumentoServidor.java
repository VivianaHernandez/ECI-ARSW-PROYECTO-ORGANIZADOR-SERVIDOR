
package edu.eci.arsw.Server;

import javax.swing.JFrame;

public class DocumentoServidor
{
    private final String texto=""; 
    
    public DocumentoServidor() {
        initComponents();
        jf.setSize(500,400);    
      }
    
    @SuppressWarnings("unchecked")
        
    
    private void initComponents() {
        jf=new JFrame();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        textjsp = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        jFormattedTextField1.setText("jFormattedTextField1");
        jf.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        textArea.setColumns(20);
        textArea.setRows(5);
        textjsp.setViewportView(textArea);
        jf.getContentPane().add(textjsp, java.awt.BorderLayout.CENTER);
        jf.pack();
    }                        
             
    public void setTexto(int posicion, String tex) {
          textArea.insert(tex, posicion);
    }

    public String getTexto() {
     
        return textArea.getText();
    }
    
    public void setVisibles(boolean est)
    {
    jf.setVisible(est);
    }
    
    private javax.swing.JFrame jf;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JTextArea textArea;
    private javax.swing.JScrollPane textjsp;
}