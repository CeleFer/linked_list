
import logica.*;
import datos.Nodo;

public class Main{

    public static void main(String[] args) {

        Logica objLogica = new Logica();
        Nodo ini = new Nodo() ;

        ini = objLogica.insertar(ini,"a");
        ini = objLogica.insertar(ini,"b");
        ini = objLogica.insertar(ini,"c");
        ini = objLogica.insertar(ini,"d");

        objLogica.mostrar_lista(ini);

    }


}