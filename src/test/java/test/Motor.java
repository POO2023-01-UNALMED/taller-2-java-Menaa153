package test;

class Motor {
    int numeroCilindros;
    String tipo;
    int registro;
    
    public void cambiarRegistro(int registro) {
        this.registro = registro;
    }
    
    public void asignarTipo(String tipo) {
        String[] tipos = {"electrico", "gasolina"};
        for (String t : tipos) {
            if (t.equals(tipo)) {
                this.tipo = tipo;
            }
        }
    }
}