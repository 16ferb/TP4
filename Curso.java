import java.util.*;

public class Curso{
    private String nombre;
    private HashMap<Integer, Alumno> alumnos;
    
    public Curso(String p_nombre){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<>());
    }
    
    public Curso(String p_nombre, HashMap p_alumnos){
        this.setNombre(p_nombre);
        this.setAlumnos(new HashMap<> (p_alumnos));
    }
    
    private void setNombre(String p_nombre){
        this.nombre = p_nombre;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    private void setAlumnos(HashMap<Integer, Alumno> p_alumnos){
        this.alumnos = p_alumnos;
    }
    
    public HashMap<Integer, Alumno> getAlumnos(){
        return this.alumnos;
    }
    
    public void inscribirAlumno(Alumno p_alumno){
        this.getAlumnos().put(p_alumno.getLu(), p_alumno);
    }
    
    public Alumno quitarAlumno(int p_lu){
        return this.getAlumnos().remove(p_lu);
    }
    
    public int cantidadDeAlumnos(){
        return this.getAlumnos().size();
    }
    
    public boolean estaInscripto(int p_lu){
        return this.getAlumnos().containsKey(p_lu);
    }
    
    public boolean estaInscripto(Alumno p_alumno){
        return this.getAlumnos().containsValue(p_alumno);
    }
    
    public Alumno buscarAlumno(int p_lu){
        return this.getAlumnos().get(p_lu);
    }
    
    public void imprimirPromedioDelAlumno(int p_lu){
        Alumno alumnoEncontrado = this.getAlumnos().get(p_lu);
        
        if(alumnoEncontrado != null){
            System.out.println("Promedio alumno " + p_lu + ": " + alumnoEncontrado.promedio());
        } else {
            System.out.println("No se encontro ningun alumno con la libreta universitaria " + p_lu);
        }
    }
    
    public void mostrarInscriptos(){
        System.out.println("***Alumnos inscriptos***");
        for(Alumno unAlumno : this.getAlumnos().values()){
            System.out.println(unAlumno.getLu() + " " + unAlumno.nomYApe());
        }
    }
}
