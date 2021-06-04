package lab6p2_joselagos;

import java.util.ArrayList;

public class Docentes {
    private String nombre;
    private String apellido;
    private int registro;
    private String titulo_u;
    private String titulo_p;
    private int imp_clase;
    private String facultad;
    
    private ArrayList proyectos = new ArrayList();
    
    private String user;
    private String password;

    public Docentes() {
    }

    public Docentes(String nombre, String apellido, int registro, String titulo_u, String titulo_p, int imp_clase, String facultad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.registro = registro;
        this.titulo_u = titulo_u;
        this.titulo_p = titulo_p;
        this.imp_clase = imp_clase;
        this.facultad = facultad;
    }

    public Docentes(String nombre, String apellido, int registro, String titulo_u, String titulo_p, int imp_clase, String facultad, String user, String password) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.registro = registro;
        this.titulo_u = titulo_u;
        this.titulo_p = titulo_p;
        this.imp_clase = imp_clase;
        this.facultad = facultad;
        this.user = user;
        this.password = password;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getTitulo_u() {
        return titulo_u;
    }

    public void setTitulo_u(String titulo_u) {
        this.titulo_u = titulo_u;
    }

    public String getTitulo_p() {
        return titulo_p;
    }

    public void setTitulo_p(String titulo_p) {
        this.titulo_p = titulo_p;
    }

    public int getImp_clase() {
        return imp_clase;
    }

    public void setImp_clase(int imp_clase) {
        this.imp_clase = imp_clase;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public ArrayList getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList proyectos) {
        this.proyectos = proyectos;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
