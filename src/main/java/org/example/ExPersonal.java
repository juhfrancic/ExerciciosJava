package org.example;

public class ExPersonal {
    static void sacar (double saldo, double valor) throws
            SaldoInsuficienteException {
            if(valor > saldo){
                throw new SaldoInsuficienteException("Saldo insuficiente! Saldo: " + saldo);

        }
    }

    public static void main(String[] args){
        try{
            sacar(100, 500);
        }catch(SaldoInsuficienteException ex){
            System.out.println("Erro:" + ex.getMessage());
        }
    }
}
