public class Venta {
    private Cliente cliente;
    private double valor;
    private String fecha;

    public Venta(Cliente cliente, String descripcion, double valor, String fecha) {
        this.cliente = cliente;
        this.valor = valor;
        this.fecha = fecha;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }
    

}
