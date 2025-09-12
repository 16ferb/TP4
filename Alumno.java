/**
 * Permite conocer los datos y notas de un alumno
 * @version 1.0 - 17/08/2025
 * @author Gonzalo Biancardi
 */

public class Alumno
{
        private int lu;
        private String nombre;
        private String apellido;
        private double nota1;
        private double nota2;
        private double promedio = 0.0;
        
        /**
         * Constructor con 3 parametros
         * @param p_lu recibe la libreta universitaria del alumno
         * @param p_nombre recibe el nombre del alumno
         * @param p_apellido recibe el apellido del alumno
         */
    
        public Alumno(int p_lu, String p_nombre, String p_apellido){
            this.setLu(p_lu);
            this.setNombre(p_nombre);
            this.setApellido(p_apellido);
        }
        
        /**
         * Asigna p_lu a la libreta universitaria del alumno
         * @param p_lu
         * @return no devuelve ningun valor
         */
            private void setLu(int p_lu){
                this.lu = p_lu;
            }
        
        /**
         * Devuelve la libreta universitaria del alumno
         * @param no recibe ningun parametro
         * @return un valor de tipo int
         */
        public int getLu(){
            return this.lu;
        }
        
        /**
         * Asigna p_nombre al nombre del alumno
         * @param p_nombre
         * @return no devuelve ningun valor
         */
        private void setNombre(String p_nombre){
            this.nombre = p_nombre;
        }
        
        /**
         * Devuelve el nombre del alumno
         * @param no recibe ningun parametro
         * @return un valor de tipo String
         */
        public String getNombre(){
            return this.nombre;
        }
        
        /**
         * Asigna p_apellido al apellido del alumno
         * @param p_apellido
         * @return no devuelve ningun valor
         */
        private void setApellido(String p_apellido){
            this.apellido = p_apellido;
        }
        
        /**
         * Devuelve el apellido del alumno
         * @param no recibe ningun parametro
         * @return un valor de tipo String
         */
        public String getApellido(){
            return this.apellido;
        }
        
        /**
         * Asigna p_nota a la primera nota del alumno
         * @param p_nota
         * @return no devuelve ningun valor
         */
        public void setNota1(double p_nota){
            this.nota1 = p_nota;
        }
        
        /**
         * Devuelve la primera nota del alumno
         * @param no recibe ningun parametro
         * @return un valor de tipo double
         */
        public double getNota1(){
            return this.nota1;
        }
        
        /**
         * Asigna p_nota a la segunda nota del alumno
         * @param p_nota
         * @return no devuelve ningun valor
         */
        public void setNota2(double p_nota){
            this.nota2 = p_nota;
        }
        
        /**
         * Devuelve la segunda nota del alumno
         * @param no recibe ningun parametro
         * @return un valor de tipo double
         */
        public double getNota2(){
            return this.nota2;
        }
        
        /**
         * Calcula el promedio del alumno
         * @param no recibe ningun parametro
         * @return un valor de tipo boolean
         */
        private boolean aprueba(){
            if((this.promedio() > 7.0) && (this.getNota1()  >= 6.0) && (this.getNota2()>=6.0)){
                return true;
            } else {
                return false;
            }
        }
        
        /**
         * Verifica si el alumno aprueba o no
         * @param no recibe ningun parametro
         * @return un valor de tipo String
         */
        private String leyendaAprueba(){
            if(this.aprueba() == true){
                return "APROBADO";
            } else {
                return "DESAPROBADO";
            }
        }
        
        /**
         * Calcula el promedio del alumno
         * @param no recibe ningun parametro
         * @return un valor de tipo double
         */
        public double promedio(){
            return promedio = (this.getNota1() + this.getNota2()) / 2;
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
         * Muestra por pantalla los datos y notas del alumno
         * @param no recibe ningun parametro
         * @return no devuelve ningun valor
         */
        public void mostrar(){
            System.out.println("Nombre y apellido: " + this.nomYApe());
            System.out.println("LU: " + this.getLu() + "\tNotas: " + this.getNota1() + " - " +this.getNota2());
            System.out.println("Promedio: " + this.promedio() + " - " + this.leyendaAprueba());
        }
}
