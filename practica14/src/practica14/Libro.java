package practica14;

public class Libro {
    private int isbn;
    private String titulo;
    private String autor;
    private int edicion;
    private Libro siguiente;

    public Libro(int isbn, String titulo, String autor, int edicion) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.edicion = edicion;
        this.siguiente = null;
    }

    public Libro getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Libro siguiente) {
        this.siguiente = siguiente;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getEdicion() {
        return edicion;
    }

    public void setEdicion(int edicion) {
        this.edicion = edicion;
    }
    
    
}
