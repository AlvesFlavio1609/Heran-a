public class Contacorrente  extends Conta{
    private double chequeEspecial;
    private double limitedeDepositos;


    public Contacorrente(int numero, int agencia, String banco, double saldo, double chequeEspecial, double limitedeDepositos) {
        super(numero, agencia, banco, saldo);
        this.chequeEspecial = chequeEspecial;
        this.limitedeDepositos = limitedeDepositos;
    }

    @Override
    public String toString() {
        return "Contacorrente{" +
                "chequeEspecial=" + chequeEspecial +
                '}';
    }


    public double getSaldo(){
        return this.chequeEspecial + saldo;


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
