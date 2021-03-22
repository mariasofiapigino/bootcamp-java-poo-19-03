import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        System.out.println(" - Ejercicio 1 - ");
        CuentaCorriente cuentaCorriente = new CuentaCorriente(100, "Sofia");
        CuentaCorriente cuentaCorriente1 = new CuentaCorriente(cuentaCorriente);

        cuentaCorriente.ingreso(100);
        cuentaCorriente1.egreso(100);
        cuentaCorriente1.reintegro(300);
        cuentaCorriente.transferenciaIngreso(200);
        cuentaCorriente1.transferenciaEgreso(200);

        System.out.print(cuentaCorriente.toString() + "\n");
        System.out.print(cuentaCorriente1.toString());

        System.out.println("\n - Ejercicio 2 - ");
        Contador contador = new Contador(10);
        Contador contador1 = new Contador(contador);
        contador.incrementar(10);
        contador1.decrementar(20);
        System.out.println(contador.toString());
        System.out.println(contador1.toString());

        System.out.println(" - Ejercicio 3 - ");
        Libro libro = new Libro("Harry Potter","9780545582889","Rowling, J. K.");
        System.out.println(libro.prestar());
        System.out.println(libro.prestar());
        System.out.println(libro.devolver());
        System.out.println(libro.devolver());
        System.out.println(libro.toString());

        System.out.println(" - Ejercicio 4 - ");
        Fraccion fraccion = new Fraccion(3);
        fraccion.incrementar(3.2);
        Fraccion fraccion1 = new Fraccion(4.5);
        fraccion1.decrementar(6);
        System.out.println(fraccion);
        System.out.println(fraccion1);

        System.out.println(" - Ejercicio 5 - ");
        Fecha fecha = new Fecha();
        System.out.println(fecha.isCorrect(13, 20,2020));
        System.out.println(fecha.isCorrect(10,3,2020));
        System.out.println(fecha.toString());
        fecha.addDays(5);
        System.out.println(fecha.toString());

        System.out.println(" - Ejercicio 6 - ");
        StringUtil stringUtil = new StringUtil();
        System.out.println(stringUtil.rpad("ss", 4, '0'));
        System.out.println(stringUtil.ltrim("  hola  "));
        System.out.println(stringUtil.rtrim("  hola  "));
        System.out.println(stringUtil.trim("  hola  "));
        System.out.println(stringUtil.indexOfN("John|Paul|George|Ringo", '|',3));
        System.out.println(stringUtil.indexOfN("John|Paul|George|Ringo", 'a',3));




    }


}
