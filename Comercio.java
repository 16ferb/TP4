import java.util.*;

public class Comercio{
    private String nombre;
    private HashMap<Long, Empleado> empleados;
    
    public Comercio(String p_nombre){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<>());
    }
    
    public Comercio(String p_nombre, HashMap p_empleados){
        this.setNombre(p_nombre);
        this.setEmpleados(new HashMap<>(p_empleados));
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setEmpleados(HashMap<Long, Empleado> p_empleados){
        this.empleados = p_empleados;
    }
    
    public HashMap<Long, Empleado> getEmpleados(){
        return this.empleados;
    }
    
    public void altaEmpleado(Empleado p_empleado){
        this.getEmpleados().put(p_empleado.getCuil(), p_empleado);
    }
    
    public void bajaEmpleado(Empleado p_empleado){
        this.getEmpleados().remove(p_empleado.getCuil(), p_empleado);
    }
    
    public int cantidadEmpleados(){
        return this.getEmpleados().size();
    }
    
    public boolean esEmpleado(long p_cuil){
        return this.getEmpleados().containsKey(p_cuil);
    }
    
    public Empleado buscarEmpleado(long p_cuil){
        return this.getEmpleados().get(p_cuil);
    }
    
    public void sueldoNeto(long p_cuil){
        Empleado empleadoEncontrado = this.getEmpleados().get(p_cuil);
        
        if(empleadoEncontrado != null){
            System.out.println("Sueldo neto, CUIL " + p_cuil + ": " + empleadoEncontrado.sueldoNeto());
        } else {
            System.out.println("***Empleado no encontrado con ese CUIL***");
        }
    }
    
    public void nomina(){
        System.out.println("*** Nomina de empleados de Avanti SRL ***");
        for(Empleado unEmpleado : this.getEmpleados().values()){
            System.out.println(unEmpleado.getCuil() + " " + unEmpleado.apeYNom() + "---------$" + unEmpleado.sueldoNeto());
        }
    }
}
