public class AplicacionBanco{
    public static void main(String []args){
        Localidad unaLocalidad = new Localidad("Goya", "Corrientes");
        Empleado empleado1 = new Empleado(267504235, "Lorena", "Perez", 121200.00,0);
        Persona persona1 = new Persona(14526387, "Gomez", "Maria Esther", 1960);
        Persona persona2 = new Persona(23145698, "Villalba", "Martin", 1972);
        CuentaBancaria cuenta1 = new CuentaBancaria(1, persona1, 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria(2, persona2, 0);
        Banco unBanco = new Banco("RIO", unaLocalidad, 3, empleado1);
        
        unBanco.agregarCuentaBancaria(cuenta1);
        unBanco.agregarCuentaBancaria(cuenta2);
        Empleado empleado2 = new Empleado(20156456, "Pedro", "Dominguez", 265000.00, 0);
        
        
        unBanco.agregarEmpleado(empleado2);
        //unBanco.mostrar();
        unBanco.mostrarResumen();
      
    }
}
