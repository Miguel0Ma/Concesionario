public class Reparacion {
    private int cantidadRepuestos;
    private double costoManoObra;

    public Reparacion(int cantidadRepuestos, double costoManoObra) {
        this.cantidadRepuestos = cantidadRepuestos;
        this.costoManoObra = costoManoObra;
    }

    public int getCantidadRepuestos() {
        return cantidadRepuestos;
    }

    public void setCantidadRepuestos(int cantidadRepuestos) {
        this.cantidadRepuestos = cantidadRepuestos;
    }

    public double getCostoManoObra() {
        return costoManoObra;
    }

    public void setCostoManoObra(double costoManoObra) {
        this.costoManoObra = costoManoObra;
    }
}
