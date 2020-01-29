
package exempoarrays;

import javax.swing.JOptionPane;


public class PedirDatos {
      public static int pedirInt(){
         return Integer.parseInt(JOptionPane.showInputDialog("teclea int :"));
         
     }
     public static String pedirString(){
         return JOptionPane.showInputDialog("teclea String : ");
     
     }
}
