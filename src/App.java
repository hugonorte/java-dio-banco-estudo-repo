public class App {
    public static void main(String[] args) throws Exception {
        Conta cc = new ContaCorrente();
        cc.depositar(100);
        
        Conta cp = new ContaPoupanca();
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
