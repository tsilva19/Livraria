public class CalculadoraDeEstoque {
    public static  void  main(String[] args){

             /** double  livroJava8 = 59.90;
   double  livroTDD = 59.90;   */
        double soma = 0;
        // int contador = 0;

      //double soma = livroTDD + livroJava8;
     /**
        while (contador < 35) {
            double valorDoLivro =59.90;

            //soma = soma + valorDoLivro;
            soma += valorDoLivro;
            //contador = contador + 1;
            contador ++;


        }*/

     for (int contador = 0; contador < 35; contador ++) {
         soma += 59.99;
     }



      System.out.println("O total em estoque é " + soma);

      if(soma < 150) {
          System.out.println("Seu estoque está muito baixo!");
      } else if (soma >= 2000){
           System.out.println("Seu estoque está muito alto");
        }else {
          System.out.println(" Seu estoque está bom ");
      }
    }
}
