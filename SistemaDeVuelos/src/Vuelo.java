public class Vuelo {

    private String codigo;
    private String origen;
    private String destino;
    private String horario;
    private double tarifa;
    private int asientosDisponibles;

    public Vuelo(String codigo, String origen, String destino, String horario, double tarifa, int asientos) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.horario = horario;
        this.tarifa = tarifa;
        this.asientosDisponibles = asientos;
    }

    public boolean tieneAsientos() {
        return asientosDisponibles > 0;
    }

    public void reservarAsiento() {
        if (tieneAsientos()) asientosDisponibles--;
    }

    public String getCodigo() {
        return codigo;
    }

    public void mostrarInfo() {
        System.out.println(codigo + ": " + origen + " -> " + destino + " | " + horario + " | $" + tarifa + " | Asientos: " + asientosDisponibles);
    }

    public String getHorario() { return horario; }
    public double getTarifa() { return tarifa; }
    public String getOrigen() { return origen; }
    public String getDestino() { return destino; }
}

}
