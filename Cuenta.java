public class Cuenta {
    String numero;
    double saldo;
    String tipo;
    Cliente titular;

   // Constructor
   public Cuenta(String numero, double saldoInicial, String tipo, Cliente titular) {
       this.numero = numero;
       this.saldo = saldoInicial;
       this.tipo = tipo;
       this.titular = titular;
   }

   // Getters y setters
   public String getNumero() {
       return numero;
   }

   public double getSaldo() {
       return saldo;
   }

   public String getTipo() {
       return tipo;
   }

   public Cliente getTitular() {
       return titular;
   }

   // Método para consignar dinero
   public void consignar(double cantidad) {
       saldo += cantidad;
   }

   // Método para retirar dinero
   public boolean retirar(double cantidad) {
       if (saldo >= cantidad) {
           saldo -= cantidad;
           return true;
       } else {
           return false;
       }
   }
}