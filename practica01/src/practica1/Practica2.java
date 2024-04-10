package practica1;

import java.util.Scanner;

public class Practica2 {

    private static final Tren trenes[] = new Tren[20];
    private static final Scanner scanner = new Scanner(System.in);
        
    public static void main(String[] args) {
      
        int opcion = 0;
        
        do{
            
            System.out.println("""
                               ----------Menu-------------
                               1.-Nuevo tren 
                               2.-Editar tren
                               3.-Borrar tren
                               4.-Imprimir trenes
                               0.-Salir
                               """);
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println(nuevoTren());
                    break;
                case 2:
                    System.out.println(editarTren());
                    break;
                case 3:
                    System.out.println(borrarTren());
                    break;
                case 4:
                    imprimirTrens();
                    break;
                case 0:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("El valor seleccionado no esta en el menu");
            }
            
            
        }while(opcion != 0);
    }
    
    private static String nuevoTren(){
        String idTren = "", tipo = "Terrestre";
        int capacidad = 0, indiceTren = obtenerIndiceTren(), vagones = 0;
        float velocidadMaxima = 0;
        double capacidadEnergetica;
        Tren nuevoTren;
        
        if(indiceTren == -1) return "No se logro insertar el tren";
        
        System.out.print("Ingrese la idTren del tren: ");
        idTren = scanner.next();
        
        System.out.print("Ingrese la vagones del tren: ");
        vagones = scanner.nextInt();
        
        System.out.print("Ingrese el velocidadMaxima del tren: ");
        velocidadMaxima = scanner.nextFloat();
        
        System.out.print("Ingrese la capacidad del tren: ");
        capacidad = scanner.nextInt();
        
        System.out.print("Ingrese la capacidad energetica: ");
        capacidadEnergetica = scanner.nextDouble();
        
        nuevoTren = new Tren(idTren, vagones, velocidadMaxima, tipo, capacidad, capacidadEnergetica);
        
        trenes[indiceTren] = nuevoTren;
        
        return "El tren se inserto con exito";
    }
    
    private static String editarTren(){
        int opcionEditar = 0, trenEditar = 0;
        
        imprimirTrens();
        
        System.out.println("SELECCIONE EL EVENTO A EDITAR");
        
        trenEditar = scanner.nextInt()-1;
        
        System.out.println("""
                           Menu Edicion 
                           1.- IdTren
                           2.- Vagones
                           3.- Velocidad Maxima
                           4.- Capacidad
                           5.- Capacidad Energetica
                           """);
        opcionEditar = scanner.nextInt();
        
        try{
            switch (opcionEditar) {
                case 1:
                    String idTren;
                    System.out.print("Ingrese la nueve idTren: ");
                    idTren = scanner.next();
                    trenes[trenEditar].setIdTren(idTren);
                    break;
                case 2:
                    int vagones;
                    System.out.print("Ingrese la nueve vagones: ");
                    vagones = scanner.nextInt();
                    trenes[trenEditar].setVagones(vagones);
                    break;
                case 3:
                    float velocidadMaxima;
                    System.out.print("Ingrese la nueve velocidadMaxima: ");
                    velocidadMaxima = scanner.nextFloat();
                    trenes[trenEditar].setVelocidadMaxima(velocidadMaxima);
                    break;
                case 4:
                    int capacidad;
                    System.out.print("Ingrese la nueve capacidad: ");
                    capacidad = scanner.nextInt();
                    trenes[trenEditar].setCapacidad(capacidad);
                    break;
                case 5:
                    double capacidadEnergetica;
                    System.out.print("Ingrese la nueve capacidadEnergetica: ");
                    capacidadEnergetica = scanner.nextDouble();
                    trenes[trenEditar].setCapacidadEnergetica(capacidadEnergetica);
                    break;
            }
            return "El tren se ha editado con exito";
        }
        catch(Exception e){
            return "El tren no se ha editado";
        }
    }
    
    private static String borrarTren(){
        try{
            int trenEliminar = 0;
        
            imprimirTrens();

            System.out.println("SELECCIONE EL EVENTO A ELIMINAR");

            trenEliminar = scanner.nextInt()-1;

            reordenarTrens(trenEliminar);

            return "El tren se ha eliminado con exito";
        }
        catch(Exception e){
            return "El tren no se ha podido eliminar";
        }
        
    }
    
    private static void reordenarTrens(int indice){
        for (int i = indice; i < (trenes.length-1); i++) {
            trenes[i] = trenes[i+1];
        }
    }
    
    private static void imprimirTrens(){
        int indiceImpresion = obtenerIndiceTren();
        if(indiceImpresion != 0){
            for (int i = 0; i < indiceImpresion; i++) {
            System.out.println("---------------Tren "+(i+1)+"---------------");
            System.out.println("IdTren: "+trenes[i].getIdTren());
            System.out.println("Vagones: "+trenes[i].getVagones());
            System.out.println("Velocidad maxima: "+trenes[i].getVelocidadMaxima());
            System.out.println("Tipo de transporte: "+trenes[i].getTipo());
            System.out.println("Capacidad: "+trenes[i].getCapacidad());
            System.out.println("Capacidad Energetica: "+trenes[i].getCapacidadEnergetica());
            }
        }else{
            System.out.println("no hay tren para mostrar");
        }
    }
    
    private static int obtenerIndiceTren(){
        for(int i = 0; i < trenes.length; i++){
            if(trenes[i] == null) return i;
        }
        return -1;
    }

}

class Transporte{
    private String tipo;
    private int capacidad;
    private double capacidadEnergetica;

    public Transporte(String tipo, int capacidad, double capacidadEnergetica) {
        this.tipo = tipo;
        this.capacidad = capacidad;
        this.capacidadEnergetica = capacidadEnergetica;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getCapacidadEnergetica() {
        return capacidadEnergetica;
    }

    public void setCapacidadEnergetica(double capacidadEnergetica) {
        this.capacidadEnergetica = capacidadEnergetica;
    }
    
    
}

class Tren extends Transporte{
    private String idTren;
    private int vagones;
    private float velocidadMaxima;

    public Tren(String idTren, int vagones, float velocidadMaxima, String tipo, int capacidad, double capacidadEnergetica) {
        super(tipo, capacidad, capacidadEnergetica);
        this.idTren = idTren;
        this.vagones = vagones;
        this.velocidadMaxima = velocidadMaxima;
    }

    public String getIdTren() {
        return idTren;
    }

    public void setIdTren(String idTren) {
        this.idTren = idTren;
    }

    public int getVagones() {
        return vagones;
    }

    public void setVagones(int vagones) {
        this.vagones = vagones;
    }

    public float getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setVelocidadMaxima(float velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }
    
    
}
