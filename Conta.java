public abstract class Conta {

    private int numero;
    private  int agencia;
    private  String banco;
    protected   double saldo;
    protected double deposito;
    protected int saques;
    protected double limitedesaque;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public double getLimiteDesaque() {
        return limitedesaque;
    }

    public void setLimiteDesaque(double limiteDesaque) {
        this.limitedesaque = limiteDesaque;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public abstract double getDeposito();



    public void setDeposito(double deposito) {

        this.deposito = deposito;
    }


    public abstract int getSaques();



    public void setSaques(int saques) {
        this.saques = saques;
    }

    public abstract double getSaldo();

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Conta(int numero, int agencia, String banco, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.banco = banco;
        this.saldo = saldo;

    }

    @Override
    public String toString() {
        return  "Conta { "  +
                " numero = "  +  numero  +
                " ,  agencia = " + agencia +
                " , banco = ' "  + banco + '\'' +
                ", saldo=" + saldo +
                '}';
    }
}