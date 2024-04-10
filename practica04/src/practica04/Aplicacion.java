package practica04;

public class Aplicacion {
    
    private String nombre;
    private float version;
    private String desarrollador;
    private String descripcion;

    public Aplicacion(String nombre, float version, String desarrollador, String descripcion) {
        this.nombre = nombre;
        this.version = version;
        this.desarrollador = desarrollador;
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    
    
}
