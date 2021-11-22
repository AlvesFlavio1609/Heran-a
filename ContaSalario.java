public class ContaSalario extends Conta{
    private int limitedeSaque;
    private double bonusporCaridade;
    private double limitedeDepositos;

    public ContaSalario(int numero, int agencia, String banco, double saldo, int limitedeSaque, double bonusporCaridade, double limitedeDepositos) {
        super(numero, agencia, banco, saldo);
        this.limitedeSaque = limitedeSaque;
        this.bonusporCaridade = bonusporCaridade;
        this.limitedeDepositos = limitedeDepositos;
    }

    @Override
    public double getSaldo() {
        return this.saldo + this.bonusporCaridade;

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
