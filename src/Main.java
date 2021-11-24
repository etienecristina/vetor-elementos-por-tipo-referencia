import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        Produtos[] vect = new Produtos[n];

        for (int i = 0; i < vect.length; i++) {
            scanner.nextLine();
            System.out.println("Digite o nome do produto para a posição " + i);
            String nome = scanner.nextLine();
            System.out.println("Digite o preço do produto: ");
            Double preco = scanner.nextDouble();
            vect[i] = new Produtos(nome, preco);
        }

        Double soma = 0.0;
        for (int i = 0; i < vect.length; i++) {
            soma += vect[i].getPreco();
        }

        Double media = soma / vect.length;
        System.out.printf("A média dos preços dos produtos é: %.2f", media);
        scanner.close();
    }
}
