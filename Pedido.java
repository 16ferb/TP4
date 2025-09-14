import java.util.*;
import java.text.*;

public class Pedido{
        private Calendar fecha;
        private Cliente cliente;
        private ArrayList productos;
        
        public Pedido(Calendar p_fecha, Cliente p_cliente, ArrayList p_productos){
            this.setFecha(p_fecha);
            this.setCliente(p_cliente);
            this.setProductos(new ArrayList<>(p_productos));
        }
        
        public Pedido(Calendar p_fecha, Cliente p_cliente, Producto p_producto){
            this.setFecha(p_fecha);
            this.setCliente(p_cliente);
            this.setProductos(new ArrayList<>());
            this.agregarProducto(p_producto);
        }
        
        private void setFecha(Calendar p_fecha){
            this.fecha = p_fecha;
        }
        
        public Calendar getFecha(){
            return this.fecha;
        }
        
        private void setCliente(Cliente p_cliente){
            this.cliente = p_cliente;
        }
        
        public Cliente getCliente(){
            return this.cliente;
        }
        
        private void setProductos(ArrayList p_productos){
            this.productos = p_productos;
        }
        
        public ArrayList getProductos(){
            return this.productos;
        }
        
        public double totalAlContado(){
            double total = 0.0;
            for(int i = 0; i < productos.size() ; i++){
                Producto unProducto = (Producto) productos.get(i);
                total += unProducto.precioContado();
            }
            return total;
        }
        
        public double totalFinanciado(){
            double total = 0.0;
            for(int i = 0; i < productos.size() ; i++){
                Producto unProducto = (Producto) productos.get(i);
                total += unProducto.precioLista();
            }
            return total;
        }
        
        public boolean agregarProducto(Producto p_producto){
            return this.getProductos().add(p_producto);
        }
        
        public boolean quitarProducto(Producto p_producto){
            return this.getProductos().remove(p_producto);
        }
        
        public void mostrarPedido(){
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy");
            String fechaFormateada = formatoFecha.format(this.fecha.getTime());
            System.out.println("***** Detalle del pedido ***** Fecha: " + fechaFormateada);
            System.out.println("Producto\t Precio Lista\t Precio Contado");
            System.out.println("---------------------------------------------");
            for(Object obj : this.productos){
                Producto producto = (Producto) obj;
                System.out.println(producto.getDescripcion() + "\t" + producto.precioLista() + "\t" + producto.precioContado());
            }
            System.out.println("-----------------------------------------------");
            System.out.println("*** Total ----- " + this.totalFinanciado() + "\t" + this.totalAlContado());
        }
}
