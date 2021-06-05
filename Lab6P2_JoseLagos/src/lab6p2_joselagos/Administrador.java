package lab6p2_joselagos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Administrador {

    private ArrayList<Alumnos> alumnos = new ArrayList();
    private ArrayList<Clases> clases = new ArrayList();
    private ArrayList<Docentes> docente = new ArrayList();
    private ArrayList<Proyectos> proyectos = new ArrayList();
    private ArrayList<Admin> admin = new ArrayList();
    private File archivo = null;

    public Administrador(String path) {
        archivo = new File(path);
    }

    public ArrayList<Proyectos> getProyectos() {
        return proyectos;
    }

    public void setProyectos(ArrayList<Proyectos> proyectos) {
        this.proyectos = proyectos;
    }

    public ArrayList<Admin> getAdmin() {
        return admin;
    }

    public void setAdmin(ArrayList<Admin> admin) {
        this.admin = admin;
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
    public void setAlumno(Alumnos a) {
        this.alumnos.add(a);
    }

    public void setDocente(Docentes d) {
        this.docente.add(d);
    }

    public void setClase(Clases c) {
        this.clases.add(c);
    }

    public void setProyecto(Proyectos p) {
        this.proyectos.add(p);
    }

    @Override
    public String toString() {
        return "Administrador{" + "alumnos=" + alumnos + ", clases=" + clases + ", docente=" + docente + ", proyectos=" + proyectos + '}';
    }

    ////////////////METODOS DE CREACION//////////////////////////////////
    public void crearArchivoAlumno() throws IOException {
        FileWriter canal = null;
        BufferedWriter RAM = null;

        try {
            canal = new FileWriter(archivo, false);//Falso para sobreescribir
            RAM = new BufferedWriter(canal);
            for (Alumnos a : alumnos) {
                RAM.write(a.getNombre() + ";");
                RAM.write(a.getApellido() + ";");
                RAM.write(a.getEdad() + ";");
                RAM.write(a.getRegistro() + ";");
                RAM.write(a.getID() + ";");
                RAM.write(a.getCarrera() + ";");
                RAM.write(a.getAño_carrera() + ";");
                RAM.write(a.getPromedio() + ";");
                RAM.write(a.getFacultad() + ";");
                RAM.write(a.getUser() + ";");
                RAM.write(a.getPassword() + ";");
            }
            RAM.flush();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error al momento de crear el archivo");
        }
        RAM.close();
        canal.close();
    }

    public void crearArchivoDocente() throws IOException {
        FileWriter canal = null;
        BufferedWriter RAM = null;

        try {
            canal = new FileWriter(archivo, false);
            RAM = new BufferedWriter(canal);
            for (Docentes d : docente) {
                RAM.write(d.getNombre() + ";");
                RAM.write(d.getApellido() + ";");
                RAM.write(d.getRegistro() + ";");
                RAM.write(d.getTitulo_u() + ";");
                RAM.write(d.getTitulo_p() + ";");
                RAM.write(d.getImp_clase() + ";");
                RAM.write(d.getFacultad() + ";");
                RAM.write(d.getUser() + ";");
                RAM.write(d.getPassword() + ";");
            }
            RAM.flush();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error al momento de crear el archivo");
        }
        RAM.close();
        canal.close();
    }

    public void crearArchivoClase() throws IOException {
        FileWriter canal = null;
        BufferedWriter RAM = null;

        try {
            canal = new FileWriter(archivo, false);
            RAM = new BufferedWriter(canal);
            for (Clases c : clases) {
                RAM.write(c.getNombre() + ";");
                RAM.write(c.getSeccion() + ";");
                RAM.write(c.getCodigo()+";");
                RAM.write(c.getCodigo_carrera() + ";");
                RAM.write(c.getAlumnos() + ";");
                RAM.write(c.getAula() + ";");
            }
            RAM.flush();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error al momento de crear el archivo");
        }
        RAM.close();
        canal.close();
    }

    public void crearArchivoProyecto() throws IOException {
        FileWriter canal = null;
        BufferedWriter RAM = null;

        try {
            canal = new FileWriter(archivo, false);
            RAM = new BufferedWriter(canal);
            for (Proyectos p : proyectos) {
                RAM.write(p.getTitulo() + ";");
                RAM.write(p.getDescripcion() + ";");
                RAM.write(p.getPuntuacion() + ";");
                RAM.write(p.getDificultad() + ";");
                RAM.write(p.getDuracion() + ";");
                RAM.write(p.getMax_p() + ";");
                RAM.write(p.getEntrega() + ";");
            }
            RAM.flush();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error al momento de crear el archivo");
        }
        RAM.close();
        canal.close();
    }

    /////////////////////METODOS DE CARGA/////////////////////////////////////
    public void cargarArchivoAlumno() {
        Scanner leer = null;
        alumnos = new ArrayList();

        if (archivo.exists()) {//Determina si el archivo existe o no
            try {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                    alumnos.add(new Alumnos(leer.next(), leer.next(), leer.nextInt(), leer.nextInt(), leer.next(), leer.next(), leer.nextInt(), leer.nextInt(), leer.next(), leer.next(), leer.next()));//Separa por tokens (dependiendo de su tipo int, String, etc)y agrega una PERSONA de la clase persona
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error al cargar el archivo");
            }
            leer.close();
        }
    }

    public void cargarArchivoDocente() {
        Scanner leer = null;
        docente = new ArrayList();

        if (archivo.exists()) {
            try {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                    docente.add(new Docentes(leer.next(), leer.next(), leer.nextInt(), leer.next(), leer.next(), leer.nextInt(), leer.next(), leer.next(), leer.next()));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error al cargar el archivo");
            }
            leer.close();
        }
    }

    public void cargarArchivoClase() {
        Scanner leer = null;
        clases = new ArrayList();

        if (archivo.exists()) {
            try {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                    clases.add(new Clases(leer.next(), leer.next(), leer.next(),leer.next(), leer.nextInt(), leer.nextInt()));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error al cargar el archivo");
            }
            leer.close();
        }
    }

    public void cargarArchivoProyecto() {
        Scanner leer = null;
        proyectos = new ArrayList();

        if (archivo.exists()) {
            try {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                    proyectos.add(new Proyectos(leer.next(), leer.next(), leer.nextDouble(), leer.nextInt(), leer.next(), leer.nextInt(), leer.next()));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error al cargar el archivo");
            }
            leer.close();
        }
        
 
    }
    public void cargarAdmin() {
        Scanner leer = null;
        admin = new ArrayList();

        if (archivo.exists()) {
            try {
                leer = new Scanner(archivo);
                leer.useDelimiter(";");
                while (leer.hasNext()) {
                    admin.add(new Admin(leer.next(),leer.next()));
                }
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ha Ocurrido un Error al cargar el archivo");
            }
            leer.close();
        }
        
 
    }
}
