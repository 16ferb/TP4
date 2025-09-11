public class AplicacionBanco{
    public static void main(String []args){
        Localidad unaLocalidad = new Localidad("Goya", "Corrientes");
        Empleado empleado1 = new Empleado(267504235, "Lorena", "Perez", 121200.00,0);
        Banco unBanco = new Banco("RIO", unaLocalidad, 3, empleado1);
        
        Empleado empleado2 = new Empleado(20156456, "Pedro", "Dominguez", 265000.00, 0);
        
        
        unBanco.agregarEmpleado(empleado2);
        unBanco.mostrar();
        
        unBanco.quitarEmpleado(empleado1);
        unBanco.mostrar();
        
        unBanco.quitarEmpleado(empleado2);
        unBanco.mostrar();
    }
}
