public class Contacorrente  extends Conta {
    protected double chequeEspecial;
    protected double limitedeSaque;


    public Contacorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial, double limitedeSaque) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
        this.limitedeSaque = saldo + chequeEspecial;



    }




    public double getSaldo() {
        return this.chequeEspecial;


    }
    @Override
    public String toString() {
        return "Seu limite de cheque especial é "+ chequeEspecial;
                }


    @Override
    public double getDeposito() {
        return 20;
    }

    @Override
    public int getSaques() {
        return 5;
    }

    public double getLimitedeSaque() {
        return saldo + chequeEspecial;
    }
}

