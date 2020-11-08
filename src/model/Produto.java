package model;

// Irá receber os atributos do banco de dados

/**
 *
 * @author arthursvpb
 */
public class Produto {
    
    // Colocar os atributos exatamente como está no BD
    private int id;
    private String nome;
    private double preco;
    private int qtd_estoque;
    
    private ItemMovimento itemMovimento;
    private Unidade unidade;
    private Categoria categoria;
    
    public Unidade getUnidade() {
        return unidade;
    }
    
    public void setUnidade(Unidade unidade) {
        this.unidade = unidade;
    }
    
    public Categoria getCategoria() {
        return categoria;
    }
    
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }
    
    
    
    public ItemMovimento getItemMovimento() {
        return itemMovimento;
    }
    
    public void setItemMovimento(ItemMovimento itemMovimento) {
        this.itemMovimento = itemMovimento;
    }
    
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    public int getQtd_estoque() {
        return qtd_estoque;
    }
    
    public void setQtd_estoque(int qtd_estoque) {
        this.qtd_estoque = qtd_estoque;
    }
    
    
    
    
}
