package pratica.caixaEletronico;

public class CaixaEletronico {
    private float SALDO = 0;

    public float imprimiSaldo() {
        return this.SALDO;
    }

    public float adcionaSaldo(float valor) {
        return this.SALDO += valor;
    }

    public float retiraSaldo(float valor){
        if(this.SALDO <= 0) {
            System.out.println("Conta Negativa não é permitido saque");
        }
        return this.SALDO -= valor;
    }

}
