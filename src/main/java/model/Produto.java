package model;

import java.io.Serializable;

//classe Produto é uma classe para instanciar produtos
 
public class Produto implements Serializable {

    /**
     * declaração das variáveis de intancia
     */
    private String nomeProduto;
    private int idProduto;
    private double precoUnit;
    private String unidadeProduto;
    private int quantidadeEstoque;
    private int estoqueMinimo;
    private int estoqueMaximo;
    private Categoria categoria;
    private boolean acimaMedia;
    private boolean abaixoMedia;
    private double valorTotal = precoUnit * quantidadeEstoque;
    private double estoqueTotal;

    /**
     * construtor da classe Produto
     */
    public Produto() {
    }

    /**
     * construtor da classe Produto
     * @param nomeProduto valor inicial para o nome do produto
     * @param idProduto valor inicial para o id do produto
     * @param precoUnit valor inicial para o preço unitáriodo produto
     * @param unidadeProduto valor inicial para a unidade do produto
     * @param quantidadeEstoque valor inicial para a quantidade de produto em estoque
     * @param estoqueMinimo valor inicial para o estoque mínimo de produto
     * @param estoqueMaximo valor inicial para o estoque máximo de produto
     * @param categoria
     */
    public Produto(String nomeProduto, int idProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque, int estoqueMinimo, int estoqueMaximo, Categoria nomeCategoria) {
        this.nomeProduto = nomeProduto;
        this.idProduto = idProduto;
        this.precoUnit = precoUnit;
        this.unidadeProduto = unidadeProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.categoria = categoria;
    }

    /**
     *
     * @param nomeProduto
     * @param precoUnit
     * @param unidadeProduto
     * @param quantidadeEstoque
     * @param estoqueMinimo
     * @param estoqueMaximo
     * @param categoria
     */
    public Produto(String nomeProduto, double precoUnit, String unidadeProduto, int quantidadeEstoque, int estoqueMinimo, int estoqueMaximo, Categoria categoria) {
        this.nomeProduto = nomeProduto;
        this.precoUnit = precoUnit;
        this.unidadeProduto = unidadeProduto;
        this.quantidadeEstoque = quantidadeEstoque;
        this.estoqueMinimo = estoqueMinimo;
        this.estoqueMaximo = estoqueMaximo;
        this.categoria = categoria;
    }

    //getters e setters

    /**
     *
     * @return nome do procuto
     */
    public String getNomeProduto() {
        return nomeProduto;
    }

    /**
     *
     * @param nomeProduto atribui um nome para o produto
     */
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    /**
     *
     * @return preço unitario do produto
     */
    public double getPrecoUnit() {
        return precoUnit;
    }

    /**
     *
     * @param precoUnit atribui um preço unitário para o produto
     */
    public void setPrecoUnit(double precoUnit) {
        this.precoUnit = precoUnit;
    }

    /**
     *
     * @return unidade do produto
     */
    public String getUnidadeProduto() {
        return unidadeProduto;
    }

    /**
     *
     * @param unidadeProduto atribui uma unidade para o produto
     */
    public void setUnidadeProduto(String unidadeProduto) {
        this.unidadeProduto = unidadeProduto;
    }

    /**
     *
     * @return quantidade do produto em estoque
     */
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    /**
     *
     * @param quantidadeEstoque atribui uma quatidade em estoque para o produto
     */
    public void setQuantidadeEstoque(int quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    /**
     *
     * @return estoque mínimo 
     */
    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }
}
