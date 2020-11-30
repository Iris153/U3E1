package pilasarreglos;

public class Pila {

    int tope, max;
    String pila[];

    public Pila(int m) {
        max = m;
        pila = new String[max];
        tope = 0;
    }

    private void Insertar(String palabra) {
        if (tope < max) {
            pila[tope] = palabra;
            tope++;

        } else {
            System.out.println("Pila llena");
        }
    }

    public void Mostrar() {
        if (!Vacia()) {
            for (int a = (tope - 1); a > 0; a--) {
                System.out.println(pila[a]);
            }
        } else {
            System.out.println("La pila esta vacia");
        }
    }

    public int Eliminar() {
        if (tope > 0) {
            tope--;
            System.out.println("Dato eliminado");
        } else {
            System.out.println("No hay datos para eliminar");
        }
        return tope;
    }

    public boolean Vacia() {
        if (pila == null) {
            return true;
        } else {
            return false;
        }
    }

}
