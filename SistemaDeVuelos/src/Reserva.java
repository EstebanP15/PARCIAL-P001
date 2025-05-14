public class Reserva {
    private Usuario usuario;
    private Vuelo vuelo;

    public Reserva(Usuario usuario, Vuelo vuelo) {
        this.usuario = usuario;
        this.vuelo = vuelo;
    }

    public void confirmar() {
        vuelo.reservarAsiento();
        System.out.println("Reserva confirmada para " + usuario.getNombre() + " en el vuelo " + vuelo.getCodigo());
    }
}
