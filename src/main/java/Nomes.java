import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Nomes {
    public static void main(String[] args) {
        List<String> nomes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos nomes você quer cadastrar? ");
        int num = scanner.nextInt();
        scanner.nextLine(); // limpar buffer

        for (int i = 0; i < num; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            String nome = scanner.nextLine();
            nomes.add(nome);
        }

        System.out.println("\nTodos os nomes: " + nomes);

        List<String> nomeComA = new ArrayList<>();
        for (String nome : nomes) {
            if (nome.toLowerCase().startsWith("a")) {
                nomeComA.add(nome);
            }
        }
        System.out.println("Nomes que começam com A: " + nomeComA);

        String maior = nomes.get(0);
        String menor = nomes.get(0);

        for (String nome : nomes) {
            if (nome.length() > maior.length()) {
                maior = nome;
            }
            if (nome.length() < menor.length()) {
                menor = nome;
            }
        }
        System.out.println("Maior nome: " + maior);
        System.out.println("Menor nome: " + menor);

        int contador = 0;
        for (String nome : nomes) {
            if (nome.length() > 5) {
                contador++;
            }
        }
        System.out.println("Nomes com mais de 5 letras: " + contador);

        Collections.sort(nomes, String.CASE_INSENSITIVE_ORDER);
        System.out.println("Nomes em ordem alfabética: " + nomes);

        scanner.close();
    }
}
