public abstract class Persona {
    String nombre;
    String telefono;
    String id;
    String email;

    public Persona (String nombre, String telefono, String id, String email){
        this.nombre = nombre;
        this.telefono = telefono;
        this.id = id;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

}
