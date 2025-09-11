/**
 * Permite conocer donde nacio y donde vive el paciente
 * @author Gonzalo Biancardi
 * @version 1.0 - 06/09/2025
 */
public class Localidad
{
    private String nombre;
    private String provincia;
    
    /**
     * Constructor con 2 parametros
     * @param p_nombre recibe la ciudad donde nacio el paciente
     * @param p_provincia recibe la provincia donde vive el paciente
     */
    public Localidad(String p_nombre,String p_provincia){
        this.setNombre(p_nombre);
        this.setProvincia(p_provincia);
    }
    
    /**
     * Asigna p_nombre a la ciudad donde nacio el paciente
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Devuelve la ciudad donde nacio el paciente
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Asigna p_provincia a la provincia donde vive el paciente
     * @param p_provincia
     * @return no devuelve ningun valor
     */
    private void setProvincia(String p_provincia){
        this.provincia = p_provincia;
    }
    
    /**
     * Devuelve la provincia donde vive el paciente
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getProvincia(){
        return this.provincia;
    }
    
    /**
     * Muestra por pantalla la ciudad y provincia del paciente
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String mostrar(){
        return "\nLocalidad: " + this.getNombre() + "\tProvincia: " + this.getProvincia();
    }
}
