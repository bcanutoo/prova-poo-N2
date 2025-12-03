public class ContaPoupanca implements Conta {

    private double saldo;

    public ContaPoupanca() {
        saldo = 0;
    }

    public ContaPoupanca(double s) {
        saldo = s;
    }

    public double getSaldo() {
        return saldo;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            System.out.println("Sem saldo");
            return;
        }
        saldo -= valor;
        System.out.println("Sacou " + valor + ", saldo agora: " + saldo);
    }

    public void depositar(double valor) {
        saldo += valor;
        System.out.println("Depositou " + valor + ", saldo agora: " + saldo);
    }
}
