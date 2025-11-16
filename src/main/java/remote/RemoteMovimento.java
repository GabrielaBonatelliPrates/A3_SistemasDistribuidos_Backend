package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import model.MovimentacaoEstoque;

/**
 *
 * @author Davi-Wolff
 */
public interface RemoteMovimento extends Remote{
    
    public void cadastraMovimentacao(MovimentacaoEstoque movimentacao) throws SQLException,RemoteException;
    
    public void inserirMovimentacao(int idMovimentacao, int idProduto, Date data, int quantidadeMovimentada, String nomeProduto, String tipoMovimentacao) throws SQLException,RemoteException;
    
    public List<MovimentacaoEstoque> listarProdutosMovimentados() throws SQLException,RemoteException;

    public void adicionarQuantidade(int idProduto, int quantidadeAdicionar)throws RemoteException;

    public void retirarQuantidade(int idProduto, int quantidadeRetirar)throws RemoteException;
    
}
