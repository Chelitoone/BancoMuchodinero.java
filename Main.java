public class Main {

   public static void main(String[] args) {
       
   // Crear el banco
   Banco bancoMuchoDinero = new Banco("Mi Banco");

   // Agregar las cuentas al banco
   bancoMuchoDinero.adicionarCuenta("12345-6", 200000, "Ahorros", "1234567890 ", "Jaime Molina");
   bancoMuchoDinero.adicionarCuenta("78901-2", 350000 , "Corriente", "24307665", "Lady Gaga");

   System.out.println("Saldo total del banco: " + bancoMuchoDinero.consultarTotalDinero());
   System.out.println("Cliente con mayor saldo: " + bancoMuchoDinero.consultarClienteMayorSaldo());

   }
}
