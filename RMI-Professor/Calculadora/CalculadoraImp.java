package Calculadora;
public class CalculadoraImp extends java.rmi.server.UnicastRemoteObject implements
Calculadora {
public CalculadoraImp() throws java.rmi.RemoteException {
super( );
}
public double soma(double a, double b) throws java.rmi.RemoteException {
return ( a + b );
}
public double subtracao(double a, double b) throws java.rmi.RemoteException {
return ( a - b );
}
public double multiplicacao(double a, double b) throws java.rmi.RemoteException {
return ( a * b );
}
public double divisao(double a, double b) throws java.rmi.RemoteException {
return ( a / b );
}
}
