package lab6p2_joselagos;

public class Proyectos {
    private String titulo;
    private String descripcion;
    private double puntuacion;
    private int dificultad;
    private String duracion;
    private int max_p;
    private String entrega;

    public Proyectos() {
    }

    public Proyectos(String titulo, String descripcion, double puntuacion, int dificultad, String duracion, int max_p, String entrega) {
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
        this.dificultad = dificultad;
        this.duracion = duracion;
        this.max_p = max_p;
        this.entrega = entrega;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(double puntuacion) {
        this.puntuacion = puntuacion;
    }

    public int getDificultad() {
        return dificultad;
    }

    public void setDificultad(int dificultad) {
        this.dificultad = dificultad;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public int getMax_p() {
        return max_p;
    }

    public void setMax_p(int max_p) {
        this.max_p = max_p;
    }

    public String getEntrega() {
        return entrega;
    }

    public void setEntrega(String entrega) {
        this.entrega = entrega;
    }

    @Override
    public String toString() {
        return titulo;
    }
    
    
}
