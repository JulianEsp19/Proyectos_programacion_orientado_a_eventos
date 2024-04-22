package practica10;

public class Usuario {
    private String contrasena;
    private String usuario;

    public Usuario(String contrasena, String usuario) {
        this.contrasena = contrasena;
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}
