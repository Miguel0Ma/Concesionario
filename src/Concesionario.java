public class Concesionario {
    private static Concesionario instancia;
    private String nombre;
    private String nit;
    private String direccion;

    private Concesionario() {
    }

    public static Concesionario getInstancia() {
        if (instancia == null) {
            instancia = new Concesionario();
        }
        return instancia;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public String getNit() {
        return nit;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }

}




