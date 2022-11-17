package EquacaoLinear;

import javax.swing.*;
import java.awt.*;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.net.MalformedURLException;
import java.rmi.NotBoundException;

public class ClienteRMISI {
    public static void main(String[] args) {
        String strA, strB, strC, strD, strE, strF, resp;
        double A, B, C, D, E, F, x, y, det, detx, dety;
        JOptionPane.showMessageDialog( null, "A*x + B*y = C\nD*x + E*y = F", "Resolução Eq. Linear: ", JOptionPane.INFORMATION_MESSAGE);
        strA = JOptionPane.showInputDialog( "Entre com o valor de A" );
        strB = JOptionPane.showInputDialog( "Entre com o valor de B" );
        strC = JOptionPane.showInputDialog( "Entre com o valor de C" );
        strD = JOptionPane.showInputDialog( "Entre com o valor de D" );
        strE = JOptionPane.showInputDialog( "Entre com o valor de E" );
        strF = JOptionPane.showInputDialog( "Entre com o valor de F" );
        A = Double.parseDouble( strA );
        B = Double.parseDouble( strB );
        C = Double.parseDouble( strC );
        D = Double.parseDouble( strD );
        E = Double.parseDouble( strE );
        F = Double.parseDouble( strF );
        try {
            RMISI si = (RMISI) Naming.lookup("//10.215.1.31/SIService");
            resp = si.resolverSistemaLinear( A, B, C, D, E, F);
            System.out.println(resp);
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