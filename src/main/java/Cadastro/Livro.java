package Cadastro;

public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes() {
        //String mensagens = "Mostrando detalhes do livro";

        System.out.println("Mostrando detalhes do livro  ");
        System.out.println("Nome:  " + nome);
        System.out.println("Descrição:  " + descricao);
        System.out.println("VALOR:  " + valor);
        System.out.println("ISBN:  " + isbn);
/**
        System.out.println("Mostrando detalhes do autor  ");
        System.out.println("Nome:  " + autor.nomeDoAutor);
        System.out.println("Descrição:  " + autor.emailDoAutor);
        System.out.println("VALOR:  " + autor.cpfDoAutor);
        System.out.println("--");
 */
    }
}


