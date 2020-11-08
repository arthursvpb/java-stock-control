/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package model;

/**
 *
 * @author arthursvpb
 */
public class Movimento {
    
    private int id;
    private String data;
    private float total;
    private ItemMovimento itemMovimento;
    private Pessoa pessoa;
    private Usuario usuario;
    
    public Usuario getUsuario() {
        return usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public Pessoa getPessoa() {
        return pessoa;
    }
    
    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getData() {
        return data;
    }
    
    public void setData(String data) {
        this.data = data;
    }
    
    public float getTotal() {
        return total;
    }
    
    public void setTotal(float total) {
        this.total = total;
    }
    
    public ItemMovimento getItemMovimento() {
        return itemMovimento;
    }
    
    public void setItemMovimento(ItemMovimento itemMovimento) {
        this.itemMovimento = itemMovimento;
    }
    
    
    
    
    
}
