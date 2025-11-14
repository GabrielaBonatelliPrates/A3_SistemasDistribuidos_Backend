package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;
import model.Categoria;
import model.Produto;

public interface RemoteProduto extends Remote {

    void cadastrarProduto(String nomeProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque,
            int estoqueMinimo, int estoqueMaximo, String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException;

    boolean atualizarProdutoBD(int idProduto, String nomeProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque,
            int estoqueMinimo, int estoqueMaximo, String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException;

    boolean deletarProdutoBD(int idProduto)
            throws RemoteException;

    Produto buscarPorId(int idProduto)
            throws RemoteException;

    Produto buscarPorNome(String nomePesquisado)
            throws RemoteException;

    List<Produto> pegarProdutos()
            throws RemoteException;

    List<Produto> produtosOrdemAlfabética()
            throws RemoteException;

    List<Produto> pegarProdutosAbaixoMinimo()
            throws RemoteException;

    List<Produto> pegarProdutosAcimaMaximo()
            throws RemoteException;

    double valorTotal()
            throws RemoteException;

    String fichaProduto(String nomePesquisado)
            throws RemoteException;

    String verificaProduto(String nomePesquisado)
            throws RemoteException;
    
    boolean atualizarPreco(String nome, double preco, int id) 
            throws RemoteException;
    
    List<Produto> produtosCategoria(Categoria categoriaPesquisada) 
            throws RemoteException;
}
