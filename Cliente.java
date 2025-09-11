/**
 * Permite conocer los datos de la cuenta del Cliente
 * @author Gonzalo Biancardi
 * @version 1.0 - 17/08/2025
 */

public class Cliente
{
  private int nroDni;
  private String apellido;
  private String nombre;
  private double saldo;
  
  /**
   * Constructor con 4 parametros
   * @param p_dni recibe el dni del cliente
   * @param p_apellido recibe el apellido del cliente
   * @param p_nombre recibe el nombre del cliente
   * @param p_importe recibe el saldo del cliente
   */
  public Cliente (int p_dni, String p_apellido, String p_nombre, double p_importe){
      this.setDni(p_dni);
      this.setApellido(p_apellido);
      this.setNombre(p_nombre);
      this.setSaldo(p_importe);
  }
  
  /**
   * Asigna p_dni al dni del cliente
   * @param p_dni
   * @return no devuelve ningun valor
   */
  private void setDni(int p_dni){
      this.nroDni = p_dni;
  }
  
  /**
   * Devuelve el dni del cliente
   * @param no recibe ningun parametro
   * @return un valor de tipo int
   */
  public int getDni(){
      return this.nroDni;
  }
  
  /**
   * Asigna p_apellido al apellido del cliente
   * @param p_apellido
   * @return no devuelve ningun valor
   */
  private void setApellido(String p_apellido){
      this.apellido = p_apellido;
  }
  
  /**
   * Devuelve el apellido del cliente
   * @param no recibe ningun parametro
   * @return un valor de tipo String
   */
  public String getApellido(){
      return this.apellido;
  }
  
  /**
   * Asigna p_nombre al nombre del cliente
   * @param p_nombre
   * @return no devuelve ningun valor
   */
  private void setNombre(String p_nombre){
      this.nombre = p_nombre;
  }
  
  /**
   * Devuelve el nombre del cliente
   * @param no recibe ningun parametro
   * @return un valor de tipo String
   */
  public String getNombre(){
      return this.nombre;
  }
  
  /**
   * Asigna p_importe al saldo del cliente
   * @param p_importe
   * @return no devuelve ningun valor
   */
  private void setSaldo(double p_importe){
      this.saldo = p_importe;
  }
  
  /**
   * Devuelve el saldo del cliente
   * @param no recibe ningun parametro
   * @return un valor de tipo double
   */
  public double getSaldo(){
      return this.saldo;
  }
  
  /**
   * Muestra por pantalla la cuenta del cliente
   * @param no recibe ningun parametro
   * @return no devuelve ningun valor
   */
  public void mostrar(){
      System.out.println(" - Cliente - ");
      System.out.println("Nombre y apellido: " + this.nomYApe() + "(" + this.getDni() + ")");
      System.out.println("Saldo: " + this.getSaldo());
  }
  
  /**
   * Asigna p_importe al saldo de la cuenta del cliente
   * @param p_importe
   * @return un valor de tipo double
   */
  public double nuevoSaldo(double p_importe){
      this.setSaldo(p_importe);
      return this.getSaldo();
  }
  
  /**
   * Asigna p_importe incrementando la cuenta del cliente
   * @param p_importe
   * @return un valor de tipo double
   */
  public double agregaSaldo(double p_importe){
      this.setSaldo(this.getSaldo() + p_importe);
      return this.getSaldo();
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
   * Concatena el nombre con el apellido
   * @param no recibe ningun parametro
   * @return un valor de tipo String
   */
  public String nomYApe(){
      return this.getNombre() + " " + this.getApellido();
  }
}
