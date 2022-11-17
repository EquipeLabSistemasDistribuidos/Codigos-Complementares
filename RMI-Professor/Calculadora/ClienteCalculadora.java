package Calculadora;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;
public class ClienteCalculadora {
public static void main( String[] args ) {
try {
Calculadora c = (Calculadora) Naming.lookup("//10.16.1.240/CalculatorService");
System.out.println( c.soma(4, 3) );
System.out.println( c.subtracao(4, 5) );
System.out.println( c.multiplicacao(3, 6) );
System.out.println( c.divisao(9, 3) );
}
catch ( MalformedURLException murle ) {
System.out.println( );
System.out.println( "MalformedURLException" );
System.out.println( murle );
}
catch ( RemoteException re ) {
System.out.println( );
System.out.println( "RemoteException" );
System.out.println( re );
}
catch ( NotBoundException nbe ) {
System.out.println( );
System.out.println( "NotBoundException" );
System.out.println( nbe );
}
catch ( java.lang.ArithmeticException ae ) {
System.out.println( );
System.out.println( "java.lang.ArithmeticException" );
System.out.println( ae );
}
}
}
