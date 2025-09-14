import java.util.*;
public class AplicacionBanco{
    public static void main(String []args){
        ArrayList<Empleado> listaEmpleados = new ArrayList<Empleado>();
        ArrayList<CuentaBancaria> listaCuentas = new ArrayList<CuentaBancaria>();
        
        Localidad unaLocalidad = new Localidad("Goya", "Corrientes");
        Empleado empleado1 = new Empleado(267504235, "Lorena", "Perez", 121200.00,0);
        Persona persona1 = new Persona(14526387, "Gomez", "Maria Esther", 1960);
        Persona persona2 = new Persona(23145698, "Villalba", "Martin", 1972);
        Persona persona3 = new Persona(78945655, "Zalazar", "Maxi", 1988);
        Persona persona4 = new Persona(12457889, "Garcia", "Agustina", 1978);
        Persona persona5 = new Persona(65432111, "Messi", "Lionel", 1998);
        
        CuentaBancaria cuenta1 = new CuentaBancaria(1, persona1, 1000);
        CuentaBancaria cuenta2 = new CuentaBancaria(2, persona2, 0);
        CuentaBancaria cuenta3 = new CuentaBancaria(3, persona3, 500);
        CuentaBancaria cuenta4 = new CuentaBancaria(4, persona4, 7700);
        CuentaBancaria cuenta5 = new CuentaBancaria(5, persona5, 0);
        
        listaEmpleados.add(empleado1);
        listaCuentas.add(cuenta1);
        listaCuentas.add(cuenta2);
        listaCuentas.add(cuenta3);
        listaCuentas.add(cuenta4);
        listaCuentas.add(cuenta5);
        
        Banco unBanco = new Banco("RIO", unaLocalidad, 3, listaEmpleados, listaCuentas);
        
        Empleado empleado2 = new Empleado(20156456, "Pedro", "Dominguez", 265000.00, 0);
        
        
        unBanco.agregarEmpleado(empleado2);
        //unBanco.mostrar();
        unBanco.mostrarResumen();
      
    }
}
