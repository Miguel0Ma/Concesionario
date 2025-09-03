//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
       Empleado empleado = new Empleado.EmpleadoBuilder()
               .nombre("Juan Perez")
               .telefono("123456789")
               .id("EMP001")
               .email("juan.perez@example.com")
               .cargo("Vendedor")
               .salario(3000.00)
               .build();

       System.out.println("Empleado creado:");
       System.out.println("Nombre: " + empleado.getNombre());
       System.out.println("Teléfono: " + empleado.getTelefono());
       System.out.println("ID: " + empleado.getId());
       System.out.println("Email: " + empleado.getEmail());
       System.out.println("Cargo: " + empleado.getCargo());
       System.out.println("Salario: " + empleado.getSalario());
    }
}