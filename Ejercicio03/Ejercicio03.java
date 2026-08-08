class Pago {
    private double monto;

    public Pago(double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void procesarPago() {
        System.out.println("Procesando pago de Q" + monto);
    }
}

class PagoTarjeta extends Pago {
    private String numeroTarjeta;

    public PagoTarjeta(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        super.procesarPago();
        System.out.println("Metodo: Tarjeta terminada en " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
    }
}

class PagoEfectivo extends Pago {
    private double montoRecibido;

    public PagoEfectivo(double monto, double montoRecibido) {
        super(monto);
        this.montoRecibido = montoRecibido;
    }

    public double getMontoRecibido() {
        return montoRecibido;
    }

    public void setMontoRecibido(double montoRecibido) {
        this.montoRecibido = montoRecibido;
    }

    @Override
    public void procesarPago() {
        super.procesarPago();
        double vuelto = montoRecibido - getMonto();
        System.out.println("Metodo: Efectivo | Recibido: Q" + montoRecibido + " | Vuelto: Q" + vuelto);
    }
}

public class Ejercicio03 {
    public static void main(String[] args) {
        Pago[] pagos = new Pago[2];
        pagos[0] = new PagoTarjeta(150.50, "4523780012349876");
        pagos[1] = new PagoEfectivo(80.00, 100.00);

        System.out.println("=== Sistema de Pagos ===\n");

        for (Pago p : pagos) {
            p.procesarPago();
            System.out.println("-----------------------------");
        }
    }
}