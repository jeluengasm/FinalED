package logicaDeNegocio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;
import javax.swing.JOptionPane;


/**
 *
 * @author Jhon E. Luengas
 */
public class Metodos {
    
    Vector vPrincipal = new Vector();
    
    public void guardar(List Beneficiarios, List Lideres){
        vPrincipal.addElement(Beneficiarios);
        vPrincipal.addElement(Lideres);
    }
    
    public void guardarArchivo(List Beneficiarios, List Lideres){
        try{
            FileWriter fw = new FileWriter("plan par.txt",true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            for (int i = 0; i < Beneficiarios.size(); i++) {
                pw.print(Beneficiarios.get(i).Ben.getNombres());
            }
            
            
        }catch(Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
}
