public class MainCalculadora {
    public static void main(String[] args) {
   
        double dineroInicial=1000;
        double montoPagado=800;
        double precioTotal=500;

        CajaRegistradora caja = new CajaRegistradora();

        caja.CajaRegistradora1(dineroInicial);
      
        caja.realizarPago(montoPagado,precioTotal);


    }
}
