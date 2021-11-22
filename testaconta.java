public class testaconta {
    public static void main (String[] args){
        Contacorrente cc1 = new Contacorrente(22,1,"Santander",1200.00,21000.00,20);
        System.out.println(cc1);


        System.out.println("o saldo da conta corrente é R$ " +cc1.getSaldo());




       ContaPoupanca p1 = new ContaPoupanca(2,22,"Caixa",10.50,21,1.2,5);

        System.out.println("o saldo da conta Poupanca é R$ " + p1.getSaldo());


        ContaSalario S1 =new ContaSalario(21,25,"Mentorama",5000.00,4,500.00,0);

        System.out.println(" Seu limite na conta Salario é R$: "  +  S1.getSaldo());



    }

}
