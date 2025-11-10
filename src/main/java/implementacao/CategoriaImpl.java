package implementacao;

import dao.CategoriaDAO;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Categoria;
import remote.RemoteCategoria;

public class CategoriaImpl extends UnicastRemoteObject implements RemoteCategoria {

    private final CategoriaDAO categoriaDAO;

    // Construtor precisa lançar RemoteException obrigatoriamente
    public CategoriaImpl() throws RemoteException {
        super();
        this.categoriaDAO = new CategoriaDAO();
    }

    @Override
    public void cadastrarCategoria(int idCategoria, String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException, SQLException {
        categoriaDAO.cadastrarCategoria(idCategoria, nomeCategoria, tamanho, embalagem);
    }

    @Override
    public List<Categoria> mostrarCategorias() throws RemoteException {
        return categoriaDAO.mostrarCategorias();
    }

    @Override
    public Categoria buscarCategoriaPorId(int idCategoria) throws RemoteException {
        return categoriaDAO.buscarCategoriaPorId(idCategoria);
    }

    @Override
    public Categoria buscarPorNome(String nomePesquisado) throws RemoteException {
        return categoriaDAO.buscarPorNome(nomePesquisado);
    }

    @Override
    public boolean atualizarCategoria(String nomeCategoria, String tamanho, String embalagem, int idCategoria)
            throws RemoteException {
        return categoriaDAO.atualizarCategoria(nomeCategoria, tamanho, embalagem, idCategoria);
    }

    @Override
    public boolean deletarCategoria(int idCategoria) throws RemoteException {
        return categoriaDAO.deletarCategoria(idCategoria);
    }

    @Override
    public String fichaCategoria(String nomePesquisado) throws RemoteException {
        return categoriaDAO.fichaCategoria(nomePesquisado);
    }

    @Override
    public int buscarIdCategoria(Categoria categoria) throws RemoteException {
        return categoriaDAO.buscarIdCategoria(categoria);
    }

    @Override
    public Categoria buscarCategoria(String nomeCategoria, String tamanho, String embalagem) throws RemoteException {
        return categoriaDAO.buscarCategoria(nomeCategoria, tamanho, embalagem);
    }

    @Override
    public boolean verificaCategoria(String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException, SQLException {
        return categoriaDAO.verificaCategoria(nomeCategoria, tamanho, embalagem);
    }

    @Override
    public List<Categoria> pegarCategorias() throws RemoteException {
        return categoriaDAO.pegarCategorias();
    }

    @Override
    public List<Categoria> devolveCategorias(String nomeCategoria) throws RemoteException {
        return categoriaDAO.devolveCategorias(nomeCategoria);
    }

    @Override
    public DefaultTableModel tabelaAtualizada() throws SQLException, RemoteException {
        return categoriaDAO.tabelaAtualizada();
    }

}
