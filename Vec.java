
import java.util.Vector;

/**
 *
 * @author Pamela Pinos, Pedro Bermeo
 * @version 1.0 Beta
 *
 */
public class Vec {

    public int apuntador;
    public Vector arreglo;

    public Vec() {

        apuntador = -1;
        arreglo = new Vector();

    }

    public void insertar(int elemento) throws Exception {

        apuntador++;
        arreglo.add(elemento);

        for (int Contador = arreglo.size() - 1; Contador >= 0; Contador--) {

            System.out.println("-------------------------------------");
            System.out.println("Los valores dela Pila son:" + arreglo.get(Contador));

        }

    }

    public int quitar() throws Exception {

        int aux;

        if (isVacia()== true) {

            System.out.println("-------------------------------------");
            throw new Exception("\nPila Vacia");
            
        } else {

            System.out.println("El elemento: " + arreglo.get(apuntador) + " A sido eliminado.");
            aux = (int) arreglo.elementAt(apuntador);
            arreglo.removeElementAt(apuntador);
            apuntador--;
            return aux;
        }
    }

    public boolean isVacia() {

        if (apuntador == -1) {
            return true;
        }
        return false;
    }

    public boolean isLlena() {

        if (apuntador == arreglo.size() - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimir() {

        for (int Contador = arreglo.size() - 1; Contador >= 0; Contador--) {
            System.out.println("-------------------------------------");
            System.out.println("Los valores del Vector son:" + arreglo.get(Contador));
        }
    }

    public void verificartamanio() {
        int t = arreglo.size();
        if (t == 0) {
            System.out.println("Pila Vacia, por favor ingrese datos.");
        } else {
            System.out.println("-------------------------------------");
            System.out.println("\nEl tamaño de la Pila es: " + t);
        }
    }

    public void vaciar() {
        apuntador = 0;

    }

}
