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
    
    /**
     *
     * @param movimentacao parametro necessário para cadastrar uma nova movimentação
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    public void cadastraMovimentacao(MovimentacaoEstoque movimentacao) throws SQLException,RemoteException;
    
    /**
     *
     * @param idMovimentacao parametro necessário para cadastrar o id de uma nova movimentação
     * @param idProduto parametro necessário para definir o Id do produto a ser movimentado
     * @param data parametro necessário para definir a data de uma nova movimentação
     * @param quantidadeMovimentada parametro necessário para definiar a quantidade a ser alterada de uma nova movimentação
     * @param nomeProduto parametro necessário para definir o produto a ser movimentado
     * @param tipoMovimentacao parametro necessário para definir o tipo de uma nova movimentação
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    public void inserirMovimentacao(int idMovimentacao, int idProduto, Date data, int quantidadeMovimentada, String nomeProduto, String tipoMovimentacao) throws SQLException,RemoteException;
    
    /**
     *
     * @return
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    public List<MovimentacaoEstoque> listarProdutosMovimentados() throws SQLException,RemoteException;

    /**
     *
     * @param idProduto parametro necessário para definir o Id do produto a ser movimentado
     * @param quantidadeAdicionar parametro necessário para definir a quantidade a ser acresentada de um produto 
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    public void adicionarQuantidade(int idProduto, int quantidadeAdicionar)throws RemoteException;

    /**
     *
     * @param idProduto parametro necessário para definir o Id do produto a ser movimentado
     * @param quantidadeRetirar parametro necessário para definir a quantidade a ser retirada de um produto 
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    public void retirarQuantidade(int idProduto, int quantidadeRetirar)throws RemoteException;
    
}
