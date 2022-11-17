package EquacaoLinear;

public class RMISIImp extends java.rmi.server.UnicastRemoteObject implements RMISI {
    public RMISIImp() throws java.rmi.RemoteException {
    super();
}
   
public String resolverSistemaLinear( double a, double b, double c, double d, double e, double f ) throws java.rmi.RemoteException {
    double det, detx, dety, x, y;
    String resp;
    det = a*e - b*d;
    if( det != 0 ) {
        detx = c*e - b*f;
        dety = a*f - c*d;
        x = detx / det;
        y = dety / det;
        resp = "Resolução do sistema linear\nX = " + x + "\nY = "+ y;
    }
    else {
        resp = "O sistema linear não possui solução finita";
    }
    return resp;
    }
}