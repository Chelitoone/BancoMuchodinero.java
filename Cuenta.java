/**
 * 
 * @author Marcelo Sepúlveda Londoño 11065 
 * @version 1.0 
 * @since 04 / 09 / 2024
 * 
 */

import java.util.Scanner;

// Creación de mi clase publica Cuenta 
public class Cuenta {

    String numeroCuenta;
    double saldo;
    String tipoCuenta;
    boolean carteraMorosa;

   
    //Ingreso de los metodos para consultarSaldo, retirar y consigar

    public double consultarSaldo(){
        return saldo;
    }


    public void retirar( double cantidad ){
        if (cantidad < 0) {
            System.out.println("Cantidad no valida...");
        }
        if (cantidad > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= cantidad;
        }
      }
    
    

    public void consigar(double cantidad){
        
        if (cantidad < 0) {
            System.out.println("Cantidad no valida...");
        }
        saldo += cantidad;
    }

    // El metodo main??
    public static void main(String[] args) {

        // Creación del objeto para la Cuenta de Pepe Peréz 
        Cuenta pepePeréz = new Cuenta();
        
        pepePeréz.numeroCuenta = "345-128637-23";
        pepePeréz.saldo = 2535.24;
        pepePeréz.tipoCuenta = "Ahorros";
        pepePeréz.carteraMorosa = false;

        // Creación del objeto para la Cuenta de Lola Lopez  
        Cuenta lolaLopez = new Cuenta();

        lolaLopez.numeroCuenta = "124-345654-12";
        lolaLopez.saldo = 305856.00;
        lolaLopez.tipoCuenta = "Corriente";
        lolaLopez.carteraMorosa = true;
        
        Scanner sc = new Scanner(System.in);
        
        //Ingreso al Banco MuchoDinero Pepe Perez 
        System.out.println();
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("$$$       !Bienvenido a tu Banco MuchoDinero¡       $$$");
        System.out.println("$$$           ~ esquina de la Calle 51  ~           $$$");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("             ~ Ingrese su tarjeta bancaria ~           ");
        System.out.println("...");
        System.out.println("Bienvenido Sr. Pepe Peréz");
        
        int opción = 0;
        do {
            System.out.println(" 1- Consultar Saldo /  2 - Retirar Saldo  /  3 - Consignar ");
            System.out.print("Seleccione una opción: ");
            opción = sc.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            switch (opción) {
                
                case 1:
                    // Ingreso del método consultarSaldo()
                     
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~ ~ imprimiendo recibo ~ ~~~~~");
                    System.out.println("Su saldo es de:  $" +pepePeréz.consultarSaldo()+" COP");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                
                case 2:
                    // Ingreso del método retirar()

                    System.out.print("Ingrese la cantidad a retirar: ");
                    double dineroRetirar = sc.nextDouble();
                    if (dineroRetirar <= pepePeréz.consultarSaldo()) {
                        pepePeréz.saldo -= dineroRetirar;
                        System.out.println("Retiro exitoso. Su saldo actual es: $" + pepePeréz.consultarSaldo() + " COP");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    // Empleo del método consignar()
                    
                    System.out.print("Ingrese la cantidad a consignar: ");
                    double dineroConsignar = sc.nextDouble();
                    pepePeréz.saldo+= dineroConsignar;
                    System.out.println("Consignación exitosa. Su saldo actual es: $" + pepePeréz.consultarSaldo() + " COP");
                    break;
                
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

            System.out.println(); // Para dejar una línea en blanco antes de repetir el menú

        } while (opción < 1 || opción > 3);

        // Se acerca al cajero la señora Lola Lopez 
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("...");
        System.out.println("Bienvenida Sra. Lola Lopez");
    
        int opción2 = 0;
        do {
            System.out.println(" 1- Consultar Saldo /  2 - Retirar Saldo  /  3 - Consignar ");
            System.out.print("Seleccione una opción: ");
            opción2 = sc.nextInt();
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

            switch (opción2) {
                
                case 1:
                    // Ingreso del método consultarSaldo()
                     
                    System.out.println();
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    System.out.println("~~~ ~ imprimiendo recibo ~ ~~~~~");
                    System.out.println("Su saldo es de:  $" +lolaLopez.consultarSaldo()+" COP");
                    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                    break;
                
                case 2:
                    // Ingreso del método retirar()

                    System.out.print("Ingrese la cantidad a retirar: ");
                    double dineroRetirar = sc.nextDouble();
                    if (dineroRetirar <= lolaLopez.consultarSaldo()) {
                        lolaLopez.saldo -= dineroRetirar;
                        System.out.println("Retiro exitoso. Su saldo actual es: $" + lolaLopez.consultarSaldo() + " COP");
                    } else {
                        System.out.println("Saldo insuficiente.");
                    }
                    break;

                case 3:
                    // Empleo del método consignar()
                    
                    System.out.print("Ingrese la cantidad a consignar: ");
                    double dineroConsignar = sc.nextDouble();
                    lolaLopez.saldo+= dineroConsignar;
                    System.out.println("Consignación exitosa. Su saldo actual es: $" + lolaLopez.consultarSaldo() + " COP");
                    break;
                
                default:
                    System.out.println("Ingrese una opción válida");
                    break;
            }

            System.out.println(); // Para dejar una línea en blanco antes de repetir el menú

        } while (opción < 1 || opción > 3);

        sc.close();

      }
}