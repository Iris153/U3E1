package pilasarreglos;

import static java.lang.Double.max;
import java.util.Scanner;

public class PilasArreglos {

    public static void main(String[] args) {

        int tope, max;
        String pila[] = null;

        boolean continuar = true;
        int opc, t;
        String palabra;

        Scanner leer = new Scanner(System.in);

        while (continuar) {
            System.out.println("MENU");
            System.out.println("Tamaño de la pila");
            t = leer.nextInt();
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");

            opc = leer.nextInt();

            switch (opc) {
                case 1:
                    System.out.println("Inserte dato");
                    palabra = leer.next();
                    pila.Insertar(palabra);
                    break;
                case 2:
                    pila.Mostrar();
                    break;
                case 3:
                    pila.Eliminar();
                    break;
                case 4:
                    continuar = false;
                    break;
            }
        }
    }

}
