/**
 * Crea una clase Fraccion con métodos necesarios para sumar, restar, multiplicar y dividir
 * fracciones. Todos los métodos deben estar sobrecargados de modo que también puedan
 * usarse para operar entre fracciones y números enteros (por ejemplo: 3⁄5+2 o 5⁄8*4).
 *
 * @author  Sofia Pigino (Grupo 2)
 * @version 1.0
 */

public class Fraccion {
    private double count;

    public Fraccion() {
        this.count = 0;
    }

    public Fraccion(double count) {
        this.count = count;
    }

    public Fraccion(int count) {
        this.count = count;
    }

    public void incrementar(int amount){
        this.count += amount;
    }

    public void incrementar(double amount){
        this.count += amount;
    }

    public void decrementar(int amount){
        this.count -= amount;
    }

    public void decrementar(double amount){
        this.count -= amount;
    }

    public double getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public void setCount(double count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Fraccion{" +
                "count=" + count +
                '}';
    }
}
