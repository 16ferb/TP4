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
        this.setEmpleado(new ArrayList<>(p_empleado));
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleado(new ArrayList<>());
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
    
    private void setEmpleado(ArrayList<Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    public ArrayList<Empleado> getEmpleado(){
        return this.empleados;
    }
    
    public boolean agregarEmpleado(Empleado p_empleado){
        return this.getEmpleado().add(p_empleado);
    }
    
    public boolean quitarEmpleado(Empleado p_empleado){
        return this.getEmpleado().remove(p_empleado);
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
        System.out.println("Localidad: " + getLocalidad().getNombre() + "\tProvincia: " + getLocalidad().getProvincia());
        this.listarSueldos();
        System.out.println("\nTotal a Pagar------------------------- $" + this.sueldoAPagar());
    }
}