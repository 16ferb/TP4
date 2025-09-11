/**
 * @author Gonzalo Biancardi
 * @version 1.0 10/09/23
 * Permite desplazar puntos en la construccion de figuras
 */

public class Punto{
    private double x;
    private double y;

    /**
     * Constructor sin ningun parametro
     */
    public Punto(){
        this.setX(0);
        this.setY(0);
    }
    
    /**
     * Constructor que recibe dos parametros
     * @param p_x recibe el punto x
     * @param p_y recibe el punto y
     */
    public Punto(double p_x, double p_y){
        this.setX(p_x);
        this.setY(p_y);
    }
    
    /**
     * Asigna p_x a la abscisa X
     * @param p_x recibe la coordenada de X
     */
    private void setX(double p_x){
        this.x = p_x;
    }
    
    /**
     * Retorna el valor de X
     * @return un valor de tipo double
     */
    public double getX(){
        return this.x;
    }
    
    /**
     * Asigna p_y a la ordenada Y
     * @param p_y recibe la coordenada de Y
     */
    private void setY(double p_y){
        this.y = p_y;
    }
    
    /**
     * Retorna el valor de Y
     * @return un valor de tipo double
     */    
    public double getY(){
        return this.y;
    }
    
    public double distanciaA(Punto p_ptoDistante){
        return Math.sqrt(Math.pow(x - p_ptoDistante.getX(),2) + Math.pow(y - p_ptoDistante.getY(),2));
    }
    
    /**
     * Cambia las posiciones de los puntos
     * @param p_dx recibe el punto hacia donde se desplaza la abscisa
     * @param p_dy recibe el punto hacia donde se desplaza la ordenada
     */
    public void desplazar(double p_dx, double p_dy){
        this.setX(this.getX() + p_dx);
        this.setY(this.getY() + p_dy);
    }
    
    /**
     * Muestra por pantalla las nuevas posiciones de los puntos
     */
    public void mostrar(){
        System.out.println("Punto. X: " + this.getX() + ", Y: " + this.getY());
    }
    
    /**
     * Muestra por pantalla los lugares de los puntos
     * @return un String
     */
    public String coordenadas(){
        return "\n(" + this.getX() + ", " + this.getY() + ")";  
    }
}