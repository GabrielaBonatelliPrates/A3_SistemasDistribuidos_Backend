
package implementation;

import dao.Conexao;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import remote.RemoteConexao;

/**
 *
 * @author Cesar Augusto
 */

public class ConexaoImpl extends UnicastRemoteObject implements RemoteConexao {

    /**
     *
     * @throws RemoteException  envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    public ConexaoImpl() throws RemoteException {
        super();
    }

    /**
     *
     * @return
     * @throws RemoteException  envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public boolean testarConexao() throws RemoteException {
        Connection connection = null;
        try {
            connection = Conexao.conectar();
            return connection != null && !connection.isClosed();
        } catch (Exception e) {
            return false;
        } finally {
            try {
                if (connection != null && !connection.isClosed()) {
                    connection.close();
                }
            } catch (Exception ignored) {
            }
        }
    }
}