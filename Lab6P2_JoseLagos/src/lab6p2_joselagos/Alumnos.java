package lab6p2_joselagos;

public class Alumnos {
    private String nombre;
    private String apellido;
    private int edad;
    private int registro;
    private String ID;
    private String carrera;
    private int año_carrera;
    private int promedio;
    private String facultad;

    public Alumnos() {
    }

    public Alumnos(String nombre, String apellido, int edad, int registro, String ID, String carrera, int año_carrera, int promedio, String facultad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.registro = registro;
        this.ID = ID;
        this.carrera = carrera;
        this.año_carrera = año_carrera;
        this.promedio = promedio;
        this.facultad = facultad;
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

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getRegistro() {
        return registro;
    }

    public void setRegistro(int registro) {
        this.registro = registro;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getAño_carrera() {
        return año_carrera;
    }

    public void setAño_carrera(int año_carrera) {
        this.año_carrera = año_carrera;
    }

    public int getPromedio() {
        return promedio;
    }

    public void setPromedio(int promedio) {
        this.promedio = promedio;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
}
