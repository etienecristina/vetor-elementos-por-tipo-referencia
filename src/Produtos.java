public class Produtos {
    private String nome;
    private Double preco;

    public Produtos(String name, Double preco) {
        this.nome = name;
        this.preco = preco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setPreco(Double preco){
        this.preco = preco;
    }

    public Double getPreco(){
        return preco;
    }
}
