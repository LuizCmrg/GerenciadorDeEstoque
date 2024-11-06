package entities;

public class Product {
  private String nome;
  private String categoria;
  private Integer quantidade;
  private Integer preco;
  private String localizacao;

  public Product() {
  }

  public Product(String nome, String categoria, Integer quantidade, Integer preco, String localizacao) {
    this.nome = nome;
    this.categoria = categoria;
    this.quantidade = quantidade;
    this.preco = preco;
    this.localizacao = localizacao;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCategoria() {
    return categoria;
  }

  public void setCategoria(String categoria) {
    this.categoria = categoria;
  }

  public Integer getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(Integer quantidade) {
    this.quantidade = quantidade;
  }

  public Integer getPreco() {
    return preco;
  }

  public void setPreco(Integer preco) {
    this.preco = preco;
  }

  public String getLocalizacao() {
    return localizacao;
  }

  public void setLocalizacao(String localizacao) {
    this.localizacao = localizacao;
  }

  public int estoqueUpdate(int quantidade) {
    return quantidade;

  }

  @Override
  public String toString() {
    StringBuilder produto = new StringBuilder();
    produto.append("\n Nome: " + getNome());
    produto.append("\n Categoria:" + getCategoria());
    produto.append("\n Quantidade: " + getQuantidade());
    produto.append("\n Preço: " + getPreco());
    produto.append("\n Localização:" + getLocalizacao());

    return produto.toString();
  }

}
