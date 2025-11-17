package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Categoria;

/**
 *
 * @author Mateo-Padilla
 */
public interface RemoteCategoria extends Remote {

    /**
     *
     * @param idCategoria parametro necessário para cadastrar o Id de uma categoria 
     * @param nomeCategoria parametro necessário para cadastrar o nome de uma categoria 
     * @param tamanho parametro necessário para cadastrar o tamanho de uma categoria 
     * @param embalagem parametro necessário para cadastrar o tipo de embalagem de uma categoria 
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     */
    void cadastrarCategoria(int idCategoria, String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException, SQLException;

    /**
     *
     * @return
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    public DefaultTableModel tabelaAtualizada()
            throws SQLException, RemoteException;

    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    List<Categoria> mostrarCategorias()
            throws RemoteException;

    /**
     *
     * @param idCategoria parametro necessário para buscar uma categoria pelo Id da mesma
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    Categoria buscarCategoriaPorId(int idCategoria)
            throws RemoteException;

    /**
     *
     * @param nomePesquisado parametro necessário para mostrar uma categoria quando pesquisada pelo nome da mesma 
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    Categoria buscarPorNome(String nomePesquisado)
            throws RemoteException;

    /**
     *
     * @param nomeCategoria parametro necessário para atualizar o nome de uma categoria 
     * @param tamanho parametro necessário para atualizar o tamanho de uma categoria 
     * @param embalagem parametro necessário para atualizar o tipo de embalagem de uma categoria 
     * @param idCategoria parametro necessário para atualizar o Id de uma categoria 
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    boolean atualizarCategoria(String nomeCategoria, String tamanho, String embalagem, int idCategoria)
            throws RemoteException;

    /**
     *
     * @param idCategoria parametro necessário para apagar uma categoria pelo Id da mesma
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    boolean deletarCategoria(int idCategoria)
            throws RemoteException;

    /**
     *
     * @param nomePesquisado parametro necessário para mostrar as caracteristicas de uma categoria pelo nome
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    String fichaCategoria(String nomePesquisado)
            throws RemoteException;

    /**
     *
     * @param categoria parametro necessário para bsucar uma categoria pelo Id
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    int buscarIdCategoria(Categoria categoria)
            throws RemoteException;

    /**
     *
     * @param nomeCategoria parametro necessário para bsucar uma categoria 
     * @param tamanho parametro necessário para bsucar uma categoria 
     * @param embalagem parametro necessário para bsucar uma categoria 
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    Categoria buscarCategoria(String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException;

    /**
     *
     * @param nomeCategoria parametro necessário para verificar a existência de uma categoria 
     * @param tamanho parametro necessário para verificar a existência de uma categoria 
     * @param embalagem parametro necessário para verificar a existência de uma categoria 
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     */
    boolean verificaCategoria(String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException, SQLException;

    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    List<Categoria> pegarCategorias()
            throws RemoteException;

    /**
     *
     * @param nomeCategoria parametro necessário para mostrar as categorias listadas
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    List<Categoria> devolveCategorias(String nomeCategoria)
            throws RemoteException;
}
