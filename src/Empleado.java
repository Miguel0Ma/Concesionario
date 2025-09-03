public class Empleado extends Persona {
    String cargo;
    double salario;

    private Empleado(EmpleadoBuilder builder) {
        super(builder.nombre, builder.telefono, builder.id, builder.email);
        this.cargo = builder.cargo;
        this.salario = builder.salario;
    }

    public String getCargo() {
        return cargo;
    }

    public double getSalario() {
        return salario;
    }

    public static class EmpleadoBuilder {
        private String nombre;
        private String telefono;
        private String id;
        private String email;
        private String cargo;
        private double salario;

        public EmpleadoBuilder nombre(String nombre) {
            this.nombre = nombre;
            return this;
        }

        public EmpleadoBuilder telefono(String telefono) {
            this.telefono = telefono;
            return this;
        }

        public EmpleadoBuilder id(String id) {
            this.id = id;
            return this;
        }

        public EmpleadoBuilder email(String email) {
            this.email = email;
            return this;
        }

        public EmpleadoBuilder cargo(String cargo) {
            this.cargo = cargo;
            return this;
        }

        public EmpleadoBuilder salario(double salario) {
            this.salario = salario;
            return this;
        }

        public Empleado build() {
            return new Empleado(this);
        }
    }
}
