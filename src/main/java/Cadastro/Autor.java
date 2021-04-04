package Cadastro;

public class Autor {

    String nomeDoAutor;
    String emailDoAutor;
    String cpfDoAutor;

    void mostraDetalhes(){
        System.out.println("Mostrando detalhes do autor  ");
        System.out.println("Nome:  " + nomeDoAutor);
        System.out.println("email:  " + emailDoAutor);
        System.out.println("CPF:  " + cpfDoAutor);
        System.out.println("--");
    }


}
