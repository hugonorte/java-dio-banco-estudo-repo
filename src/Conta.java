public abstract class Conta implements IConta {

private static final int AGENCIA_PADRAO = 001;
private static int SEQUENCIAL = 1;

protected int agencia;
protected int numero;
protected double saldo;

public Conta() {
    this.agencia = Conta.AGENCIA_PADRAO;
    this.numero = SEQUENCIAL++;
}

@Override
public void depositar(double valor) {
    saldo = saldo + valor;
}



@Override
public void sacar(double valor) {
    saldo = saldo - valor;
    
}



@Override
public void transferir(double valor, Conta contaDestino) {
    this.sacar(valor);
    contaDestino.depositar(valor);
}

protected void imprimirInfosComuns() {
        System.out.println("Agencia: " + this.agencia);
        System.out.println("Numero: " + this.numero);
        System.out.println("Saldo: " + this.saldo);
    }



public int getAgencia() {
    return agencia;
}
public void setAgencia(int agencia) {
    this.agencia = agencia;
}
public int getNumero() {
    return numero;
}
public void setNumero(int numero) {
    this.numero = numero;
}
public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}

}
