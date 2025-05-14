public class Compra {
    private Reserva reserva;
    private String tarjetaCredito;

    public Compra(Reserva reserva, String tarjetaCredito) {
        this.reserva = reserva;
        this.tarjetaCredito = tarjetaCredito;
    }

    public void procesarPago() {
        System.out.println("Procesando pago con tarjeta: ****" + tarjetaCredito.substring(tarjetaCredito.length() - 4));
        reserva.confirmar(); // Confirmamos la reserva como parte del pago
        System.out.println("Compra completada. ¡Gracias por su compra!");
    }
}

