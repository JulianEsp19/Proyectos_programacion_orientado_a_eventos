package practica14;

public class Alumno {
    private String idAlumno;
    private String nombre;
    private int curso;
    private String email;
    private Alumno siguiente;

    public Alumno(String idAlumno, String nombre, int curso, String email) {
        this.idAlumno = idAlumno;
        this.nombre = nombre;
        this.curso = curso;
        this.email = email;
        this.siguiente = null;
    }

    public Alumno getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Alumno siguiente) {
        this.siguiente = siguiente;
    }
    
    public String getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(String idAlumno) {
        this.idAlumno = idAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
