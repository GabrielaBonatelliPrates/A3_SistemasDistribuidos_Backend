package model;

import dao.CategoriaDAO;
import java.io.Serializable;
import java.util.Random;

/**classe Categoria é uma classe para instanciar categorias
 *
 * @author Mateo-Padilla
 */
public class Categoria implements Serializable{
    
    Random random = new Random();

   /**
     * Declaração das variáveis de instância
     */
    private int idCategoria;
    private String nomeCategoria;
    private String tamanho;
    private String embalagem;



    /**
     * Construtor da classe Categoria
     */
    public Categoria() {
    }



    /**
     *Construtor da classe Categoria
     * 
     * @param idCategoria valor inicial para o id da categoria.
     * @param nomeCategoria valor inicial para o nome da categoria.
     * @param tamanho valor inicial para o tamanho da categoria.
     * @param embalagem valor inicial para a embalagem da categoria.
     */
    public Categoria(int idCategoria, String nomeCategoria, String tamanho, String embalagem) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    /**
     * Construtor da classe Categoria
     *
     * @param nomeCategoria valor inicial para o nome da categoria.
     * @param tamanho valor inicial para o tamanho da categoria.
     * @param embalagem valor inicial para a embalagem da categoria.
     */
    public Categoria(String nomeCategoria, String tamanho, String embalagem) {
        this.nomeCategoria = nomeCategoria;
        this.tamanho = tamanho;
        this.embalagem = embalagem;
    }

    //Getters e setters

    /**
     *
     * @return idCategoria id da Categoria
     */
     public int getIdCategoria() {
        return idCategoria;
    }

    /**
     *
     * @param idCategoria atribui um id para a categoria
     */
    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }
    
    /**
     *
     * @return nome da categoria
     */
    public String getNomeCategoria() {
        return nomeCategoria;
    }

    /**
     *
     * @param nomeCategoria atribui um nome para a categoria
     */
    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    /**
     *
     * @return tamanho tamanho da categoria
     */
    public String getTamanho() {
        return tamanho;
    }

    /**
     *
     * @param tamanho atribui um tamanho para a categoria
     */
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    /**
     *
     * @return embalagem embalagem da categoria
     */
    public String getEmbalagem() {
        return embalagem;
    }

    /**
     *
     * @param embalagem atribui uma embalagem para a categoria
     */
    public void setEmbalagem(String embalagem) {
        this.embalagem = embalagem;
    }    
    
    /**
     *
     * @return nomeCategoria + " / " + tamanho + " / " + embalagem retorna método "toString"
     */
    @Override
    public String toString() {
        return nomeCategoria + " / " + tamanho + " / " + embalagem;
    }
}
