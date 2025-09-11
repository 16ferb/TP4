/**
 * Permite ver datos de los productos de una drogueria
 * @version 1.0 - 06/09/2025
 * @author Gonzalo Biancardi
 */
public class Producto{
    private int codigo;
    private String rubro;
    private String descripcion;
    private double costo;
    private int stock;
    private double porcPtoRepo;
    private int existMinima;
    private Laboratorio laboratorio;
    
    /**
     * Constructor con 7 parametros
     * @param p_codigo recibe el codigo de un producto
     * @param p_rubro recibe el rubro del producto
     * @param p_desc recibe la descripcion del producto
     * @param p_costo recibe el costo del producto
     * @param p_porcPtoRepo recibe el porcentaje de punto de reposicion de cada producto
     * @param p_existMinima recibe la existencia minima de cada producto
     * @param p_lab reutiliza la clase Laboratorio
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, double p_porcPtoRepo, int p_existMinima, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(p_porcPtoRepo);
        this.setExistMinima(p_existMinima);
        this.setLaboratorio(p_lab);
    }
    
    /**
     * Constructor con 5 parametros
     * @param p_codigo recibe el codigo del producto
     * @param p_rubro recibe el rubro del producto
     * @param p_desc recibe la descripcion del producto
     * @param p_costo recibe el costo del producto
     * @param p_lab reutiliza la clase Laboratorio
     */
    public Producto(int p_codigo, String p_rubro, String p_desc, double p_costo, Laboratorio p_lab){
        this.setCodigo(p_codigo);
        this.setRubro(p_rubro);
        this.setDescripcion(p_desc);
        this.setCosto(p_costo);
        this.setStock(0);
        this.setPorcPtoRepo(0.0);
        this.setExistMinima(0);
        this.setLaboratorio(p_lab);
    }
    
    /**
     * Asigna p_codigo al codigo del producto
     * @param p_codigo
     * @return no devuelve ningun valor
     */
    private void setCodigo(int p_codigo){
        this.codigo = p_codigo;
    }
    
    /**
     * Devuelve el codigo del producto
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getCodigo(){
        return this.codigo;
    }
    
    /**
     * Asigna p_rubro al rubro del producto
     * @param p_rubro
     * @return no devuelve ningun valor
     */
    private void setRubro(String p_rubro){
        this.rubro = p_rubro;
    }
    
    /**
     * Devuelve el rubro del producto
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getRubro(){
        return this.rubro;
    }
    
    /**
     * Asigna p_desc a la descripcion del producto
     * @param p_desc
     * @return no devuelve ningun valor
     */
    private void setDescripcion(String p_desc){
        this.descripcion = p_desc;
    }
    
    /**
     * Devuelve la descripcion del producto
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String getDescripcion(){
        return this.descripcion;
    }
    
    /**
     * Asigna p_costo al costo del producto
     * @param p_costo
     * @return no devuelve ningun valor
     */
    private void setCosto(double p_costo){
        this.costo = p_costo;
    }
    
    /**
     * Devuelve el costo del producto
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double getCosto(){
        return this.costo;
    }
    
    /**
     * Asigna p_stock al stock de cada producto
     * @param p_stock
     * @return no devuelve ningun valor
     */
    private void setStock(int p_stock){
        this.stock = p_stock;
    }
    
    /**
     * Devuelve el stock de cada producto
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getStock(){
        return this.stock;
    }
    
    /**
     * Asigna p_porcPtoRepo al porcentaje de punto de reposicion de cada producto
     * @param p_porcPtoRepo
     * @return no devuelve ningun valor
     */
    private void setPorcPtoRepo(double p_porcPtoRepo){
        this.porcPtoRepo = p_porcPtoRepo;
    }
    
    /**
     * Devuelve el porcentaje de punto de reposicion de cada producto
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double getPorcPtoRepo(){
        return this.porcPtoRepo;
    }
    
    /**
     * Asigna p_existMinima a la existencia minima que tiene cada producto
     * @param p_existMinima
     * @return no devuelve ningun valor
     */
    private void setExistMinima(int p_existMinima){
        this.existMinima = p_existMinima;
    }
    
    /**
     * Devuelve la existencia minima de cada producto
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getExistMinima(){
        return this.existMinima;
    }
    
    /**
     * Asigna p_lab al laboratorio asociado al producto
     * @param p_lab
     * @return no devuelve ningun valor
     */
    private void setLaboratorio(Laboratorio p_lab){
        this.laboratorio = p_lab;
    }
    
    /**
     * Devuelve el laboratorio asociado al producto
     * @param no recibe ningun parametro
     * @return un valor de tipo Laboratorio
     */
    public Laboratorio getLaboratorio(){
        return this.laboratorio;
    }
    
    /**
     * Muestra por pantalla los datos de un producto
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void mostrar(){
        System.out.println(this.getLaboratorio().mostrar());
        System.out.println("Rubro: " + this.getRubro());
        System.out.println("Descripcion: " + this.getDescripcion());
        System.out.println("Precio Costo: " + this.getCosto());
        System.out.println("Stock: " + this.getStock() + " - " + "Stock valorizado: $" + this.stockValorizado() + "\n");
    }
    
    /**
     * Permite modificar el stock
     * @param p_cantidad recibe la cantidad que debe agregar o quitar del stock
     * @return no devuelve ningun valor
     */
    public void ajuste (int p_cantidad){
        this.setStock(this.getStock() + p_cantidad); // Agrega stock
        
    }
    
    /**
     * Calcula el valor del stock
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double stockValorizado(){
        return (this.getStock() * this.getCosto() * 1.12); // El resultado de multiplicar stock * precio de costo + una rentabilidad del 12%
    }
    
    /**
     * Calcula el precio de lista 
     * @param no recibe ningun valor
     * @return un valor de tipo double
     */
    public double precioLista(){
        return this.getCosto() + (this.getCosto() * 0.12); // Agrega un 12% al precio de costo
    }
    
    /**
     * Calcula el precio de contado
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double precioContado(){
        return this.precioLista() - (this.precioLista() * 0.05); // Se resta un 5% al precio de lista
    }
    
    /**
     * Devuelve una linea con datos de un producto
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String mostrarLinea(){
        return this.getDescripcion() + "  " + this.precioLista() + "  " + this.precioContado();
    }
    
    /**
     * Por si hay un nuevo porcentaje de punto de reposicion
     * @param p_porce recibe un nuevo porcentaje de punto de reposicion
     * @return no devuelve ningun valor
     */
    public void ajustarPtoRepo(double p_porce){
        this.setPorcPtoRepo(p_porce);
    }
    
    /**
     * Por si hay que ajustar la existencia minima de un producto
     * @param p_cantidad recibe una nueva existencia minima
     * @return no devuelve ningun valor
     */
    public void ajustarExistMin(int p_cantidad){
        this.setExistMinima(p_cantidad);
    }

    
}