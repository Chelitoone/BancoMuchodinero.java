import java.util.ArrayList;

public class Main {

 public static void main(String[] args) {

   /* 
    int valor = 10000;

    //Creación de un objeto y agregar los valores en el orden que me da el constuctor
    Cuenta cuenta = new Cuenta("Ahorros","1234-5",100000); // El "new Cuenta()" es el constructor con el que creo objetos desde mi clase 
   
    //Creación de otro objeto 
    Cuenta cuentaNueva = new Cuenta("Corriente", "12345-6", valor);
    System.out.println(cuentaNueva.numero);
    System.out.println(cuentaNueva.tipo);

    //Cambio de valores por medio del get 
    System.out.println(cuentaNueva.getNumero());
    cuentaNueva.setNumero("1234-7");
   */



   Cuenta cuenta1 = new Cuenta("Ahorros","12345-8", 100000);
   Cuenta cuenta2 = new Cuenta("Corriente","2345-9");
   Cuenta cuenta3 = cuenta1;
   
   //ArrayList es una clase en java que permite almacenar objetos 
   ArrayList<Cuenta> cuentas = new ArrayList<>();   
   cuentas.add(cuenta1);
   cuentas.add(cuenta2);
   cuentas.add(cuenta3);
  
   /*
    get(i);
    add(obj);
    isEmpy();
    clear();
    remove(i);
    size(); 
    */


   System.out.println(cuenta1);

   System.out.println(cuentas.get(0).consultarSaldo());

   for (int i = 0; i < cuentas.size(); i++ ) {
      
      System.out.printf("numero de cuenta: %s, Tipo de cuenta: %s, El saldo es: %.2f", cuentas.get(i).getNumero(), cuentas.get(i).getTipo(), cuentas.get(i).getSaldo());
   }

   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

   //For each
   for ( Cuenta cuenta : cuentas ){

      System.out.printf("numero de cuenta: %s, Tipo de cuenta: %s, El saldo es: %.2f", cuenta.getNumero(), cuenta.getTipo(), cuenta.getSaldo());
   }

   System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");


   //Metodo forEach de la clase ArrayList
   cuentas.forEach(cuenta ->{
      System.out.printf("numero de cuenta: %s, Tipo de cuenta: %s, El saldo es: %.2f", cuenta.getNumero(), cuenta.getTipo(), cuenta.getSaldo());

   });



   for (int i = 0; i < cuentas.size(); i++ ) {

      
   }

   





    /*  
    System.out.println(cuenta.consultarSaldo());
    
    cuenta.consignar(valor);

    System.out.println(cuenta.consultarSaldo());

    
    //Utilizar metodo para retirar saldo
    boolean pudoRetirar = cuenta.retirar(50000.5);
    System.out.println("Pudo retirar: " +pudoRetirar);
    System.out.println(cuenta.consultarSaldo());

    boolean pudoSegundoRetiro = cuenta.retirar(50000.5);
    System.out.println("Pudo retirar: " +pudoSegundoRetiro);


    Cuenta cuenta1 = new Cuenta(); //Objetos inicializados 
    Cuenta cuenta2 = null; // Objeto sin inicializar, no esta guardado en espacio de memoria 
    Cuenta cuenta3;         // "  "  "   "          "  "   "
   */




   }   

}