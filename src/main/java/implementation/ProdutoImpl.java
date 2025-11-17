package implementation;

import dao.CategoriaDAO;
import dao.ProdutoDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.List;
import model.Categoria;
import model.Produto;
import remote.RemoteProduto;

/**
 *
 * @author GabrielaBonatelliPrates
 */
public class ProdutoImpl extends UnicastRemoteObject implements RemoteProduto {

    private ProdutoDAO produtoDAO;
    
    /**
     *
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    public ProdutoImpl() throws RemoteException {
        super(); //Para poder acessar o objeto remotamente via RMI (utilizando o UnicastRemoteObject)
        this.produtoDAO = new ProdutoDAO(new CategoriaDAO());
    }
    
    /**
     *
     * @param nomeProduto parametro necessário para cadastrar o nome de um novo produto
     * @param precoUnit parametro necessário para cadastrar o preço unitário de um novo produto
     * @param unidadeProduto parametro necessário para cadastrar a unidade de medida de um novo produto
     * @param quantidadeEstoque parametro necessário para cadastrar a quantidade em estoque de um novo produto
     * @param estoqueMinimo parametro necessário para cadastrar o estoque minimo de um novo produto
     * @param estoqueMaximo parametro necessário para cadastrar o estoque maximo de um novo produto
     * @param nomeCategoria parametro necessário para cadastrar o nome da categoria de um novo produto
     * @param tamanho parametro necessário para cadastrar o tamanho de um novo produto
     * @param embalagem parametro necessário para cadastrar a embalagem de um novo produto
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public void cadastrarProduto(String nomeProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque,
            int estoqueMinimo, int estoqueMaximo, String nomeCategoria, String tamanho, String embalagem) throws RemoteException {
        produtoDAO.cadastrarProduto(nomeProduto, precoUnit, unidadeProduto, quantidadeEstoque,
                estoqueMinimo, estoqueMaximo, nomeCategoria, tamanho, embalagem);
    }
    
    /**
     *
     * @param nomeProduto parametro necessário para atualizar o nome de um novo produto
     * @param precoUnit parametro necessário para atualizar o preço unitário de um novo produto
     * @param unidadeProduto parametro necessário para atualizar a unidade de medida de um novo produto
     * @param quantidadeEstoque parametro necessário para atualizar a quantidade em estoque de um novo produto
     * @param estoqueMinimo parametro necessário para atualizar o estoque minimo de um novo produto
     * @param estoqueMaximo parametro necessário para atualizar o estoque maximo de um novo produto
     * @param nomeCategoria parametro necessário para atualizar o nome da categoria de um novo produto
     * @param tamanho parametro necessário para atualizar o tamanho de um novo produto
     * @param embalagem parametro necessário para atualizar a embalagem de um novo produto
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public boolean atualizarProdutoBD(int idProduto, String nomeProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque,
            int estoqueMinimo, int estoqueMaximo, String nomeCategoria, String tamanho, String embalagem) throws RemoteException {
        return produtoDAO.atualizarProdutoBD(idProduto, nomeProduto, precoUnit, unidadeProduto, quantidadeEstoque,
                estoqueMinimo, estoqueMaximo, nomeCategoria, tamanho, embalagem);
    }
    
    /**
     *
     * @param idProduto parametro necessário para deletar um produto pelo Id do mesmo
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public boolean deletarProdutoBD(int idProduto) throws RemoteException {
        return produtoDAO.deletarProdutoBD(idProduto);
    }
    
    /**
     *
     * @param idProduto parametro necessário para buscar um produto pelo Id do mesmo
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public Produto buscarPorId(int idProduto) throws RemoteException {
        return produtoDAO.buscarPorId(idProduto);
    }
    
    /**
     *
     * @param nomePesquisado parametro necessário para buscar um produto pelo nome do mesmo
     * @return 
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public Produto buscarPorNome(String nomePesquisado) throws RemoteException {
        return produtoDAO.buscarPorNome(nomePesquisado);
    }
    
    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public List<Produto> pegarProdutos() throws RemoteException {
        return produtoDAO.pegarProdutos();
    }
    
    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public List<Produto> produtosOrdemAlfabética() throws RemoteException {
        return produtoDAO.produtosOrdemAlfabética();
    }
    
    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public List<Produto> pegarProdutosAbaixoMinimo() throws RemoteException {
        return produtoDAO.pegarProdutosAbaixoMinimo();
    }
    
    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public List<Produto> pegarProdutosAcimaMaximo() throws RemoteException {
        return produtoDAO.pegarProdutosAcimaMaximo();
    }
    
    /**
     *
     * @return 
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public double valorTotal() throws RemoteException {
        return produtoDAO.valorTotal();
    }
    
    /**
     *
     * @param nomePesquisado parametro necessário para mostrar as caracteristicas de um produto pelo nome do mesmo
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */ 
    @Override
    public String fichaProduto(String nomePesquisado) throws RemoteException {
        return produtoDAO.fichaProduto(nomePesquisado);
    }
    
    /**
     *
     * @param nomePesquisado parametro necessário para verificar a existência de um produto pelo nome do mesmo
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public String verificaProduto(String nomePesquisado) throws RemoteException {
        return produtoDAO.verificaProduto(nomePesquisado);
    }
    
    /**
     *
     * @param nome parametro necessário para atualizar o nome de um produto
     * @param preco parametro necessário para atualizar o preço de um produto
     * @param id parametro necessário para atualizar o Id de um produto caso seja necessário 
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public boolean atualizarPreco(String nome, double preco, int id) throws RemoteException{
        return produtoDAO.atualizarPreco(nome, preco, id);
    }
    
    /**
     *
     * @param categoriaPesquisada parametro necessário para definir os produtos pertencentes a uma mesma categoria
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public List<Produto> produtosCategoria(Categoria categoriaPesquisada) throws RemoteException{
        return produtoDAO.produtosCategoria(categoriaPesquisada);
    }
    
}
