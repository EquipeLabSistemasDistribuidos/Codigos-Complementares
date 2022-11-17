package Calculadora;
public interface Calculadora extends java.rmi.Remote {
public double soma( double a, double b ) throws java.rmi.RemoteException;
public double subtracao( double a, double b ) throws java.rmi.RemoteException;
public double multiplicacao( double a, double b ) throws java.rmi.RemoteException;
public double divisao( double a, double b ) throws java.rmi.RemoteException;
}
