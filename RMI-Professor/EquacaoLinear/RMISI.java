package EquacaoLinear;

public interface RMISI extends java.rmi.Remote {
    public String resolverSistemaLinear( double a, double b, double c, double d, double e, double f ) throws java.rmi.RemoteException;
}