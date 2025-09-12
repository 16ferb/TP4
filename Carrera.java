import java.util.*;
public class Carrera{
    public static void main(String []args){
        HashMap<Integer, Alumno> alumnosInscribir = new HashMap<>();
        Alumno alumno1 = new Alumno(32555, "Pedro", "Gomez");
        Alumno alumno2 = new Alumno(23564, "Maria", "Vasquez");
        Alumno alumno3 = new Alumno(30123, "Juan", "Perez");
        Alumno alumno4 = new Alumno(32655, "Marcela", "Martinez");
        
        alumnosInscribir.put(alumno1.getLu(), alumno1);
        alumnosInscribir.put(alumno2.getLu(), alumno2);
        alumnosInscribir.put(alumno3.getLu(), alumno3);
        alumnosInscribir.put(alumno4.getLu(), alumno4);
        
        Curso unCurso = new Curso("Nombre", alumnosInscribir);
        unCurso.mostrarInscriptos();
        
        unCurso.quitarAlumno(30123);
        unCurso.mostrarInscriptos();
    }
}
