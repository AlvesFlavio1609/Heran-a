public class ContaPoupanca extends Conta {
    private int vencimento;
    private double taxadeJurus;
    private double limitedeDepositos;


    public ContaPoupanca(int numero, int agencia, String banco, double saldo, int vencimento, double taxadeJurus, double limitedeDepositos) {
        super(numero, agencia, banco, saldo);
        this.vencimento = vencimento;
        this.taxadeJurus = taxadeJurus;
        this.limitedeDepositos = limitedeDepositos;
    }

    @Override
    public double getSaldo() {
        return this.saldo + this.taxadeJurus + this.saldo;

    }

    @Override
    public double getDeposito() {
        return 20;
    }

    @Override
    public int getSaques() {
        return 5;
    }
}

