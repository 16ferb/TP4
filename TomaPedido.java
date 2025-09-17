import java.util.*;

public class TomaPedido
{
    public static void main(String[]args){
        Scanner texto = new Scanner(System.in);
        Calendar fecha = Calendar.getInstance();
        Laboratorio unLaboratorio = new Laboratorio("Colgate SA", "Scalabrini Ortiz 5234", "54-11-321654");
        ArrayList productos = new ArrayList();
        Cliente unCliente = new Cliente(35123456, "Juan", "Perez", 100.0);
        Pedido unPedido = new Pedido(fecha, unCliente, productos);

        int opcion;
        
        do{
            System.out.println("\n*** Menu Pedidos ***");
            System.out.println("1. Agregar producto");
            System.out.println("2. Quitar producto");
            System.out.println("3. Listar productos");
            System.out.println("4. Emitir detalle del pedido");
            System.out.println("5. Finalizar");
            opcion = texto.nextInt();
            
            switch(opcion){
                case 1:
                    char continuar = 's';
                    do{
                        System.out.println("Ingresar codigo del producto:");
                        int codigoProducto = texto.nextInt();
                        System.out.println("Ingrese el nombre del producto:");
                        String nombreProducto = texto.next();
                        System.out.println("Ingrese el precio del producto:");
                        double precioProducto = texto.nextDouble();
                        Producto nuevoProducto = new Producto(codigoProducto, "Rubro", nombreProducto, precioProducto,0, 0, unLaboratorio);
                        unPedido.agregarProducto(nuevoProducto);
                        System.out.println("Desea agregar otro producto? (s/n)");
                        continuar = texto.next().charAt(0);
                    }while(continuar == 's' || continuar == 'S');
                    
                    break;
                    
                case 2:
                    
                    if(unPedido.getProductos().size() > 1){
                        System.out.println("\nIngrese el codigo del producto a eliminar:");
                        int codigoAEliminar = texto.nextInt();
                    
                        Producto productoEncontrado = null;
                    
                        for (Object obj : unPedido.getProductos()){
                            Producto borrarProducto = (Producto) obj;
                        
                            if(borrarProducto.getCodigo() == codigoAEliminar){
                                productoEncontrado = borrarProducto;
                                break;
                            }
                        }
                    
                        if(productoEncontrado != null){
                            unPedido.quitarProducto(productoEncontrado);
                            System.out.println("*** Producto borrado ***");
                        } else {
                            System.out.println("*** No se encontro un producto con ese codigo ***");
                        }
                    } else{
                        System.out.println("*** No se puede quitar el ultimo producto ***");
                    }
                    
                    
                    break;
                    
                    
                case 3:
                    unPedido.mostrarPedido();
                    
                    break;
                    
                case 4:
                    unPedido.mostrarPedido();
                    opcion = 5;
                    
                    break;
                    
                case 5:
                    System.out.println("*** Pedido finalizado ***");
                    
                    opcion = 5;
                    break;
                default:
                    System.out.println("Ingreso incorrecto, intente nuevamente.");
                    
                    break;
            }
            
        }while(opcion != 5);
        /*
        Calendar fecha = Calendar.getInstance();
        Laboratorio unLaboratorio = new Laboratorio("Colgate SA", "Scalabrini Ortiz 5234", "54-11-321654");
        Cliente unCliente = new Cliente(35123456, "Juan", "Perez", 100.0);
        Producto producto1 = new Producto(101, "Perfumeria", "Pendrive", 10800, 0.0, 0, unLaboratorio);
        Producto producto2 = new Producto(102, "Libreria", "Libro-POO", 10450, 0.0, 0, unLaboratorio);
        Producto producto3 = new Producto(102, "Libreria", "Revista-user", 5830, 0.0, 0, unLaboratorio);
        
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(producto1);
        productos.add(producto2);
        productos.add(producto3);
        
        Pedido pedido1 = new Pedido(fecha, unCliente, productos);
        
        pedido1.mostrarPedido();
        */
    }
}
