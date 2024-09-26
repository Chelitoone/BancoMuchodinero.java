//Creación de la clase para las Cuentas Bancarias 

public class Cuenta {

    //Creación de los getters y seeters 
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    double saldo;
    String numero;
    String tipo;
 

    //El contructor
    //Debe tener el mismo nombre de la clase 
    public Cuenta(String tipo, String numero, double saldo){

        this.tipo = tipo;
        this.numero = numero;
        this.saldo = saldo;
    }

    public Cuenta(String tipo, String numero){

        this(tipo,numero,0);
        
    }


    //Creacion de otro constuctor, pero sin parametros 
    public Cuenta(){

        this("Ahorros", "1234-6",0);
    }

    
    



    // Creación de los metodos 

    //Metodo consultar
    double consultarSaldo(){
        return saldo;
        }

    //Metodo retirar
    boolean retirar(double cantidad){
       if(saldo>=cantidad){
        saldo -= cantidad;
        return true;

         }else {
          return false;
            }
        }

    //Metodo consigar con "void" el cual void no retorna nada    
    void consignar (double cantidad){
       saldo += cantidad;
        } 

}

/*  Comandos para Git para actualizar documentación 
git add . ó tambien git add Cuenta.java
git push -u origin main
git commit -m "first commit"
*/