/**
 * Crea una clase Contador (sí, contador de programación) con métodos que permitan
 * incrementar y decrementar su valor. La clase contendrá un constructor por defecto, un
 * constructor con parámetros, un constructor copia y los setters y getters (métodos de acceso)
 * que corresponda.
 *
 * @author  Sofia Pigino (Grupo 2)
 * @version 1.0
 */

public class Contador {
    private int cont;

    // Constructor
    public Contador() {
        this.cont = 0;
    }

    public Contador(int cont) {
        this.cont = cont;
    }

    public Contador(Contador cont) {
        this.cont = cont.getCount();
    }

    public void incrementar(int cantidad){
        this.cont += cantidad;
    }

    public void decrementar(int cantidad){
        this.cont -= cantidad;
    }

    public int getCount() {
        return cont;
    }

    public void setCount(int count) {
        this.cont = count;
    }

    @Override
    public String toString() {
        return "Contador{" +
                "cont=" + cont +
                '}';
    }
}
