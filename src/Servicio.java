public class Servicio {
    private String fechaCita;
    private String descripcion;

    public Servicio(String fechaCita, String descripcion) {
        this.fechaCita = fechaCita;
        this.descripcion = descripcion;
    }

    public String getFechaCita() {
        return fechaCita;
    }

    public void setFechaCita(String fechaCita) {
        this.fechaCita = fechaCita;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
