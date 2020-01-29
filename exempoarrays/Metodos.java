
package exempoarrays;


public class Metodos {
   int [] numeros = new int [6]; 
    public void crearArray (){
        for(int i=0; i<numeros.length; i++){
            numeros[i]=PedirDatos.pedirInt();
        } 
             
    }
    public void amosar(){
        for(int i=0; i<numeros.length;i++)
            System.out.println(numeros[i]);
    }
    //recibimos o array como parametro
    public void visualizar(int[]lista){
        for(int i=0; i<lista.length; i++)
            System.out.println("***"+lista[i]);
    }
               
            
}
