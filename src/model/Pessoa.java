package model;

/**
 *
 * @author arthursvpb
 */
public class Pessoa {
    
    private int id;
    private String nome;
    private String email;
    private String celular;
    private String cpf;
    
    private Endereco endereco;
    private Movimento movimento;
    
    public Movimento getMovimento() {
        return movimento;
    }
    
    public void setMovimento(Movimento movimento) {
        this.movimento = movimento;
    }
    
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
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
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getCelular() {
        return celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    
    
    
}
