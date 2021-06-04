package lab6p2_joselagos;

import java.io.File;
import java.util.ArrayList;

public class Administrador {
    private ArrayList<Alumnos> alumnos = new ArrayList();
    private ArrayList<Clases> clases = new ArrayList();
    private ArrayList<Docentes> docente = new ArrayList();
    private ArrayList<Proyectos> proyectos = new ArrayList();
    private File archivo = null;
    
    public Administrador(String path) {
        archivo = new File(path);
    }

    public ArrayList<Alumnos> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(ArrayList<Alumnos> alumnos) {
        this.alumnos = alumnos;
    }

    public ArrayList<Clases> getClases() {
        return clases;
    }

    public void setClases(ArrayList<Clases> clases) {
        this.clases = clases;
    }

    public ArrayList<Docentes> getDocente() {
        return docente;
    }

    public void setDocente(ArrayList<Docentes> docente) {
        this.docente = docente;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Proyectos> getPoryectos() {
        return proyectos;
    }

    public void setPoryectos(ArrayList<Proyectos> poryectos) {
        this.proyectos = poryectos;
    }
    
    
    ////////////////////////////////////////////////
    public void setAlumno(Alumnos a){
        this.alumnos.add(a);
    }
    
    public void setDocente(Docentes d){
        this.docente.add(d);
    }
    
    public void setClase(Clases c){
        this.clases.add(c);
    }
    
    public void setProyecto(Proyectos p){
        this.proyectos.add(p);
    }
    
    
}
