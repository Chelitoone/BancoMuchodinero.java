//Creación de la clase para las Cuentas Bancarias <

public class Cuenta {
    double saldo;
    String numero;
    String tipo;

    double consultarSaldo(){
        return saldo;
    }

    boolean retirar(double cantidad){
       if(saldo>=cantidad){
        saldo -= cantidad;
        return true;

         }else {
          return false;
         }

        }

    void consignar (double cantidad){
       saldo += cantidad;
       }

}