public class CajaRegistradora implements Imprimible, Transaccionable {
    private double dineroEnCaja;

    public CajaRegistradora() {
    }

    public double getDineroEnCaja() {
        return dineroEnCaja;
    }

    public void setDineroEnCaja(double dineroEnCaja) {
        this.dineroEnCaja = dineroEnCaja;
    }

    public void CajaRegistradora1(double dineroInicial) {
        System.out.println("El dinero inicial de la caja es " + dineroInicial);
    }

    @Override
    public void realizarPago(double montoPagado, double precioTotal) {
        if (montoPagado>precioTotal) {
                double cambio = montoPagado - precioTotal;
                System.out.println(
                "El precio total es " + precioTotal + 
                " y se pago con " + montoPagado + 
                " el cambio es " + cambio);
            }else {
            System.out.println("El monto pagado es inferior al precio total.");
        }
    }

    @Override
    public void imprimirRecibo(double precioTotal, double montoPagado, double cambio) {
        System.out.println("El precio total es"+ precioTotal +" y el cambio es "+ cambio);
    }
}
