import java.util.*;

/**
 * Version 1.0: Permite conocer la edad de una persona. 
 * Version 1.1: Tambien permite saber si es su cumpleanios
 * @author Gonzalo Biancardi
 * @version 1.0 - 19/08/2025
 * @version 1.1 - 06/09/2025
 */

public class Persona
{
    private int nroDni;
    private String nombre;
    private String apellido;
    private Calendar fechaNacimiento;
    
    /**
     * Constructor con 4 parametros.
     * @param p_dni recibe el dni de la persona
     * @param p_nombre recibe el nombre de la persona
     * @param p_apellido recibe el apellido de la persona
     * @param p_anio recibe el anio de nacimiento de la persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, int p_anio){
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setAnioNacimiento(p_anio);
    }
    /**
     * Constructor con 4 parametros
     * @param p_dni recibe el dni de la persona
     * @param p_nombre recibe el nombre de la persona
     * @param p_apellido recibe el apellido de la persona
     * @param p_fecha recibe la fecha de nacimiento de la persona
     */
    public Persona(int p_dni, String p_nombre, String p_apellido, Calendar p_fecha){
        this.setDni(p_dni);
        this.setNombre(p_nombre);
        this.setApellido(p_apellido);
        this.setFechaNacimiento(p_fecha);
    }
    /**
     * Asigna p_dni al dni de la persona
     * @param int p_dni
     * @return no devuelve ningun valor
     */
    private void setDni(int p_dni){
        this.nroDni = p_dni;
    }
    
    /**
     * Retorna el numero de dni de la persona.
     * @param no recibe ningun parametro
     * @return un valor de tipo int.
     */
    public int getDni(){
        return this.nroDni;
    }
    
    /**
     * Asigna p_nombre al nombre de la persona
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Retorna el nombre de la persona
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Asigna p_apellido al apellido de la persona
     * @param p_apellido
     * @return no devuelve ningun valor
     */
    private void setApellido(String p_apellido){
        this.apellido = p_apellido;
    }
    
    /**
     * Retorna el apellido de la persona
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getApellido(){
        return this.apellido;
    }
    
    /**
     * Asigna p_anio al anio de nacimiento de la persona
     * @param p_anio
     * @retorna no devuelve ningun valor
     */
    private void setAnioNacimiento(int p_anio){
        Calendar unaFecha = Calendar.getInstance();
        unaFecha.set(p_anio, 0 , 1);
        this.setFechaNacimiento(unaFecha);
    }
    
    /**
     * Retorna el anio de nacimiento de la persona
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getAnioNacimiento(){
        return this.getFechaNacimiento().get(Calendar.YEAR);
    }
    
    /**
     * Asigna p_fecha a la fecha de nacimiento de la persona
     * @param p_fecha
     * @return no devuelve ningun valor
     */
    private void setFechaNacimiento(Calendar p_fecha){
        this.fechaNacimiento = p_fecha;
    }
    
    /**
     * Devuelve la fecha de nacimiento de la persona
     * @param no recibe ningun parametro
     * @return un valor de tipo Calendar
     */
    public Calendar getFechaNacimiento(){
        return this.fechaNacimiento;
    }
    
    /**
     * Calcula la edad de la persona
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int edad(){
        Calendar fechaHoy = new GregorianCalendar();
        int anioHoy = fechaHoy.get(Calendar.YEAR);
        return anioHoy - this.getAnioNacimiento();
    }
    
    /**
     * Concatena el nombre con el apellido
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String nomYApe(){
        return this.getNombre() + " " + this.getApellido();
    }
    
    /**
     * Concatena el apellido con el nombre
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String apeYNom(){
        return this.getApellido() + " " + this.getNombre();
    }
    
    /**
     * Muestra por pantalla los datos de la persona
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void mostrar(){
        System.out.println("Nombre y apellido: " + this.nomYApe());
        System.out.println("DNI: " + this.getDni() + "\tEdad: " + this.edad());
    }
    
    /**
     * Verifica que sea el cumpleanios del empleado
     * @param no recibe ningun parametro
     * @return un valor de tipo boolean
     */
    public boolean esCumpleanios(){
        Calendar hoy = new GregorianCalendar();
        int diaHoy = hoy.get(Calendar.DAY_OF_MONTH);
        int mesHoy = hoy.get(Calendar.MONTH);
        
        int mesNac = this.fechaNacimiento.get(Calendar.MONTH);
        int diaNac = this.fechaNacimiento.get(Calendar.DAY_OF_MONTH);

        return (mesHoy == mesNac) && (diaHoy == diaNac);
    }
}
