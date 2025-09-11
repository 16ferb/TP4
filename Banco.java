import java.util.*;

public class Banco{
    private String nombre;
    private int nroSucursal;
    private ArrayList<Empleado> empleados;
    private Localidad localidad;
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<>(p_empleado));
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<>());
        this.agregarEmpleado(p_empleados);
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setNroSucursal(int p_nroSucursal){
        this.nroSucursal = p_nroSucursal;
    }
    
    public int getNroSucursal(){
        return this.nroSucursal;
    }
    
    private void setLocalidad(Localidad p_localidad){
        this.localidad = p_localidad;
    }
    
    public Localidad getLocalidad(){
        return this.localidad;
    }
    
    private void setEmpleados(ArrayList<Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    public ArrayList<Empleado> getEmpleados(){
        return this.empleados;
    }
    
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleados().add(p_empleado);
    }
    
    public boolean quitarEmpleado(Empleado p_empleado){
        if(this.getEmpleados().size() > 1){
            return this.getEmpleados().remove(p_empleado);
        } else {
            System.out.println("**No se puede quitar el ultimo empleado**");
            return false;
        }
    }
    
    public void listarSueldos(){
        for(int i = 0; i < empleados.size(); i++){
            Empleado unEmpleado = empleados.get(i);
            System.out.println(unEmpleado.getCuil() + "  " + unEmpleado.apeYNom() + "...........................................$" + unEmpleado.sueldoNeto());
        }
    }
    
    public double sueldoAPagar(){
        double totalSueldos = 0.0;
        for(int i=0; i < empleados.size(); i++){
            Empleado unEmpleado = empleados.get(i);
            totalSueldos += unEmpleado.sueldoNeto();
        }
        return totalSueldos;
    }
    
    public void mostrar(){
        System.out.println("Banco: " + this.getNombre() + "\tSucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + getLocalidad().getNombre() + "\tProvincia: " + getLocalidad().getProvincia() + "\n");
        this.listarSueldos();
        System.out.println("\nTotal a Pagar------------------------- $" + this.sueldoAPagar() + "\n");
    }
}