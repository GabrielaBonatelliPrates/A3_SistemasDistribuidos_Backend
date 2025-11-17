package main;

import implementation.CategoriaImpl;
import implementation.ConexaoImpl;
import implementation.MovimentacaoImpl;
import implementation.ProdutoImpl;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import remote.RemoteCategoria;
import remote.RemoteConexao;
import remote.RemoteMovimento;
import remote.RemoteProduto;

/**
 *
 * @author Cesar Augusto
 */
public class Main {

    /**
     *
     * @param args parametro da classe main para rodar o sistema
     */
    public static void main(String[] args) {
        try {
            
            int porta = 1099;

            
            Registry registro = null;
            try {
                registro = LocateRegistry.createRegistry(porta);
                System.out.println("Servidor iniciado na porta: " + porta);
            } catch (Exception e) {
                registro = LocateRegistry.getRegistry(porta);
                System.out.println("Registro RMI já existente na porta: " + porta);
            }

            
            RemoteProduto produto = new ProdutoImpl();
            RemoteMovimento movimentacao = new MovimentacaoImpl();
            RemoteCategoria categoria = new CategoriaImpl();
            RemoteConexao conexao = new ConexaoImpl();

            
            registro.rebind("ProdutoService", produto);
            registro.rebind("MovimentacaoService", movimentacao);
            registro.rebind("CategoriaService", categoria);
            registro.rebind("ConexaoService", conexao);

            System.out.println("Servidor iniciado com sucesso");
            System.out.println("Aguardando conexões de clientes...");

        } catch (Exception e) {
            System.err.println("Erro ao iniciar o Servidor: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
