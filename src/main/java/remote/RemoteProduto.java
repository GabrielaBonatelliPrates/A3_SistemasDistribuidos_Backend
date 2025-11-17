package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Categoria;
import model.Produto;

/**
 *
 * @author GabrielaBonatelliPrates
 */
public interface RemoteProduto extends Remote {

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
    void cadastrarProduto(String nomeProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque,
            int estoqueMinimo, int estoqueMaximo, String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException;

    /**
     *
     * @param idProduto parametro necessário para atualizar o Id de um novo produto
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
    boolean atualizarProdutoBD(int idProduto, String nomeProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque,
            int estoqueMinimo, int estoqueMaximo, String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException;

    /**
     *
     * @param idProduto parametro necessário para deletar um produto pelo Id do mesmo
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    boolean deletarProdutoBD(int idProduto)
            throws RemoteException;

    /**
     *
     * @param idProduto parametro necessário para buscar um produto pelo Id do mesmo
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    Produto buscarPorId(int idProduto)
            throws RemoteException;

    /**
     *
     * @param nomePesquisado parametro necessário para buscar um produto pelo nome do mesmo
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    Produto buscarPorNome(String nomePesquisado)
            throws RemoteException;

    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    List<Produto> pegarProdutos()
            throws RemoteException;

    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    List<Produto> produtosOrdemAlfabética()
            throws RemoteException;

    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    List<Produto> pegarProdutosAbaixoMinimo()
            throws RemoteException;

    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    List<Produto> pegarProdutosAcimaMaximo()
            throws RemoteException;

    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    double valorTotal()
            throws RemoteException;

    /**
     *
     * @param nomePesquisado parametro necessário para mostrar as caracteristicas de um produto pelo nome do mesmo
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    String fichaProduto(String nomePesquisado)
            throws RemoteException;

    /**
     *
     * @param nomePesquisado parametro necessário para verificar a existência de um produto pelo nome do mesmo
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    String verificaProduto(String nomePesquisado)
            throws RemoteException;
    
    /**
     *
     * @param nome parametro necessário para atualizar o nome de um produto
     * @param preco parametro necessário para atualizar o preço de um produto
     * @param id parametro necessário para atualizar o Id de um produto caso seja necessário 
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    boolean atualizarPreco(String nome, double preco, int id) 
            throws RemoteException;
    
    /**
     *
     * @param categoriaPesquisada parametro necessário para definir os produtos pertencentes a uma mesma categoria
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    List<Produto> produtosCategoria(Categoria categoriaPesquisada) 
            throws RemoteException;
}
