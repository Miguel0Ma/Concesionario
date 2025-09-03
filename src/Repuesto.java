public class Repuesto {
    private String nombreRepuesto;
    private String idRepuesto;
    private double precio;

    public Repuesto(String nombreRepuesto, String idRepuesto, double precio) {
        this.nombreRepuesto = nombreRepuesto;
        this.idRepuesto = idRepuesto;
        this.precio = precio;
    }

    public String getNombreRepuesto() {
        return nombreRepuesto;
    }

    public void setNombreRepuesto(String nombreRepuesto) {
        this.nombreRepuesto = nombreRepuesto;
    }

    public String getIdRepuesto() {
        return idRepuesto;
    }

    public void setIdRepuesto(String idRepuesto) {
        this.idRepuesto = idRepuesto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
