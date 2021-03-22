/**
 * Crea una clase CuentaCorriente, con los métodos: ingreso, egreso, reintegro y transferencia.
 * La clase contendrá un constructor por defecto, uno con parámetros y otro que recibirá una
 * cuentaCorriente de la cual copiará de todos sus datos. Además se deben desarrollar los
 * métodos de acceso (para cada variable de instancia de la clase, desarrollar un método set y
 * otro get. Por ejemplo: si la clase tiene una variable double saldo, sus métodos de acceso
 * serán: double getSaldo() y void setSaldo(double s). Los prototipos de los métodos y
 * constructores deberán ser discutidos y diseñados en equipo.
 *
 * @author  Sofia Pigino (Grupo 2)
 * @version 1.0
 */

public class CuentaCorriente {
    private double saldo;
    private String titular;

    // Constructores
    public CuentaCorriente(double saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public CuentaCorriente() {}

    public CuentaCorriente(CuentaCorriente otraCuentaCorriente){
        this.saldo = otraCuentaCorriente.getSaldo();
        this.titular = otraCuentaCorriente.getTitular();
    }

    public void ingreso(double cantidad){
        this.saldo += cantidad;
    }

    public boolean egreso(double cantidad){
        if (saldo >= cantidad){
            this.saldo -= cantidad;
            return true;
        }
        return false;
    }

    public void reintegro(double cantidad){
        ingreso(cantidad);
    }

    public boolean transferenciaEgreso(double cantidad){
        return egreso(cantidad);
    }

    public void transferenciaIngreso(double cantidad){
        ingreso(cantidad);
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" +
                "saldo=" + saldo +
                ", titular='" + titular + '\'' +
                '}';
    }
}
