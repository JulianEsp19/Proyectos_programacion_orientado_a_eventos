package practica1;

import java.util.Scanner;

public class Practica{
    
    private static final Evento eventos[] = new Evento[20];
    private static final Scanner scanner = new Scanner(System.in);
        
    public static void main(String[] args) {
      
        int opcion = 0;
        
        do{
            
            System.out.println("""
                               ----------Menu-------------
                               1.-Nuevo evento 
                               2.-Editar evento
                               3.-Borrar evento
                               4.-Imprimir eventos
                               0.-Salir
                               """);
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1:
                    System.out.println(nuevoEvento());
                    break;
                case 2:
                    System.out.println(editarEvento());
                    break;
                case 3:
                    System.out.println(borrarEvento());
                    break;
                case 4:
                    imprimirEventos();
                    break;
                case 0:
                    System.out.println("Saliendo....");
                    break;
                default:
                    System.out.println("El valor seleccionado no esta en el menu");
            }
            
            
        }while(opcion != 0);
    }
    
    private static String nuevoEvento(){
        String fecha = "", hora = "", lugar = "";
        int capacidad = 0, indiceEvento = obtenerIndiceEvento();
        double costoBoleto;
        Evento nuevoEvento;
        
        if(indiceEvento == -1) return "No se logro insertar el evento";
        
        System.out.print("Ingrese la fecha del evento: ");
        fecha = scanner.next();
        
        System.out.print("Ingrese la hora del evento: ");
        hora = scanner.next();
        
        System.out.print("Ingrese el lugar del evento: ");
        lugar = scanner.next();
        
        System.out.print("Ingrese la capacidad del evento: ");
        capacidad = scanner.nextInt();
        
        System.out.print("Ingrese el costo del boleto: ");
        costoBoleto = scanner.nextDouble();
        
        nuevoEvento = new Evento(fecha, hora, lugar, capacidad, costoBoleto);
        
        eventos[indiceEvento] = nuevoEvento;
        
        return "El evento se inserto con exito";
    }
    
    private static String editarEvento(){
        int opcionEditar = 0, eventoEditar = 0;
        
        imprimirEventos();
        
        System.out.println("SELECCIONE EL EVENTO A EDITAR");
        
        eventoEditar = scanner.nextInt()-1;
        
        System.out.println("""
                           Menu Edicion 
                           1.- Fecha
                           2.- Hora
                           3.- Lugar
                           4.- Capacidad
                           5.- Costo Boleto
                           """);
        opcionEditar = scanner.nextInt();
        
        try{
            switch (opcionEditar) {
                case 1:
                    String fecha;
                    System.out.print("Ingrese la nueve fecha: ");
                    fecha = scanner.next();
                    eventos[eventoEditar].setFecha(fecha);
                    break;
                case 2:
                    String hora;
                    System.out.print("Ingrese la nueve hora: ");
                    hora = scanner.next();
                    eventos[eventoEditar].setHora(hora);
                    break;
                case 3:
                    String lugar;
                    System.out.print("Ingrese la nueve lugar: ");
                    lugar = scanner.next();
                    eventos[eventoEditar].setLugar(lugar);
                    break;
                case 4:
                    int capacidad;
                    System.out.print("Ingrese la nueve capacidad: ");
                    capacidad = scanner.nextInt();
                    eventos[eventoEditar].setCapacidad(capacidad);
                    break;
                case 5:
                    double costoBoleto;
                    System.out.print("Ingrese la nueve costoBoleto: ");
                    costoBoleto = scanner.nextDouble();
                    eventos[eventoEditar].setCostoBoleto(costoBoleto);
                    break;
            }
            return "El evento se ha editado con exito";
        }
        catch(Exception e){
            return "El evento no se ha editado";
        }
    }
    
    private static String borrarEvento(){
        try{
            int eventoEliminar = 0;
        
            imprimirEventos();

            System.out.println("SELECCIONE EL EVENTO A ELIMINAR");

            eventoEliminar = scanner.nextInt()-1;

            reordenarEventos(eventoEliminar);

            return "El evento se ha eliminado con exito";
        }
        catch(Exception e){
            return "El evento no se ha podido eliminar";
        }
        
    }
    
    private static void reordenarEventos(int indice){
        for (int i = indice; i < (eventos.length-1); i++) {
            eventos[i] = eventos[i+1];
        }
    }
    
    private static void imprimirEventos(){
        int indiceImpresion = obtenerIndiceEvento();
        if(indiceImpresion != 0){
            for (int i = 0; i < indiceImpresion; i++) {
            System.out.println("---------------Evento "+(i+1)+"---------------");
            System.out.println("Fecha: "+eventos[i].getFecha());
            System.out.println("Hora: "+eventos[i].getHora());
            System.out.println("Lugar: "+eventos[i].getLugar());
            System.out.println("Capacidad: "+eventos[i].getCapacidad());
            System.out.println("Costo Boleto: "+eventos[i].getCostoBoleto());
            }
        }else{
            System.out.println("no hay evento para mostrar");
        }
    }
    
    private static int obtenerIndiceEvento(){
        for(int i = 0; i < eventos.length; i++){
            if(eventos[i] == null) return i;
        }
        return -1;
    }

}

class Evento{
    private String fecha;
    private String hora;
    private String lugar;
    private int capacidad;
    private double costoBoleto;

    public Evento(String fecha, String hora, String lugar, int capacidad, double costoBoleto) {
        this.fecha = fecha;
        this.hora = hora;
        this.lugar = lugar;
        this.capacidad = capacidad;
        this.costoBoleto = costoBoleto;
    }

    public Evento() {
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public double getCostoBoleto() {
        return costoBoleto;
    }

    public void setCostoBoleto(double costoBoleto) {
        this.costoBoleto = costoBoleto;
    }
}