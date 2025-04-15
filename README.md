# Decorator
## 📚 Exemplo de Padrão Decorator: Hamburgueria

Este projeto demonstra o uso do padrão de projeto **Decorator** em Java, utilizando uma hamburgueria como exemplo. O padrão Decorator permite adicionar funcionalidades a objetos de forma flexível e dinâmica, sem alterar o código das classes originais.

## Estrutura 🏗️

- `Ingrediente`: Interface base para todos os ingredientes.
- `Hamburguer`: Implementação base de um hambúrguer simples.
- `IngredienteDecorator`: Classe abstrata para os decoradores de ingredientes.
- `Queijo`, `Bacon`, `Ovo`: Decoradores concretos que adicionam ingredientes ao hambúrguer.
- `Pedido`: Classe que representa um pedido de hambúrguer.
- `HamburguerTest`: Testes unitários com exemplos de uso.

## Como funciona 🔍

Cada ingrediente extra é um decorador que recebe outro ingrediente (que pode ser outro decorador ou o hambúrguer simples) e adiciona sua descrição e preço.

## Executando os testes 💡

Os testes estão em [`HamburguerTest.java`](HamburguerTest.java) e podem ser executados com JUnit 5.

## 🚀 Diagrama de Classe
![Diagrama de Classe Decorator](./Diagrama_padrão_Decorator.pdf)

---

Projeto acadêmico para demonstração do padrão Decorator.
