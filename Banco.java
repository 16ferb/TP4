import java.util.*;

public class Banco{
    private String nombre;
    private int nroSucursal;
    private ArrayList<Empleado> empleados;
    private Localidad localidad;
    private ArrayList<CuentaBancaria> cuentasBancarias;
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleado){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<>(p_empleado));
        this.setCuentasBancarias(new ArrayList<>());
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, Empleado p_empleados){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<>());
        this.agregarEmpleado(p_empleados);
        this.setCuentasBancarias(new ArrayList<>());
    }
    
    public Banco(String p_nombre, Localidad p_localidad, int p_nroSucursal, ArrayList<Empleado> p_empleado, ArrayList<CuentaBancaria> p_cuentas){
        this.setNombre(p_nombre);
        this.setLocalidad(p_localidad);
        this.setNroSucursal(p_nroSucursal);
        this.setEmpleados(new ArrayList<>(p_empleado));
        this.setCuentasBancarias(new ArrayList<>(p_cuentas));
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
    
    private void setCuentasBancarias(ArrayList<CuentaBancaria> p_cuentas){
        this.cuentasBancarias = p_cuentas;
    }
    
    public ArrayList getCuentasBancarias(){
        return this.cuentasBancarias;
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
    
    public boolean agregarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentasBancarias().add(p_cuenta);
    }
    
    public boolean quitarCuentaBancaria(CuentaBancaria p_cuenta){
        return this.getCuentasBancarias().remove(p_cuenta);
    }
    
    public void listarCuentasConSaldoCero(){
        int totalCuentasSaldoCero = 0;
        for(int i=0; i < cuentasBancarias.size(); i++){
            CuentaBancaria unaCuenta = cuentasBancarias.get(i);
            if(unaCuenta.getSaldo() == 0){
                System.out.println(unaCuenta.getNroCuenta() + "\t" + unaCuenta.getTitular().nomYApe());
                totalCuentasSaldoCero += 1;
            }
        }
    }
    
    public HashSet<Persona> listaDeTitulares(){
        HashSet<Persona> listaTitulares = new HashSet<>();
        for(int i = 0; i < cuentasBancarias.size(); i++){
            CuentaBancaria unaCuenta = cuentasBancarias.get(i);
            Persona unTitular = unaCuenta.getTitular();
            listaTitulares.add(unTitular);
        }
        return listaTitulares;
    }
    
    private int cuentasSaldoActivo(){
        int totalCuentasActivas = 0;
        for(int i = 0; i < cuentasBancarias.size(); i++){
            CuentaBancaria unaCuenta = cuentasBancarias.get(i);
            if(unaCuenta.getSaldo() > 0){
                totalCuentasActivas += 1;
            }
        }
        return totalCuentasActivas;
    }
    
    public void mostrarResumen(){
        System.out.println("Banco: " + this.getNombre() + " - Sucursal: " + this.getNroSucursal());
        System.out.println("Localidad: " + this.getLocalidad().getNombre() + "\tProvincia:" + this.getLocalidad().getProvincia());
        System.out.println("***********************************************************************");
        System.out.println("RESUMEN DE CUENTAS BANCARIAS");
        System.out.println("***********************************************************************");
        System.out.println("Numero total de Cuentas Bancarias: ");
        System.out.println("Cuentas activas: " + this.cuentasSaldoActivo());
        System.out.println("Cuentas saldo cero: ");
        System.out.println("------------------------------------------------------------------------");
        System.out.println("Cuentas sin saldo:");
        System.out.println("---Cuenta------------------Apellido y Nombre----------------------------");
        this.listarCuentasConSaldoCero();
        System.out.println("------------------------------------------------------------------------");
        System.out.print("Listado de clientes:");
        HashSet<Persona> titulares = listaDeTitulares();
        for(Persona unTitular : titulares){
            System.out.print(" " + unTitular.apeYNom() + ";");
        }
        }
}
