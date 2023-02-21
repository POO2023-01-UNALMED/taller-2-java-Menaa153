package test;

public class Auto {
    static int cantidadCreados = 0;
    String modelo;
    double precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    
    public Auto(String modelo, double precio, Asiento[] asientos, String marca, Motor motor, int registro) {
        this.modelo = modelo;
        this.precio = precio;
        this.asientos = asientos;
        this.marca = marca;
        this.motor = motor;
        this.registro = registro;
        cantidadCreados++;
    }
    
    public int cantidadAsientos() {
        int numeroAsientos = 0;
        for (Asiento asiento : this.asientos) {
            if (asiento != null) {
                numeroAsientos++;
            }
        }
        return numeroAsientos;
    }
    
    public String verificarIntegridad() {
        for (Asiento asiento : this.asientos) {
            if (asiento != null) {
                if (asiento.registro != this.registro) {
                    return "Las piezas no son originales";
                }
            }
        }
        if (this.motor.registro != this.registro) {
            return "Las piezas no son originales";
        }
        return "Auto original";
    }
}