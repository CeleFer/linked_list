package logica;

import datos.Nodo;

public class Logica {


    public void mostrar_lista(Nodo ini){
        Nodo pos = ini;
        while( pos != null){   
            if(pos.name != null ){  
                //El primer nodo es nulo , con esto lo ignoramos
                System.out.println(pos.name);    
            }
            pos = pos.enlace;
        }
        System.out.println("fin");    
    }

    public Nodo insertar(Nodo nodoParametro ,String a){
        // No puede ser void ya que retornamos una clase LETRA.

        // Creamos un nuevoNodo Nodo con un valor "a"
        Nodo nuevoNodo = new Nodo(a);        
        // El nodo ingresado como parametro pasa a ser el siguiente nodo.
        nuevoNodo.enlace = nodoParametro;   
        // El nuevo nodo pasa a ser el nodo del parametro y devolvemos el parametro.
        nodoParametro  = nuevoNodo;

     return nodoParametro;
     /*
     Esquema :
        El nodo inicial que es ingresado en el parametro es devuelto al mismo nodo inicial

        Linea 12 : ini = ini.insertar(ini,"b");

        Pero , sus valores son cambiados. el nuevo nodo recive en su enlace al anterior nodo
        el nuevo nodo con el anterior nodo dentro de su enlace se va por el return.
        

        En la case main se igualara al nodo principal , logrando el efecto que el primer
        valor es el ultimo y el ultimo valor ingresado el primero.
     */


    }
    
}
