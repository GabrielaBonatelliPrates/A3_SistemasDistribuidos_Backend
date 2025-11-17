package implementation;

import dao.CategoriaDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import remote.RemoteCategoria;

/**
 *
 * @author Mateo-Padilla
 */
public class CategoriaImpl extends UnicastRemoteObject implements RemoteCategoria {

    private final CategoriaDAO categoriaDAO;

    // Construtor precisa lançar RemoteException obrigatoriamente

    /**
     *
     * @throws RemoteException 
     */
    public CategoriaImpl() throws RemoteException {
        super();
        this.categoriaDAO = new CategoriaDAO();
    }

    /**
     *
     * @param idCategoria parametro necessário para cadastrar o id de uma nova categoria
     * @param nomeCategoria parametro necessário para cadastrar o nome de uma nova categoria
     * @param tamanho parametro necessário para definir o tamanho de uma nova categoria
     * @param embalagem parametro necessário para definir a embalagem de uma nova categoria
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     */
    @Override
    public void cadastrarCategoria(int idCategoria, String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException, SQLException {
        categoriaDAO.cadastrarCategoria(idCategoria, nomeCategoria, tamanho, embalagem);
    }

    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     */
    @Override
    public List<Categoria> mostrarCategorias() throws RemoteException {
        return categoriaDAO.mostrarCategorias();
    }

    /**
     *
     * @param idCategoria parametro necessário para buscar uma categoria pelo id da mesma
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     */
    @Override
    public Categoria buscarCategoriaPorId(int idCategoria) throws RemoteException {
        return categoriaDAO.buscarCategoriaPorId(idCategoria);
    }

    /**
     *
     * @param nomePesquisado parametro necessário para buscar uma categoria pelo nome da mesma
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     */
    @Override
    public Categoria buscarPorNome(String nomePesquisado) throws RemoteException {
        return categoriaDAO.buscarPorNome(nomePesquisado);
    }

    /**
     *
     * @param idCategoria parametro necessário para atualizar o id de uma nova categoria
     * @param nomeCategoria parametro necessário para atualizar o nome de uma nova categoria
     * @param tamanho parametro necessário para atualizar o tamanho de uma nova categoria
     * @param embalagem parametro necessário para atualizar a embalagem de uma nova categoria
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     */
    @Override
    public boolean atualizarCategoria(String nomeCategoria, String tamanho, String embalagem, int idCategoria)
            throws RemoteException {
        return categoriaDAO.atualizarCategoria(nomeCategoria, tamanho, embalagem, idCategoria);
    }

    /**
     *
     * @param idCategoria parametro necessário para apagar uma categoria pelo Id da mesma
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     */
    @Override
    public boolean deletarCategoria(int idCategoria) throws RemoteException {
        return categoriaDAO.deletarCategoria(idCategoria);
    }

    /**
     *
     * @param nomePesquisado parametro necessário para mostrar as categorias de uma categoria quando pesquisada pelo nome da mesma
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */ 
    @Override
    public String fichaCategoria(String nomePesquisado) throws RemoteException {
        return categoriaDAO.fichaCategoria(nomePesquisado);
    }

    /**
     *
     * @param categoria parametro necessário para encontrar o id de uma categoria
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     */
    @Override
    public int buscarIdCategoria(Categoria categoria) throws RemoteException {
        return categoriaDAO.buscarIdCategoria(categoria);
    }

    /**
     * @param nomeCategoria parametro necessário para buscar o nome de uma categoria
     * @param tamanho parametro necessário para buscar o tamanho de uma categoria
     * @param embalagem parametro necessário para buscar a embalagem de uma categoria
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     */
    @Override
    public Categoria buscarCategoria(String nomeCategoria, String tamanho, String embalagem) throws RemoteException {
        return categoriaDAO.buscarCategoria(nomeCategoria, tamanho, embalagem);
    }

    /**
     *
     * @param nomeCategoria parametro necessário para verificar a existência de uma categoria
     * @param tamanho parametro necessário para verificar a existência de uma categoria
     * @param embalagem parametro necessário para verificar a existência de uma categoria
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     */
    @Override
    public boolean verificaCategoria(String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException, SQLException {
        return categoriaDAO.verificaCategoria(nomeCategoria, tamanho, embalagem);
    }

    /**
     *
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada 
     */
    @Override
    public List<Categoria> pegarCategorias() throws RemoteException {
        return categoriaDAO.pegarCategorias();
    }

    /**
     *
     * @param nomeCategoria parametro necessário para listar as categorias
     * @return
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     */
    @Override
    public List<Categoria> devolveCategorias(String nomeCategoria) throws RemoteException {
        return categoriaDAO.devolveCategorias(nomeCategoria);
    }

    /**
     *
     * @return
     * @throws SQLException envia uma exceção caso a conexão com o banco de dados não seja efetivada
     * @throws RemoteException envia uma exceção caso a conexão entre os projetos não seja efetivada
     */
    @Override
    public DefaultTableModel tabelaAtualizada() throws SQLException, RemoteException {
        return categoriaDAO.tabelaAtualizada();
    }

}
