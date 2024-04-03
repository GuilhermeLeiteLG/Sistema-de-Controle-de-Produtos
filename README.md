

# Sistema de Controle de Produtos 


Este é um sistema simples desenvolvido em Java para controlar informações sobre produtos. Ele consiste em duas classes principais: `Produto` e `Programa`.

## Classe Produto

A classe `Produto` define um modelo básico para representar um produto. Cada produto possui um nome, um preço e uma quantidade em estoque. Além disso, possui métodos para calcular o valor total em estoque, adicionar e remover produtos, e uma sobrescrita do método `toString()` para exibir informações detalhadas sobre o produto.

### Métodos

- `Produto(String nome, double preco, int quantidade)`: Construtor da classe para inicializar um produto com nome, preço e quantidade.
- `double totalValorEmEstoque()`: Calcula o valor total em estoque do produto.
- `void adicionarProduto(int quantidade)`: Adiciona uma quantidade específica de produtos ao estoque.
- `void removerProduto(int quantidade)`: Remove uma quantidade específica de produtos do estoque.
- `String toString()`: Retorna uma representação em string do produto contendo seu nome, preço, quantidade em estoque e valor total em estoque.

## Classe Programa

A classe `Programa` é a classe principal que contém o método `main`. Ela é responsável por interagir com o usuário através do console para obter informações sobre o produto, criar uma instância da classe `Produto` com essas informações e realizar operações como adição e remoção de produtos.

### Funcionalidades

1. Solicita ao usuário informações sobre um produto (nome, preço e quantidade em estoque).
2. Cria um objeto `Produto` com base nas informações fornecidas pelo usuário.
3. Exibe informações detalhadas sobre o produto criado.
4. Permite adicionar uma quantidade especificada de produtos ao estoque.
5. Exibe informações atualizadas do produto após a adição de produtos.
6. Permite remover uma quantidade especificada de produtos do estoque.
7. Exibe informações atualizadas do produto após a remoção de produtos.



![Java Icon](https://cdn.iconscout.com/icon/free/png-256/java-43-569305.png)
