package Calculadora;
import java.rmi.Naming;
public class ServidorCalculadora {
public ServidorCalculadora() {
try {
Calculadora obj = new CalculadoraImp( );
Naming.rebind("//10.16.1.240/CalculatorService", obj);
}
catch( Exception e) {
System.out.println("Erro: " + e);
}
}
public static void main( String[] args ) {
new ServidorCalculadora( );
}
}
