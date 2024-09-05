//Creación de la clase para las Cuentas Bancarias 

public class Cuenta {
    double saldo;
    String numero;
    String tipo;

    // Creación de los metodos 

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

/*  Comandos para Git 
git push -u origin main
git commit -m "first commit"
*/