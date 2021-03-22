/**
 * Partiendo de la clase StringUtil (que usamos para resolver Radix Sort), agregar los siguientes
 * métodos estáticos:
 * - public static String rpad(String s,char c,int n); idem lpad, pero agregando caracteres a
 * la derecha.
 * - public static String ltrim(String s); Retorna una cadena idéntica a s pero sin espacios a
 * la izquierda.
 * - public static String rtrim(String s); idem ltrim, pero sin espacios a la derecha.
 * - public static String trim(String s); idem lpad, pero sin espacios a derecha ni izquierda.
 * - public static int indexOfN(String s,char c,int n); Retorna la posición de la n-ésima
 * ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s =
 * “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
 * segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es:
 * 9.
 *
 * @author  Sofia Pigino (Grupo 2)
 * @version 1.0
 */

import java.util.Arrays;
import java.util.stream.Stream;

public class StringUtil
{
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n)
    {
        String strChar = String.valueOf(c);
        return strChar.repeat(n);
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c)
    {
        String strArray = "";
        int start = s.length();
        int finish = n - 1;
        if (start != 0) finish = n;
        for (int i = start; i < finish; i++) {
            strArray += String.valueOf(c);
        }

        strArray += s;

        return strArray;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int intArray[])
    {
        String[] strArray = new String[intArray.length];

        for (int i = 0; i < intArray.length; i++) {
            strArray[i] = String.valueOf(intArray[i]);
        }
        return strArray;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[])
    {
        return Stream.of(arr)
                .mapToInt(Integer::parseInt).toArray();
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[])
    {
        return Arrays.asList(arr)
                .stream().map(String::length).max(Integer::compareTo).get();
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c)
    {
        int max = maxLength(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = lpad(arr[i], max, c);
        }
    }

    // idem lpad, pero agregando caracteres a la derecha.
    public static String rpad(String s, int n, char c)
    {
        int start = s.length();

        for (int i = start; i < n; i++) {
            s += c;
        }

        return s;
    }

    // Retorna una cadena idéntica a s pero sin espacios a
    // la izquierda.
    public static String ltrim(String s){
        return s.replaceAll("^\\s*", "");
    }

    // idem ltrim, pero sin espacios a la derecha.
    public static String rtrim(String s){
        return s.replaceAll("\\s*$", "");
    }

    // idem lpad, pero sin espacios a derecha ni izquierda.
    public static String trim(String s){
        String ltrim = ltrim(s);
        String lrtrim = rtrim(ltrim);
        return lrtrim;
    }

    // Retorna la posición de la n-ésima ocurrencia del carácter c dentro de s,
    // o -1 si s no contiene a c. Por ejemplo, si s = “John|Paul|George|Ringo”,
    // c = ‘|’ y n = 2, la función debe retornar la posición de la
    // segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es:
    // 9.
    public static int indexOfN(String s,char c,int n){
        char[] charArray = s.toCharArray();
        int count = 0;
        int index = -1;
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] == c) {
                count++;
                if (count == n){
                    index = i;
                    return index;
                }
            }
        }
        return index;

    }

}

