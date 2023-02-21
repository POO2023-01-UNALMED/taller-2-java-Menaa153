package test;

class Asiento {
    String color;
    double precio;
    int registro;
    
    public Asiento(String color, double precio, int registro) {
        this.color = color;
        this.precio = precio;
        this.registro = registro;
    }
    
    public void cambiarColor(String color) {
        String[] colores = {"rojo", "verde", "amarillo", "negro", "blanco"};
        for (String c : colores) {
            if (c.equals(color)) {
                this.color = color;
                break;
            }
        }
    }
}