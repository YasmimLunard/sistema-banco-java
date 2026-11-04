
package sistema.banco.java;


public class Conta {
    private int numero;
    private String titular;
    private double saldo;

    public Conta(int numero, String titular) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = 0;
    }

    public int getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }
    public void depositar(double valor){
        if (valor > 0){
            this.saldo = valor + this.saldo;
        }else{
            System.out.println("Valor Inválido!");
        }
    }
        public boolean sacar(double valor){
            if (valor > 0 && valor <= this.saldo){
            this.saldo = this.saldo - valor;
            return true;
           }else{
                   System.out.println("Saldo insuficiente!");
                   return false;
                   }
        }
        public void exibirSaldo(){
            System.out.println("Conta" +numero+ " - " 
                    +titular+ " | Saldo: R$ " +String.format("%.2f", saldo));
        }
    }

