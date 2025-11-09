package remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import model.Categoria;

public interface RemoteCategoria extends Remote {

    void cadastrarCategoria(int idCategoria, String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException, SQLException;

    public DefaultTableModel tabelaAtualizada()
            throws SQLException, RemoteException;

    List<Categoria> mostrarCategorias()
            throws RemoteException;

    Categoria buscarCategoriaPorId(int idCategoria)
            throws RemoteException;

    Categoria buscarPorNome(String nomePesquisado)
            throws RemoteException;

    boolean atualizarCategoria(String nomeCategoria, String tamanho, String embalagem, int idCategoria)
            throws RemoteException;

    boolean deletarCategoria(int idCategoria)
            throws RemoteException;

    String fichaCategoria(String nomePesquisado)
            throws RemoteException;

    int buscarIdCategoria(Categoria categoria)
            throws RemoteException;

    Categoria buscarCategoria(String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException;

    boolean verificaCategoria(String nomeCategoria, String tamanho, String embalagem)
            throws RemoteException, SQLException;

    List<Categoria> pegarCategorias()
            throws RemoteException;

    List<Categoria> devolveCategorias(String nomeCategoria)
            throws RemoteException;
}
