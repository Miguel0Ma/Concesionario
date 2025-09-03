import java.util.ArrayList;

public class Cliente extends Persona {
    ArrayList<Vehiculo> vehiculosComprados;
    public Cliente(String nombre, String telefono, String id, String email) {
        super(nombre, telefono, id, email);
        vehiculosComprados = new ArrayList<>();
    }

}
