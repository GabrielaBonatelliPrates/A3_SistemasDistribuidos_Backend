package implementation;

import dao.CategoriaDAO;
import dao.MovimentacaoDAO;
import dao.ProdutoDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import model.MovimentacaoEstoque;
import remote.RemoteMovimento;

/**
 *
 * @author Davi-Wolff
 */
public class MovimentacaoImpl extends UnicastRemoteObject implements RemoteMovimento{
    
    private MovimentacaoDAO movimentacao;

    /**
     *
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    public MovimentacaoImpl() throws RemoteException {
        super();
        this.movimentacao = new MovimentacaoDAO(new ProdutoDAO(new CategoriaDAO()));
    }
    
    /**
     *
     * @param movEstoque parametro necessário para poder realizar uma movimentação em algum produto
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */ 
    @Override
    public void cadastraMovimentacao(MovimentacaoEstoque movEstoque) throws SQLException,RemoteException{
        this.movimentacao.cadastraMovimentacao(movEstoque);
    }
    
    /**
     *
     * @param idMovimentacao parametro necessário para atribuir um id à uma nova movimentação de produto 
     * @param idProduto parametro necessário para reconhecer o id do produto a ser movimentado 
     * @param data parametro necessário para definir a data na qual a movimentação foi efetivada
     * @param quantidadeMovimentada parametro necessário para definir a quantidade de produto a ser movimentada 
     * @param nomeProduto parametro necessário para definir o nome do produto que será movimentado
     * @param tipoMovimentacao parametro necessário para definir o tipo de movimentação à qual o produto será submetido
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public void inserirMovimentacao(int idMovimentacao, int idProduto, Date data, int quantidadeMovimentada, String nomeProduto, String tipoMovimentacao) throws SQLException,RemoteException{
        movimentacao.inserirMovimentacao(idMovimentacao, tipoMovimentacao,  idProduto, nomeProduto,  quantidadeMovimentada, data);
    }
    
    /**
     *
     * @return
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public List<MovimentacaoEstoque> listarProdutosMovimentados() throws SQLException,RemoteException{
        return movimentacao.listarProdutosMovimentados();
    }
    
    /**
     *
     * @param idProduto parametro necessário para reconhecer o id do produto a ser movimentado 
     * @param quantidadeAdicionar parametro necessário para definiar a quantidade a ser acresentada a algum produto 
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public void adicionarQuantidade(int idProduto, int quantidadeAdicionar)throws RemoteException{
        movimentacao.adicionarQuantidade(idProduto, quantidadeAdicionar);
    }
    
    /**
     *
     * @param idProduto parametro necessário para reconhecer o id do produto a ser movimentado 
     * @param quantidadeRetirar parametro necessário para definiar a quantidade a ser reduzida a algum produto 
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public void retirarQuantidade(int idProduto, int quantidadeRetirar)throws RemoteException{
        movimentacao.retirarQuantidade(idProduto, quantidadeRetirar);
    }
    
}
