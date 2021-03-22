/**
 * Crea una clase Fecha. La clase contendrá además de los constructores que consideres
 * adecuados, métodos de acceso y el método toString, tal como lo explicamos en el ejercicio
 * anterior, un método para comprobar si la fecha es correcta y otro para sumarle un día al valor
 * actual de la fecha. Se debe investigar y utilizar la clase GregorianCalendar para implementar
 * los métodos y constructores de Fecha.
 *
 * @author  Sofia Pigino (Grupo 2)
 * @version 1.0
 */

import java.time.LocalDate;
import java.util.Date;

public class Fecha {
    private LocalDate localDate;

    public Fecha(int day, int month, int year){
        try {
            localDate = LocalDate.of(year, month, day);
        }
        catch (Exception e){
            System.out.println("Fecha invalida");
        }
    }

    public Fecha(){}

    public boolean isCorrect(int day, int month, int year){
        try {
            localDate = LocalDate.of(year, month, day);
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

    public void addDays(int days){
        localDate = localDate.plusDays(days);
    }

    @Override
    public String toString() {
        return "Fecha{" +
                "localDate=" + localDate +
                '}';
    }
}
