import java.util.*;

public class GestionComercio{
    public static void main(String []args){
        HashMap<Long, Empleado> empleadosInscribir = new HashMap<>();
        Empleado empleado1 = new Empleado(30100623, "Juan", "Gonzalez", 100200.00, 1998);
        Empleado empleado2 = new Empleado(37045987, "Mercedes", "Martinez", 100000.00, 2003);
        Empleado empleado3 = new Empleado(32550096, "Virginia", "Gomez", 150000.00, 1993);
        
        empleadosInscribir.put(empleado1.getCuil(), empleado1);
        empleadosInscribir.put(empleado2.getCuil(), empleado2);
        empleadosInscribir.put(empleado3.getCuil(), empleado3);
        
        Comercio unComercio = new Comercio("Avanti SRL", empleadosInscribir);
        
        unComercio.nomina();
        
        unComercio.bajaEmpleado(empleado2);
        unComercio.nomina();
    }
}
