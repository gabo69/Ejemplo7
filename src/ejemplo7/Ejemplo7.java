/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplo7;

import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Mantuano ---- Luis Torres
 */
public class Ejemplo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     int ingreso;
     char x;
     String a=" ";
     String cadn1, auxiliar;
     cadn1=JOptionPane.showInputDialog("Ingrese Frase");
     int longitud1 = cadn1.length();    
     char [] frase1= cadn1.toCharArray();  
     for (int i = 0; i < longitud1; i++)
        {
            if (cadn1.codePointAt(i)>=65 && cadn1.codePointAt(i)<=90)
            {
                ingreso = cadn1.codePointAt(i);
                ingreso = ingreso + 32;
                x=(char)ingreso; 
                a=a+x;                    
            }
            else                  
            {
                a=a+frase1[i];                    
            }          
        }
        JOptionPane.showMessageDialog(null,a);
     
    }
    
}
