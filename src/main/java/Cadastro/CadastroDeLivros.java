package Cadastro;



public class CadastroDeLivros {
    public static  void main(String[] args){

        Autor autor = new Autor();
        autor.nomeDoAutor= "Rodrigo Turini";
        autor.emailDoAutor= "rodrigo.turini@caelum.com.br";
        autor.cpfDoAutor = "123.456.789.10";



        Livro livro = new Livro();

        livro.nome = "Java 8 Pratico";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";
        livro.autor = autor;
        // metodo
        livro.mostrarDetalhes();
        autor.mostraDetalhes();

        /**
        System.out.println(livro.nome);
        System.out.println(livro.descricao);
        System.out.println(livro.valor);
        System.out.println(livro.isbn);


*/
        Autor outroAutor = new Autor();
        outroAutor.nomeDoAutor= "Paulo Silveira";
        outroAutor.emailDoAutor= "paulo.silveira@caelum.com.br";
        outroAutor.cpfDoAutor = "123.456.789.10";

        Livro outroLivro = new Livro();
        outroLivro.nome = "Logica de Programação";
        outroLivro.descricao = "Crie seus primeiros passos";
        outroLivro.valor = 59.90;
        outroLivro.isbn = "978-85-66250-22-0";
        outroLivro.autor = outroAutor;

        outroLivro.mostrarDetalhes();
        outroAutor.mostraDetalhes();

        if(autor == outroAutor){
            System.out.println("Iguais , mesmo autor!!");
        } else {
            System.out.println("HEIN!!? PORQUE DIFERENTES ?");
        }

/**
        System.out.println(outroLivro.nome);
        System.out.println(outroLivro.descricao);
        System.out.println(outroLivro.valor);
        System.out.println(outroLivro.isbn);
 */
    }
}