import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Produto {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Cadastre 5 produtos");

        ///
        List<String>cadastro= new ArrayList<>();


      while (cadastro.size() < 5){

          String nome= scanner.nextLine();
          cadastro.add(nome);


      }
        for ( int i =0; i < cadastro.size();i++){
            System.out.println("voce cadastrou "+cadastro.get(i));
        }

       System.out.println("Primeiro produto "+cadastro.getFirst()+" Ultimo produto "+cadastro.getLast());
        System.out.println("Produtos cadastrados "+cadastro.size());
        if (cadastro.contains("Arroz")){
            System.out.println("Arroz está na lista");


        }else {
            System.out.println("Arroz não está na lista");
        }

    }


}
