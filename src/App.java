import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        String input = "";
        Scanner scanner = new Scanner(System.in);
        Map<String, String> partes = new HashMap<String, String>();
        while (input.equals("sair") == false) {

            System.out.println("Qual o seu nome e genero (separado por virgula)?");
            String nomeEGenero = scanner.nextLine();

            String[] split = nomeEGenero.split(",");
            if (split.length == 2) {
                partes.put(split[0].trim(), split[1].trim());
            }
            Map<String, String> mulheres = partes.entrySet().stream()
                    .filter(entry -> entry.getValue().equalsIgnoreCase("feminino"))
                    .collect(HashMap::new, (map, entry) -> map.put(entry.getKey(), entry.getValue()), HashMap::putAll);

            mulheres.forEach((nome, genero) -> {
                System.out.println("Nome: " + nome + ", Gênero: " + genero);
            });

            System.out.println("Digite 'sair' para encerrar o programa.");
            System.out.println("Digite 'continuar' para continuar.");
            input = scanner.nextLine().toLowerCase().trim();

        }
        scanner.close();

    }
}
