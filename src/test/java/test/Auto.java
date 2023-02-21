package test;

public class Auto {
    static int cantidadCreados = 0;
    String modelo;
    int precio;
    Asiento[] asientos;
    String marca;
    Motor motor;
    int registro;
    
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