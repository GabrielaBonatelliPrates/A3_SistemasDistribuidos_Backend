package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
public interface RemoteConexao extends Remote {

    public  boolean testarConexao() throws RemoteException;
}
