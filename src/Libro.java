/**
 * Crea una clase Libro con los métodos: préstamo, devolución y toString, cuyo prototipo
 * debe ser: public String toString(). Este método debe retornar una cadena que
 * represente al objeto. Por ejemplo: si la clase tiene los atributos: título, isbn y autor, una
 * cadena que represente a un libro podría ser: “Harry Potter, 9780545582889, Rowling,
 * J. K.”. La clase contendrá un constructor por defecto, un constructor con parámetros y
 * los métodos de acceso.
 *
 * @author  Sofia Pigino (Grupo 2)
 * @version 1.0
 */

public class Libro {
    private String titulo;
    private String isbn;
    private String autor;
    private boolean borrow;

    public Libro(String titulo, String isbn, String autor) {
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.borrow = false;
    }

    public Libro(){
    }

    public boolean prestar(){
        if (!borrow){
            borrow = true;
            return true;
        }
        return false;
    }

    public boolean devolver(){
        if (borrow){
            borrow = false;
            return true;
        }
        return false;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", isbn='" + isbn + '\'' +
                ", autor='" + autor + '\'' +
                '}';
    }
}
