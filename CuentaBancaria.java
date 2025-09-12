/**
 * Permite realizar depositos y extracciones de una cuenta bancaria
 * @version 1.0 - 06/09/2025
 * @author Gonzalo Biancardi
 */
public class CuentaBancaria
{
    private int nroCuenta;
    private double saldo;
    private Persona titular;
    
    /**
     * Constructor con 2 parametros
     * @param p_nroCuenta recibe el numero de la cuenta
     * @param p_titular recibe el titular de tipo Persona
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(0.0);
    }
    
    /**
     * Constructor con 3 parametros
     * @param p_nroCuenta recibe el numero de la cuenta
     * @param p_titular recibe el titular de tipo Persona
     * @param p_saldo recibe el saldo de la cuenta
     */
    public CuentaBancaria(int p_nroCuenta, Persona p_titular, double p_saldo){
        this.setNroCuenta(p_nroCuenta);
        this.setTitular(p_titular);
        this.setSaldo(p_saldo);
    }
    
    /**
     * Asigna p_nroCuenta a la cuenta de la persona
     * @param p_nroCuenta
     * @return no devuelve ningun valor
     */
    private void setNroCuenta(int p_nroCuenta){
        this.nroCuenta = p_nroCuenta;
    }
    
    /**
     * Devuelve el numero de la cuenta de la persona
     * @param no recibe ningun parametro
     * @return un valor de tipo int
     */
    public int getNroCuenta(){
        return this.nroCuenta;
    }
    
    /**
     * Asigna p_titular a la cuenta de la persona
     * @param p_titular
     * @return no devuelve ningun valor
     */
    private void setTitular(Persona p_titular){
        this.titular = p_titular;
    }
    
    /**
     * Devuelve el titular de la cuenta
     * @param no recibe ningun parametro
     * @return un valor de tipo Persona
     */
    public Persona getTitular(){
        return this.titular;
    }
    
    /**
     * Asigna p_saldo a la cuenta de la persona
     * @param p_saldo
     * @return no devuelve ningun valor
     */
    private void setSaldo(double p_saldo){
        this.saldo = p_saldo;
    }
    
    /**
     * Devuelve el saldo de la cuenta 
     * @param no recibe ningun parametro
     * @return un valor de tipo double
     */
    public double getSaldo(){
        return this.saldo;
    }
    
    /**
     * Realiza un deposito en la cuenta
     * @param p_importe
     * @return un valor de tipo double
     */
    public double depositar(double p_importe){
        this.setSaldo(this.getSaldo() + p_importe);
        return this.getSaldo();
    }
    
    /**
     * Realiza una extraccion de la cuenta
     * @param p_importe
     * @return un valor de tipo double
     */
    public double extraer(double p_importe){
        this.setSaldo(this.getSaldo() - p_importe);
        return this.getSaldo();
    }
    
    /**
     * Muestra por pantalla los datos de la cuenta bancaria
     * @param no recibe ningun parametro
     * @return no devuelve ningun valor
     */
    public void mostrar(){
        System.out.println("-Cuenta Bancaria-");
        System.out.println("Titular: " + this.getTitular().nomYApe() + "(" + this.getTitular().edad() + ")");
        System.out.println("Saldo: " + this.getSaldo());
    }
    
    /**
     * Muestra una linea con datos de la cuenta bancaria
     * @param no recibe ningun parametro
     * @return un valor de tipo String
     */
    public String toString(){
        return this.getNroCuenta() + "\t" + this.getTitular().nomYApe() + "\t" + this.getSaldo();
    }
}
