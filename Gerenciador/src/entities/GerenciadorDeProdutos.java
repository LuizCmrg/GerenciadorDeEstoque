package entities;

import java.util.ArrayList;

public class GerenciadorDeProdutos extends Product {
  ArrayList<Product> produtos;

  public GerenciadorDeProdutos() {
    produtos = new ArrayList<>();
    produtos.add(new Product("Madeira", "Material", 9, 10, "estoque1"));
    produtos.add(new Product("Ferro", "Material", 8, 10, "estoque2"));
    produtos.add(new Product("Cobre", "Material", 10, 10, "estoque3"));
  }

  public void adicionarProduto(Product produto) {
    produtos.add(produto);
    System.out.println("Produto adicionado: " + produto.getNome());
  }

  public void exibirProdutos() {
    System.out.println("Lista de Produtos:");
    for (Product produto : produtos) {
      System.out.println(produto.getNome() + ":  " + produto.getQuantidade());
    }
  }

  public Product buscarProduto(String nome) {
    for (Product produto : produtos) {
      if (produto.getNome().equalsIgnoreCase(nome)) {
        return produto;
      }
    }
    return null;
  }
}
