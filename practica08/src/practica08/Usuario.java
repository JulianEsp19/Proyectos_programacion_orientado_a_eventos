package practica08;

public class Usuario {
    private String usuario;
    private String contrasena;
    private Usuario siguiente;

    public Usuario() {
        this.usuario = "";
        this.contrasena = "";
        this.siguiente = null;
    }

    public Usuario(String usuario, String contrasena, Usuario siguiente) {
        this.usuario = usuario;
        this.contrasena = contrasena;
        this.siguiente = siguiente;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public Usuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Usuario siguiente) {
        this.siguiente = siguiente;
    }    
}
