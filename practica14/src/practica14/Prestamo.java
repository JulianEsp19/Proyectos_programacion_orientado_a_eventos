package practica14;

public class Prestamo {
    private int idPrestamo;
    private String fechaPrestamo;
    private String fechaDevolucion;
    private String idAlumno;
    private Prestamo siguiente;

    public Prestamo(int idPrestamo, String fechaPrestamo, String fechaDevolucion, String idAlumno) {
        this.idPrestamo = idPrestamo;
        this.fechaPrestamo = fechaPrestamo;
        this.fechaDevolucion = fechaDevolucion;
        this.idAlumno = idAlumno;
        this.siguiente = null;
    }

    public Prestamo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Prestamo siguiente) {
        this.siguiente = siguiente;
    }

    public int getIdPrestamo() {
        return idPrestamo;
    }

    public void setIdPrestamo(int idPrestamo) {
        this.idPrestamo = idPrestamo;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }
    
    
}
