import main.Pessoa;

import java.util.*;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) throws Exception {

        String input = "";
        Scanner scanner = new Scanner(System.in);
        List<Pessoa> pessoas = new ArrayList<Pessoa>();
        while (!input.equals("sair")) {

            System.out.println("Qual o seu nome e genero (separado por virgula)?");
            String nomeEGenero = scanner.nextLine();

            String[] split = nomeEGenero.split(",");
            if (split.length == 2) {
                Pessoa pessoa = new Pessoa(split[0].trim(), split[1].trim());
                pessoas.add(pessoa);
            }
            List<Pessoa> mulheres = pessoas.stream()
                    .filter(Pessoa::isFeminino)
                    .collect(Collectors.toCollection(ArrayList::new));

            mulheres.forEach((pessoa) -> {
                System.out.println("Nome: " + pessoa.getNome() + ", Gênero: " + pessoa.getGenero());
            });

            System.out.println("Digite 'sair' para encerrar o programa.");
            System.out.println("Digite 'continuar' para continuar.");
            input = scanner.nextLine().toLowerCase().trim();

        }
        scanner.close();

    }
}
