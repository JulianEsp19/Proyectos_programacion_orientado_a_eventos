package examen2;

import java.awt.Component;
import javax.swing.JOptionPane;

public class Lista {
    private Nodo inicio;

    public Lista() {
        this.inicio = null;
    }
    
    public boolean estaVacio(){
        return inicio == null;
    }
    
    public void agregar(Component parentComponent){
            int codigoProducto, cantidadDisponible;
            String nombreProducto, fechaUltimoPedido;
            float precioUnitario;
        try{
            codigoProducto = Integer.parseInt(JOptionPane.showInputDialog(parentComponent, "Ingrese el codigo de producto \n Los codigos son enteros y de 5 digitos"));
            nombreProducto = JOptionPane.showInputDialog(parentComponent, "Ingrese el nombre del producto");
            cantidadDisponible = Integer.parseInt(JOptionPane.showInputDialog(parentComponent, "Ingrese la cantidad disponible"));
            precioUnitario = Float.parseFloat(JOptionPane.showInputDialog(parentComponent, "Ingrese el precion unitario del producto"));
            fechaUltimoPedido = JOptionPane.showInputDialog(parentComponent, "Ingrese la fecha del ultimo pedido", "mm/dd/aaaa");
            
            Nodo temporal = new Nodo(codigoProducto, nombreProducto, cantidadDisponible, precioUnitario, fechaUltimoPedido);
            if(estaVacio()) inicio = temporal;
            else{
                temporal.setSiguiente(inicio);
                inicio = temporal;
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(parentComponent,  
                "No se ha podido completar el registro", 
                "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public String buscar(Component parentComponent, int codigoProducto){
        String resultado = "";
        Nodo temporal = inicio;
        while (temporal != null) {
            if(codigoProducto == temporal.getCodigoProducto()){
                resultado += "Codigo de producto: " + codigoProducto + "\n" +
                        "Nombre del producto: " + temporal.getNombreProducto() + "\n" +
                        "Cantidad disponible: " + temporal.getCantidadDisponible() + "\n" +
                        "Precio unitario: " + temporal.getPrecioUnitario() + "\n" +
                        "Fecha del ultimo pedido: " + temporal.getFechaUltimoPedido();
                return resultado;
            }
            
            temporal = temporal.getSiguiente();
        }
        JOptionPane.showMessageDialog(parentComponent,  
                "No se ha podido encontrar el producto", 
                "Advertencia", 
                JOptionPane.WARNING_MESSAGE);
        return resultado;
    }
    
}
