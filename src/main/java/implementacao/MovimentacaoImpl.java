/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementacao;

import dao.CategoriaDAO;
import dao.MovimentacaoDAO;
import dao.ProdutoDAO;
import java.rmi.RemoteException;
import java.rmi.server.RMIClientSocketFactory;
import java.rmi.server.RMIServerSocketFactory;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import model.MovimentacaoEstoque;
import remote.RemoteMovimento;

/**
 *
 * @author daviw
 */
public class MovimentacaoImpl extends UnicastRemoteObject implements RemoteMovimento{
    
    private MovimentacaoDAO movimentacao;

     public MovimentacaoImpl() throws RemoteException {
        super();
        this.movimentacao = new MovimentacaoDAO(new ProdutoDAO(new CategoriaDAO()));
    }
    
    @Override
    public void cadastraMovimentacao(MovimentacaoEstoque movEstoque) throws SQLException,RemoteException{
        this.movimentacao.cadastraMovimentacao(movEstoque);
    }
    
    @Override
    public void inserirMovimentacao(int idMovimentacao, int idProduto, Date data, int quantidadeMovimentada, String nomeProduto, String tipoMovimentacao) throws SQLException,RemoteException{
        movimentacao.inserirMovimentacao(idMovimentacao, tipoMovimentacao,  idProduto, nomeProduto,  quantidadeMovimentada, data);
    }
    
    @Override
    public List<MovimentacaoEstoque> listarProdutosMovimentados() throws SQLException,RemoteException{
        return movimentacao.listarProdutosMovimentados();
    }
    
    @Override
    public void adicionarQuantidade(int idProduto, int quantidadeAdicionar)throws RemoteException{
        movimentacao.adicionarQuantidade(idProduto, quantidadeAdicionar);
    }
    
    @Override
    public void retirarQuantidade(int idProduto, int quantidadeRetirar)throws RemoteException{
        movimentacao.retirarQuantidade(idProduto, quantidadeRetirar);
    }
    
}
