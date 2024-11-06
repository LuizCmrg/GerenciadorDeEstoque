package application;

import entities.GerenciadorDeProdutos;

import java.util.Scanner;

import entities.Product;

public class Program {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        GerenciadorDeProdutos gerenciador = new GerenciadorDeProdutos();

        Product product = new Product(null, null, null, null, null);
        int escolha;

        do {
            escolha = MostrarMenu(sc);
            switch (escolha) {

                case 1:
                    System.out.println("--------Cadastro de produtos-------- \n Nome do produto: ");
                    String teste = sc.next();
                    product.setNome(teste);
                    System.out.println("Categoria do Produto: ");
                    product.setCategoria(sc.next());
                    System.out.println("Quantidade: ");
                    product.setQuantidade(sc.nextInt());
                    System.out.println("Preço: ");
                    product.setPreco(sc.nextInt());
                    System.out.println("Localização: ");
                    product.setLocalizacao(sc.next());
                    System.out.println("Produto cadastrado com Sucesso:");
                    System.out.println(product.toString());
                    gerenciador.adicionarProduto(product);
                    break;

                case 2:// Atualização de produtos existentes.

                    System.out.println(
                            "Você deseja:  \n  Atualizar produto existente: Digite 1. 2|  Relatório do estoque: Digite 2 ");
                    int attEscolha = sc.nextInt();
                    switch (attEscolha) {
                        case 1:
                            System.out.println("Digite o produto para ser atualizado: ");
                            String productAtt = sc.next();
                            product = gerenciador.buscarProduto(productAtt);
                            System.out.println("Digite a quantidade a ser adicionada: ");
                            int quantidadeAtt = sc.nextInt();
                            product.setQuantidade(product.getQuantidade() + quantidadeAtt);
                            System.out.println("Nova atualização do produto: " + gerenciador.getNome());
                            break;

                        case 2:
                            gerenciador.exibirProdutos();
                            break;
                        default:
                            break;
                    }
                    break;

                case 3: // Rastreamento e Localização// e Também indicadores de baixo estoque
                    System.out.print("Nome do Produto: ");
                    String nomeBusca = sc.next();
                    Product produtoEncontrado = gerenciador.buscarProduto(nomeBusca);
                    if (produtoEncontrado != null) {
                        System.out.println("Produto encontrado: " + produtoEncontrado);
                        if (product.getQuantidade() < 10) {
                            System.out.println("Estoque de " + produtoEncontrado.getNome() + " baixo");
                        } else {
                            System.out.println("Estoque OK!");
                        }
                    }
                    break;
                case 4: // 4 - Relatórios://
                    gerenciador.exibirProdutos();

                    break;
                case 5: // Sair
                    System.exit(0);
                    break;
                default:
                    break;
            }
            System.out.print("Digite qualquer coisa para continuar: ");
            sc.next();
        } while (escolha != 0);
        sc.close();

    }

    // Função para exibir o Menu, ja pedindo a escolha do usuário.
    public static int MostrarMenu(Scanner sc) {
        System.out.println("\033c");
        int escolha;
        System.out.println(
                "Digite a opção desejada: \n 1 - Cadastro de Produtos: \n 2 - Atualização de Estoque: \n 3 - Rastreamento de Localização: \n 4 - Relatórios:  \n 5 - Sair: ");
        escolha = Integer.parseInt(sc.next());
        return escolha;
    }

}
