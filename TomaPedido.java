import java.util.*;

public class TomaPedido
{
    public static void main(String[]args){
        
        Calendar fecha = Calendar.getInstance();
        Laboratorio unLaboratorio = new Laboratorio("Colgate SA", "Scalabrini Ortiz 5234", "54-11-321654");
        Cliente unCliente = new Cliente(35123456, "Juan", "Perez", 100.0);
        Producto producto1 = new Producto(101, "Perfumeria", "Perfume 1", 200, 0.0, 0, unLaboratorio);
        Producto producto2 = new Producto(102, "Perfumeria", "Perfume 2", 250, 0.0, 0, unLaboratorio);
        
        
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        
        Pedido pedido1 = new Pedido(fecha, unCliente, productos);
        
        pedido1.mostrarPedido();
        
    }
}
