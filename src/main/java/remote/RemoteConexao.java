package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Cesar Augusto
 */
public interface RemoteConexao extends Remote {

    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    public  boolean testarConexao() throws RemoteException;
}
