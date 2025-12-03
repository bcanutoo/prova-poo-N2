public class ContaCorrente implements Conta {

    private double saldo;

    public ContaCorrente() {
        saldo = 0;
    }

    public ContaCorrente(double s) {
        saldo = s;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        double taxa = valor * 0.20;
        double total = valor + taxa;

        if (total > saldo) {
            System.out.println("Saldo insuficiente com taxa");
            return;
        }

        saldo -= total;
        System.out.println("Sacou " + valor + " (+ taxa " + taxa + ") saldo: " + saldo);
    }

    public void depositar(double valor) {
        double taxa = valor * 0.20;
        double liquido = valor - taxa;

        saldo += liquido;
        System.out.println("Depositou " + valor + " (- taxa " + taxa + ") saldo: " + saldo);
    }
}
