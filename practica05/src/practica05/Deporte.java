package practica05;

public class Deporte {
    private String nombre;
    private int numJugadores;
    private float popularidad;
    private String accionPuntaje;

    public Deporte(String nombre, int numJugadores, float popularidad, String accionPuntaje) {
        this.nombre = nombre;
        this.numJugadores = numJugadores;
        this.popularidad = popularidad;
        this.accionPuntaje = accionPuntaje;
    }

    public Deporte() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumJugadores() {
        return numJugadores;
    }

    public void setNumJugadores(int numJugadores) {
        this.numJugadores = numJugadores;
    }

    public float getPopularidad() {
        return popularidad;
    }

    public void setPopularidad(float popularidad) {
        this.popularidad = popularidad;
    }

    public String getAccionPuntaje() {
        return accionPuntaje;
    }

    public void setAccionPuntaje(String accionPuntaje) {
        this.accionPuntaje = accionPuntaje;
    }
    
    
}
