public class ContaPoupanca extends Conta {

    @Override
    public void imprimirExtrato() {
        // TODO Auto-generated method stub
        System.out.println("Extrato Conta Poupanca");
        super.imprimirInfosComuns();
    }

}
