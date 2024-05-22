package practica14;

public class PilaAlumno {
    private Alumno inicio;

    public PilaAlumno() {
        this.inicio = null;
    }
    
    public boolean estaVacio(){
        return inicio == null;
    }
    
    public int tamano(){
        Alumno temporal = inicio;
        int resultado = 0;
        while(temporal != null){
            resultado ++;
            temporal = temporal.getSiguiente();
        }
        return resultado;
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
    
    public Object[] toObject(){
        Object filas[] = new Object[tamano()];
        Object informacion[] = new Object[4];
        Alumno temporal = inicio;
        
        for (int i = 0; i < filas.length; i++) {
            informacion[0] = temporal.getIdAlumno();
            informacion[1] = temporal.getNombre();
            informacion[2] = temporal.getCurso();
            informacion[3] = temporal.getEmail();
            
            filas[i] = informacion;
            informacion = new Object[4];
            
            temporal = temporal.getSiguiente();
        }
        
        return filas;
    }
    
}
