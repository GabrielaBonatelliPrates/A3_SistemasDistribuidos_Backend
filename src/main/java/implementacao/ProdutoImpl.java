package implementacao;

import dao.CategoriaDAO;
import dao.ProdutoDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Categoria;
import model.Produto;
import remote.RemoteProduto;

public class ProdutoImpl extends UnicastRemoteObject implements RemoteProduto {

    private ProdutoDAO produtoDAO;
    
    public ProdutoImpl() throws RemoteException {
        super(); //Para poder acessar o objeto remotamente via RMI (utilizando o UnicastRemoteObject)
        this.produtoDAO = new ProdutoDAO(new CategoriaDAO());
    }
    
    
    @Override
    public void cadastrarProduto(String nomeProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque,
            int estoqueMinimo, int estoqueMaximo, String nomeCategoria, String tamanho, String embalagem) throws RemoteException {
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
    public boolean deletarProdutoBD(int idProduto) throws RemoteException {
        return produtoDAO.deletarProdutoBD(idProduto);
    }
    
    @Override
    public Produto buscarPorId(int idProduto) throws RemoteException {
        return produtoDAO.buscarPorId(idProduto);
    }
    
    @Override
    public Produto buscarPorNome(String nomePesquisado) throws RemoteException {
        return produtoDAO.buscarPorNome(nomePesquisado);
    }
    
    @Override
    public List<Produto> pegarProdutos() throws RemoteException {
        return produtoDAO.pegarProdutos();
    }
    
    @Override
    public List<Produto> produtosOrdemAlfabética() throws RemoteException {
        return produtoDAO.produtosOrdemAlfabética();
    }
    
    @Override
    public List<Produto> pegarProdutosAbaixoMinimo() throws RemoteException {
        return produtoDAO.pegarProdutosAbaixoMinimo();
    }
    
    @Override
    public List<Produto> pegarProdutosAcimaMaximo() throws RemoteException {
        return produtoDAO.pegarProdutosAcimaMaximo();
    }
    
    @Override
    public double valorTotal() throws RemoteException {
        return produtoDAO.valorTotal();
    }
    
    @Override
    public String fichaProduto(String nomePesquisado) throws RemoteException {
        return produtoDAO.fichaProduto(nomePesquisado);
    }
    
    @Override
    public String verificaProduto(String nomePesquisado) throws RemoteException {
        return produtoDAO.verificaProduto(nomePesquisado);
    }
    
    @Override
    public boolean atualizarPreco(String nome, double preco, int id) throws RemoteException{
        return produtoDAO.atualizarPreco(nome, preco, id);
    }
    
    @Override
    public List<Produto> produtosCategoria(Categoria categoriaPesquisada) throws RemoteException{
        return produtoDAO.produtosCategoria(categoriaPesquisada);
    }
    
}
