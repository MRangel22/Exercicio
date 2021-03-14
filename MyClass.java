import java.util.Scanner;
import java.util.ArrayList;
public class MyClass {
    public static void main(String args[]) {
       
        Scanner ler = new Scanner(System.in);
        ArrayList<Produtos> produtos  = new ArrayList();
       
        int resposta = 0;
      
       
        while(resposta == 0){
            Produtos produto = new Produtos();
            System.out.println("Qual o id do produto?");
            produto.id = ler.nextInt();
            System.out.println("Qual o nome do produto? ");
            produto.nome = ler.next();
            System.out.println("Qual a descrição do produto?");
            produto.descricao = ler.next();
            System.out.println("Qual o preço do produto?");
            produto.preco = ler.nextFloat();
           
            produtos.add(produto);
           
            System.out.println("Deseja repetir? 0 p S // qualquer outro para N");
            resposta = ler.nextInt();
        }
       
         System.out.println("Id\tNome\tDescrição\tPreço");
        for(int i = 0; i < produtos.size(); i++ ){
            System.out.println(produtos.get(i).id + "\t" + produtos.get(i).nome + "\t" + produtos.get(i).descricao + "\t" + produtos.get(i).preco );
        }
      
    }
}
