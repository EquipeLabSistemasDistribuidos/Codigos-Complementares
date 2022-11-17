package EquacaoLinear;

import java.rmi.Naming;

public class ServidorRMISI {
    public ServidorRMISI() {
        try {
            RMISI obj = new RMISIImp();
            Naming.rebind("//10.215.1.31/SIService", obj);
        }
        catch( Exception e) {
            System.out.println("Erro: " + e);
        }
    }

    public static void main(String[] args) {
        // TODO code application logic here
        new ServidorRMISI();
    }
}