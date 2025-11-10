
package implementacao;

import dao.CategoriaDAO;
import dao.ProdutoDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import remote.RemoteProduto;

public class ProdutoImpl extends UnicastRemoteObject implements RemoteProduto {
    private ProdutoDAO produtoDAO;

    public ProdutoImpl(ProdutoDAO produtoDAO) throws RemoteException {
        super(); //Para poder acessar o objeto remotamente via RMI (utilizando o UnicastRemoteObject)
        this.produtoDAO = produtoDAO;
    }
    
    @Override
    public void cadastrarProduto(String nomeProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque,
           int estoqueMinimo, int estoqueMaximo,String nomeCategoria, String tamanho, String embalagem)throws RemoteException {
        produtoDAO.cadastrarProduto(nomeProduto, precoUnit, unidadeProduto, quantidadeEstoque, 
                estoqueMinimo, estoqueMaximo, nomeCategoria, tamanho, embalagem);
    }
    
    @Override
    public boolean atualizarProdutoBD(int idProduto, String nomeProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque,
            int estoqueMinimo, int estoqueMaximo, String nomeCategoria, String tamanho, String embalagem) throws RemoteException {
        return produtoDAO.atualizarProdutoBD(idProduto, nomeProduto, precoUnit, unidadeProduto, quantidadeEstoque, 
                estoqueMinimo, estoqueMaximo, nomeCategoria, tamanho, embalagem);
    }
    
    @Override
    public boolean deletarProdutoBD(int idProduto) throws RemoteException{
        return produtoDAO.deletarProdutoBD(idProduto);
    }
    
}
