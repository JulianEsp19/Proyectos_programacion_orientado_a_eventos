package practica10;

public class PilaAlumno {
    private Alumno inicio;

    public PilaAlumno() {
        this.inicio = null;
    }
    
    public boolean estaVacio(){
        return inicio == null;
    }
    
    public void push(String idAlumno, String nombre, int curso, String email){
        Alumno temporal = new Alumno(idAlumno, nombre, curso, email);
        
        if(estaVacio()) inicio = temporal;
        else{
            temporal.setSiguiente(inicio);
            inicio = temporal;
        }
    }
    
    public void pop(){
        if(!estaVacio()){
            inicio = inicio.getSiguiente();
        }
    }
    
    @Override
    public String toString(){
        String resultado = "";
        Alumno temporal = inicio;
        
        while (temporal != null) {
            resultado += "Id alumno: " + temporal.getIdAlumno() + "\n"+
                    "Nombre: " + temporal.getNombre() + "\n"+
                    "Curso: " + temporal.getCurso() + "\n" +
                    "Email: " + temporal.getEmail() + "\n\n" +
                    "------------------------------------------" + "\n\n";
            temporal = temporal.getSiguiente();
        }
        
        return resultado;
    }
    
}
