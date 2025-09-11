/**
 * Version 1.0 Permite conocer los datos del laboratorio.
 * @author Gonzalo Biancardi
 * @version 1.0 - 19/08/2025
 */

public class Laboratorio
{
    private String nombre;
    private String domicilio;
    private String telefono;
    private int compraMinima;
    private int diaEntrega;
    
    /**
     * Constructor con 5 parametros
     * @param p_nombre recibe el nombre del laboratorio
     * @param p_domicilio recibe el domicilio del laboratorio
     * @param p_telefono recibe el telefono del laboratorio
     * @param p_compraMin recibe la compra de un producto
     * @param p_diaEnt recibe el dia de entrega del producto
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono, int p_compraMin, int p_diaEnt){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(p_compraMin);
        this.setDiaEntrega(p_diaEnt);
    }
    
    /**
     * Constructor con 3 parametros
     * @param p_nombre recibe el nombre del laboratorio
     * @param p_domicilio recibe el domicilio del laboratorio
     * @param p_telefono recibe el telefono del laboratorio
     */
    public Laboratorio(String p_nombre, String p_domicilio, String p_telefono){
        this.setNombre(p_nombre);
        this.setDomicilio(p_domicilio);
        this.setTelefono(p_telefono);
        this.setCompraMinima(0);
        this.setDiaEntrega(0);
    }
    
    /**
     * Asigna p_nombre al nombre del laboratorio
     * @param p_nombre
     * @return no devuelve ningun valor
     */
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    /**
     * Devuelve el nombre del laboratorio
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getNombre(){
        return this.nombre;
    }
    
    /**
     * Asigna p_domicilio al domicilio del laboratorio
     * @param p_domicilio
     * @return no devuelve ningun valor
     */
    private void setDomicilio(String p_domicilio){
        this.domicilio = p_domicilio;
    }
    
    /**
     * Devuelve el domicilio del laboratorio
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getDomicilio(){
        return this.domicilio;
    }
    
    /**
     * Asigna p_telefono al telefono del laboratorio
     * @param p_telefono
     * @return no devuelve ningun valor
     */
    private void setTelefono(String p_telefono){
        this.telefono = p_telefono;
    }
    
    /**
     * Devuelve el telefono del laboratorio
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getTelefono(){
        return this.telefono;
    }
    
    /**
     * Asigna p_compraMin si hay una compra minima
     * @param p_compraMin
     * @return no devuelve ninguna valor
     */
    private void setCompraMinima(int p_compraMin){
        this.compraMinima = p_compraMin;
    }
    
    /**
     * Devuelve una compra minima
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getCompraMinima(){
        return this.compraMinima;
    }
    
    /**
     * Asigna p_diaEnt al dia de entrega de la compra
     * @param p_diaEnt
     * @return no devuelve ningun valor
     */
    private void setDiaEntrega(int p_diaEnt){
        this.diaEntrega = p_diaEnt;
    }
    
    /**
     * Devuelve el dia de entrega de la compra
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getDiaEntrega(){
        return this.diaEntrega;
    }
    
    /**
     * Asigna p_compraMin si hay una nueva compra minima
     * @param p_compraMin
     * @return no devuelve ninguna valor
     */
    public void nuevaCompraMinima(int p_compraMin){
        this.setCompraMinima(p_compraMin);
    }
    
    /**
     * Asigna p_diaEnt si hay un nuevo dia de entrega de la compra
     * @param p_diaEnt
     * @return no devuelve ningun valor
     */
    public void nuevoDiaEntrega(int p_diaEnt){
        this.setDiaEntrega(p_diaEnt);
    }
    
    /**
     * Muestra por pantalla los datos del laboratorio
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public String mostrar(){
        return "Laboratorio: " + this.getNombre() + "\nDomicilio: "+ this.getDomicilio() + " - " + "Telefono: " + this.getTelefono() + "\n"; 
    }
}
