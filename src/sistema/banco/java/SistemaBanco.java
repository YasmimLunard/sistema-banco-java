/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistema.banco.java;

/**
 *
 * @author aluno
 */
public class SistemaBanco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ContaCorrente c1 = new ContaCorrente(1, "Ana", 15.00);
        ContaPoupanca c2 = new ContaPoupanca(2, "Bruno", 0.01);
        
        c1.depositar(100);
        c2.depositar(100);
        
        c1.exibirSaldo();
        c2.exibirSaldo();
        
        c1.sacar(500);
        c1.depositar(-10);
        
        c1.fecharMes();
        c2.fecharMes();
        
        c1.exibirSaldo();
        c2.exibirSaldo();
                
    }
    
}
