import java.util.*;

/**
 * Version 1.0: Permite calcular la liquidacion de sueldos de los empleados
 * Version 1.1: Tambien, conoce si el empleado cumple un anio mas en la empresa
 * @author Gonzalo Biancardi
 * @version 1.0 - 19/08/2025
 * @version 1.1 - 06/09/2025
 */
public class Empleado
{
    private long cuil;
    private String apellido;
    private String nombre;
    private double sueldoBasico;
    private Calendar fechaIngreso;
    
    /**
     * Constructor con 5 parametros
     * @param p_cuil recibe el cuil del empleado
     * @param p_nombre recibe el nombre del empleado
     * @param p_apellido recibe el apellido del empleado
     * @param p_importe recibe el sueldo basico del empleado
     * @param p_anio recibe el anio de ingreso del empleado
     */
    public Empleado(long p_cuil, String p_nombre, String p_apellido, double p_importe, int p_anio){
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setAnioIngreso(p_anio);
    }
    
    /**
     * Constructor con 5 parametros
     * @param p_cuil recibe el cuil del empleado
     * @param p_nombre recibe el nombre del empleado
     * @param p_apellido recibe el apellido del empleado
     * @param p_importe recibe el sueldo basico del empleado
     * @param p_fecha recibe la fecha de ingreso del empleado
     */
    public Empleado(long p_cuil, String p_nombre, String p_apellido, double p_importe, Calendar p_fecha){
        this.setCuil(p_cuil);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setSueldoBasico(p_importe);
        this.setFechaIngreso(p_fecha);
    }
    
    /**
     * Asigna p_cuil al cuil del empleado
     * @param p_cuil
     * @return no devuelve ningun valor
     */
    private void setCuil(long p_cuil){
        this.cuil = p_cuil;
    }
    
    /**
     * Devuelve el cuil del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo long
     */
    public long getCuil(){
        return this.cuil;
    }
    
    /**
     * Asigna p_apellido al apellido del empleado
     * @param p_apellido
     * @return no devuelve ningun valor
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Devuelve el apellido del empleado
     * @param no recibe ningun porametro
     * @return un valor de tipo String
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Asigna p_nombre al nombre del empleado
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Devuelve el nombre del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Asigna p_importe al sueldo basico del empleado
     * @param p_importe
     * @return no devuelve ningun valor
     */
    private void setSueldoBasico(double p_importe){
        this.sueldoBasico = p_importe;
    }
    
    /**
     * Devuelve el sueldo basico del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double getSueldoBasico(){
        return this.sueldoBasico;
    }
    
    /**
     * Asigna p_anio al anio de ingreso del empleado
     * @param p_anio
     * @return no devuelve ningun valor
     */
    private void setAnioIngreso(int p_anio){
        Calendar unaFecha = Calendar.getInstance();
        unaFecha.set(p_anio, 0 , 1);
        this.setFechaIngreso(unaFecha);
    }
    
    /**
     * Devuelve el anio del ingreso del empleado
     * @param no recibe ningun paramtro
     * @return un valor de tipo int
     */
    public int getAnioIngreso(){
        return this.getFechaIngreso().get(Calendar.YEAR);
    }
    
    /**
     * Asigna p_fecha a la fecha de ingreso del empleado
     * @param p_fecha
     * @return no devuelve ningun valor
     */
    private void setFechaIngreso(Calendar p_fecha){
        this.fechaIngreso = p_fecha;
    }
    
    /**
     * Devuelve la fecha de ingreso del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo Calendar
     */
    public Calendar getFechaIngreso(){
        return this.fechaIngreso;
    }
    
    /**
     * Calcula la antiguedad del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public int antiguedad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioIngreso();
    }
    
    /**
     * Calcula el descuento que se le aplica al sueldo basico del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    private double descuento(){
        return ((this.getSueldoBasico() * 0.02) + 1500);
    }
    
    /**
     * Calcula el adicional que le corresponde al empleado de acuerdo a su antiguedad
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    private double adicional(){
        if(this.antiguedad() < 2){
            return (this.getSueldoBasico() * 0.02);
        } if (this.antiguedad() >= 2 && this.antiguedad() < 10){
            return (this.getSueldoBasico() * 0.04);
        } else {
            return (this.getSueldoBasico() * 0.06);
        }
    }
    
    /**
     * Calcula el sueldo neto del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double sueldoNeto(){
        return this.getSueldoBasico() + this.adicional() - this.descuento();
    }
    
    /**
     * Concatena el nombre con el apellido del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Concatena el apellido con el nombre del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Muestra por pantalla los datos y sueldo del empleado
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void mostrar(){
        System.out.println("\nNombre y apellido: " + this.nomYApe());
        System.out.println("CUIL:" + this.getCuil() + "\tAntiguedad: " + this.antiguedad() + " anios de servicio");
        System.out.println("Sueldo neto: $" + this.sueldoNeto());
    }
    
    /**
     * Muestra una linea con datos y sueldo del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String mostrarLinea(){
        return "\n" + this.getCuil() + "\t" + this.apeYNom() + " ........... " + "$" + this.sueldoNeto();
    }
    
    /**
     * Verifica si el empleado cumple un anio mas en la empresa
     * @param no recibe ningun parametro
     * @return un valor de tipo boolean
     */
    public boolean esAniversario(){
        Calendar hoy = new GregorianCalendar();
        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
        int mesHoy = hoy.get(Calendar.MONTH);
        
        int diaIngreso = this.fechaIngreso.get(Calendar.DAY_OF_MONTH);
        int mesIngreso = this.fechaIngreso.get(Calendar.MONTH);
        return ((diaHoy == diaIngreso) && (mesHoy == mesIngreso));
    }
}
