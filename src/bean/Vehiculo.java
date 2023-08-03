// eLABORADO POR KAREN LORENA MOLANO ARIAS CC 1002543562 Y JUAN JOSE RAMIREZ GUTIERREZ CC 1002543562
// LENGUAJE DE PROGRAMACION AVANZADA 1 - 2023-2 UNIREMINGTON
package bean;

public class Vehiculo {

    private int codigo;
    private String tipov;
    private double costo;

    public Vehiculo(int codigo, String tipov, double costo) {
        this.codigo = codigo;
        this.tipov = tipov;
        this.costo = costo;
    }

    public Vehiculo(int codigo, String tipov) {
        this.codigo = codigo;
        this.tipov = tipov;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTipov() {
        return tipov;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
