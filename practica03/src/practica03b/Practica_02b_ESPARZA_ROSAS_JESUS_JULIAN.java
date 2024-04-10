package practica03b;

import java.util.Scanner;

public class Practica_02b_ESPARZA_ROSAS_JESUS_JULIAN {
    
    private static Cirujano cirujanos[] = new Cirujano[20];
    private static int indiceCirujanos = 0;
    private static Scanner scanner = new Scanner(System.in);
    
    public static void main(String[] args) {
        int opcion = 0;
        
        inicializar();
        
        do {
            System.out.println("""
                               ---------------MENU---------------
                               1.-Registrar un nuevo cirujano
                               2.-Buscar cirujano
                               3.-Consultar cirujano
                               4.-Eliminar cirujano
                               0.-Salir
                               """);
            
            opcion = scanner.nextInt();
            
            switch (opcion) {
                case 1 -> registrarCirujano();
                case 2 -> buscarCirujano();
                case 3 -> consultarCirujanos();
                case 4 -> eliminarCirujano();
                case 0-> System.out.println("Saliendo ...");
                default -> System.out.println("la opcion seleccionada no es valida");
            }
            
        } while (opcion != 0);
    }
    
    private static void inicializar(){
        for (int i = 0; i < 20; i++) {
            cirujanos[i] = new Cirujano();
        }
    }
    
    private static void registrarCirujano(){
        if (indiceCirujanos < 20) {
            String nombre;
            String especialidad;
            int experiencia;
            String tipoCirujano;
            int numCirujias;
            String hospitalTrabajo;

            System.out.print("Ingrese el nombre del cirujano: ");
            nombre = scanner.next();

            System.out.print("Ingrese la especialidad del cirujano: ");
            especialidad = scanner.next();
            
            System.out.print("Ingrese los anos de experiencia del cirujano: ");
            experiencia = scanner.nextInt();
            
            System.out.print("Ingrese el tipo de cirujano: ");
            tipoCirujano = scanner.next();
            
            System.out.print("Ingrese el numero de cirujias que ha tenido el cirujano: ");
            numCirujias = scanner.nextInt();
            
            System.out.print("Ingrese el hospital en el que trabaja: ");
            hospitalTrabajo = scanner.next();

            cirujanos[indiceCirujanos].setNombre(nombre);
            cirujanos[indiceCirujanos].setEspecialidad(especialidad);        
            cirujanos[indiceCirujanos].setTipoCirujano(tipoCirujano);
            cirujanos[indiceCirujanos].setExperiencia(experiencia);
            cirujanos[indiceCirujanos].setNumCirujias(numCirujias);
            cirujanos[indiceCirujanos].setHospitalTrabajo(hospitalTrabajo);
            
            indiceCirujanos++;
        }else{
            System.out.println("se ha superado el limite de cirujanos");
        }
    }
    
    private static void buscarCirujano(){
        if (estaVacio()) System.out.println("No hay cirujanos para buscar");
        else{
            String nombre; 
            boolean exitoso = false;
        
            System.out.print("Ingrese el nombre del cirujano a buscar: ");
            nombre = scanner.next();
            
            for(Cirujano cirujano: cirujanos) {
                if (cirujano.getNombre().equals(nombre)) {
                    System.out.println("Se a encontrado una coincidencia");
                    System.out.println("Especialidad: " + cirujano.getEspecialidad());
                    System.out.println("Anos de experiencia: " + cirujano.getExperiencia());
                    System.out.println("Tipo de cirujano: " + cirujano.getTipoCirujano());
                    System.out.println("Numero de cirujias: " + cirujano.getNumCirujias());
                    System.out.println("Hospital en el que trabaja: " + cirujano.getHospitalTrabajo());
                    exitoso = true;
                    break;
                }
            }
            if (!exitoso) System.out.println("no se ha encotrado ninguna coincidencia");
        }
    }
    
    private static void consultarCirujanos(){
        if (estaVacio()) System.out.println("No hay cirujanos para consultar");
        else{
            for (int i = 0; i < indiceCirujanos; i++) {
                System.out.println("-----Cirujano "+i+"-----");
                System.out.println("Nombre: " + cirujanos[i].getNombre());
                System.out.println("Especialidad: " + cirujanos[i].getEspecialidad());
                System.out.println("Anos de experiencia: " + cirujanos[i].getExperiencia());
                System.out.println("Tipo de cirujano: " + cirujanos[i].getTipoCirujano());
                System.out.println("Numero de cirujias: " + cirujanos[i].getNumCirujias());
                System.out.println("Hospital en el que trabaja: " + cirujanos[i].getHospitalTrabajo());
            }
        }
    }
    
    private static void eliminarCirujano(){
        if(estaVacio()) System.out.println("No hay cirujanos para eliminar");
        else{
            String nombre;
            int indiceCirujano = 0;
            
            System.out.print("Ingrese el nombre del cirujano a eliminar: ");
            nombre = scanner.next();
            
            indiceCirujano = indiceCirujano(nombre);
            
            if(indiceCirujano >= 0){
                for(int i = indiceCirujano; i<(indiceCirujanos-1); i++){
                    cirujanos[i] = cirujanos[i+1];
                }
                indiceCirujanos --;
            }else System.out.print("No se ha encontrado el nombre del cirujano");
        }
    }
    
    private static int indiceCirujano(String nombre){
        for (int i = 0; i < indiceCirujanos; i++) {
            if (cirujanos[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
    
    private static boolean estaVacio(){
        return (indiceCirujanos <= 0);
    }
}
