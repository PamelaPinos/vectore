
import java.util.Scanner;

/**
 *
 * @author Pamela Pinos, Pedro Bermeo
 * @version 1.0 Beta
 *
 */
public class Principal {

    public static void main(String[] args) throws Exception {

        Principal p = new Principal();

        p.ingresarMenur();

    }

    public void ingresarMenur() throws Exception {

        boolean bandera = true;
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        int elemento = 0;
        
      
        Vec v = new Vec();

        while (bandera) {

            System.out.println("-------------------------------------");
            System.out.println("\nIngrese la opcion que desea: \n1->Insertar Dato en el Vector. \n2-> Quitar un elemento del Vector. \n3->Mostrar Todos los elementos. \n4->Tamaño del Vector.\n5->Vaciar Vector.\n6->Salir");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:

                    System.out.println("\nIngrese el elemento que desea ingresar: ");
                    elemento = entrada.nextInt();

                    v.insertar(elemento);
                    break;

                case 2:

                    v.quitar();
                    break;

                case 3:

                    v.imprimir();
                    break;

                case 4:

                    v.verificartamanio();
                    break;

                case 5:

                    System.out.println("\nVector Vaciado.");
                    System.out.println("Ingrese nuevamente los datos del Vector Nuevo.");
                    v.vaciar();
                    ingresarMenur();
                    break;

                case 6:

                    System.out.println("-----------------------------------------");
                    System.out.println("Gracias por usar el Sistema");
                    System.out.println("-----------------------------------------");
                    System.exit(1);
                    break;

                default:
                    System.out.println("\nOpcion Incorrecta por favor intente con una opción Valida. ");
                    break;
            }
        }
        while (opcion > 6);
    }

}
