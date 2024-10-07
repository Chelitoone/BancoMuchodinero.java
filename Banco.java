import java.util.ArrayList;
import java.util.List;

public class Banco {
    String nombre;
    List<Cuenta> cuentas;

    // Constructor
    public Banco(String nombre) {
        this.nombre = nombre;
        this.cuentas = new ArrayList<>();
    }

    // Método para buscar una cuenta
    public Cuenta buscarCuenta(String numeroCuenta) {
       
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getNumero().equals(numeroCuenta)) {
                return cuenta;
            }
        }
        return null;
    }

    // Método para añadir una nueva cuenta
    public void adicionarCuenta(String numeroCuenta, double saldoInicial, String tipo, String cedulaTitular, String nombreTitular) {
        // Crea un nuevo objeto de tipo Cuenta con los datos proporcionados
        Cuenta nuevaCuenta = new Cuenta(numeroCuenta, saldoInicial, tipo, new Cliente(cedulaTitular, nombreTitular));
        cuentas.add(nuevaCuenta);
    }

    // Método para calcular el total de dinero
    public double consultarTotalDinero() {
        double total = 0;
        // Recorre la lista de cuentas y suma los saldos de cada cuenta
        for (Cuenta cuenta : cuentas) {
            total += cuenta.getSaldo();
        }
        return total;
    }

    // Método para encontrar el cliente con el mayor saldo
    public String consultarClienteMayorSaldo() {
        // Inicializa una variable para almacenar el mayor saldo encontrado y el nombre del cliente
        double mayorSaldo = 0;
        String clienteMayorSaldo = "";
        // Recorre la lista de cuentas  y compara los saldos
        for (Cuenta cuenta : cuentas) {
            if (cuenta.getSaldo() > mayorSaldo) {
                mayorSaldo = cuenta.getSaldo();
                clienteMayorSaldo = cuenta.getTitular().getNombre();
            }
        }
        return clienteMayorSaldo;
    }
}