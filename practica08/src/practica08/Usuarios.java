package practica08;

public class Usuarios {
    private Usuario inicio;

    public Usuarios() {
        this.inicio = null;
    }
    
    public boolean estaVacio(){
        return inicio == null;
    }
    
    public void anadirUsuario(String usuario, String contrasena){
        Usuario temp = new Usuario(usuario, contrasena, null);
        if(estaVacio()) inicio = temp;
        else{
            temp.setSiguiente(inicio);
            inicio = temp;
        }
    }
    
    public boolean usuarioInicioSesion(String usuario, String contrasena){
        Usuario temp = inicio;
        while(temp != null){
            if(temp.getUsuario().equals(usuario))
                if(temp.getContrasena().equals(contrasena))
                    return true;
            
            temp = temp.getSiguiente();
        }
        return false;
    }
    
}
