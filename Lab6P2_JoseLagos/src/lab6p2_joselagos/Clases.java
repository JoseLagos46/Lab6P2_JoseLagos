package lab6p2_joselagos;

import java.util.ArrayList;

public class Clases {
    private String nombre;
    private String seccion;
    private String codigo_carrera;
    private int alumnos;
    private int aula;

    
    private ArrayList proyectos = new ArrayList();
    private ArrayList alumnos_m = new ArrayList();

    public Clases() {
    }

    public Clases(String nombre, String seccion, String codigo_carrera, int alumnos, int aula) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.codigo_carrera = codigo_carrera;
        this.alumnos = alumnos;
        this.aula = aula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public String getCodigo_carrera() {
        return codigo_carrera;
    }

    public void setCodigo_carrera(String codigo_carrera) {
        this.codigo_carrera = codigo_carrera;
    }

    public int getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(int alumnos) {
        this.alumnos = alumnos;
    }

    public int getAula() {
        return aula;
    }

    public void setAula(int aula) {
        this.aula = aula;
    }

    public ArrayList getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList proyectos) {
        this.proyectos = proyectos;
    }

    public ArrayList getAlumnos_m() {
        return alumnos_m;
    }

    public void setAlumnos_m(ArrayList alumnos_m) {
        this.alumnos_m = alumnos_m;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
